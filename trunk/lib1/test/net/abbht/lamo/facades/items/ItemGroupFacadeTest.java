/*
 * ItemGroupFacadeTest.java
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
public class ItemGroupFacadeTest extends TestCase {
    
    public ItemGroupFacadeTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ItemGroupFacadeTest.class);
        
        return suite;
    }

    /**
     * Test of saveItemGroup method, of class net.abbht.lamo.facades.items.ItemGroupFacade.
     */
    public void testSaveItemGroup() {
        System.out.println("saveItemGroup");
        
        ItemGroup itemGroup = new ItemGroup();
        itemGroup.setDescription("lkj");
        itemGroup.setGroupname("apple");
        itemGroup.setNoofdays(22);
        itemGroup.setPossibleRenews(2);
        ItemGroupFacade instance = new ItemGroupFacade();
        
        instance.saveItemGroup(itemGroup);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of findByPrimaryKey method, of class net.abbht.lamo.facades.items.ItemGroupFacade.
     */
    public void testFindByPrimaryKey() {
        System.out.println("findByPrimaryKey");
        
        Object key = null;
        ItemGroupFacade instance = new ItemGroupFacade();
        
        Item expResult = null;
        Item result = instance.findByPrimaryKey(key);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByPossibleRenews method, of class net.abbht.lamo.facades.items.ItemGroupFacade.
     */
    public void testFindByPossibleRenews() {
        System.out.println("findByPossibleRenews");
        
        int noofrenews = 0;
        ItemGroupFacade instance = new ItemGroupFacade();
        
        Item expResult = null;
        Item result = instance.findByPossibleRenews(noofrenews);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByGroupName method, of class net.abbht.lamo.facades.items.ItemGroupFacade.
     */
    public void testFindByGroupName() {
        System.out.println("findByGroupName");
        
        String groupName = "";
        ItemGroupFacade instance = new ItemGroupFacade();
        
        ItemGroup expResult = null;
        ItemGroup result = instance.findByGroupName(groupName);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class net.abbht.lamo.facades.items.ItemGroupFacade.
     */
    public void testFindAll() {
        System.out.println("findAll");
        
        ItemGroupFacade instance = new ItemGroupFacade();
        
        List expResult = null;
        List result = instance.findAll();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
