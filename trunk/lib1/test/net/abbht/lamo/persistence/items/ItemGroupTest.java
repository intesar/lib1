/*
 * ItemGroupTest.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:41 PM
 */

package net.abbht.lamo.persistence.items;

import junit.framework.*;

/**
 *
 * @author home
 */
public class ItemGroupTest extends TestCase {
    
    public ItemGroupTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ItemGroupTest.class);
        
        return suite;
    }

    /**
     * Test of getId method, of class net.abbht.lamo.persistence.items.ItemGroup.
     */
    public void testGetId() {
        System.out.println("getId");
        
        ItemGroup instance = new ItemGroup();
        
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class net.abbht.lamo.persistence.items.ItemGroup.
     */
    public void testSetId() {
        System.out.println("setId");
        
        Long id = null;
        ItemGroup instance = new ItemGroup();
        
        instance.setId(id);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGroupname method, of class net.abbht.lamo.persistence.items.ItemGroup.
     */
    public void testGetGroupname() {
        System.out.println("getGroupname");
        
        ItemGroup instance = new ItemGroup();
        
        String expResult = "";
        String result = instance.getGroupname();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGroupname method, of class net.abbht.lamo.persistence.items.ItemGroup.
     */
    public void testSetGroupname() {
        System.out.println("setGroupname");
        
        String groupname = "";
        ItemGroup instance = new ItemGroup();
        
        instance.setGroupname(groupname);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class net.abbht.lamo.persistence.items.ItemGroup.
     */
    public void testGetDescription() {
        System.out.println("getDescription");
        
        ItemGroup instance = new ItemGroup();
        
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class net.abbht.lamo.persistence.items.ItemGroup.
     */
    public void testSetDescription() {
        System.out.println("setDescription");
        
        String description = "";
        ItemGroup instance = new ItemGroup();
        
        instance.setDescription(description);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNoofdays method, of class net.abbht.lamo.persistence.items.ItemGroup.
     */
    public void testGetNoofdays() {
        System.out.println("getNoofdays");
        
        ItemGroup instance = new ItemGroup();
        
        int expResult = 0;
        int result = instance.getNoofdays();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNoofdays method, of class net.abbht.lamo.persistence.items.ItemGroup.
     */
    public void testSetNoofdays() {
        System.out.println("setNoofdays");
        
        int noofdays = 0;
        ItemGroup instance = new ItemGroup();
        
        instance.setNoofdays(noofdays);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPossibleRenews method, of class net.abbht.lamo.persistence.items.ItemGroup.
     */
    public void testGetPossibleRenews() {
        System.out.println("getPossibleRenews");
        
        ItemGroup instance = new ItemGroup();
        
        int expResult = 0;
        int result = instance.getPossibleRenews();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPossibleRenews method, of class net.abbht.lamo.persistence.items.ItemGroup.
     */
    public void testSetPossibleRenews() {
        System.out.println("setPossibleRenews");
        
        int possibleRenews = 0;
        ItemGroup instance = new ItemGroup();
        
        instance.setPossibleRenews(possibleRenews);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
