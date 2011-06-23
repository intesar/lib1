package com.cisco.altcso.service;

import com.cisco.altcso.domain.CsoProfile;
import com.cisco.altcso.domain.Customer;
import com.cisco.altcso.domain.TransEngineProfileMap;
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
    //  tab-1
    //
    /**
     * 
     * @param keyword
     * @return 
     */
    List<Customer> getCustomerByName(String keyword);

    void mergeCustomer(Customer customer);

    void persistCustomer(Customer customer);

    void deleteCustomer(Long customerId);
    
    String generateAppkey();

    //
    // tab-2
    //
    List<CsoProfile> searchCsoProfiles(String name);

    void mergeCsoProfile(CsoProfile csoProfile);

    void deleteCsoProfile(Long csoProfileId);
    
    List<CsoProfile> getAllCsoProfiles();
    
    List<Customer> getAllCustomers();
    
    List<TransEngineProfileMap> getAllTransEngineProfileMaps();

    //
    // tab-3
    //
    List<Users> getByUserIds(String userId);

    void persistUsers(String userId, String firstName, String lastName);

    void mergeUsers(Users users);

    void deleteUsers(String userId);

    //
    // tab-4
    //
    List<TranslationStatus> getTranslationStatusesBetween(Date start, Date end, Long customerId);

    List<Customer> getAllCutomers();

    //
    //  tab-5
    //
    /**
     *  
     */
    List<TranslationStatus> getActiveTranslationStatuses();
}
