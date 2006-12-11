/*
 * LoanTest.java
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
public class LoanTest extends TestCase {
    
    public LoanTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(LoanTest.class);
        
        return suite;
    }

    /**
     * Test of getId method, of class net.abbht.lamo.persistence.loans.Loan.
     */
    public void testGetId() {
        System.out.println("getId");
        
        Loan instance = new Loan();
        
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class net.abbht.lamo.persistence.loans.Loan.
     */
    public void testSetId() {
        System.out.println("setId");
        
        Long id = null;
        Loan instance = new Loan();
        
        instance.setId(id);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReturndate method, of class net.abbht.lamo.persistence.loans.Loan.
     */
    public void testGetReturndate() {
        System.out.println("getReturndate");
        
        Loan instance = new Loan();
        
        java.sql.Date expResult = null;
        java.sql.Date result = instance.getReturndate();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReturndate method, of class net.abbht.lamo.persistence.loans.Loan.
     */
    public void testSetReturndate() {
        System.out.println("setReturndate");
        
        java.sql.Date returndate = null;
        Loan instance = new Loan();
        
        instance.setReturndate(returndate);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIsreturned method, of class net.abbht.lamo.persistence.loans.Loan.
     */
    public void testGetIsreturned() {
        System.out.println("getIsreturned");
        
        Loan instance = new Loan();
        
        boolean expResult = true;
        boolean result = instance.getIsreturned();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsreturned method, of class net.abbht.lamo.persistence.loans.Loan.
     */
    public void testSetIsreturned() {
        System.out.println("setIsreturned");
        
        boolean isreturned = true;
        Loan instance = new Loan();
        
        instance.setIsreturned(isreturned);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNoofrenews method, of class net.abbht.lamo.persistence.loans.Loan.
     */
    public void testGetNoofrenews() {
        System.out.println("getNoofrenews");
        
        Loan instance = new Loan();
        
        int expResult = 0;
        int result = instance.getNoofrenews();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNoofrenews method, of class net.abbht.lamo.persistence.loans.Loan.
     */
    public void testSetNoofrenews() {
        System.out.println("setNoofrenews");
        
        int noofrenews = 0;
        Loan instance = new Loan();
        
        instance.setNoofrenews(noofrenews);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuedate method, of class net.abbht.lamo.persistence.loans.Loan.
     */
    public void testGetDuedate() {
        System.out.println("getDuedate");
        
        Loan instance = new Loan();
        
        java.sql.Date expResult = null;
        java.sql.Date result = instance.getDuedate();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDuedate method, of class net.abbht.lamo.persistence.loans.Loan.
     */
    public void testSetDuedate() {
        System.out.println("setDuedate");
        
        java.sql.Date duedate = null;
        Loan instance = new Loan();
        
        instance.setDuedate(duedate);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalduedays method, of class net.abbht.lamo.persistence.loans.Loan.
     */
    public void testGetTotalduedays() {
        System.out.println("getTotalduedays");
        
        Loan instance = new Loan();
        
        int expResult = 0;
        int result = instance.getTotalduedays();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalduedays method, of class net.abbht.lamo.persistence.loans.Loan.
     */
    public void testSetTotalduedays() {
        System.out.println("setTotalduedays");
        
        int totalduedays = 0;
        Loan instance = new Loan();
        
        instance.setTotalduedays(totalduedays);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReturnto method, of class net.abbht.lamo.persistence.loans.Loan.
     */
    public void testGetReturnto() {
        System.out.println("getReturnto");
        
        Loan instance = new Loan();
        
        String expResult = "";
        String result = instance.getReturnto();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReturnto method, of class net.abbht.lamo.persistence.loans.Loan.
     */
    public void testSetReturnto() {
        System.out.println("setReturnto");
        
        String returnto = "";
        Loan instance = new Loan();
        
        instance.setReturnto(returnto);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIssuedate method, of class net.abbht.lamo.persistence.loans.Loan.
     */
    public void testGetIssuedate() {
        System.out.println("getIssuedate");
        
        Loan instance = new Loan();
        
        java.sql.Date expResult = null;
        java.sql.Date result = instance.getIssuedate();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIssuedate method, of class net.abbht.lamo.persistence.loans.Loan.
     */
    public void testSetIssuedate() {
        System.out.println("setIssuedate");
        
        java.sql.Date issuedate = null;
        Loan instance = new Loan();
        
        instance.setIssuedate(issuedate);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIssueby method, of class net.abbht.lamo.persistence.loans.Loan.
     */
    public void testGetIssueby() {
        System.out.println("getIssueby");
        
        Loan instance = new Loan();
        
        String expResult = "";
        String result = instance.getIssueby();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIssueby method, of class net.abbht.lamo.persistence.loans.Loan.
     */
    public void testSetIssueby() {
        System.out.println("setIssueby");
        
        String issueby = "";
        Loan instance = new Loan();
        
        instance.setIssueby(issueby);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemid method, of class net.abbht.lamo.persistence.loans.Loan.
     */
    public void testGetItemid() {
        System.out.println("getItemid");
        
        Loan instance = new Loan();
        
        String expResult = "";
        String result = instance.getItemid();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemid method, of class net.abbht.lamo.persistence.loans.Loan.
     */
    public void testSetItemid() {
        System.out.println("setItemid");
        
        String itemid = "";
        Loan instance = new Loan();
        
        instance.setItemid(itemid);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class net.abbht.lamo.persistence.loans.Loan.
     */
    public void testGetUsername() {
        System.out.println("getUsername");
        
        Loan instance = new Loan();
        
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class net.abbht.lamo.persistence.loans.Loan.
     */
    public void testSetUsername() {
        System.out.println("setUsername");
        
        String username = "";
        Loan instance = new Loan();
        
        instance.setUsername(username);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
