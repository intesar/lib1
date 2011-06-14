package com.cisco.altcso.dao;

import org.springframework.stereotype.Repository;

import com.cisco.altcso.domain.Person;

/**
 * Hibernate implementation of the Person DAO interface.
 */
@Repository
public class PersonDaoImpl extends GenericDaoImpl<Person, Long> implements PersonDao {
    public PersonDaoImpl() {
        super(Person.class);
    }
}