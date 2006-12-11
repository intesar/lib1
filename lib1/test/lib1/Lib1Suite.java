/*
 * Lib1Suite.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:41 PM
 */

package lib1;

import junit.framework.*;

/**
 *
 * @author home
 */
public class Lib1Suite extends TestCase {
    
    public Lib1Suite(String testName) {
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
        TestSuite suite = new TestSuite("Lib1Suite");
        suite.addTest(lib1.ApplicationBean1Test.suite());
        suite.addTest(lib1.SessionBean1Test.suite());
        suite.addTest(lib1.RequestBean1Test.suite());
        suite.addTest(lib1.StaffTest.suite());
        return suite;
    }
    
}
