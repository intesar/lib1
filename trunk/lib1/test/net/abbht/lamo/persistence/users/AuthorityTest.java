/*
 * AuthorityTest.java
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
public class AuthorityTest extends TestCase {
    
    public AuthorityTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(AuthorityTest.class);
        
        return suite;
    }

    /**
     * Test of getId method, of class net.abbht.lamo.persistence.users.Authority.
     */
    public void testGetId() {
        System.out.println("getId");
        
        Authority instance = new Authority();
        
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class net.abbht.lamo.persistence.users.Authority.
     */
    public void testSetId() {
        System.out.println("setId");
        
        Long id = null;
        Authority instance = new Authority();
        
        instance.setId(id);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class net.abbht.lamo.persistence.users.Authority.
     */
    public void testGetUsername() {
        System.out.println("getUsername");
        
        Authority instance = new Authority();
        
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class net.abbht.lamo.persistence.users.Authority.
     */
    public void testSetUsername() {
        System.out.println("setUsername");
        
        String username = "";
        Authority instance = new Authority();
        
        instance.setUsername(username);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorityname method, of class net.abbht.lamo.persistence.users.Authority.
     */
    public void testGetAuthorityname() {
        System.out.println("getAuthorityname");
        
        Authority instance = new Authority();
        
        String expResult = "";
        String result = instance.getAuthorityname();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthorityname method, of class net.abbht.lamo.persistence.users.Authority.
     */
    public void testSetAuthorityname() {
        System.out.println("setAuthorityname");
        
        String authorityname = "";
        Authority instance = new Authority();
        
        instance.setAuthorityname(authorityname);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
