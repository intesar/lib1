/*
 * UsersBOTest.java
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
public class UsersBOTest extends TestCase {
    
    public UsersBOTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(UsersBOTest.class);
        
        return suite;
    }

    /**
     * Test of addAddress method, of class net.abbht.lamo.bo.users.UsersBO.
     */
    public void testAddAddress() throws Exception {
        System.out.println("addAddress");
        
        Address address = null;
        UsersBO instance = new UsersBO();
        
        instance.addAddress(address);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAddress method, of class net.abbht.lamo.bo.users.UsersBO.
     */
    public void testUpdateAddress() throws Exception {
        System.out.println("updateAddress");
        
        Address address = null;
        UsersBO instance = new UsersBO();
        
        instance.updateAddress(address);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addGroup method, of class net.abbht.lamo.bo.users.UsersBO.
     */
    public void testAddGroup() throws Exception {
        System.out.println("addGroup");
        
        UserGroup userGroup = null;
        UsersBO instance = new UsersBO();
        
        instance.addGroup(userGroup);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateGroup method, of class net.abbht.lamo.bo.users.UsersBO.
     */
    public void testUpdateGroup() throws Exception {
        System.out.println("updateGroup");
        
        UserGroup userGroup = null;
        UsersBO instance = new UsersBO();
        
        instance.updateGroup(userGroup);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPhone method, of class net.abbht.lamo.bo.users.UsersBO.
     */
    public void testAddPhone() throws Exception {
        System.out.println("addPhone");
        
        Phone phone = null;
        UsersBO instance = new UsersBO();
        
        instance.addPhone(phone);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePhone method, of class net.abbht.lamo.bo.users.UsersBO.
     */
    public void testUpdatePhone() throws Exception {
        System.out.println("updatePhone");
        
        Phone phone = null;
        UsersBO instance = new UsersBO();
        
        instance.updatePhone(phone);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addUser method, of class net.abbht.lamo.bo.users.UsersBO.
     */
    public void testAddUser() throws Exception {
        System.out.println("addUser");
        
        User user = null;
        UsersBO instance = new UsersBO();
        
        instance.addUser(user);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUser method, of class net.abbht.lamo.bo.users.UsersBO.
     */
    public void testUpdateUser() throws Exception {
        System.out.println("updateUser");
        
        User user = null;
        UsersBO instance = new UsersBO();
        
        instance.updateUser(user);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of assignAuthorities method, of class net.abbht.lamo.bo.users.UsersBO.
     */
    public void testAssignAuthorities() throws Exception {
        System.out.println("assignAuthorities");
        
        Authority[] authories = null;
        UsersBO instance = new UsersBO();
        
        instance.assignAuthorities(authories);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAuthority method, of class net.abbht.lamo.bo.users.UsersBO.
     */
    public void testRemoveAuthority() throws Exception {
        System.out.println("removeAuthority");
        
        String username = "";
        UsersBO instance = new UsersBO();
        
        instance.removeAuthority(username);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class net.abbht.lamo.bo.users.UsersBO.
     */
    public void testSetStatus() throws Exception {
        System.out.println("setStatus");
        
        String username = "";
        boolean status = true;
        UsersBO instance = new UsersBO();
        
        instance.setStatus(username, status);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetPassword method, of class net.abbht.lamo.bo.users.UsersBO.
     */
    public void testResetPassword() throws Exception {
        System.out.println("resetPassword");
        
        String username = "";
        UsersBO instance = new UsersBO();
        
        instance.resetPassword(username);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changePassword method, of class net.abbht.lamo.bo.users.UsersBO.
     */
    public void testChangePassword() throws Exception {
        System.out.println("changePassword");
        
        String username = "";
        String oldPasswor = "";
        String newPassword = "";
        UsersBO instance = new UsersBO();
        
        instance.changePassword(username, oldPasswor, newPassword);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByUsername method, of class net.abbht.lamo.bo.users.UsersBO.
     */
    public void testFindByUsername() throws Exception {
        System.out.println("findByUsername");
        
        String username = "";
        UsersBO instance = new UsersBO();
        
        User expResult = null;
        User result = instance.findByUsername(username);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findUserGroup method, of class net.abbht.lamo.bo.users.UsersBO.
     */
    public void testFindUserGroup() throws Exception {
        System.out.println("findUserGroup");
        
        String groupName = "";
        UsersBO instance = new UsersBO();
        
        UserGroup expResult = null;
        UserGroup result = instance.findUserGroup(groupName);
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddressFacade method, of class net.abbht.lamo.bo.users.UsersBO.
     */
    public void testSetAddressFacade() {
        System.out.println("setAddressFacade");
        
        AddressFacade addressFacade = null;
        UsersBO instance = new UsersBO();
        
        instance.setAddressFacade(addressFacade);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthorityFacade method, of class net.abbht.lamo.bo.users.UsersBO.
     */
    public void testSetAuthorityFacade() {
        System.out.println("setAuthorityFacade");
        
        AuthorityFacade authorityFacade = null;
        UsersBO instance = new UsersBO();
        
        instance.setAuthorityFacade(authorityFacade);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhoneFacade method, of class net.abbht.lamo.bo.users.UsersBO.
     */
    public void testSetPhoneFacade() {
        System.out.println("setPhoneFacade");
        
        PhoneFacade phoneFacade = null;
        UsersBO instance = new UsersBO();
        
        instance.setPhoneFacade(phoneFacade);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserFacade method, of class net.abbht.lamo.bo.users.UsersBO.
     */
    public void testSetUserFacade() {
        System.out.println("setUserFacade");
        
        UserFacade userFacade = null;
        UsersBO instance = new UsersBO();
        
        instance.setUserFacade(userFacade);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserGroupFacade method, of class net.abbht.lamo.bo.users.UsersBO.
     */
    public void testSetUserGroupFacade() {
        System.out.println("setUserGroupFacade");
        
        UserGroupFacade userGroupFacade = null;
        UsersBO instance = new UsersBO();
        
        instance.setUserGroupFacade(userGroupFacade);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Generated implementation of abstract class net.abbht.lamo.bo.users.UsersBO. Please fill dummy bodies of generated methods.
     */
    private class UsersBOImpl implements UsersBO {

        public void addAddress(net.abbht.lamo.persistence.users.Address address) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public void updateAddress(net.abbht.lamo.persistence.users.Address address) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public void addGroup(net.abbht.lamo.persistence.users.UserGroup userGroup) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public void updateGroup(net.abbht.lamo.persistence.users.UserGroup userGroup) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public void addPhone(net.abbht.lamo.persistence.users.Phone phone) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public void updatePhone(net.abbht.lamo.persistence.users.Phone phone) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public void addUser(net.abbht.lamo.persistence.users.User user) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public void updateUser(net.abbht.lamo.persistence.users.User user) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public void assignAuthorities(net.abbht.lamo.persistence.users.Authority[] authories) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public void removeAuthority(java.lang.String username) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public void setStatus(java.lang.String username, boolean status) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public void resetPassword(java.lang.String username) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public void changePassword(java.lang.String username, java.lang.String oldPasswor, java.lang.String newPassword) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public net.abbht.lamo.persistence.users.User findByUsername(java.lang.String username) {
            // TODO fill the body in order to provide useful implementation
            
            return null;
        }

        public net.abbht.lamo.persistence.users.UserGroup findUserGroup(java.lang.String groupName) {
            // TODO fill the body in order to provide useful implementation
            
            return null;
        }

        public void setAddressFacade(net.abbht.lamo.facades.users.AddressFacade addressFacade) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public void setAuthorityFacade(net.abbht.lamo.facades.users.AuthorityFacade authorityFacade) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public void setPhoneFacade(net.abbht.lamo.facades.users.PhoneFacade phoneFacade) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public void setUserFacade(net.abbht.lamo.facades.users.UserFacade userFacade) {
            // TODO fill the body in order to provide useful implementation
            
        }

        public void setUserGroupFacade(net.abbht.lamo.facades.users.UserGroupFacade userGroupFacade) {
            // TODO fill the body in order to provide useful implementation
            
        }
    }

    
}
