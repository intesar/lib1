/*
 * LoanBOImplTest.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:41 PM
 */

package net.abbht.lamo.bo.loans;

import junit.framework.*;
import java.sql.Date;
import java.util.Iterator;
import java.util.List;
import net.abbht.lamo.facades.items.ItemGroupFacade;
import net.abbht.lamo.facades.loans.LoanFacade;
import net.abbht.lamo.facades.loans.RenewFacade;
import net.abbht.lamo.persistence.loans.Loan;

/**
 *
 * @author home
 */
public class LoanBOImplTest extends TestCase {
    
    public LoanBOImplTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(LoanBOImplTest.class);
        
        return suite;
    }

    /**
     * Test of issue method, of class net.abbht.lamo.bo.loans.LoanBOImpl.
     */
    public void testIssue() throws Exception {
        System.out.println("issue");
        
        String username = "";
        String ItemNo = "";
        String staff = "";
        LoanBOImpl instance = new LoanBOImpl();
        
        instance.issue(username, ItemNo, staff);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of renew method, of class net.abbht.lamo.bo.loans.LoanBOImpl.
     */
    public void testRenew() throws Exception {
        System.out.println("renew");
        
        String username = "";
        String ItemNo = "";
        String staff = "";
        LoanBOImpl instance = new LoanBOImpl();
        
        instance.renew(username, ItemNo, staff);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnItem method, of class net.abbht.lamo.bo.loans.LoanBOImpl.
     */
    public void testReturnItem() throws Exception {
        System.out.println("returnItem");
        
        String ItemNo = "";
        String staff = "";
        LoanBOImpl instance = new LoanBOImpl();
        
        instance.returnItem(ItemNo, staff);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLoanFacade method, of class net.abbht.lamo.bo.loans.LoanBOImpl.
     */
    public void testSetLoanFacade() {
        System.out.println("setLoanFacade");
        
        LoanFacade loanFacade = null;
        LoanBOImpl instance = new LoanBOImpl();
        
        instance.setLoanFacade(loanFacade);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRenewFacade method, of class net.abbht.lamo.bo.loans.LoanBOImpl.
     */
    public void testSetRenewFacade() {
        System.out.println("setRenewFacade");
        
        RenewFacade renewFacade = null;
        LoanBOImpl instance = new LoanBOImpl();
        
        instance.setRenewFacade(renewFacade);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemGroupFacade method, of class net.abbht.lamo.bo.loans.LoanBOImpl.
     */
    public void testSetItemGroupFacade() {
        System.out.println("setItemGroupFacade");
        
        ItemGroupFacade itemGroupFacade = null;
        LoanBOImpl instance = new LoanBOImpl();
        
        instance.setItemGroupFacade(itemGroupFacade);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
