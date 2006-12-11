/*
 * UsersSuite.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:42 PM
 */

package net.abbht.lamo.persistence.users;

import junit.framework.*;

/**
 *
 * @author home
 */
public class UsersSuite extends TestCase {
    
    public UsersSuite(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    /**
     * suite method automatically generated by JUnit module
     */
    public static Test suite() {
        TestSuite suite = new TestSuite("UsersSuite");
        suite.addTest(net.abbht.lamo.persistence.users.PhoneTest.suite());
        suite.addTest(net.abbht.lamo.persistence.users.UserTest.suite());
        suite.addTest(net.abbht.lamo.persistence.users.AuthorityTest.suite());
        suite.addTest(net.abbht.lamo.persistence.users.UserGroupTest.suite());
        suite.addTest(net.abbht.lamo.persistence.users.AddressTest.suite());
        return suite;
    }
    
}
