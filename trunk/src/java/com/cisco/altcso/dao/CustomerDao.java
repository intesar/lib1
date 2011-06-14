package com.cisco.altcso.dao;

import com.cisco.altcso.domain.Customer;
import java.util.List;

/**
 * DAO Interface for {@link Customer}
 */
public interface CustomerDao extends GenericDao<Customer, Long> {
    
    public List<Customer> findByGroupName(String keyword);
}
