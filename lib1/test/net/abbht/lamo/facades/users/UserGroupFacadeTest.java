/*
 * UserGroupFacadeTest.java
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
public class UserGroupFacadeTest extends TestCase {
    
    public UserGroupFacadeTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(UserGroupFacadeTest.class);
        
        return suite;
    }

    /**
     * Test of saveUserGroup method, of class net.abbht.lamo.facades.users.UserGroupFacade.
     */
    public void testSaveUserGroup() {
        System.out.println("saveUserGroup");
        
        UserGroup userGroup = null;
        UserGroupFacade instance = new UserGroupFacade();
        
        instance.saveUserGroup(userGroup);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUserGroup method, of class net.abbht.lamo.facades.users.UserGroupFacade.
     */
    public void testUpdateUserGroup() {
        System.out.println("updateUserGroup");
        
        UserGroup userGroup = null;
        UserGroupFacade instance = new UserGroupFacade();
        
        instance.updateUserGroup(userGroup);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByPrimaryKey method, of class net.abbht.lamo.facades.users.UserGroupFacade.
     */
    public void testFindByPrimaryKey() {
        System.out.println("findByPrimaryKey");
        
        Object key = null;
        UserGroupFacade instance = new UserGroupFacade();
        
        UserGroup expResult = null;
        UserGroup result = instance.findByPrimaryKey(key);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByGroupName method, of class net.abbht.lamo.facades.users.UserGroupFacade.
     */
    public void testFindByGroupName() {
        System.out.println("findByGroupName");
        
        String gname = "";
        UserGroupFacade instance = new UserGroupFacade();
        
        UserGroup expResult = null;
        UserGroup result = instance.findByGroupName(gname);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
