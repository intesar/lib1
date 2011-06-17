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
            DateFormat df = new SimpleDateFormat("MM/dd/YYYY");
            Date startDate = df.parse(start);
            Date endDate = df.parse(end);
            return altCsoService.getTranslationStatusesBetween(startDate, endDate, customerId);
        } catch (ParseException ex) {
            //Logger.getLogger(AltCsoAjax.class.getName()).log(Level.SEVERE, null, ex);
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
