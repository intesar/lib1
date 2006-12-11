/*
 * DepartmentTest.java
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
public class DepartmentTest extends TestCase {
    
    public DepartmentTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(DepartmentTest.class);
        
        return suite;
    }

    /**
     * Test of getId method, of class net.abbht.lamo.persistence.items.Department.
     */
    public void testGetId() {
        System.out.println("getId");
        
        Department instance = new Department();
        
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class net.abbht.lamo.persistence.items.Department.
     */
    public void testSetId() {
        System.out.println("setId");
        
        Long id = null;
        Department instance = new Department();
        
        instance.setId(id);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeptname method, of class net.abbht.lamo.persistence.items.Department.
     */
    public void testGetDeptname() {
        System.out.println("getDeptname");
        
        Department instance = new Department();
        
        String expResult = "";
        String result = instance.getDeptname();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeptname method, of class net.abbht.lamo.persistence.items.Department.
     */
    public void testSetDeptname() {
        System.out.println("setDeptname");
        
        String deptname = "";
        Department instance = new Department();
        
        instance.setDeptname(deptname);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeptdesc method, of class net.abbht.lamo.persistence.items.Department.
     */
    public void testGetDeptdesc() {
        System.out.println("getDeptdesc");
        
        Department instance = new Department();
        
        String expResult = "";
        String result = instance.getDeptdesc();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeptdesc method, of class net.abbht.lamo.persistence.items.Department.
     */
    public void testSetDeptdesc() {
        System.out.println("setDeptdesc");
        
        String deptdesc = "";
        Department instance = new Department();
        
        instance.setDeptdesc(deptdesc);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreationDate method, of class net.abbht.lamo.persistence.items.Department.
     */
    public void testGetCreationDate() {
        System.out.println("getCreationDate");
        
        Department instance = new Department();
        
        java.sql.Date expResult = null;
        java.sql.Date result = instance.getCreationDate();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCreationDate method, of class net.abbht.lamo.persistence.items.Department.
     */
    public void testSetCreationDate() {
        System.out.println("setCreationDate");
        
        java.sql.Date creationDate = null;
        Department instance = new Department();
        
        instance.setCreationDate(creationDate);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
