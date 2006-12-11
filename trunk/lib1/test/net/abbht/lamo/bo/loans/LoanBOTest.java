/*
 * LoanBOTest.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:41 PM
 */

package net.abbht.lamo.bo.loans;

import junit.framework.*;
import net.abbht.lamo.facades.items.ItemGroupFacade;
import net.abbht.lamo.facades.loans.LoanFacade;
import net.abbht.lamo.facades.loans.RenewFacade;

/**
 *
 * @author home
 */
public class LoanBOTest extends TestCase {
    
    public LoanBOTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(LoanBOTest.class);
        
        return suite;
    }

    /**
     * Test of issue method, of class net.abbht.lamo.bo.loans.LoanBO.
     */
    public void testIssue() throws Exception {
        System.out.println("issue");
        
        String username = "";
        String ItemNo = "";
        String staff = "";
        LoanBO instance = new LoanBO();
        
        instance.issue(username, ItemNo, staff);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of renew method, of class net.abbht.lamo.bo.loans.LoanBO.
     */
    public void testRenew() throws Exception {
        System.out.println("renew");
        
        String userName = "";
        String ItemNo = "";
        LoanBO instance = new LoanBO();
        
        instance.renew(userName, ItemNo);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnItem method, of class net.abbht.lamo.bo.loans.LoanBO.
     */
    public void testReturnItem() throws Exception {
        System.out.println("returnItem");
        
        String ItemNo = "";
        String staff = "";
        LoanBO instance = new LoanBO();
        
        instance.returnItem(ItemNo, staff);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLoanFacade method, of class net.abbht.lamo.bo.loans.LoanBO.
     */
    public void testSetLoanFacade() {
        System.out.println("setLoanFacade");
        
        LoanFacade loanFacade = null;
        LoanBO instance = new LoanBO();
        
        instance.setLoanFacade(loanFacade);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRenewFacade method, of class net.abbht.lamo.bo.loans.LoanBO.
     */
    public void testSetRenewFacade() {
        System.out.println("setRenewFacade");
        
        RenewFacade renewFacade = null;
        LoanBO instance = new LoanBO();
        
        instance.setRenewFacade(renewFacade);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemGroupFacade method, of class net.abbht.lamo.bo.loans.LoanBO.
     */
    public void testSetItemGroupFacade() {
        System.out.println("setItemGroupFacade");
        
        ItemGroupFacade itemGroupFacade = null;
        LoanBO instance = new LoanBO();
        
        instance.setItemGroupFacade(itemGroupFacade);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Generated implementation of abstract class net.abbht.lamo.bo.loans.LoanBO. Please fill dummy bodies of generated methods.
     */
    private class LoanBOImpl implements LoanBO {

        public void issue(java.lang.String username, java.lang.String ItemNo, java.lang.String staff) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public void renew(java.lang.String userName, java.lang.String ItemNo) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public void renew(java.lang.String username, java.lang.String ItemNo, java.lang.String staff) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public void returnItem(java.lang.String ItemNo, java.lang.String staff) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public void setLoanFacade(net.abbht.lamo.facades.loans.LoanFacade loanFacade) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public void setRenewFacade(net.abbht.lamo.facades.loans.RenewFacade renewFacade) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public void setItemGroupFacade(net.abbht.lamo.facades.items.ItemGroupFacade itemGroupFacade) {
            // TODO fill the body in order to provide useful implementation
            
        }
    }

    
}
