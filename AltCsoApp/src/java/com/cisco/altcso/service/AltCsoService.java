package com.cisco.altcso.service;

import com.cisco.altcso.domain.Customer;
import com.cisco.altcso.domain.TranslationStatus;
import com.cisco.altcso.domain.Users;
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
    List<TranslationStatus> getActiveTranslationStatuses();
    
    //
    //  tab-1
    //
    /**
     * 
     * @param keyword
     * @return 
     */
    List<Customer> getCustomerByName(String keyword);
    
    void saveCustomer(Customer customer);
    
    void deleteCustomer(Long customerId);
    
    //
    // tab-4
    //
    
    List<TranslationStatus> getTranslationStatusesBetween(Date start, Date end, Long customerId );
    
    List<Customer> getAllCutomers();
    
    //
    // tab-3
    //
    
    List<Users> getByUserIds(String userId);
    void persistUsers(String userId, String firstName, String lastName);
    void mergeUsers(Users users);
    void deleteUsers(String userId);
}
