package com.cisco.altcso.dao;

import java.util.List;
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

    @Override
    public List<CsoProfile> findByCsoProfileName(String name) {
        return this.entityManager.createNamedQuery("CsoProfile.findByCsoProfileName")
                .setParameter("csoProfileName", "%" + name + "%")
                .getResultList();
    }

    @Override
    public List<CsoProfile> findByDefaultProfile(String code) {
        return this.entityManager.createNamedQuery("CsoProfile.findByDefaultProfile")
                .setParameter("defaultProfile", code)
                .getResultList();
    }
}