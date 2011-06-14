package com.cisco.altcso.dao;

import org.springframework.stereotype.Repository;

import com.cisco.altcso.domain.CsoProfile;

/**
 * Hibernate implementation of the CsoProfile DAO interface.
 */
@Repository
public class CsoProfileDaoImpl extends GenericDaoImpl<CsoProfile, Long> implements CsoProfileDao {
    public CsoProfileDaoImpl() {
        super(CsoProfile.class);
    }
}