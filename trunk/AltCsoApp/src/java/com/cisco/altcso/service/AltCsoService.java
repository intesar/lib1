package com.cisco.altcso.service;

import com.cisco.altcso.domain.Customer;
import com.cisco.altcso.domain.TranslationStatus;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Intesar Mohammed
 */
public interface AltCsoService {
    //
    //  tab-5
    //
    /**
     *  
     */
    public List<TranslationStatus> getActiveTranslationStatuses();
    
    //
    //  tab-1
    //
    /**
     * 
     * @param keyword
     * @return 
     */
    public List<Customer> getCustomerByName(String keyword);
    
    public void saveCustomer(Customer customer);
    
    public void deleteCustomer(Long customerId);
    
    //
    // tab-4
    //
    
    public List<TranslationStatus> getTranslationStatusesBetween(Date start, Date end, Long customerId );
}
