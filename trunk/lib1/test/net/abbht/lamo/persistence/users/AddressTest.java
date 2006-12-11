/*
 * AddressTest.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:42 PM
 */

package net.abbht.lamo.persistence.users;

import junit.framework.*;

/**
 *
 * @author home
 */
public class AddressTest extends TestCase {
    
    public AddressTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(AddressTest.class);
        
        return suite;
    }

    /**
     * Test of getId method, of class net.abbht.lamo.persistence.users.Address.
     */
    public void testGetId() {
        System.out.println("getId");
        
        Address instance = new Address();
        
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class net.abbht.lamo.persistence.users.Address.
     */
    public void testSetId() {
        System.out.println("setId");
        
        Long id = null;
        Address instance = new Address();
        
        instance.setId(id);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCity method, of class net.abbht.lamo.persistence.users.Address.
     */
    public void testGetCity() {
        System.out.println("getCity");
        
        Address instance = new Address();
        
        String expResult = "";
        String result = instance.getCity();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCity method, of class net.abbht.lamo.persistence.users.Address.
     */
    public void testSetCity() {
        System.out.println("setCity");
        
        String city = "";
        Address instance = new Address();
        
        instance.setCity(city);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getState method, of class net.abbht.lamo.persistence.users.Address.
     */
    public void testGetState() {
        System.out.println("getState");
        
        Address instance = new Address();
        
        String expResult = "";
        String result = instance.getState();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setState method, of class net.abbht.lamo.persistence.users.Address.
     */
    public void testSetState() {
        System.out.println("setState");
        
        String state = "";
        Address instance = new Address();
        
        instance.setState(state);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStreet method, of class net.abbht.lamo.persistence.users.Address.
     */
    public void testGetStreet() {
        System.out.println("getStreet");
        
        Address instance = new Address();
        
        String expResult = "";
        String result = instance.getStreet();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStreet method, of class net.abbht.lamo.persistence.users.Address.
     */
    public void testSetStreet() {
        System.out.println("setStreet");
        
        String street = "";
        Address instance = new Address();
        
        instance.setStreet(street);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZipcode method, of class net.abbht.lamo.persistence.users.Address.
     */
    public void testGetZipcode() {
        System.out.println("getZipcode");
        
        Address instance = new Address();
        
        String expResult = "";
        String result = instance.getZipcode();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setZipcode method, of class net.abbht.lamo.persistence.users.Address.
     */
    public void testSetZipcode() {
        System.out.println("setZipcode");
        
        String zipcode = "";
        Address instance = new Address();
        
        instance.setZipcode(zipcode);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCountry method, of class net.abbht.lamo.persistence.users.Address.
     */
    public void testGetCountry() {
        System.out.println("getCountry");
        
        Address instance = new Address();
        
        String expResult = "";
        String result = instance.getCountry();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCountry method, of class net.abbht.lamo.persistence.users.Address.
     */
    public void testSetCountry() {
        System.out.println("setCountry");
        
        String country = "";
        Address instance = new Address();
        
        instance.setCountry(country);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class net.abbht.lamo.persistence.users.Address.
     */
    public void testGetUsername() {
        System.out.println("getUsername");
        
        Address instance = new Address();
        
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class net.abbht.lamo.persistence.users.Address.
     */
    public void testSetUsername() {
        System.out.println("setUsername");
        
        String username = "";
        Address instance = new Address();
        
        instance.setUsername(username);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class net.abbht.lamo.persistence.users.Address.
     */
    public void testGetType() {
        System.out.println("getType");
        
        Address instance = new Address();
        
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class net.abbht.lamo.persistence.users.Address.
     */
    public void testSetType() {
        System.out.println("setType");
        
        String type = "";
        Address instance = new Address();
        
        instance.setType(type);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnable method, of class net.abbht.lamo.persistence.users.Address.
     */
    public void testGetEnable() {
        System.out.println("getEnable");
        
        Address instance = new Address();
        
        int expResult = 0;
        int result = instance.getEnable();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnable method, of class net.abbht.lamo.persistence.users.Address.
     */
    public void testSetEnable() {
        System.out.println("setEnable");
        
        int enable = 0;
        Address instance = new Address();
        
        instance.setEnable(enable);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUpdationDate method, of class net.abbht.lamo.persistence.users.Address.
     */
    public void testGetUpdationDate() {
        System.out.println("getUpdationDate");
        
        Address instance = new Address();
        
        java.sql.Date expResult = null;
        java.sql.Date result = instance.getUpdationDate();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUpdationDate method, of class net.abbht.lamo.persistence.users.Address.
     */
    public void testSetUpdationDate() {
        System.out.println("setUpdationDate");
        
        java.sql.Date UpdationDate = null;
        Address instance = new Address();
        
        instance.setUpdationDate(UpdationDate);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
