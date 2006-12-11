/*
 * AuthorTest.java
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
public class AuthorTest extends TestCase {
    
    public AuthorTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(AuthorTest.class);
        
        return suite;
    }

    /**
     * Test of getId method, of class net.abbht.lamo.persistence.items.Author.
     */
    public void testGetId() {
        System.out.println("getId");
        
        Author instance = new Author();
        
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class net.abbht.lamo.persistence.items.Author.
     */
    public void testSetId() {
        System.out.println("setId");
        
        Long id = null;
        Author instance = new Author();
        
        instance.setId(id);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemid method, of class net.abbht.lamo.persistence.items.Author.
     */
    public void testGetItemid() {
        System.out.println("getItemid");
        
        Author instance = new Author();
        
        String expResult = "";
        String result = instance.getItemid();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemid method, of class net.abbht.lamo.persistence.items.Author.
     */
    public void testSetItemid() {
        System.out.println("setItemid");
        
        String itemid = "";
        Author instance = new Author();
        
        instance.setItemid(itemid);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorname method, of class net.abbht.lamo.persistence.items.Author.
     */
    public void testGetAuthorname() {
        System.out.println("getAuthorname");
        
        Author instance = new Author();
        
        String expResult = "";
        String result = instance.getAuthorname();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthorname method, of class net.abbht.lamo.persistence.items.Author.
     */
    public void testSetAuthorname() {
        System.out.println("setAuthorname");
        
        String authorname = "";
        Author instance = new Author();
        
        instance.setAuthorname(authorname);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class net.abbht.lamo.persistence.items.Author.
     */
    public void testGetDescription() {
        System.out.println("getDescription");
        
        Author instance = new Author();
        
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class net.abbht.lamo.persistence.items.Author.
     */
    public void testSetDescription() {
        System.out.println("setDescription");
        
        String description = "";
        Author instance = new Author();
        
        instance.setDescription(description);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
