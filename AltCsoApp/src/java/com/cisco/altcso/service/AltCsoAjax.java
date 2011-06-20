package com.cisco.altcso.service;

import com.cisco.altcso.domain.CsoProfile;
import com.cisco.altcso.domain.Customer;
import com.cisco.altcso.domain.TranslationStatus;
import com.cisco.altcso.domain.Users;
import com.cisco.altcso.exception.DuplicateUserIdException;
import com.cisco.altcso.exception.ErrorProcessingRequest;
import com.cisco.altcso.exception.NoDataFoundException;
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
        try {
            List<Customer> list = this.altCsoService.getCustomerByName(keyword);
            return list;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        throw new NoDataFoundException();
    }

    /**
     * 
     * @param customer 
     */
    public void mergeCustomer(Customer customer) {
        try {
            altCsoService.mergeCustomer(customer);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        throw new ErrorProcessingRequest();
    }

    /**
     * 
     * @param customer 
     */
    public void persistCustomer(Customer customer) {
        try {
            altCsoService.persistCustomer(customer);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        throw new ErrorProcessingRequest();
    }

    /**
     * 
     * @param customerId 
     */
    public void deleteCustomer(Long customerId) {
        try {
            altCsoService.deleteCustomer(customerId);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        throw new ErrorProcessingRequest();
    }

    /**
     * 
     * @return 
     */
    public List<Customer> getAllCutomers() {
        try {
            return this.altCsoService.getAllCutomers();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        throw new ErrorProcessingRequest();
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
        try {
            return this.altCsoService.searchCsoProfiles(name);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        throw new NoDataFoundException();
    }

    /**
     * 
     * @param csoProfile 
     */
    public void mergeCsoProfile(CsoProfile csoProfile) {
        try {
            this.altCsoService.mergeCsoProfile(csoProfile);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        throw new ErrorProcessingRequest();

    }

    /**
     * 
     * @param csoProfileId 
     */
    public void deleteCsoProfile(Long csoProfileId) {
        try {
            this.altCsoService.deleteCsoProfile(csoProfileId);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        throw new ErrorProcessingRequest();
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
        try {
            return this.altCsoService.getByUserIds(userId);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        throw new NoDataFoundException();
    }

    /**
     * 
     * @param userId
     * @param firstName
     * @param lastName 
     */
    public void persistUsers(String userId, String firstName, String lastName) {
        try {
            List<Users> users = this.altCsoService.getByUserIds(userId);
            for (Users u : users ) {
                if ( userId.equalsIgnoreCase(u.getUserId())){
                    throw new DuplicateUserIdException();
                }
            }
            this.altCsoService.persistUsers(userId, firstName, lastName);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        throw new ErrorProcessingRequest();
    }

    /**
     * 
     */
    public void mergeUsers(Users users) {
        try {
            this.altCsoService.mergeUsers(users);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        throw new ErrorProcessingRequest();
    }

    /**
     * 
     * @param userId 
     */
    public void deleteUsers(String userId) {
        try {
            this.altCsoService.deleteUsers(userId);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        throw new ErrorProcessingRequest();
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
        throw new NoDataFoundException();
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
        throw new ErrorProcessingRequest();
    }
}
