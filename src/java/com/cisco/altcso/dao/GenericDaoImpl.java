package com.cisco.altcso.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Hibernate implementation of GenericDao. A typesafe implementation of CRUD and finder methods
 * based on Hibernate and Spring AOP. The finders are implemented through the executeFinder method.
 * Normally called by the FinderIntroductionInterceptor.
 *
 *
 */
public abstract class GenericDaoImpl<T, PK extends Serializable> implements GenericDao<T, PK> {

    @PersistenceContext
    protected EntityManager entityManager;
    protected static final Log log = LogFactory.getLog(GenericDaoImpl.class);
    // default FinderNamingStrategy can be overriden in Spring config
    private Class<T> type;
    // ****************************** constructors ******************************

    public GenericDaoImpl(Class<T> type) {
        this.type = type;
    }
    // ****************************** methods ******************************

    @Override
    public T persist(T o) {
        entityManager.persist(o);
        return o;
    }

    @Override
    public T find(PK id) {
        return entityManager.find(type, id);
    }

    @Override
    public T merge(T o) {
        o = entityManager.merge(o);
        return o;
    }

    @Override
    public void delete(T o) {
        o = entityManager.merge(o);
        entityManager.remove(o);
    }

    @Override
    public List<T> executeNamedQueryPaginateReturnList(String namedQuery, int start, int max, Object... params) {
        Query query = entityManager.createNamedQuery(namedQuery);
        query.setFirstResult(start);
        query.setMaxResults(max);
        int index = 1;
        for (Object param : params) {
            query.setParameter(index++, param);
        }
        return query.getResultList();
    }

    @Override
    public List<T> executeNamedQueryReturnList(String namedQuery, Object... params) {
        Query query = entityManager.createNamedQuery(namedQuery);
        int index = 1;
        for (Object param : params) {
            query.setParameter(index++, param);
        }
        return query.getResultList();
    }

    @Override
    public T executeNamedQueryReturnObject(String namedQuery, Object... params) {
        Query query = entityManager.createNamedQuery(namedQuery);
        int index = 1;
        for (Object param : params) {
            query.setParameter(index++, param);
        }
        return (T) query.getSingleResult();
    }

    @Override
    public Long executeNamedQueryReturnLong(String namedQuery, Object... params) {
        Query query = entityManager.createNamedQuery(namedQuery);
        int index = 1;
        for (Object param : params) {
            query.setParameter(index++, param);
        }
        return (Long) query.getSingleResult();
    }

    @Override
    public List<T> findAll() {
        List<T> list = null;
        String query = "SELECT t FROM " + type.getSimpleName() + " t";
        list = entityManager.createQuery(query).getResultList();
        return list;
    }
}