package com.cisco.altcso.service;

import com.cisco.altcso.dao.CsoProfileDao;
import com.cisco.altcso.dao.CustomerCsoProfileMapDao;
import com.cisco.altcso.dao.CustomerDao;
import com.cisco.altcso.dao.TransEngineProfileMapDao;
import com.cisco.altcso.dao.TranslationStatusDao;
import com.cisco.altcso.dao.UsersDao;
import com.cisco.altcso.domain.CsoProfile;
import com.cisco.altcso.domain.Customer;
import com.cisco.altcso.domain.CustomerCsoProfileMap;
import com.cisco.altcso.domain.TransEngineProfileMap;
import com.cisco.altcso.domain.TranslationStatus;
import com.cisco.altcso.domain.Users;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Intesar Mohammed
 */
@Service(value = "altCsoServiceImpl")
@Transactional
public class AltCsoServiceImpl implements AltCsoService {

    @Autowired
    protected TranslationStatusDao translationStatusDao;
    @Autowired
    protected CustomerDao customerDao;
    @Autowired
    protected UsersDao usersDao;
    @Autowired
    protected CsoProfileDao csoProfileDao;
    @Autowired
    protected TransEngineProfileMapDao transEngineProfileMapDao;
    @Autowired
    protected CustomerCsoProfileMapDao customerCsoProfileMapDao;

    @Override
    public List<TranslationStatus> getActiveTranslationStatuses() {
        return translationStatusDao.findByStatus("Requested");
    }

    @Override
    public List<Customer> getCustomerByName(String keyword) {
        String padding = "%";
        return customerDao.findByGroupName(padding + keyword + padding);
    }

    @Override
    public void persistCustomer(Customer customer) {
        List<Customer> c = null;
        try {
            c = customerDao.findByGroupName(customer.getGroupName());
            if (c != null && !c.isEmpty()) {
                throw new RuntimeException("Username is already in use");
            }
        } catch (Exception ex) {
            if (c != null && !c.isEmpty()) {
                throw new RuntimeException("Username is already in use");
            }
        }
        customer.setCreateDate(new Date());
        if (customer.getAppkey() == null || customer.getAppkey().length() == 0) {
            customer.setAppkey(generateAppkey());
        }
        customerDao.persist(customer);
    }

    @Override
    public void addDefaultProfiles(Customer customer) {
        List<CsoProfile> list = this.csoProfileDao.findByDefaultProfile("Y");
        for (CsoProfile profile : list) {
            CustomerCsoProfileMap map = new CustomerCsoProfileMap();
            map.setCsoProfileId(profile);
            map.setCustomerId(customer);
            this.customerCsoProfileMapDao.persist(map);
        }
    }

    @Override
    public void mergeCustomer(Customer customer) {
        customerDao.merge(customer);
    }

    @Override
    public void deleteCustomer(Long customerId) {
        Customer customer = customerDao.find(customerId);
        customerDao.delete(customer);
    }

    @Override
    public List<TranslationStatus> getTranslationStatusesBetween(Date start, Date end, Long customerId) {
        if (customerId == 0) {
            return this.translationStatusDao.findByCustomerIdBetweenDates(customerId, start, end);
        } else {
            return this.translationStatusDao.findBetweenDates(start, end);
        }
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

    @Override
    public List<CsoProfile> searchCsoProfiles(String name) {
        return this.csoProfileDao.findByCsoProfileName(name);
    }

    @Override
    public void mergeCsoProfile(CsoProfile csoProfile) {
        if (csoProfile.getTransEngineProfileMapId() != null) {
            Long id = csoProfile.getTransEngineProfileMapId().getTransEngineProfileId();
            TransEngineProfileMap map = this.transEngineProfileMapDao.find(id);
            csoProfile.setTransEngineProfileMapId(map);
        }

        if (csoProfile.getCsoProfileId() == null) {
            this.csoProfileDao.persist(csoProfile);
        } else {
            this.csoProfileDao.merge(csoProfile);
        }
    }

    @Override
    public void deleteCsoProfile(Long csoProfileId) {
        CsoProfile csoProfile = this.csoProfileDao.find(csoProfileId);
        this.csoProfileDao.delete(csoProfile);
    }

    @Override
    public String generateAppkey() {
//        Long currentKey = this.customerDao.findMaxOfAppkey();
//        if (currentKey == null) {
//            currentKey = 1L;
//        }
//        return ++currentKey;
        Long key = Calendar.getInstance().getTimeInMillis();
        return String.valueOf(key);
    }

    @Override
    public List<CsoProfile> getAllCsoProfiles() {
        return this.csoProfileDao.findAll();
    }

    @Override
    public List<Customer> getAllCustomers() {
        return this.customerDao.findAll();
    }

    @Override
    public List<TransEngineProfileMap> getAllTransEngineProfileMaps() {
        return this.transEngineProfileMapDao.findAll();

    }
}
