/*
 * ItemsBOTest.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:41 PM
 */

package net.abbht.lamo.bo.items;

import junit.framework.*;
import java.util.List;
import net.abbht.lamo.facades.items.AuthorFacade;
import net.abbht.lamo.facades.items.ItemFacade;
import net.abbht.lamo.facades.items.ItemGroupFacade;
import net.abbht.lamo.persistence.items.Author;
import net.abbht.lamo.persistence.items.Item;
import net.abbht.lamo.persistence.items.ItemGroup;
import net.abbht.lamo.persistence.items.ItemTypes;

/**
 *
 * @author home
 */
public class ItemsBOTest extends TestCase {
    
    public ItemsBOTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ItemsBOTest.class);
        
        return suite;
    }

    /**
     * Test of addItem method, of class net.abbht.lamo.bo.items.ItemsBO.
     */
    public void testAddItem() throws Exception {
        System.out.println("addItem");
        
        Item item = null;
        ItemsBO instance = new ItemsBO();
        
        instance.addItem(item);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAuthors method, of class net.abbht.lamo.bo.items.ItemsBO.
     */
    public void testAddAuthors() throws Exception {
        System.out.println("addAuthors");
        
        Author[] authors = null;
        ItemsBO instance = new ItemsBO();
        
        instance.addAuthors(authors);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editItem method, of class net.abbht.lamo.bo.items.ItemsBO.
     */
    public void testEditItem() throws Exception {
        System.out.println("editItem");
        
        Item item = null;
        ItemsBO instance = new ItemsBO();
        
        instance.editItem(item);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addItemGroup method, of class net.abbht.lamo.bo.items.ItemsBO.
     */
    public void testAddItemGroup() throws Exception {
        System.out.println("addItemGroup");
        
        ItemGroup itemGroup = null;
        ItemsBO instance = new ItemsBO();
        
        instance.addItemGroup(itemGroup);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addEditItemType method, of class net.abbht.lamo.bo.items.ItemsBO.
     */
    public void testAddEditItemType() throws Exception {
        System.out.println("addEditItemType");
        
        ItemTypes itemType = null;
        ItemsBO instance = new ItemsBO();
        
        instance.addEditItemType(itemType);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of assignGroup method, of class net.abbht.lamo.bo.items.ItemsBO.
     */
    public void testAssignGroup() throws Exception {
        System.out.println("assignGroup");
        
        String itemNo = "";
        String groupNo = "";
        ItemsBO instance = new ItemsBO();
        
        instance.assignGroup(itemNo, groupNo);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemGroups method, of class net.abbht.lamo.bo.items.ItemsBO.
     */
    public void testGetItemGroups() throws Exception {
        System.out.println("getItemGroups");
        
        ItemsBO instance = new ItemsBO();
        
        List expResult = null;
        List result = instance.getItemGroups();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class net.abbht.lamo.bo.items.ItemsBO.
     */
    public void testSetStatus() throws Exception {
        System.out.println("setStatus");
        
        String itemNo = "";
        String status = "";
        ItemsBO instance = new ItemsBO();
        
        instance.setStatus(itemNo, status);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByItemNo method, of class net.abbht.lamo.bo.items.ItemsBO.
     */
    public void testFindByItemNo() throws Exception {
        System.out.println("findByItemNo");
        
        String itemNo = "";
        ItemsBO instance = new ItemsBO();
        
        Item expResult = null;
        Item result = instance.findByItemNo(itemNo);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findItemGroup method, of class net.abbht.lamo.bo.items.ItemsBO.
     */
    public void testFindItemGroup() throws Exception {
        System.out.println("findItemGroup");
        
        String groupName = "";
        ItemsBO instance = new ItemsBO();
        
        ItemGroup expResult = null;
        ItemGroup result = instance.findItemGroup(groupName);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemFacade method, of class net.abbht.lamo.bo.items.ItemsBO.
     */
    public void testSetItemFacade() {
        System.out.println("setItemFacade");
        
        ItemFacade itemFacade = null;
        ItemsBO instance = new ItemsBO();
        
        instance.setItemFacade(itemFacade);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemGroupFacade method, of class net.abbht.lamo.bo.items.ItemsBO.
     */
    public void testSetItemGroupFacade() {
        System.out.println("setItemGroupFacade");
        
        ItemGroupFacade itemGroupFacade = null;
        ItemsBO instance = new ItemsBO();
        
        instance.setItemGroupFacade(itemGroupFacade);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthorFacade method, of class net.abbht.lamo.bo.items.ItemsBO.
     */
    public void testSetAuthorFacade() {
        System.out.println("setAuthorFacade");
        
        AuthorFacade authorFacade = null;
        ItemsBO instance = new ItemsBO();
        
        instance.setAuthorFacade(authorFacade);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Generated implementation of abstract class net.abbht.lamo.bo.items.ItemsBO. Please fill dummy bodies of generated methods.
     */
    private class ItemsBOImpl implements ItemsBO {

        public void addItem(net.abbht.lamo.persistence.items.Item item) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public void addAuthors(net.abbht.lamo.persistence.items.Author[] authors) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public void editItem(net.abbht.lamo.persistence.items.Item item) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public void addItemGroup(net.abbht.lamo.persistence.items.ItemGroup itemGroup) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public void addEditItemType(net.abbht.lamo.persistence.items.ItemTypes itemType) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public void assignGroup(java.lang.String itemNo, java.lang.String groupNo) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public java.util.List getItemGroups() {
            // TODO fill the body in order to provide useful implementation
            
            return null;
        }

        public void setStatus(java.lang.String itemNo, java.lang.String status) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public net.abbht.lamo.persistence.items.Item findByItemNo(java.lang.String itemNo) {
            // TODO fill the body in order to provide useful implementation
            
            return null;
        }

        public net.abbht.lamo.persistence.items.ItemGroup findItemGroup(java.lang.String groupName) {
            // TODO fill the body in order to provide useful implementation
            
            return null;
        }

        public void setItemFacade(net.abbht.lamo.facades.items.ItemFacade itemFacade) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public void setItemGroupFacade(net.abbht.lamo.facades.items.ItemGroupFacade itemGroupFacade) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public void setAuthorFacade(net.abbht.lamo.facades.items.AuthorFacade authorFacade) {
            // TODO fill the body in order to provide useful implementation
            
        }
    }

    
}
