/*
 * RenewTest.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:42 PM
 */

package net.abbht.lamo.persistence.loans;

import junit.framework.*;

/**
 *
 * @author home
 */
public class RenewTest extends TestCase {
    
    public RenewTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(RenewTest.class);
        
        return suite;
    }

    /**
     * Test of getId method, of class net.abbht.lamo.persistence.loans.Renew.
     */
    public void testGetId() {
        System.out.println("getId");
        
        Renew instance = new Renew();
        
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class net.abbht.lamo.persistence.loans.Renew.
     */
    public void testSetId() {
        System.out.println("setId");
        
        Long id = null;
        Renew instance = new Renew();
        
        instance.setId(id);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRenewdate method, of class net.abbht.lamo.persistence.loans.Renew.
     */
    public void testGetRenewdate() {
        System.out.println("getRenewdate");
        
        Renew instance = new Renew();
        
        java.sql.Date expResult = null;
        java.sql.Date result = instance.getRenewdate();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRenewdate method, of class net.abbht.lamo.persistence.loans.Renew.
     */
    public void testSetRenewdate() {
        System.out.println("setRenewdate");
        
        java.sql.Date renewdate = null;
        Renew instance = new Renew();
        
        instance.setRenewdate(renewdate);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemid method, of class net.abbht.lamo.persistence.loans.Renew.
     */
    public void testGetItemid() {
        System.out.println("getItemid");
        
        Renew instance = new Renew();
        
        String expResult = "";
        String result = instance.getItemid();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemid method, of class net.abbht.lamo.persistence.loans.Renew.
     */
    public void testSetItemid() {
        System.out.println("setItemid");
        
        String itemid = "";
        Renew instance = new Renew();
        
        instance.setItemid(itemid);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class net.abbht.lamo.persistence.loans.Renew.
     */
    public void testGetUsername() {
        System.out.println("getUsername");
        
        Renew instance = new Renew();
        
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class net.abbht.lamo.persistence.loans.Renew.
     */
    public void testSetUsername() {
        System.out.println("setUsername");
        
        String username = "";
        Renew instance = new Renew();
        
        instance.setUsername(username);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
