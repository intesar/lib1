package com.cisco.altcso.service;

import com.cisco.altcso.domain.Customer;
import com.cisco.altcso.domain.TranslationStatus;
import com.cisco.altcso.domain.Users;
import java.text.DateFormat;
import java.text.ParseException;
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

    public List<TranslationStatus> getActiveTranslationStatuses() {
        try {
            return this.altCsoService.getActiveTranslationStatuses();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public List<Customer> getCustomerByName(String keyword) {
        return this.altCsoService.getCustomerByName(keyword);
    }

    public void saveCustomer(Customer customer) {
        altCsoService.saveCustomer(customer);
    }

    public void deleteCustomer(Long customerId) {
        altCsoService.deleteCustomer(customerId);
    }

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
    
    public List<Customer> getAllCutomers() {
        return this.altCsoService.getAllCutomers();
    }
    
    // tab-3
    public List<Users> getByUserIds(String userId) {
        return this.altCsoService.getByUserIds(userId);
    }
    
    public void persistUsers(String userId, String firstName, String lastName) {
        this.altCsoService.persistUsers(userId, firstName, lastName);
    }
    
    public void mergeUsers(Users users) {
        this.altCsoService.mergeUsers(users);
    }
    
    public void deleteUsers(String userId) {
        this.altCsoService.deleteUsers(userId);
    }
}
