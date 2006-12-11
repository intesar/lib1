/*
 * ApplicationBean1Test.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:41 PM
 */

package lib1;

import junit.framework.*;
import com.sun.rave.web.ui.appbase.AbstractApplicationBean;
import javax.faces.FacesException;

/**
 *
 * @author home
 */
public class ApplicationBean1Test extends TestCase {
    
    public ApplicationBean1Test(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ApplicationBean1Test.class);
        
        return suite;
    }

    /**
     * Test of init method, of class lib1.ApplicationBean1.
     */
    public void testInit() {
        System.out.println("init");
        
        ApplicationBean1 instance = new ApplicationBean1();
        
        instance.init();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class lib1.ApplicationBean1.
     */
    public void testDestroy() {
        System.out.println("destroy");
        
        ApplicationBean1 instance = new ApplicationBean1();
        
        instance.destroy();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocaleCharacterEncoding method, of class lib1.ApplicationBean1.
     */
    public void testGetLocaleCharacterEncoding() {
        System.out.println("getLocaleCharacterEncoding");
        
        ApplicationBean1 instance = new ApplicationBean1();
        
        String expResult = "";
        String result = instance.getLocaleCharacterEncoding();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
