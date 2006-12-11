/*
 * ItemTest.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:42 PM
 */

package net.abbht.lamo.persistence.items;

import junit.framework.*;

/**
 *
 * @author home
 */
public class ItemTest extends TestCase {
    
    public ItemTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ItemTest.class);
        
        return suite;
    }

    /**
     * Test of getId method, of class net.abbht.lamo.persistence.items.Item.
     */
    public void testGetId() {
        System.out.println("getId");
        
        Item instance = new Item();
        
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class net.abbht.lamo.persistence.items.Item.
     */
    public void testSetId() {
        System.out.println("setId");
        
        Long id = null;
        Item instance = new Item();
        
        instance.setId(id);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemid method, of class net.abbht.lamo.persistence.items.Item.
     */
    public void testGetItemid() {
        System.out.println("getItemid");
        
        Item instance = new Item();
        
        String expResult = "";
        String result = instance.getItemid();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemid method, of class net.abbht.lamo.persistence.items.Item.
     */
    public void testSetItemid() {
        System.out.println("setItemid");
        
        String itemid = "";
        Item instance = new Item();
        
        instance.setItemid(itemid);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class net.abbht.lamo.persistence.items.Item.
     */
    public void testGetDescription() {
        System.out.println("getDescription");
        
        Item instance = new Item();
        
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class net.abbht.lamo.persistence.items.Item.
     */
    public void testSetDescription() {
        System.out.println("setDescription");
        
        String description = "";
        Item instance = new Item();
        
        instance.setDescription(description);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemtype method, of class net.abbht.lamo.persistence.items.Item.
     */
    public void testGetItemtype() {
        System.out.println("getItemtype");
        
        Item instance = new Item();
        
        String expResult = "";
        String result = instance.getItemtype();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemtype method, of class net.abbht.lamo.persistence.items.Item.
     */
    public void testSetItemtype() {
        System.out.println("setItemtype");
        
        String itemtype = "";
        Item instance = new Item();
        
        instance.setItemtype(itemtype);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYearofissue method, of class net.abbht.lamo.persistence.items.Item.
     */
    public void testGetYearofissue() {
        System.out.println("getYearofissue");
        
        Item instance = new Item();
        
        int expResult = 0;
        int result = instance.getYearofissue();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setYearofissue method, of class net.abbht.lamo.persistence.items.Item.
     */
    public void testSetYearofissue() {
        System.out.println("setYearofissue");
        
        int yearofissue = 0;
        Item instance = new Item();
        
        instance.setYearofissue(yearofissue);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGroupname method, of class net.abbht.lamo.persistence.items.Item.
     */
    public void testGetGroupname() {
        System.out.println("getGroupname");
        
        Item instance = new Item();
        
        String expResult = "";
        String result = instance.getGroupname();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGroupname method, of class net.abbht.lamo.persistence.items.Item.
     */
    public void testSetGroupname() {
        System.out.println("setGroupname");
        
        String groupname = "";
        Item instance = new Item();
        
        instance.setGroupname(groupname);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class net.abbht.lamo.persistence.items.Item.
     */
    public void testGetTitle() {
        System.out.println("getTitle");
        
        Item instance = new Item();
        
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class net.abbht.lamo.persistence.items.Item.
     */
    public void testSetTitle() {
        System.out.println("setTitle");
        
        String title = "";
        Item instance = new Item();
        
        instance.setTitle(title);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class net.abbht.lamo.persistence.items.Item.
     */
    public void testGetStatus() {
        System.out.println("getStatus");
        
        Item instance = new Item();
        
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class net.abbht.lamo.persistence.items.Item.
     */
    public void testSetStatus() {
        System.out.println("setStatus");
        
        String status = "";
        Item instance = new Item();
        
        instance.setStatus(status);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateofissue method, of class net.abbht.lamo.persistence.items.Item.
     */
    public void testGetDateofissue() {
        System.out.println("getDateofissue");
        
        Item instance = new Item();
        
        java.sql.Date expResult = null;
        java.sql.Date result = instance.getDateofissue();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateofissue method, of class net.abbht.lamo.persistence.items.Item.
     */
    public void testSetDateofissue() {
        System.out.println("setDateofissue");
        
        java.sql.Date dateofissue = null;
        Item instance = new Item();
        
        instance.setDateofissue(dateofissue);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIsbn method, of class net.abbht.lamo.persistence.items.Item.
     */
    public void testGetIsbn() {
        System.out.println("getIsbn");
        
        Item instance = new Item();
        
        String expResult = "";
        String result = instance.getIsbn();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsbn method, of class net.abbht.lamo.persistence.items.Item.
     */
    public void testSetIsbn() {
        System.out.println("setIsbn");
        
        String isbn = "";
        Item instance = new Item();
        
        instance.setIsbn(isbn);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPublisher method, of class net.abbht.lamo.persistence.items.Item.
     */
    public void testGetPublisher() {
        System.out.println("getPublisher");
        
        Item instance = new Item();
        
        String expResult = "";
        String result = instance.getPublisher();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPublisher method, of class net.abbht.lamo.persistence.items.Item.
     */
    public void testSetPublisher() {
        System.out.println("setPublisher");
        
        String publisher = "";
        Item instance = new Item();
        
        instance.setPublisher(publisher);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEdition method, of class net.abbht.lamo.persistence.items.Item.
     */
    public void testGetEdition() {
        System.out.println("getEdition");
        
        Item instance = new Item();
        
        String expResult = "";
        String result = instance.getEdition();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEdition method, of class net.abbht.lamo.persistence.items.Item.
     */
    public void testSetEdition() {
        System.out.println("setEdition");
        
        String edition = "";
        Item instance = new Item();
        
        instance.setEdition(edition);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocation method, of class net.abbht.lamo.persistence.items.Item.
     */
    public void testGetLocation() {
        System.out.println("getLocation");
        
        Item instance = new Item();
        
        String expResult = "";
        String result = instance.getLocation();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocation method, of class net.abbht.lamo.persistence.items.Item.
     */
    public void testSetLocation() {
        System.out.println("setLocation");
        
        String location = "";
        Item instance = new Item();
        
        instance.setLocation(location);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCost method, of class net.abbht.lamo.persistence.items.Item.
     */
    public void testGetCost() {
        System.out.println("getCost");
        
        Item instance = new Item();
        
        double expResult = 0.0;
        double result = instance.getCost();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCost method, of class net.abbht.lamo.persistence.items.Item.
     */
    public void testSetCost() {
        System.out.println("setCost");
        
        double cost = 0.0;
        Item instance = new Item();
        
        instance.setCost(cost);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
