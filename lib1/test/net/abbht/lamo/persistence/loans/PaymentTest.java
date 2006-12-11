/*
 * PaymentTest.java
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
public class PaymentTest extends TestCase {
    
    public PaymentTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(PaymentTest.class);
        
        return suite;
    }

    /**
     * Test of getId method, of class net.abbht.lamo.persistence.loans.Payment.
     */
    public void testGetId() {
        System.out.println("getId");
        
        Payment instance = new Payment();
        
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class net.abbht.lamo.persistence.loans.Payment.
     */
    public void testSetId() {
        System.out.println("setId");
        
        Long id = null;
        Payment instance = new Payment();
        
        instance.setId(id);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFine method, of class net.abbht.lamo.persistence.loans.Payment.
     */
    public void testGetFine() {
        System.out.println("getFine");
        
        Payment instance = new Payment();
        
        int expResult = 0;
        int result = instance.getFine();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFine method, of class net.abbht.lamo.persistence.loans.Payment.
     */
    public void testSetFine() {
        System.out.println("setFine");
        
        int fine = 0;
        Payment instance = new Payment();
        
        instance.setFine(fine);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPaidto method, of class net.abbht.lamo.persistence.loans.Payment.
     */
    public void testGetPaidto() {
        System.out.println("getPaidto");
        
        Payment instance = new Payment();
        
        String expResult = "";
        String result = instance.getPaidto();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPaidto method, of class net.abbht.lamo.persistence.loans.Payment.
     */
    public void testSetPaidto() {
        System.out.println("setPaidto");
        
        String paidto = "";
        Payment instance = new Payment();
        
        instance.setPaidto(paidto);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescrib method, of class net.abbht.lamo.persistence.loans.Payment.
     */
    public void testGetDescrib() {
        System.out.println("getDescrib");
        
        Payment instance = new Payment();
        
        String expResult = "";
        String result = instance.getDescrib();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescrib method, of class net.abbht.lamo.persistence.loans.Payment.
     */
    public void testSetDescrib() {
        System.out.println("setDescrib");
        
        String describ = "";
        Payment instance = new Payment();
        
        instance.setDescrib(describ);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDaysfor method, of class net.abbht.lamo.persistence.loans.Payment.
     */
    public void testGetDaysfor() {
        System.out.println("getDaysfor");
        
        Payment instance = new Payment();
        
        int expResult = 0;
        int result = instance.getDaysfor();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDaysfor method, of class net.abbht.lamo.persistence.loans.Payment.
     */
    public void testSetDaysfor() {
        System.out.println("setDaysfor");
        
        int daysfor = 0;
        Payment instance = new Payment();
        
        instance.setDaysfor(daysfor);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class net.abbht.lamo.persistence.loans.Payment.
     */
    public void testGetUsername() {
        System.out.println("getUsername");
        
        Payment instance = new Payment();
        
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class net.abbht.lamo.persistence.loans.Payment.
     */
    public void testSetUsername() {
        System.out.println("setUsername");
        
        String username = "";
        Payment instance = new Payment();
        
        instance.setUsername(username);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class net.abbht.lamo.persistence.loans.Payment.
     */
    public void testGetDate() {
        System.out.println("getDate");
        
        Payment instance = new Payment();
        
        java.sql.Date expResult = null;
        java.sql.Date result = instance.getDate();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class net.abbht.lamo.persistence.loans.Payment.
     */
    public void testSetDate() {
        System.out.println("setDate");
        
        java.sql.Date date = null;
        Payment instance = new Payment();
        
        instance.setDate(date);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
