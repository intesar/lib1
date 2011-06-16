package com.cisco.altcso.dao;

import com.cisco.altcso.domain.TranslationStatus;
import java.util.Date;
import java.util.List;

/**
 * DAO Interface for {@link TranslationStatus}
 */
public interface TranslationStatusDao extends GenericDao<TranslationStatus, Long> {
    
    public List<TranslationStatus> findByStatus(String status);
    
    public List<TranslationStatus> findByCustomerIdBetweenDates(Long customerId, Date start, Date end);
}
