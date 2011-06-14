package com.cisco.altcso.dao;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.cisco.altcso.domain.Customer;

/**
 * Hibernate implementation of the Customer DAO interface.
 */
@Repository
public class CustomerDaoImpl extends GenericDaoImpl<Customer, Long> implements CustomerDao {
    public CustomerDaoImpl() {
        super(Customer.class);
    }

    @Override
    public List<Customer> findByGroupName(String keyword) {
        return this.entityManager.createNamedQuery("Customer.findByGroupName")
                .setParameter("groupName", keyword)
                .getResultList();
    }
}