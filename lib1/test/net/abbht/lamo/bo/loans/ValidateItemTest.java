/*
 * ValidateItemTest.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:41 PM
 */

package net.abbht.lamo.bo.loans;

import junit.framework.*;
import net.abbht.lamo.bo.items.ItemBOFactory;
import net.abbht.lamo.bo.items.ItemsBO;
import net.abbht.lamo.persistence.items.Item;
import net.abbht.lamo.persistence.items.ItemGroup;

/**
 *
 * @author home
 */
public class ValidateItemTest extends TestCase {
    
    public ValidateItemTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ValidateItemTest.class);
        
        return suite;
    }

    /**
     * Test of validateItem method, of class net.abbht.lamo.bo.loans.ValidateItem.
     */
    public void testValidateItem() throws Exception {
        System.out.println("validateItem");
        
        ValidateItem instance = null;
        
        instance.validateItem();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAvailable method, of class net.abbht.lamo.bo.loans.ValidateItem.
     */
    public void testIsAvailable() throws Exception {
        System.out.println("isAvailable");
        
        ValidateItem instance = null;
        
        instance.isAvailable();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllowedDays method, of class net.abbht.lamo.bo.loans.ValidateItem.
     */
    public void testGetAllowedDays() throws Exception {
        System.out.println("getAllowedDays");
        
        ValidateItem instance = null;
        
        int expResult = 0;
        int result = instance.getAllowedDays();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
