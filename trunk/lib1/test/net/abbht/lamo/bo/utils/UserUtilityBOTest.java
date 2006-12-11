/*
 * UserUtilityBOTest.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:41 PM
 */

package net.abbht.lamo.bo.utils;

import junit.framework.*;

/**
 *
 * @author home
 */
public class UserUtilityBOTest extends TestCase {
    
    public UserUtilityBOTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(UserUtilityBOTest.class);
        
        return suite;
    }

    /**
     * Test of getFine method, of class net.abbht.lamo.bo.utils.UserUtilityBO.
     */
    public void testGetFine() throws Exception {
        System.out.println("getFine");
        
        String username = "";
        UserUtilityBO instance = new UserUtilityBO();
        
        int expResult = 0;
        int result = instance.getFine(username);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of payFine method, of class net.abbht.lamo.bo.utils.UserUtilityBO.
     */
    public void testPayFine() throws Exception {
        System.out.println("payFine");
        
        String username = "";
        int amt = 0;
        int daysFor = 0;
        String description = "";
        String staff = "";
        UserUtilityBO instance = new UserUtilityBO();
        
        int expResult = 0;
        int result = instance.payFine(username, amt, daysFor, description, staff);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeUserHoldOnBook method, of class net.abbht.lamo.bo.utils.UserUtilityBO.
     */
    public void testRemoveUserHoldOnBook() throws Exception {
        System.out.println("removeUserHoldOnBook");
        
        String username = "";
        String itemNo = "";
        UserUtilityBO instance = new UserUtilityBO();
        
        instance.removeUserHoldOnBook(username, itemNo);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Generated implementation of abstract class net.abbht.lamo.bo.utils.UserUtilityBO. Please fill dummy bodies of generated methods.
     */
    private class UserUtilityBOImpl implements UserUtilityBO {

        public int getFine(java.lang.String username) {
            // TODO fill the body in order to provide useful implementation
            
            return 0;
        }

        public int payFine(java.lang.String username, int amt, int daysFor, java.lang.String description, java.lang.String staff) {
            // TODO fill the body in order to provide useful implementation
            
            return 0;
        }

        public void removeUserHoldOnBook(java.lang.String username, java.lang.String itemNo) {
            // TODO fill the body in order to provide useful implementation
            
        }
    }

    
}
