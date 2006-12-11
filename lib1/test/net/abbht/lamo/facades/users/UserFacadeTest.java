/*
 * UserFacadeTest.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:41 PM
 */

package net.abbht.lamo.facades.users;

import junit.framework.*;
import java.util.Iterator;
import java.util.List;
import net.abbht.lamo.persistence.users.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author home
 */
public class UserFacadeTest extends TestCase {
    
    public UserFacadeTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(UserFacadeTest.class);
        
        return suite;
    }

    /**
     * Test of saveUser method, of class net.abbht.lamo.facades.users.UserFacade.
     */
    public void testSaveUser() {
        System.out.println("saveUser");
        
        User user = null;
        UserFacade instance = new UserFacade();
        
        instance.saveUser(user);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveOrUpdateUser method, of class net.abbht.lamo.facades.users.UserFacade.
     */
    public void testSaveOrUpdateUser() {
        System.out.println("saveOrUpdateUser");
        
        User user = null;
        UserFacade instance = new UserFacade();
        
        instance.saveOrUpdateUser(user);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByPrimaryKey method, of class net.abbht.lamo.facades.users.UserFacade.
     */
    public void testFindByPrimaryKey() {
        System.out.println("findByPrimaryKey");
        
        Object key = null;
        UserFacade instance = new UserFacade();
        
        User expResult = null;
        User result = instance.findByPrimaryKey(key);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByName method, of class net.abbht.lamo.facades.users.UserFacade.
     */
    public void testFindByName() {
        System.out.println("findByName");
        
        String lastname = "";
        UserFacade instance = new UserFacade();
        
        List expResult = null;
        List result = instance.findByName(lastname);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByUserName method, of class net.abbht.lamo.facades.users.UserFacade.
     */
    public void testFindByUserName() {
        System.out.println("findByUserName");
        
        String username = "";
        UserFacade instance = new UserFacade();
        
        User expResult = null;
        User result = instance.findByUserName(username);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
