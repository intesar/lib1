/*
 * AbbhtSuite.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:42 PM
 */

package net.abbht;

import junit.framework.*;

/**
 *
 * @author home
 */
public class AbbhtSuite extends TestCase {
    
    public AbbhtSuite(String testName) {
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
        TestSuite suite = new TestSuite("AbbhtSuite");
        suite.addTest(net.abbht.lamo.LamoSuite.suite());
        return suite;
    }
    
}