/*
 * SessionBean1Test.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:41 PM
 */

package lib1;

import junit.framework.*;
import com.sun.rave.web.ui.appbase.AbstractSessionBean;
import javax.faces.FacesException;

/**
 *
 * @author home
 */
public class SessionBean1Test extends TestCase {
    
    public SessionBean1Test(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(SessionBean1Test.class);
        
        return suite;
    }

    /**
     * Test of init method, of class lib1.SessionBean1.
     */
    public void testInit() {
        System.out.println("init");
        
        SessionBean1 instance = new SessionBean1();
        
        instance.init();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of passivate method, of class lib1.SessionBean1.
     */
    public void testPassivate() {
        System.out.println("passivate");
        
        SessionBean1 instance = new SessionBean1();
        
        instance.passivate();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of activate method, of class lib1.SessionBean1.
     */
    public void testActivate() {
        System.out.println("activate");
        
        SessionBean1 instance = new SessionBean1();
        
        instance.activate();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class lib1.SessionBean1.
     */
    public void testDestroy() {
        System.out.println("destroy");
        
        SessionBean1 instance = new SessionBean1();
        
        instance.destroy();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApplicationBean1 method, of class lib1.SessionBean1.
     */
    public void testGetApplicationBean1() {
        System.out.println("getApplicationBean1");
        
        SessionBean1 instance = new SessionBean1();
        
        ApplicationBean1 expResult = null;
        ApplicationBean1 result = instance.getApplicationBean1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
