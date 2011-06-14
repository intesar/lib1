package com.cisco.altcso.dao;

import java.io.Serializable;
import java.util.List;

/**
 * The GenericDao interface with CRUD methods. Finders are added with interface inheritance and AOP
 * introductions for concrete implementations.
 *
 * Extended interfaces may declare methods starting with find..., list..., iterate... or scroll...
 * They will execute a preconfigured query that is looked up based on the rest of the method name.
 *
 *  Getting Started!
 *
 *  this frameworks encapsulates Spring JPA and gives some more features.
 *  it is expected that user of this framework doesn't have to know spring jpa
 *  GenericDao interface is at the heart of this framework. To use this framework
 *  you have to know only these four interfaces and classes
 *
 *  if you see the above bean its very simple if you create new dao's just copy and
 *  paste this bean decleration and change three things id, dao and entity names
 *  and ur good to go
 *
 *  if this documentation doesn't looks good and if you need more help using this
 *  framework please feel free to email me at
 *  mdshananan@gmail.com
 *
 *
 *
 * @param T entity
 * @param PK entity primary key
 * @author intesar
 *
 */
public interface GenericDao<T, PK extends Serializable> {

    /**
     * creates a new instance in the database
     * @param newInstance
     * @return
     */
    T persist(T newInstance);

    /**
     * merges the new state to the database
     * @param transientObject
     */
    T merge(T transientObject);

    /**
     * removes the instance from the database
     * @param persistentObject
     */
    void delete(T persistentObject);

    /**
     * finds the instance by primary key id
     * @param id
     * @return
     */
    T find(PK id);

    /**
     *
     * @param namedQuery
     * @param params
     * @return
     */
    List<T> executeNamedQueryReturnList(String namedQuery, Object... params);

    /**
     * 
     * @param namedQuery
     * @param start
     * @param max
     * @param params
     * @return
     */
    List<T> executeNamedQueryPaginateReturnList(String namedQuery, int start, int max, Object... params);

    /**
     *
     * @param namedQuery
     * @param params
     * @return
     */
    T executeNamedQueryReturnObject(String namedQuery, Object... params);

    /**
     * 
     * @param namedQuery
     * @param params
     * @return
     */
    Long executeNamedQueryReturnLong(String namedQuery, Object... params);

    /**
     * 
     * @return
     */
    List<T> findAll();
}
