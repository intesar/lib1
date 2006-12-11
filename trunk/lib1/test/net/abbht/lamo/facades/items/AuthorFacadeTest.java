/*
 * AuthorFacadeTest.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:41 PM
 */

package net.abbht.lamo.facades.items;

import junit.framework.*;
import java.util.Iterator;
import net.abbht.lamo.persistence.items.*;
import net.abbht.lamo.persistence.loans.Loan;
import net.abbht.lamo.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author home
 */
public class AuthorFacadeTest extends TestCase {
    
    public AuthorFacadeTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(AuthorFacadeTest.class);
        
        return suite;
    }

    /**
     * Test of saveAuthor method, of class net.abbht.lamo.facades.items.AuthorFacade.
     */
    public void testSaveAuthor() {
        System.out.println("saveAuthor");
        
        Author author = null;
        AuthorFacade instance = new AuthorFacade();
        
        instance.saveAuthor(author);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByPrimaryKey method, of class net.abbht.lamo.facades.items.AuthorFacade.
     */
    public void testFindByPrimaryKey() {
        System.out.println("findByPrimaryKey");
        
        Object key = null;
        AuthorFacade instance = new AuthorFacade();
        
        Author expResult = null;
        Author result = instance.findByPrimaryKey(key);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByPrimaryAuthorName method, of class net.abbht.lamo.facades.items.AuthorFacade.
     */
    public void testFindByPrimaryAuthorName() {
        System.out.println("findByPrimaryAuthorName");
        
        String authorname = "";
        AuthorFacade instance = new AuthorFacade();
        
        Author expResult = null;
        Author result = instance.findByPrimaryAuthorName(authorname);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByDescription method, of class net.abbht.lamo.facades.items.AuthorFacade.
     */
    public void testFindByDescription() {
        System.out.println("findByDescription");
        
        String desc = "";
        AuthorFacade instance = new AuthorFacade();
        
        Author expResult = null;
        Author result = instance.findByDescription(desc);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByItemId method, of class net.abbht.lamo.facades.items.AuthorFacade.
     */
    public void testFindByItemId() {
        System.out.println("findByItemId");
        
        String itemid = "";
        AuthorFacade instance = new AuthorFacade();
        
        Author expResult = null;
        Author result = instance.findByItemId(itemid);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
