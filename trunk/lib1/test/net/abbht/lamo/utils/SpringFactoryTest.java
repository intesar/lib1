/*
 * SpringFactoryTest.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:41 PM
 */

package net.abbht.lamo.utils;

import junit.framework.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author home
 */
public class SpringFactoryTest extends TestCase {
    
    public SpringFactoryTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(SpringFactoryTest.class);
        
        return suite;
    }

    /**
     * Test of instance method, of class net.abbht.lamo.utils.SpringFactory.
     */
    public void testInstance() {
        System.out.println("instance");
//        SpringFactory.getInstance().getBeanFactory();
        BeanFactory expResult = null;
        BeanFactory result = null;
        System.out.println("asdf");
        System.out.println("asdf" + SpringFactory.getInstance());
        try {
            result = SpringFactory.getInstance().getBeanFactory();
        } catch ( Exception e) { e.printStackTrace(); }
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
