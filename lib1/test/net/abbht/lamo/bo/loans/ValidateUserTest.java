/*
 * ValidateUserTest.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:41 PM
 */

package net.abbht.lamo.bo.loans;

import junit.framework.*;
import java.util.Iterator;
import java.util.List;
import net.abbht.lamo.bo.users.UsersBO;
import net.abbht.lamo.bo.users.UsersBOFactory;
import net.abbht.lamo.facades.loans.LoanFacade;
import net.abbht.lamo.persistence.loans.Loan;
import net.abbht.lamo.persistence.users.User;
import net.abbht.lamo.persistence.users.UserGroup;

/**
 *
 * @author home
 */
public class ValidateUserTest extends TestCase {
    
    public ValidateUserTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ValidateUserTest.class);
        
        return suite;
    }

    /**
     * Test of vaidateUser method, of class net.abbht.lamo.bo.loans.ValidateUser.
     */
    public void testVaidateUser() throws Exception {
        System.out.println("vaidateUser");
        
        ValidateUser instance = null;
        
        instance.vaidateUser();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
