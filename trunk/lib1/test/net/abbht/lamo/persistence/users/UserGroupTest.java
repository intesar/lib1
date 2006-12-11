/*
 * UserGroupTest.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:42 PM
 */

package net.abbht.lamo.persistence.users;

import junit.framework.*;

/**
 *
 * @author home
 */
public class UserGroupTest extends TestCase {
    
    public UserGroupTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(UserGroupTest.class);
        
        return suite;
    }

    /**
     * Test of getId method, of class net.abbht.lamo.persistence.users.UserGroup.
     */
    public void testGetId() {
        System.out.println("getId");
        
        UserGroup instance = new UserGroup();
        
        long expResult = 0L;
        long result = instance.getId();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class net.abbht.lamo.persistence.users.UserGroup.
     */
    public void testSetId() {
        System.out.println("setId");
        
        long id = 0L;
        UserGroup instance = new UserGroup();
        
        instance.setId(id);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGroupname method, of class net.abbht.lamo.persistence.users.UserGroup.
     */
    public void testGetGroupname() {
        System.out.println("getGroupname");
        
        UserGroup instance = new UserGroup();
        
        String expResult = "";
        String result = instance.getGroupname();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGroupname method, of class net.abbht.lamo.persistence.users.UserGroup.
     */
    public void testSetGroupname() {
        System.out.println("setGroupname");
        
        String groupname = "";
        UserGroup instance = new UserGroup();
        
        instance.setGroupname(groupname);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGroupdesc method, of class net.abbht.lamo.persistence.users.UserGroup.
     */
    public void testGetGroupdesc() {
        System.out.println("getGroupdesc");
        
        UserGroup instance = new UserGroup();
        
        String expResult = "";
        String result = instance.getGroupdesc();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGroupdesc method, of class net.abbht.lamo.persistence.users.UserGroup.
     */
    public void testSetGroupdesc() {
        System.out.println("setGroupdesc");
        
        String groupdesc = "";
        UserGroup instance = new UserGroup();
        
        instance.setGroupdesc(groupdesc);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaxnoofbooks method, of class net.abbht.lamo.persistence.users.UserGroup.
     */
    public void testGetMaxnoofbooks() {
        System.out.println("getMaxnoofbooks");
        
        UserGroup instance = new UserGroup();
        
        Integer expResult = null;
        Integer result = instance.getMaxnoofbooks();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaxnoofbooks method, of class net.abbht.lamo.persistence.users.UserGroup.
     */
    public void testSetMaxnoofbooks() {
        System.out.println("setMaxnoofbooks");
        
        Integer maxnoofbooks = null;
        UserGroup instance = new UserGroup();
        
        instance.setMaxnoofbooks(maxnoofbooks);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
