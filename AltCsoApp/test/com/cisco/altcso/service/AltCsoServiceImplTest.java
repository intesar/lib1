/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cisco.altcso.service;

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
public class AltCsoServiceImplTest {
    
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
        AltCsoServiceImpl instance = new AltCsoServiceImpl();
        List expResult = null;
        List result = instance.getActiveTranslationStatuses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerByName method, of class AltCsoServiceImpl.
     */
    @Test
    public void testGetCustomerByName() {
        System.out.println("getCustomerByName");
        String keyword = "";
        AltCsoServiceImpl instance = new AltCsoServiceImpl();
        List expResult = null;
        List result = instance.getCustomerByName(keyword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveCustomer method, of class AltCsoServiceImpl.
     */
    @Test
    public void testSaveCustomer() {
        System.out.println("saveCustomer");
        Customer customer = null;
        AltCsoServiceImpl instance = new AltCsoServiceImpl();
        instance.saveCustomer(customer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteCustomer method, of class AltCsoServiceImpl.
     */
    @Test
    public void testDeleteCustomer() {
        System.out.println("deleteCustomer");
        Long customerId = null;
        AltCsoServiceImpl instance = new AltCsoServiceImpl();
        instance.deleteCustomer(customerId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTranslationStatusesBetween method, of class AltCsoServiceImpl.
     */
    @Test
    public void testGetTranslationStatusesBetween() {
        System.out.println("getTranslationStatusesBetween");
        Date start = null;
        Date end = null;
        Long customerId = null;
        AltCsoServiceImpl instance = new AltCsoServiceImpl();
        List expResult = null;
        List result = instance.getTranslationStatusesBetween(start, end, customerId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllCutomers method, of class AltCsoServiceImpl.
     */
    @Test
    public void testGetAllCutomers() {
        System.out.println("getAllCutomers");
        AltCsoServiceImpl instance = new AltCsoServiceImpl();
        List expResult = null;
        List result = instance.getAllCutomers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByUserIds method, of class AltCsoServiceImpl.
     */
    @Test
    public void testGetByUserIds() {
        System.out.println("getByUserIds");
        String userId = "";
        AltCsoServiceImpl instance = new AltCsoServiceImpl();
        List expResult = null;
        List result = instance.getByUserIds(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of persistUsers method, of class AltCsoServiceImpl.
     */
    @Test
    public void testPersistUsers() {
        System.out.println("persistUsers");
        String userId = "";
        String firstName = "";
        String lastName = "";
        AltCsoServiceImpl instance = new AltCsoServiceImpl();
        instance.persistUsers(userId, firstName, lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mergeUsers method, of class AltCsoServiceImpl.
     */
    @Test
    public void testMergeUsers() {
        System.out.println("mergeUsers");
        Users users = null;
        AltCsoServiceImpl instance = new AltCsoServiceImpl();
        instance.mergeUsers(users);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUsers method, of class AltCsoServiceImpl.
     */
    @Test
    public void testDeleteUsers() {
        System.out.println("deleteUsers");
        String userId = "";
        AltCsoServiceImpl instance = new AltCsoServiceImpl();
        instance.deleteUsers(userId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
