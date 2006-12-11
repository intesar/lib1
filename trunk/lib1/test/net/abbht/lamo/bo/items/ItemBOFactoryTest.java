/*
 * ItemBOFactoryTest.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:41 PM
 */

package net.abbht.lamo.bo.items;

import junit.framework.*;
import net.abbht.lamo.persistence.items.ItemGroup;
import net.abbht.lamo.utils.SpringFactory;

/**
 *
 * @author home
 */
public class ItemBOFactoryTest extends TestCase {
    
    public ItemBOFactoryTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(ItemBOFactoryTest.class);
        
        return suite;
    }

    /**
     * Test of newInstance method, of class net.abbht.lamo.bo.items.ItemBOFactory.
     */
    public void testNewInstance() {
        System.out.println("newInstance");
        
        ItemsBO expResult = null;
        ItemsBO result = ItemBOFactory.newInstance();
        ItemGroup itemGroup = new ItemGroup();
        itemGroup.setDescription("lkj");
        itemGroup.setGroupname("apple11");
        itemGroup.setNoofdays(22);
        itemGroup.setPossibleRenews(2);
        try {
            //ItemsBOImpl instance = new ItemsBOImpl();
            
            result.addItemGroup(itemGroup);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
