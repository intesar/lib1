/*
 * UserTest.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:42 PM
 */

package net.abbht.lamo.persistence.users;

import junit.framework.*;

/**
 *
 * @author home
 */
public class UserTest extends TestCase {
    
    public UserTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(UserTest.class);
        
        return suite;
    }

    /**
     * Test of getId method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testGetId() {
        System.out.println("getId");
        
        User instance = new User();
        
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testSetId() {
        System.out.println("setId");
        
        Long id = null;
        User instance = new User();
        
        instance.setId(id);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCampus method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testGetCampus() {
        System.out.println("getCampus");
        
        User instance = new User();
        
        String expResult = "";
        String result = instance.getCampus();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCampus method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testSetCampus() {
        System.out.println("setCampus");
        
        String campus = "";
        User instance = new User();
        
        instance.setCampus(campus);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDepartment method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testGetDepartment() {
        System.out.println("getDepartment");
        
        User instance = new User();
        
        String expResult = "";
        String result = instance.getDepartment();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDepartment method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testSetDepartment() {
        System.out.println("setDepartment");
        
        String department = "";
        User instance = new User();
        
        instance.setDepartment(department);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testGetPassword() {
        System.out.println("getPassword");
        
        User instance = new User();
        
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testSetPassword() {
        System.out.println("setPassword");
        
        String password = "";
        User instance = new User();
        
        instance.setPassword(password);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testGetType() {
        System.out.println("getType");
        
        User instance = new User();
        
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testSetType() {
        System.out.println("setType");
        
        String type = "";
        User instance = new User();
        
        instance.setType(type);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstname method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testGetFirstname() {
        System.out.println("getFirstname");
        
        User instance = new User();
        
        String expResult = "";
        String result = instance.getFirstname();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstname method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testSetFirstname() {
        System.out.println("setFirstname");
        
        String firstname = "";
        User instance = new User();
        
        instance.setFirstname(firstname);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalduedays method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testGetTotalduedays() {
        System.out.println("getTotalduedays");
        
        User instance = new User();
        
        int expResult = 0;
        int result = instance.getTotalduedays();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalduedays method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testSetTotalduedays() {
        System.out.println("setTotalduedays");
        
        int totalduedays = 0;
        User instance = new User();
        
        instance.setTotalduedays(totalduedays);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMiddlename method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testGetMiddlename() {
        System.out.println("getMiddlename");
        
        User instance = new User();
        
        String expResult = "";
        String result = instance.getMiddlename();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMiddlename method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testSetMiddlename() {
        System.out.println("setMiddlename");
        
        String middlename = "";
        User instance = new User();
        
        instance.setMiddlename(middlename);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnabled method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testGetEnabled() {
        System.out.println("getEnabled");
        
        User instance = new User();
        
        boolean expResult = true;
        boolean result = instance.getEnabled();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnabled method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testSetEnabled() {
        System.out.println("setEnabled");
        
        boolean enabled = true;
        User instance = new User();
        
        instance.setEnabled(enabled);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGroupname method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testGetGroupname() {
        System.out.println("getGroupname");
        
        User instance = new User();
        
        String expResult = "";
        String result = instance.getGroupname();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGroupname method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testSetGroupname() {
        System.out.println("setGroupname");
        
        String groupname = "";
        User instance = new User();
        
        instance.setGroupname(groupname);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDob method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testGetDob() {
        System.out.println("getDob");
        
        User instance = new User();
        
        java.sql.Date expResult = null;
        java.sql.Date result = instance.getDob();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDob method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testSetDob() {
        System.out.println("setDob");
        
        java.sql.Date dob = null;
        User instance = new User();
        
        instance.setDob(dob);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateofjoin method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testGetDateofjoin() {
        System.out.println("getDateofjoin");
        
        User instance = new User();
        
        java.sql.Date expResult = null;
        java.sql.Date result = instance.getDateofjoin();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateofjoin method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testSetDateofjoin() {
        System.out.println("setDateofjoin");
        
        java.sql.Date dateofjoin = null;
        User instance = new User();
        
        instance.setDateofjoin(dateofjoin);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastname method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testGetLastname() {
        System.out.println("getLastname");
        
        User instance = new User();
        
        String expResult = "";
        String result = instance.getLastname();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastname method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testSetLastname() {
        System.out.println("setLastname");
        
        String lastname = "";
        User instance = new User();
        
        instance.setLastname(lastname);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMotherName method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testGetMotherName() {
        System.out.println("getMotherName");
        
        User instance = new User();
        
        String expResult = "";
        String result = instance.getMotherName();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMotherName method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testSetMotherName() {
        System.out.println("setMotherName");
        
        String motherName = "";
        User instance = new User();
        
        instance.setMotherName(motherName);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testGetTitle() {
        System.out.println("getTitle");
        
        User instance = new User();
        
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testSetTitle() {
        System.out.println("setTitle");
        
        String title = "";
        User instance = new User();
        
        instance.setTitle(title);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testGetEmail() {
        System.out.println("getEmail");
        
        User instance = new User();
        
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testSetEmail() {
        System.out.println("setEmail");
        
        String email = "";
        User instance = new User();
        
        instance.setEmail(email);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSex method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testGetSex() {
        System.out.println("getSex");
        
        User instance = new User();
        
        String expResult = "";
        String result = instance.getSex();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSex method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testSetSex() {
        System.out.println("setSex");
        
        String sex = "";
        User instance = new User();
        
        instance.setSex(sex);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFavouriteColor method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testGetFavouriteColor() {
        System.out.println("getFavouriteColor");
        
        User instance = new User();
        
        String expResult = "";
        String result = instance.getFavouriteColor();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFavouriteColor method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testSetFavouriteColor() {
        System.out.println("setFavouriteColor");
        
        String favouriteColor = "";
        User instance = new User();
        
        instance.setFavouriteColor(favouriteColor);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFavouriteBook method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testGetFavouriteBook() {
        System.out.println("getFavouriteBook");
        
        User instance = new User();
        
        String expResult = "";
        String result = instance.getFavouriteBook();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFavouriteBook method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testSetFavouriteBook() {
        System.out.println("setFavouriteBook");
        
        String favouriteBook = "";
        User instance = new User();
        
        instance.setFavouriteBook(favouriteBook);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFavouritePlace method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testGetFavouritePlace() {
        System.out.println("getFavouritePlace");
        
        User instance = new User();
        
        String expResult = "";
        String result = instance.getFavouritePlace();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFavouritePlace method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testSetFavouritePlace() {
        System.out.println("setFavouritePlace");
        
        String favouritePlace = "";
        User instance = new User();
        
        instance.setFavouritePlace(favouritePlace);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPasswordEncrypted method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testGetPasswordEncrypted() {
        System.out.println("getPasswordEncrypted");
        
        User instance = new User();
        
        boolean expResult = true;
        boolean result = instance.getPasswordEncrypted();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPasswordEncrypted method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testSetPasswordEncrypted() {
        System.out.println("setPasswordEncrypted");
        
        boolean passwordEncrypted = true;
        User instance = new User();
        
        instance.setPasswordEncrypted(passwordEncrypted);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testGetUsername() {
        System.out.println("getUsername");
        
        User instance = new User();
        
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class net.abbht.lamo.persistence.users.User.
     */
    public void testSetUsername() {
        System.out.println("setUsername");
        
        String username = "";
        User instance = new User();
        
        instance.setUsername(username);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
