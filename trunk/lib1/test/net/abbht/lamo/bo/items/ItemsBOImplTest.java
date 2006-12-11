/*
 * ItemsBOImplTest.java
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
import net.abbht.lamo.facades.items.ItemTypesFacade;

/**
 *
 * @author home
 */
public class ItemsBOImplTest extends TestCase {
    
    public ItemsBOImplTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ItemsBOImplTest.class);
        
        return suite;
    }

    /**
     * Test of addItem method, of class net.abbht.lamo.bo.items.ItemsBOImpl.
     */
    public void testAddItem() throws Exception {
        System.out.println("addItem");
        
        Item item = null;
        ItemsBOImpl instance = new ItemsBOImpl();
        
        instance.addItem(item);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAuthors method, of class net.abbht.lamo.bo.items.ItemsBOImpl.
     */
    public void testAddAuthors() throws Exception {
        System.out.println("addAuthors");
        
        Author[] authors = null;
        ItemsBOImpl instance = new ItemsBOImpl();
        
        instance.addAuthors(authors);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addItemGroup method, of class net.abbht.lamo.bo.items.ItemsBOImpl.
     */
    public void testAddItemGroup() throws Exception {
        System.out.println("addItemGroup");
        
        ItemGroup itemGroup = new ItemGroup();
        itemGroup.setDescription("hamed");
        itemGroup.setGroupname("reference");
        itemGroup.setNoofdays(12);
        itemGroup.setPossibleRenews(3);
        ItemsBOImpl instance = new ItemsBOImpl();
        
        //instance.addItemGroup(itemGroup);
        ItemBOFactory.newInstance().addItemGroup(itemGroup);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class net.abbht.lamo.bo.items.ItemsBOImpl.
     */
    public void testSetStatus() throws Exception {
        System.out.println("setStatus");
        
        String itemNo = "";
        String status = "";
        ItemsBOImpl instance = new ItemsBOImpl();
        
        instance.setStatus(itemNo, status);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of assignGroup method, of class net.abbht.lamo.bo.items.ItemsBOImpl.
     */
    public void testAssignGroup() throws Exception {
        System.out.println("assignGroup");
        
        String itemNo = "";
        String groupName = "";
        ItemsBOImpl instance = new ItemsBOImpl();
        
        instance.assignGroup(itemNo, groupName);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemGroups method, of class net.abbht.lamo.bo.items.ItemsBOImpl.
     */
    public void testGetItemGroups() throws Exception {
        System.out.println("getItemGroups");
        
        ItemsBOImpl instance = new ItemsBOImpl();
        
        List expResult = null;
        List result = instance.getItemGroups();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editItem method, of class net.abbht.lamo.bo.items.ItemsBOImpl.
     */
    public void testEditItem() throws Exception {
        System.out.println("editItem");
        
        Item item = null;
        ItemsBOImpl instance = new ItemsBOImpl();
        
        instance.editItem(item);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByItemNo method, of class net.abbht.lamo.bo.items.ItemsBOImpl.
     */
    public void testFindByItemNo() throws Exception {
        System.out.println("findByItemNo");
        
        String itemNo = "";
        ItemsBOImpl instance = new ItemsBOImpl();
        
        Item expResult = null;
        Item result = instance.findByItemNo(itemNo);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findItemGroup method, of class net.abbht.lamo.bo.items.ItemsBOImpl.
     */
    public void testFindItemGroup() throws Exception {
        System.out.println("findItemGroup");
        
        String groupName = "";
        ItemsBOImpl instance = new ItemsBOImpl();
        
        ItemGroup expResult = null;
        ItemGroup result = instance.findItemGroup(groupName);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addEditItemType method, of class net.abbht.lamo.bo.items.ItemsBOImpl.
     */
    public void testAddEditItemType() throws Exception {
        System.out.println("addEditItemType");
        
        ItemTypes itemType = null;
        ItemsBOImpl instance = new ItemsBOImpl();
        
        instance.addEditItemType(itemType);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemFacade method, of class net.abbht.lamo.bo.items.ItemsBOImpl.
     */
    public void testSetItemFacade() {
        System.out.println("setItemFacade");
        
        ItemFacade itemFacade = null;
        ItemsBOImpl instance = new ItemsBOImpl();
        
        instance.setItemFacade(itemFacade);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemGroupFacade method, of class net.abbht.lamo.bo.items.ItemsBOImpl.
     */
    public void testSetItemGroupFacade() {
        System.out.println("setItemGroupFacade");
        
        ItemGroupFacade itemGroupFacade = null;
        ItemsBOImpl instance = new ItemsBOImpl();
        
        instance.setItemGroupFacade(itemGroupFacade);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthorFacade method, of class net.abbht.lamo.bo.items.ItemsBOImpl.
     */
    public void testSetAuthorFacade() {
        System.out.println("setAuthorFacade");
        
        AuthorFacade authorFacade = null;
        ItemsBOImpl instance = new ItemsBOImpl();
        
        instance.setAuthorFacade(authorFacade);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemTypesFacade method, of class net.abbht.lamo.bo.items.ItemsBOImpl.
     */
    public void testSetItemTypesFacade() {
        System.out.println("setItemTypesFacade");
        
        ItemTypesFacade itemTypesFacade = null;
        ItemsBOImpl instance = new ItemsBOImpl();
        
        instance.setItemTypesFacade(itemTypesFacade);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
