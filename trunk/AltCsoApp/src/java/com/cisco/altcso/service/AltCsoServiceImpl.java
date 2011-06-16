package com.cisco.altcso.service;

import com.cisco.altcso.dao.CustomerDao;
import com.cisco.altcso.dao.TranslationStatusDao;
import com.cisco.altcso.dao.UsersDao;
import com.cisco.altcso.domain.Customer;
import com.cisco.altcso.domain.TranslationStatus;
import com.cisco.altcso.domain.Users;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Intesar Mohammed
 */
@Service(value = "altCsoServiceImpl")
public class AltCsoServiceImpl implements AltCsoService {

    @Autowired
    protected TranslationStatusDao translationStatusDao;
    @Autowired
    protected CustomerDao customerDao;
    @Autowired
    protected UsersDao usersDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<TranslationStatus> getActiveTranslationStatuses() {
        return translationStatusDao.findByStatus("Requested");
    }

    @Override
    public List<Customer> getCustomerByName(String keyword) {
        String padding = "%";
        return customerDao.findByGroupName(padding + keyword + padding);
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerDao.merge(customer);
    }

    @Override
    public void deleteCustomer(Long customerId) {
        Customer customer = customerDao.find(customerId);
        customerDao.delete(customer);
    }

    @Override
    public List<TranslationStatus> getTranslationStatusesBetween(Date start, Date end, Long customerId) {
        return this.translationStatusDao.findByCustomerIdBetweenDates(customerId, start, end);
    }

    @Override
    public List<Customer> getAllCutomers() {
        return this.customerDao.findAll();
    }

    @Override
    public List<Users> getByUserIds(String userId) {
        return this.usersDao.findByUserId(userId);
    }

    @Override
    public void persistUsers(String userId, String firstName, String lastName) {
        Users user = new Users();
        user.setUserId(userId);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        
        this.usersDao.persist(user);
    }

    @Override
    public void mergeUsers(Users users) {
        this.usersDao.merge(users);
    }

    @Override
    public void deleteUsers(String userId) {
        Users user = this.usersDao.find(userId);
        this.usersDao.delete(user);
    }
    
    
}
