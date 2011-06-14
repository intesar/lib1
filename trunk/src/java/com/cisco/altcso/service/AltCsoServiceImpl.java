package com.cisco.altcso.service;

import com.cisco.altcso.dao.CustomerDao;
import com.cisco.altcso.dao.TranslationStatusDao;
import com.cisco.altcso.domain.Customer;
import com.cisco.altcso.domain.TranslationStatus;
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
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
