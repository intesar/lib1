/*
 * AuthorityFacadeTest.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:41 PM
 */

package net.abbht.lamo.facades.users;

import junit.framework.*;
import net.abbht.lamo.persistence.users.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author home
 */
public class AuthorityFacadeTest extends TestCase {
    
    public AuthorityFacadeTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(AuthorityFacadeTest.class);
        
        return suite;
    }

    /**
     * Test of saveAuthority method, of class net.abbht.lamo.facades.users.AuthorityFacade.
     */
    public void testSaveAuthority() {
        System.out.println("saveAuthority");
        
        Authority authority = null;
        AuthorityFacade instance = new AuthorityFacade();
        
        instance.saveAuthority(authority);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByPrimaryKey method, of class net.abbht.lamo.facades.users.AuthorityFacade.
     */
    public void testFindByPrimaryKey() {
        System.out.println("findByPrimaryKey");
        
        Object key = null;
        AuthorityFacade instance = new AuthorityFacade();
        
        Authority expResult = null;
        Authority result = instance.findByPrimaryKey(key);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAuthorities method, of class net.abbht.lamo.facades.users.AuthorityFacade.
     */
    public void testRemoveAuthorities() {
        System.out.println("removeAuthorities");
        
        String username = "";
        AuthorityFacade instance = new AuthorityFacade();
        
        instance.removeAuthorities(username);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
