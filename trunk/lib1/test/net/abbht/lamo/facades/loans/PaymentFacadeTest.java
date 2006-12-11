/*
 * PaymentFacadeTest.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:41 PM
 */

package net.abbht.lamo.facades.loans;

import junit.framework.*;
import java.util.Iterator;
import net.abbht.lamo.persistence.loans.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author home
 */
public class PaymentFacadeTest extends TestCase {
    
    public PaymentFacadeTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(PaymentFacadeTest.class);
        
        return suite;
    }

    /**
     * Test of savePayment method, of class net.abbht.lamo.facades.loans.PaymentFacade.
     */
    public void testSavePayment() {
        System.out.println("savePayment");
        
        Payment payment = null;
        PaymentFacade instance = new PaymentFacade();
        
        instance.savePayment(payment);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByPrimaryKey method, of class net.abbht.lamo.facades.loans.PaymentFacade.
     */
    public void testFindByPrimaryKey() {
        System.out.println("findByPrimaryKey");
        
        Object key = null;
        PaymentFacade instance = new PaymentFacade();
        
        Payment expResult = null;
        Payment result = instance.findByPrimaryKey(key);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByPrimary method, of class net.abbht.lamo.facades.loans.PaymentFacade.
     */
    public void testFindByPrimary() {
        System.out.println("findByPrimary");
        
        String username = "";
        PaymentFacade instance = new PaymentFacade();
        
        Payment expResult = null;
        Payment result = instance.findByPrimary(username);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
