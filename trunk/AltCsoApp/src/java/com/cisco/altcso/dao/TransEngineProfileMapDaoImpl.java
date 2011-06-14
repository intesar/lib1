package com.cisco.altcso.dao;

import org.springframework.stereotype.Repository;

import com.cisco.altcso.domain.TransEngineProfileMap;

/**
 * Hibernate implementation of the TransEngineProfileMap DAO interface.
 */
@Repository
public class TransEngineProfileMapDaoImpl extends GenericDaoImpl<TransEngineProfileMap, Long> implements
        TransEngineProfileMapDao {
    public TransEngineProfileMapDaoImpl() {
        super(TransEngineProfileMap.class);
    }
}