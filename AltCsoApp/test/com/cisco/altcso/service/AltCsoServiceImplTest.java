/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cisco.altcso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.cisco.altcso.domain.CsoProfile;
import com.cisco.altcso.domain.Customer;
import com.cisco.altcso.domain.Users;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Intesar Mohammed
 */

@RunWith(SpringJUnit4ClassRunner.class)
// ApplicationContext will be loaded from "/applicationContext.xml" 
// in the root of the classpath
@ContextConfiguration(locations={"/applicationContext.xml"})
@TransactionConfiguration(transactionManager="txManager", defaultRollback=true)
@Transactional
public class AltCsoServiceImplTest {
    
    @Autowired
    AltCsoService instance;
    
    public AltCsoServiceImplTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getActiveTranslationStatuses method, of class AltCsoServiceImpl.
     */
    @Test
    public void testGetActiveTranslationStatuses() {
        System.out.println("getActiveTranslationStatuses");
        List result = instance.getActiveTranslationStatuses();
        assertNotNull(result);
    }

    /**
     * Test of getCustomerByName method, of class AltCsoServiceImpl.
     */
    @Test
    public void testGetCustomerByName() {
        System.out.println("getCustomerByName");
        String keyword = "s";
        List expResult = null;
        List result = instance.getCustomerByName(keyword);
        //assertEquals(expResult, result);
        
    }

    /**
     * Test of persistCustomer method, of class AltCsoServiceImpl.
     */
    @Test
    public void testPersistCustomer() {
        System.out.println("persistCustomer");
        Customer customer = new Customer();
        customer.setAppkey("xx");
        customer.setCreateDate(new Date());
        //customer.setCustomerId(1L);
        customer.setExpiryDate(new Date());
        customer.setGroupName("cisco");
        customer.setMaxPriority(9L);
        customer.setTmx("Y");
        instance.persistCustomer(customer);
        
    }

    /**
     * Test of mergeCustomer method, of class AltCsoServiceImpl.
     */
    @Test
    public void testMergeCustomer() {
        System.out.println("mergeCustomer");
        Customer customer = new Customer();
        customer.setAppkey("yy");
        customer.setCreateDate(new Date());
        customer.setCustomerId(1L);
        customer.setExpiryDate(new Date());
        customer.setGroupName("cisco");
        customer.setMaxPriority(9L);
        customer.setTmx("Y");
        instance.mergeCustomer(customer);
        
    }

    /**
     * Test of deleteCustomer method, of class AltCsoServiceImpl.
     */
    @Test
    public void testDeleteCustomer() {
        System.out.println("deleteCustomer");
        Long customerId = 1L;
        instance.deleteCustomer(customerId);
        
    }

    /**
     * Test of getTranslationStatusesBetween method, of class AltCsoServiceImpl.
     */
    @Test
    public void testGetTranslationStatusesBetween() {
        System.out.println("getTranslationStatusesBetween");
        Date start = new Date();
        Date end = new Date();
        Long customerId = 1L;
        List expResult = null;
        List result = instance.getTranslationStatusesBetween(start, end, customerId);
        //assertEquals(expResult, result);
        
    }

    /**
     * Test of getAllCutomers method, of class AltCsoServiceImpl.
     */
    @Test
    public void testGetAllCutomers() {
        System.out.println("getAllCutomers");
        List expResult = null;
        List result = instance.getAllCutomers();
        //assertEquals(expResult, result);
        
    }

    /**
     * Test of getByUserIds method, of class AltCsoServiceImpl.
     */
    @Test
    public void testGetByUserIds() {
        System.out.println("getByUserIds");
        String userId = "s";
        List expResult = null;
        List result = instance.getByUserIds(userId);
        //assertEquals(expResult, result);
        
    }

    /**
     * Test of persistUsers method, of class AltCsoServiceImpl.
     */
    @Test
    public void testPersistUsers() {
        System.out.println("persistUsers");
        String userId = "syra";
        String firstName = "syra";
        String lastName = "nawaz";
        instance.persistUsers(userId, firstName, lastName);
        
    }

    /**
     * Test of mergeUsers method, of class AltCsoServiceImpl.
     */
    @Test
    public void testMergeUsers() {
        System.out.println("mergeUsers");
        Users users = new Users();
        users.setFirstName("syra");
        users.setLastName("nawaz");
        users.setUserId("syra");
        instance.mergeUsers(users);
        
    }

    /**
     * Test of deleteUsers method, of class AltCsoServiceImpl.
     */
    @Test
    public void testDeleteUsers() {
        System.out.println("deleteUsers");
        String userId = "syra";
        //instance.deleteUsers(userId);
        
    }

    /**
     * Test of searchCsoProfiles method, of class AltCsoServiceImpl.
     */
    @Test
    public void testSearchCsoProfiles() {
        System.out.println("searchCsoProfiles");
        String name = "s";
        List expResult = null;
        List result = instance.searchCsoProfiles(name);
        //assertEquals(expResult, result);
        
    }

    /**
     * Test of mergeCsoProfile method, of class AltCsoServiceImpl.
     */
    @Test
    public void testMergeCsoProfile() {
        System.out.println("mergeCsoProfile");
        CsoProfile csoProfile = new CsoProfile();
        //instance.mergeCsoProfile(csoProfile);
        
    }

    /**
     * Test of deleteCsoProfile method, of class AltCsoServiceImpl.
     */
    @Test
    public void testDeleteCsoProfile() {
        System.out.println("deleteCsoProfile");
        Long csoProfileId = 1L;
        instance.deleteCsoProfile(csoProfileId);
        
    }
}
