/*
 * PhoneTest.java
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
public class PhoneTest extends TestCase {
    
    public PhoneTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(PhoneTest.class);
        
        return suite;
    }

    /**
     * Test of getId method, of class net.abbht.lamo.persistence.users.Phone.
     */
    public void testGetId() {
        System.out.println("getId");
        
        Phone instance = new Phone();
        
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class net.abbht.lamo.persistence.users.Phone.
     */
    public void testSetId() {
        System.out.println("setId");
        
        Long id = null;
        Phone instance = new Phone();
        
        instance.setId(id);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class net.abbht.lamo.persistence.users.Phone.
     */
    public void testGetType() {
        System.out.println("getType");
        
        Phone instance = new Phone();
        
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class net.abbht.lamo.persistence.users.Phone.
     */
    public void testSetType() {
        System.out.println("setType");
        
        String type = "";
        Phone instance = new Phone();
        
        instance.setType(type);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class net.abbht.lamo.persistence.users.Phone.
     */
    public void testGetUsername() {
        System.out.println("getUsername");
        
        Phone instance = new Phone();
        
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class net.abbht.lamo.persistence.users.Phone.
     */
    public void testSetUsername() {
        System.out.println("setUsername");
        
        String username = "";
        Phone instance = new Phone();
        
        instance.setUsername(username);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhoneNo method, of class net.abbht.lamo.persistence.users.Phone.
     */
    public void testGetPhoneNo() {
        System.out.println("getPhoneNo");
        
        Phone instance = new Phone();
        
        String expResult = "";
        String result = instance.getPhoneNo();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhoneNo method, of class net.abbht.lamo.persistence.users.Phone.
     */
    public void testSetPhoneNo() {
        System.out.println("setPhoneNo");
        
        String phoneNo = "";
        Phone instance = new Phone();
        
        instance.setPhoneNo(phoneNo);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreationDate method, of class net.abbht.lamo.persistence.users.Phone.
     */
    public void testGetCreationDate() {
        System.out.println("getCreationDate");
        
        Phone instance = new Phone();
        
        java.sql.Date expResult = null;
        java.sql.Date result = instance.getCreationDate();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCreationDate method, of class net.abbht.lamo.persistence.users.Phone.
     */
    public void testSetCreationDate() {
        System.out.println("setCreationDate");
        
        java.sql.Date creationDate = null;
        Phone instance = new Phone();
        
        instance.setCreationDate(creationDate);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
