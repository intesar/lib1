/*
 * DepartmentFacadeTest.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:41 PM
 */

package net.abbht.lamo.facades.items;

import junit.framework.*;
import java.util.Iterator;
import net.abbht.lamo.persistence.items.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author home
 */
public class DepartmentFacadeTest extends TestCase {
    
    public DepartmentFacadeTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(DepartmentFacadeTest.class);
        
        return suite;
    }

    /**
     * Test of saveDepartment method, of class net.abbht.lamo.facades.items.DepartmentFacade.
     */
    public void testSaveDepartment() {
        System.out.println("saveDepartment");
        
        Department department = null;
        DepartmentFacade instance = new DepartmentFacade();
        
        instance.saveDepartment(department);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByPrimaryKey method, of class net.abbht.lamo.facades.items.DepartmentFacade.
     */
    public void testFindByPrimaryKey() {
        System.out.println("findByPrimaryKey");
        
        Object key = null;
        DepartmentFacade instance = new DepartmentFacade();
        
        Department expResult = null;
        Department result = instance.findByPrimaryKey(key);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByDepartmentName method, of class net.abbht.lamo.facades.items.DepartmentFacade.
     */
    public void testFindByDepartmentName() {
        System.out.println("findByDepartmentName");
        
        String deptname = "";
        DepartmentFacade instance = new DepartmentFacade();
        
        Department expResult = null;
        Department result = instance.findByDepartmentName(deptname);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
