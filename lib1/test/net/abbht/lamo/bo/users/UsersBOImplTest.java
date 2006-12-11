/*
 * UsersBOImplTest.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:41 PM
 */

package net.abbht.lamo.bo.users;

import junit.framework.*;
import net.abbht.lamo.facades.users.AddressFacade;
import net.abbht.lamo.facades.users.AuthorityFacade;
import net.abbht.lamo.facades.users.PhoneFacade;
import net.abbht.lamo.facades.users.UserFacade;
import net.abbht.lamo.facades.users.UserGroupFacade;
import net.abbht.lamo.persistence.users.Address;
import net.abbht.lamo.persistence.users.Authority;
import net.abbht.lamo.persistence.users.Phone;
import net.abbht.lamo.persistence.users.User;
import net.abbht.lamo.persistence.users.UserGroup;

/**
 *
 * @author home
 */
public class UsersBOImplTest extends TestCase {
    
    public UsersBOImplTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(UsersBOImplTest.class);
        
        return suite;
    }

    /**
     * Test of addUser method, of class net.abbht.lamo.bo.users.UsersBOImpl.
     */
    public void testAddUser() throws Exception {
        System.out.println("addUser");
        
        User user = null;
        UsersBOImpl instance = new UsersBOImpl();
        
        instance.addUser(user);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class net.abbht.lamo.bo.users.UsersBOImpl.
     */
    public void testSetStatus() throws Exception {
        System.out.println("setStatus");
        
        String username = "";
        boolean status = true;
        UsersBOImpl instance = new UsersBOImpl();
        
        instance.setStatus(username, status);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of assignAuthorities method, of class net.abbht.lamo.bo.users.UsersBOImpl.
     */
    public void testAssignAuthorities() throws Exception {
        System.out.println("assignAuthorities");
        
        Authority[] authories = null;
        UsersBOImpl instance = new UsersBOImpl();
        
        instance.assignAuthorities(authories);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAuthority method, of class net.abbht.lamo.bo.users.UsersBOImpl.
     */
    public void testRemoveAuthority() throws Exception {
        System.out.println("removeAuthority");
        
        String username = "";
        UsersBOImpl instance = new UsersBOImpl();
        
        instance.removeAuthority(username);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addGroup method, of class net.abbht.lamo.bo.users.UsersBOImpl.
     */
    public void testAddGroup() throws Exception {
        System.out.println("addGroup");
        
        UserGroup userGroup = null;
        UsersBOImpl instance = new UsersBOImpl();
        
        instance.addGroup(userGroup);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateGroup method, of class net.abbht.lamo.bo.users.UsersBOImpl.
     */
    public void testUpdateGroup() throws Exception {
        System.out.println("updateGroup");
        
        UserGroup userGroup = null;
        UsersBOImpl instance = new UsersBOImpl();
        
        instance.updateGroup(userGroup);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAddress method, of class net.abbht.lamo.bo.users.UsersBOImpl.
     */
    public void testAddAddress() throws Exception {
        System.out.println("addAddress");
        
        Address address = null;
        UsersBOImpl instance = new UsersBOImpl();
        
        instance.addAddress(address);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAddress method, of class net.abbht.lamo.bo.users.UsersBOImpl.
     */
    public void testUpdateAddress() throws Exception {
        System.out.println("updateAddress");
        
        Address address = null;
        UsersBOImpl instance = new UsersBOImpl();
        
        instance.updateAddress(address);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePhone method, of class net.abbht.lamo.bo.users.UsersBOImpl.
     */
    public void testUpdatePhone() throws Exception {
        System.out.println("updatePhone");
        
        Phone phone = null;
        UsersBOImpl instance = new UsersBOImpl();
        
        instance.updatePhone(phone);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPhone method, of class net.abbht.lamo.bo.users.UsersBOImpl.
     */
    public void testAddPhone() throws Exception {
        System.out.println("addPhone");
        
        Phone phone = null;
        UsersBOImpl instance = new UsersBOImpl();
        
        instance.addPhone(phone);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetPassword method, of class net.abbht.lamo.bo.users.UsersBOImpl.
     */
    public void testResetPassword() throws Exception {
        System.out.println("resetPassword");
        
        String username = "";
        UsersBOImpl instance = new UsersBOImpl();
        
        instance.resetPassword(username);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changePassword method, of class net.abbht.lamo.bo.users.UsersBOImpl.
     */
    public void testChangePassword() throws Exception {
        System.out.println("changePassword");
        
        String username = "";
        String oldPassword = "";
        String newPassword = "";
        UsersBOImpl instance = new UsersBOImpl();
        
        instance.changePassword(username, oldPassword, newPassword);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByUsername method, of class net.abbht.lamo.bo.users.UsersBOImpl.
     */
    public void testFindByUsername() throws Exception {
        System.out.println("findByUsername");
        
        String username = "";
        UsersBOImpl instance = new UsersBOImpl();
        
        User expResult = null;
        User result = instance.findByUsername(username);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findUserGroup method, of class net.abbht.lamo.bo.users.UsersBOImpl.
     */
    public void testFindUserGroup() throws Exception {
        System.out.println("findUserGroup");
        
        String groupName = "";
        UsersBOImpl instance = new UsersBOImpl();
        
        UserGroup expResult = null;
        UserGroup result = instance.findUserGroup(groupName);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUser method, of class net.abbht.lamo.bo.users.UsersBOImpl.
     */
    public void testUpdateUser() throws Exception {
        System.out.println("updateUser");
        
        User user = null;
        UsersBOImpl instance = new UsersBOImpl();
        
        instance.updateUser(user);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddressFacade method, of class net.abbht.lamo.bo.users.UsersBOImpl.
     */
    public void testSetAddressFacade() {
        System.out.println("setAddressFacade");
        
        AddressFacade addressFacade = null;
        UsersBOImpl instance = new UsersBOImpl();
        
        instance.setAddressFacade(addressFacade);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthorityFacade method, of class net.abbht.lamo.bo.users.UsersBOImpl.
     */
    public void testSetAuthorityFacade() {
        System.out.println("setAuthorityFacade");
        
        AuthorityFacade authorityFacade = null;
        UsersBOImpl instance = new UsersBOImpl();
        
        instance.setAuthorityFacade(authorityFacade);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhoneFacade method, of class net.abbht.lamo.bo.users.UsersBOImpl.
     */
    public void testSetPhoneFacade() {
        System.out.println("setPhoneFacade");
        
        PhoneFacade phoneFacade = null;
        UsersBOImpl instance = new UsersBOImpl();
        
        instance.setPhoneFacade(phoneFacade);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserFacade method, of class net.abbht.lamo.bo.users.UsersBOImpl.
     */
    public void testSetUserFacade() {
        System.out.println("setUserFacade");
        
        UserFacade userFacade = null;
        UsersBOImpl instance = new UsersBOImpl();
        
        instance.setUserFacade(userFacade);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserGroupFacade method, of class net.abbht.lamo.bo.users.UsersBOImpl.
     */
    public void testSetUserGroupFacade() {
        System.out.println("setUserGroupFacade");
        
        UserGroupFacade userGroupFacade = null;
        UsersBOImpl instance = new UsersBOImpl();
        
        instance.setUserGroupFacade(userGroupFacade);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
