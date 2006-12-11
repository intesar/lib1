/*
 * RenewFacadeTest.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:41 PM
 */

package net.abbht.lamo.facades.loans;

import junit.framework.*;
import java.util.Date;
import java.util.Iterator;
import net.abbht.lamo.persistence.loans.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author home
 */
public class RenewFacadeTest extends TestCase {
    
    public RenewFacadeTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(RenewFacadeTest.class);
        
        return suite;
    }

    /**
     * Test of saveRenew method, of class net.abbht.lamo.facades.loans.RenewFacade.
     */
    public void testSaveRenew() {
        System.out.println("saveRenew");
        
        Renew renew = null;
        RenewFacade instance = new RenewFacade();
        
        instance.saveRenew(renew);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByPrimaryKey method, of class net.abbht.lamo.facades.loans.RenewFacade.
     */
    public void testFindByPrimaryKey() {
        System.out.println("findByPrimaryKey");
        
        Object key = null;
        RenewFacade instance = new RenewFacade();
        
        Renew expResult = null;
        Renew result = instance.findByPrimaryKey(key);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByUserName method, of class net.abbht.lamo.facades.loans.RenewFacade.
     */
    public void testFindByUserName() {
        System.out.println("findByUserName");
        
        String username = "";
        RenewFacade instance = new RenewFacade();
        
        Renew expResult = null;
        Renew result = instance.findByUserName(username);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByRenewDate method, of class net.abbht.lamo.facades.loans.RenewFacade.
     */
    public void testFindByRenewDate() {
        System.out.println("findByRenewDate");
        
        Date renewDate = null;
        RenewFacade instance = new RenewFacade();
        
        Renew expResult = null;
        Renew result = instance.findByRenewDate(renewDate);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByItemId method, of class net.abbht.lamo.facades.loans.RenewFacade.
     */
    public void testFindByItemId() {
        System.out.println("findByItemId");
        
        String itemid = "";
        RenewFacade instance = new RenewFacade();
        
        Renew expResult = null;
        Renew result = instance.findByItemId(itemid);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
