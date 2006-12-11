/*
 * UserUtilityBOImplTest.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:41 PM
 */

package net.abbht.lamo.bo.utils;

import junit.framework.*;
import java.sql.Date;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import net.abbht.lamo.bo.users.UsersBOFactory;
import net.abbht.lamo.facades.loans.LoanFacade;
import net.abbht.lamo.facades.loans.PaymentFacade;
import net.abbht.lamo.persistence.loans.Loan;
import net.abbht.lamo.persistence.loans.Payment;
import net.abbht.lamo.persistence.users.User;

/**
 *
 * @author home
 */
public class UserUtilityBOImplTest extends TestCase {
    
    public UserUtilityBOImplTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(UserUtilityBOImplTest.class);
        
        return suite;
    }

    /**
     * Test of getFine method, of class net.abbht.lamo.bo.utils.UserUtilityBOImpl.
     */
    public void testGetFine() throws Exception {
        System.out.println("getFine");
        
        String username = "";
        UserUtilityBOImpl instance = new UserUtilityBOImpl();
        
        int expResult = 0;
        int result = instance.getFine(username);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of payFine method, of class net.abbht.lamo.bo.utils.UserUtilityBOImpl.
     */
    public void testPayFine() throws Exception {
        System.out.println("payFine");
        
        String username = "";
        int amt = 0;
        int daysFor = 0;
        String description = "";
        String staff = "";
        UserUtilityBOImpl instance = new UserUtilityBOImpl();
        
        int expResult = 0;
        int result = instance.payFine(username, amt, daysFor, description, staff);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeUserHoldOnBook method, of class net.abbht.lamo.bo.utils.UserUtilityBOImpl.
     */
    public void testRemoveUserHoldOnBook() throws Exception {
        System.out.println("removeUserHoldOnBook");
        
        String username = "";
        String itemNo = "";
        UserUtilityBOImpl instance = new UserUtilityBOImpl();
        
        instance.removeUserHoldOnBook(username, itemNo);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPaymentFacade method, of class net.abbht.lamo.bo.utils.UserUtilityBOImpl.
     */
    public void testSetPaymentFacade() {
        System.out.println("setPaymentFacade");
        
        PaymentFacade paymentFacade = null;
        UserUtilityBOImpl instance = new UserUtilityBOImpl();
        
        instance.setPaymentFacade(paymentFacade);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLoanFacade method, of class net.abbht.lamo.bo.utils.UserUtilityBOImpl.
     */
    public void testSetLoanFacade() {
        System.out.println("setLoanFacade");
        
        LoanFacade loanFacade = null;
        UserUtilityBOImpl instance = new UserUtilityBOImpl();
        
        instance.setLoanFacade(loanFacade);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
