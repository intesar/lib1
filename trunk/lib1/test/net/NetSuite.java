/*
 * NetSuite.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:42 PM
 */

package net;

import junit.framework.*;

/**
 *
 * @author home
 */
public class NetSuite extends TestCase {
    
    public NetSuite(String testName) {
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
        TestSuite suite = new TestSuite("NetSuite");
        suite.addTest(net.abbht.AbbhtSuite.suite());
        return suite;
    }
    
}
