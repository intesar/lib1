/*
 * PhoneFacadeTest.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:41 PM
 */

package net.abbht.lamo.facades.users;

import junit.framework.*;
import java.util.Iterator;
import net.abbht.lamo.persistence.users.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author home
 */
public class PhoneFacadeTest extends TestCase {
    
    public PhoneFacadeTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(PhoneFacadeTest.class);
        
        return suite;
    }

    /**
     * Test of savePhone method, of class net.abbht.lamo.facades.users.PhoneFacade.
     */
    public void testSavePhone() {
        System.out.println("savePhone");
        
        Phone phone = null;
        PhoneFacade instance = new PhoneFacade();
        
        instance.savePhone(phone);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePhone method, of class net.abbht.lamo.facades.users.PhoneFacade.
     */
    public void testUpdatePhone() {
        System.out.println("updatePhone");
        
        Phone phone = null;
        PhoneFacade instance = new PhoneFacade();
        
        instance.updatePhone(phone);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByPrimaryKey method, of class net.abbht.lamo.facades.users.PhoneFacade.
     */
    public void testFindByPrimaryKey() {
        System.out.println("findByPrimaryKey");
        
        Object key = null;
        PhoneFacade instance = new PhoneFacade();
        
        Phone expResult = null;
        Phone result = instance.findByPrimaryKey(key);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByPhoneNo method, of class net.abbht.lamo.facades.users.PhoneFacade.
     */
    public void testFindByPhoneNo() {
        System.out.println("findByPhoneNo");
        
        String ph = "";
        PhoneFacade instance = new PhoneFacade();
        
        Phone expResult = null;
        Phone result = instance.findByPhoneNo(ph);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
