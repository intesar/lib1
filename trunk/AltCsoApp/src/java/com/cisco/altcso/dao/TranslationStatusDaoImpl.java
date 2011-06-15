package com.cisco.altcso.dao;

import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.cisco.altcso.domain.TranslationStatus;

/**
 * Hibernate implementation of the TranslationStatus DAO interface.
 */
@Repository
public class TranslationStatusDaoImpl extends GenericDaoImpl<TranslationStatus, Long> implements
        TranslationStatusDao {
    public TranslationStatusDaoImpl() {
        super(TranslationStatus.class);
    }

    @Override
    public List<TranslationStatus> findByStatus(String status) {
        return this.entityManager.createNamedQuery("TranslationStatus.findByStatus")
                .setParameter("status", status)
                .getResultList();
    }

    @Override
    public List<TranslationStatus> findByStartTimeAndEndTimeAndCustomerId(Date start, Date end, Long customerId) {
        return this.entityManager.createNamedQuery("TranslationStatus.findByStartTimeAndEndTimeAndCustomerId")
                .setParameter("startTime", start)
                .setParameter("endTime", end)
                .setParameter("customerId", customerId)
                .getResultList();
    }
}