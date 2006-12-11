/*
 * LoanFacadeTest.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:41 PM
 */

package net.abbht.lamo.facades.loans;

import junit.framework.*;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import net.abbht.lamo.persistence.loans.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author home
 */
public class LoanFacadeTest extends TestCase {
    
    public LoanFacadeTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(LoanFacadeTest.class);
        
        return suite;
    }

    /**
     * Test of saveLoan method, of class net.abbht.lamo.facades.loans.LoanFacade.
     */
    public void testSaveLoan() {
        System.out.println("saveLoan");
        
        Loan loan = null;
        LoanFacade instance = new LoanFacade();
        
        instance.saveLoan(loan);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByPrimaryKey method, of class net.abbht.lamo.facades.loans.LoanFacade.
     */
    public void testFindByPrimaryKey() {
        System.out.println("findByPrimaryKey");
        
        Object key = null;
        LoanFacade instance = new LoanFacade();
        
        Loan expResult = null;
        Loan result = instance.findByPrimaryKey(key);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByLoan method, of class net.abbht.lamo.facades.loans.LoanFacade.
     */
    public void testFindByLoan() {
        System.out.println("findByLoan");
        
        Date duedate = null;
        LoanFacade instance = new LoanFacade();
        
        Loan expResult = null;
        Loan result = instance.findByLoan(duedate);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByUserName method, of class net.abbht.lamo.facades.loans.LoanFacade.
     */
    public void testFindByUserName() {
        System.out.println("findByUserName");
        
        String username = "";
        LoanFacade instance = new LoanFacade();
        
        List expResult = null;
        List result = instance.findByUserName(username);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByItemId method, of class net.abbht.lamo.facades.loans.LoanFacade.
     */
    public void testFindByItemId() {
        System.out.println("findByItemId");
        
        String itemid = "";
        LoanFacade instance = new LoanFacade();
        
        List expResult = null;
        List result = instance.findByItemId(itemid);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByUserAndItem method, of class net.abbht.lamo.facades.loans.LoanFacade.
     */
    public void testFindByUserAndItem() {
        System.out.println("findByUserAndItem");
        
        String username = "";
        String itemNo = "";
        LoanFacade instance = new LoanFacade();
        
        Loan expResult = null;
        Loan result = instance.findByUserAndItem(username, itemNo);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteLoanRecord method, of class net.abbht.lamo.facades.loans.LoanFacade.
     */
    public void testDeleteLoanRecord() {
        System.out.println("deleteLoanRecord");
        
        Loan loan = null;
        LoanFacade instance = new LoanFacade();
        
        instance.deleteLoanRecord(loan);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
