package com.cisco.altcso.service;

import com.cisco.altcso.domain.CsoProfile;
import com.cisco.altcso.domain.Customer;
import com.cisco.altcso.domain.TranslationStatus;
import com.cisco.altcso.domain.Users;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Intesar Mohammed
 */
public class AltCsoAjax {

    @Autowired
    protected AltCsoService altCsoService;

    //////////////////////////////////////
    //  Tab 1
    //////////////////////////////////////
    /**
     * 
     * @param keyword
     * @return 
     */
    public List<Customer> searchCustomerByName(String keyword) {
        return this.altCsoService.getCustomerByName(keyword);
    }

    /**
     * 
     * @param customer 
     */
    public void mergeCustomer(Customer customer) {
        altCsoService.mergeCustomer(customer);
    }

    /**
     * 
     * @param customer 
     */
    public void persistCustomer(Customer customer) {
        altCsoService.persistCustomer(customer);
    }

    /**
     * 
     * @param customerId 
     */
    public void deleteCustomer(Long customerId) {
        altCsoService.deleteCustomer(customerId);
    }

    /**
     * 
     * @return 
     */
    public List<Customer> getAllCutomers() {
        return this.altCsoService.getAllCutomers();
    }

    //////////////////////////////////////
    //  Tab 2
    //////////////////////////////////////
    /**
     * 
     * @param name
     * @return 
     */
    public List<CsoProfile> searchCsoProfiles(String name) {
        return this.altCsoService.searchCsoProfiles(name);
    }

    /**
     * 
     * @param csoProfile 
     */
    public void mergeCsoProfile(CsoProfile csoProfile) {
        this.altCsoService.mergeCsoProfile(csoProfile);

    }

    /**
     * 
     * @param csoProfileId 
     */
    public void deleteCsoProfile(Long csoProfileId) {
        this.altCsoService.deleteCsoProfile(csoProfileId);
    }

    //////////////////////////////////////
    //  Tab 3
    //////////////////////////////////////
    /**
     * 
     * @param userId
     * @return 
     */
    public List<Users> getByUserIds(String userId) {
        return this.altCsoService.getByUserIds(userId);
    }

    /**
     * 
     * @param userId
     * @param firstName
     * @param lastName 
     */
    public void persistUsers(String userId, String firstName, String lastName) {
        this.altCsoService.persistUsers(userId, firstName, lastName);
    }

    /**
     * 
     */
    public void mergeUsers(Users users) {
        this.altCsoService.mergeUsers(users);
    }

    /**
     * 
     * @param userId 
     */
    public void deleteUsers(String userId) {
        this.altCsoService.deleteUsers(userId);
    }

    //////////////////////////////////////
    //  Tab 4
    //////////////////////////////////////
    /**
     * 
     * @param start
     * @param end
     * @param customerId
     * @return 
     */
    public List<TranslationStatus> getTranslationStatusesBetween(String start, String end, Long customerId) {
        try {
            System.out.println(start);
            System.out.println(end);
            System.out.println(customerId);

            DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
            Date startDate = df.parse(start);

            DateFormat df1 = new SimpleDateFormat("MM/dd/yyyy");
            Date endDate = df1.parse(end);

            System.out.println(startDate);
            System.out.println(endDate);
            System.out.println(customerId);
            return altCsoService.getTranslationStatusesBetween(startDate, endDate, customerId);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //////////////////////////////////////
    //  Tab 5
    //////////////////////////////////////
    /**
     * 
     * @return 
     */
    public List<TranslationStatus> getActiveTranslationStatuses() {
        try {
            return this.altCsoService.getActiveTranslationStatuses();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
