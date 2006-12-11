/*
 * ItemFacadeTest.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:41 PM
 */

package net.abbht.lamo.facades.items;

import junit.framework.*;
import java.util.Iterator;
import java.util.List;
import net.abbht.lamo.persistence.items.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author home
 */
public class ItemFacadeTest extends TestCase {
    
    public ItemFacadeTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ItemFacadeTest.class);
        
        return suite;
    }

    /**
     * Test of saveItem method, of class net.abbht.lamo.facades.items.ItemFacade.
     */
    public void testSaveItem() {
        System.out.println("saveItem");
        
        Item item = null;
        ItemFacade instance = new ItemFacade();
        
        instance.saveItem(item);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByGroupName method, of class net.abbht.lamo.facades.items.ItemFacade.
     */
    public void testFindByGroupName() {
        System.out.println("findByGroupName");
        
        String groupname = "";
        ItemFacade instance = new ItemFacade();
        
        List expResult = null;
        List result = instance.findByGroupName(groupname);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByTitle method, of class net.abbht.lamo.facades.items.ItemFacade.
     */
    public void testFindByTitle() {
        System.out.println("findByTitle");
        
        String title = "";
        ItemFacade instance = new ItemFacade();
        
        List expResult = null;
        List result = instance.findByTitle(title);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByYearOfIssue method, of class net.abbht.lamo.facades.items.ItemFacade.
     */
    public void testFindByYearOfIssue() {
        System.out.println("findByYearOfIssue");
        
        String yearOfIssue = "";
        ItemFacade instance = new ItemFacade();
        
        List expResult = null;
        List result = instance.findByYearOfIssue(yearOfIssue);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByIsbn method, of class net.abbht.lamo.facades.items.ItemFacade.
     */
    public void testFindByIsbn() {
        System.out.println("findByIsbn");
        
        String isbn = "";
        ItemFacade instance = new ItemFacade();
        
        List expResult = null;
        List result = instance.findByIsbn(isbn);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByPublisher method, of class net.abbht.lamo.facades.items.ItemFacade.
     */
    public void testFindByPublisher() {
        System.out.println("findByPublisher");
        
        String publisher = "";
        ItemFacade instance = new ItemFacade();
        
        List expResult = null;
        List result = instance.findByPublisher(publisher);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByEdition method, of class net.abbht.lamo.facades.items.ItemFacade.
     */
    public void testFindByEdition() {
        System.out.println("findByEdition");
        
        String edition = "";
        ItemFacade instance = new ItemFacade();
        
        List expResult = null;
        List result = instance.findByEdition(edition);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByItemNo method, of class net.abbht.lamo.facades.items.ItemFacade.
     */
    public void testFindByItemNo() {
        System.out.println("findByItemNo");
        
        String itemId = "";
        ItemFacade instance = new ItemFacade();
        
        Item expResult = null;
        Item result = instance.findByItemNo(itemId);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
