package com.cisco.altcso.dao;

import org.springframework.stereotype.Repository;

import com.cisco.altcso.domain.CustomerCsoProfileMap;

/**
 * Hibernate implementation of the CustomerCsoProfileMap DAO interface.
 */
@Repository
public class CustomerCsoProfileMapDaoImpl extends GenericDaoImpl<CustomerCsoProfileMap, Long> implements
        CustomerCsoProfileMapDao {
    public CustomerCsoProfileMapDaoImpl() {
        super(CustomerCsoProfileMap.class);
    }
}