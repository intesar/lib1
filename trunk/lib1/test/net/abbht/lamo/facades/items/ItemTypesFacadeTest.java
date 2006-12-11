/*
 * ItemTypesFacadeTest.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:41 PM
 */

package net.abbht.lamo.facades.items;

import junit.framework.*;
import java.sql.Date;
import java.util.Iterator;
import net.abbht.lamo.persistence.items.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author home
 */
public class ItemTypesFacadeTest extends TestCase {
    
    public ItemTypesFacadeTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ItemTypesFacadeTest.class);
        
        return suite;
    }

    /**
     * Test of saveItemTypes method, of class net.abbht.lamo.facades.items.ItemTypesFacade.
     */
    public void testSaveItemTypes() {
        System.out.println("saveItemTypes");
        
        ItemTypes itemTypes = null;
        ItemTypesFacade instance = new ItemTypesFacade();
        
        instance.saveItemTypes(itemTypes);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByPrimaryKey method, of class net.abbht.lamo.facades.items.ItemTypesFacade.
     */
    public void testFindByPrimaryKey() {
        System.out.println("findByPrimaryKey");
        
        Object key = null;
        ItemTypesFacade instance = new ItemTypesFacade();
        
        ItemTypes expResult = null;
        ItemTypes result = instance.findByPrimaryKey(key);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByCreationDate method, of class net.abbht.lamo.facades.items.ItemTypesFacade.
     */
    public void testFindByCreationDate() {
        System.out.println("findByCreationDate");
        
        Date date = null;
        ItemTypesFacade instance = new ItemTypesFacade();
        
        ItemTypes expResult = null;
        ItemTypes result = instance.findByCreationDate(date);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
