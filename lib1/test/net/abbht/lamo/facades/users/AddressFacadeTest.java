/*
 * AddressFacadeTest.java
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
public class AddressFacadeTest extends TestCase {
    
    public AddressFacadeTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(AddressFacadeTest.class);
        
        return suite;
    }

    /**
     * Test of saveAddress method, of class net.abbht.lamo.facades.users.AddressFacade.
     */
    public void testSaveAddress() {
        System.out.println("saveAddress");
        
        Address address = null;
        AddressFacade instance = new AddressFacade();
        
        instance.saveAddress(address);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAddress method, of class net.abbht.lamo.facades.users.AddressFacade.
     */
    public void testUpdateAddress() {
        System.out.println("updateAddress");
        
        Address address = null;
        AddressFacade instance = new AddressFacade();
        
        instance.updateAddress(address);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByPrimaryKey method, of class net.abbht.lamo.facades.users.AddressFacade.
     */
    public void testFindByPrimaryKey() {
        System.out.println("findByPrimaryKey");
        
        Object key = null;
        AddressFacade instance = new AddressFacade();
        
        Address expResult = null;
        Address result = instance.findByPrimaryKey(key);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByName method, of class net.abbht.lamo.facades.users.AddressFacade.
     */
    public void testFindByName() {
        System.out.println("findByName");
        
        String username = "";
        AddressFacade instance = new AddressFacade();
        
        Address expResult = null;
        Address result = instance.findByName(username);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
