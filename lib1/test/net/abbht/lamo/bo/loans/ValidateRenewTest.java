/*
 * ValidateRenewTest.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:41 PM
 */

package net.abbht.lamo.bo.loans;

import junit.framework.*;
import java.util.Date;

/**
 *
 * @author home
 */
public class ValidateRenewTest extends TestCase {
    
    public ValidateRenewTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ValidateRenewTest.class);
        
        return suite;
    }

    /**
     * Test of getDueDays method, of class net.abbht.lamo.bo.loans.ValidateRenew.
     */
    public void testGetDueDays() throws Exception {
        System.out.println("getDueDays");
        
        ValidateRenew instance = null;
        
        long expResult = 0L;
        long result = instance.getDueDays();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
