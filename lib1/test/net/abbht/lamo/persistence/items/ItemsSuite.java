/*
 * ItemsSuite.java
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
public class ItemsSuite extends TestCase {
    
    public ItemsSuite(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    /**
     * suite method automatically generated by JUnit module
     */
    public static Test suite() {
        TestSuite suite = new TestSuite("ItemsSuite");
        suite.addTest(net.abbht.lamo.persistence.items.ItemTypesTest.suite());
        suite.addTest(net.abbht.lamo.persistence.items.ItemGroupTest.suite());
        suite.addTest(net.abbht.lamo.persistence.items.DepartmentTest.suite());
        suite.addTest(net.abbht.lamo.persistence.items.AuthorTest.suite());
        suite.addTest(net.abbht.lamo.persistence.items.ItemTest.suite());
        return suite;
    }
    
}
