/*
 * UsersBOFactoryTest.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:41 PM
 */

package net.abbht.lamo.bo.users;

import junit.framework.*;
import net.abbht.lamo.utils.SpringFactory;

/**
 *
 * @author home
 */
public class UsersBOFactoryTest extends TestCase {
    
    public UsersBOFactoryTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(UsersBOFactoryTest.class);
        
        return suite;
    }

    /**
     * Test of newInstance method, of class net.abbht.lamo.bo.users.UsersBOFactory.
     */
    public void testNewInstance() {
        System.out.println("newInstance");
        
        UsersBO expResult = null;
        UsersBO result = UsersBOFactory.newInstance();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
