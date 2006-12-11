/*
 * ItemTypesTest.java
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
public class ItemTypesTest extends TestCase {
    
    public ItemTypesTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ItemTypesTest.class);
        
        return suite;
    }

    /**
     * Test of getId method, of class net.abbht.lamo.persistence.items.ItemTypes.
     */
    public void testGetId() {
        System.out.println("getId");
        
        ItemTypes instance = new ItemTypes();
        
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class net.abbht.lamo.persistence.items.ItemTypes.
     */
    public void testSetId() {
        System.out.println("setId");
        
        Long id = null;
        ItemTypes instance = new ItemTypes();
        
        instance.setId(id);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class net.abbht.lamo.persistence.items.ItemTypes.
     */
    public void testGetName() {
        System.out.println("getName");
        
        ItemTypes instance = new ItemTypes();
        
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class net.abbht.lamo.persistence.items.ItemTypes.
     */
    public void testSetName() {
        System.out.println("setName");
        
        String name = "";
        ItemTypes instance = new ItemTypes();
        
        instance.setName(name);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class net.abbht.lamo.persistence.items.ItemTypes.
     */
    public void testGetDescription() {
        System.out.println("getDescription");
        
        ItemTypes instance = new ItemTypes();
        
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class net.abbht.lamo.persistence.items.ItemTypes.
     */
    public void testSetDescription() {
        System.out.println("setDescription");
        
        String description = "";
        ItemTypes instance = new ItemTypes();
        
        instance.setDescription(description);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreationDate method, of class net.abbht.lamo.persistence.items.ItemTypes.
     */
    public void testGetCreationDate() {
        System.out.println("getCreationDate");
        
        ItemTypes instance = new ItemTypes();
        
        java.sql.Date expResult = null;
        java.sql.Date result = instance.getCreationDate();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCreationDate method, of class net.abbht.lamo.persistence.items.ItemTypes.
     */
    public void testSetCreationDate() {
        System.out.println("setCreationDate");
        
        java.sql.Date creationDate = null;
        ItemTypes instance = new ItemTypes();
        
        instance.setCreationDate(creationDate);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
