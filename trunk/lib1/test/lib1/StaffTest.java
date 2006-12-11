/*
 * StaffTest.java
 * JUnit based test
 *
 * Created on December 10, 2006, 6:41 PM
 */

package lib1;

import junit.framework.*;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Button;
import com.sun.rave.web.ui.component.Calendar;
import com.sun.rave.web.ui.component.DropDown;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Label;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Listbox;
import com.sun.rave.web.ui.component.Page;
import com.sun.rave.web.ui.component.PanelLayout;
import com.sun.rave.web.ui.component.PasswordField;
import com.sun.rave.web.ui.component.StaticText;
import com.sun.rave.web.ui.component.Tab;
import com.sun.rave.web.ui.component.TabSet;
import com.sun.rave.web.ui.component.TextArea;
import com.sun.rave.web.ui.component.TextField;
import com.sun.rave.web.ui.model.DefaultOptionsList;
import com.sun.rave.web.ui.model.SingleSelectOptionsList;
import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.IntegerConverter;
import javax.faces.event.ValueChangeEvent;
import javax.faces.validator.ValidatorException;
import net.abbht.lamo.bo.items.ItemBOFactory;
import net.abbht.lamo.persistence.items.ItemGroup;

/**
 *
 * @author home
 */
public class StaffTest extends TestCase {
    
    public StaffTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(StaffTest.class);
        
        return suite;
    }

    /**
     * Test of getPage1 method, of class lib1.Staff.
     */
    public void testGetPage1() {
        System.out.println("getPage1");
        
        Staff instance = new Staff();
        
        Page expResult = null;
        Page result = instance.getPage1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPage1 method, of class lib1.Staff.
     */
    public void testSetPage1() {
        System.out.println("setPage1");
        
        Page p = null;
        Staff instance = new Staff();
        
        instance.setPage1(p);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHtml1 method, of class lib1.Staff.
     */
    public void testGetHtml1() {
        System.out.println("getHtml1");
        
        Staff instance = new Staff();
        
        Html expResult = null;
        Html result = instance.getHtml1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHtml1 method, of class lib1.Staff.
     */
    public void testSetHtml1() {
        System.out.println("setHtml1");
        
        Html h = null;
        Staff instance = new Staff();
        
        instance.setHtml1(h);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHead1 method, of class lib1.Staff.
     */
    public void testGetHead1() {
        System.out.println("getHead1");
        
        Staff instance = new Staff();
        
        Head expResult = null;
        Head result = instance.getHead1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHead1 method, of class lib1.Staff.
     */
    public void testSetHead1() {
        System.out.println("setHead1");
        
        Head h = null;
        Staff instance = new Staff();
        
        instance.setHead1(h);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLink1 method, of class lib1.Staff.
     */
    public void testGetLink1() {
        System.out.println("getLink1");
        
        Staff instance = new Staff();
        
        Link expResult = null;
        Link result = instance.getLink1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLink1 method, of class lib1.Staff.
     */
    public void testSetLink1() {
        System.out.println("setLink1");
        
        Link l = null;
        Staff instance = new Staff();
        
        instance.setLink1(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBody1 method, of class lib1.Staff.
     */
    public void testGetBody1() {
        System.out.println("getBody1");
        
        Staff instance = new Staff();
        
        Body expResult = null;
        Body result = instance.getBody1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBody1 method, of class lib1.Staff.
     */
    public void testSetBody1() {
        System.out.println("setBody1");
        
        Body b = null;
        Staff instance = new Staff();
        
        instance.setBody1(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getForm1 method, of class lib1.Staff.
     */
    public void testGetForm1() {
        System.out.println("getForm1");
        
        Staff instance = new Staff();
        
        Form expResult = null;
        Form result = instance.getForm1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setForm1 method, of class lib1.Staff.
     */
    public void testSetForm1() {
        System.out.println("setForm1");
        
        Form f = null;
        Staff instance = new Staff();
        
        instance.setForm1(f);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTabSet1 method, of class lib1.Staff.
     */
    public void testGetTabSet1() {
        System.out.println("getTabSet1");
        
        Staff instance = new Staff();
        
        TabSet expResult = null;
        TabSet result = instance.getTabSet1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTabSet1 method, of class lib1.Staff.
     */
    public void testSetTabSet1() {
        System.out.println("setTabSet1");
        
        TabSet ts = null;
        Staff instance = new Staff();
        
        instance.setTabSet1(ts);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddItem method, of class lib1.Staff.
     */
    public void testGetAddItem() {
        System.out.println("getAddItem");
        
        Staff instance = new Staff();
        
        Tab expResult = null;
        Tab result = instance.getAddItem();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddItem method, of class lib1.Staff.
     */
    public void testSetAddItem() {
        System.out.println("setAddItem");
        
        Tab t = null;
        Staff instance = new Staff();
        
        instance.setAddItem(t);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLayoutPanel1 method, of class lib1.Staff.
     */
    public void testGetLayoutPanel1() {
        System.out.println("getLayoutPanel1");
        
        Staff instance = new Staff();
        
        PanelLayout expResult = null;
        PanelLayout result = instance.getLayoutPanel1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLayoutPanel1 method, of class lib1.Staff.
     */
    public void testSetLayoutPanel1() {
        System.out.println("setLayoutPanel1");
        
        PanelLayout pl = null;
        Staff instance = new Staff();
        
        instance.setLayoutPanel1(pl);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDropDown1 method, of class lib1.Staff.
     */
    public void testGetDropDown1() {
        System.out.println("getDropDown1");
        
        Staff instance = new Staff();
        
        DropDown expResult = null;
        DropDown result = instance.getDropDown1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDropDown1 method, of class lib1.Staff.
     */
    public void testSetDropDown1() {
        System.out.println("setDropDown1");
        
        DropDown dd = null;
        Staff instance = new Staff();
        
        instance.setDropDown1(dd);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDropDown1DefaultOptions method, of class lib1.Staff.
     */
    public void testGetDropDown1DefaultOptions() {
        System.out.println("getDropDown1DefaultOptions");
        
        Staff instance = new Staff();
        
        SingleSelectOptionsList expResult = null;
        SingleSelectOptionsList result = instance.getDropDown1DefaultOptions();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDropDown1DefaultOptions method, of class lib1.Staff.
     */
    public void testSetDropDown1DefaultOptions() {
        System.out.println("setDropDown1DefaultOptions");
        
        SingleSelectOptionsList ssol = null;
        Staff instance = new Staff();
        
        instance.setDropDown1DefaultOptions(ssol);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField1 method, of class lib1.Staff.
     */
    public void testGetTextField1() {
        System.out.println("getTextField1");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField1 method, of class lib1.Staff.
     */
    public void testSetTextField1() {
        System.out.println("setTextField1");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField1(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_search method, of class lib1.Staff.
     */
    public void testGet_search() {
        System.out.println("get_search");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.get_search();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_search method, of class lib1.Staff.
     */
    public void testSet_search() {
        System.out.println("set_search");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.set_search(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListbox1 method, of class lib1.Staff.
     */
    public void testGetListbox1() {
        System.out.println("getListbox1");
        
        Staff instance = new Staff();
        
        Listbox expResult = null;
        Listbox result = instance.getListbox1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListbox1 method, of class lib1.Staff.
     */
    public void testSetListbox1() {
        System.out.println("setListbox1");
        
        Listbox l = null;
        Staff instance = new Staff();
        
        instance.setListbox1(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListbox1DefaultOptions method, of class lib1.Staff.
     */
    public void testGetListbox1DefaultOptions() {
        System.out.println("getListbox1DefaultOptions");
        
        Staff instance = new Staff();
        
        DefaultOptionsList expResult = null;
        DefaultOptionsList result = instance.getListbox1DefaultOptions();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListbox1DefaultOptions method, of class lib1.Staff.
     */
    public void testSetListbox1DefaultOptions() {
        System.out.println("setListbox1DefaultOptions");
        
        DefaultOptionsList dol = null;
        Staff instance = new Staff();
        
        instance.setListbox1DefaultOptions(dol);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField2 method, of class lib1.Staff.
     */
    public void testGetTextField2() {
        System.out.println("getTextField2");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField2();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField2 method, of class lib1.Staff.
     */
    public void testSetTextField2() {
        System.out.println("setTextField2");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField2(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField3 method, of class lib1.Staff.
     */
    public void testGetTextField3() {
        System.out.println("getTextField3");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField3();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField3 method, of class lib1.Staff.
     */
    public void testSetTextField3() {
        System.out.println("setTextField3");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField3(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField4 method, of class lib1.Staff.
     */
    public void testGetTextField4() {
        System.out.println("getTextField4");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField4();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField4 method, of class lib1.Staff.
     */
    public void testSetTextField4() {
        System.out.println("setTextField4");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField4(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField5 method, of class lib1.Staff.
     */
    public void testGetTextField5() {
        System.out.println("getTextField5");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField5();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField5 method, of class lib1.Staff.
     */
    public void testSetTextField5() {
        System.out.println("setTextField5");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField5(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField6 method, of class lib1.Staff.
     */
    public void testGetTextField6() {
        System.out.println("getTextField6");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField6();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField6 method, of class lib1.Staff.
     */
    public void testSetTextField6() {
        System.out.println("setTextField6");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField6(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField7 method, of class lib1.Staff.
     */
    public void testGetTextField7() {
        System.out.println("getTextField7");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField7();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField7 method, of class lib1.Staff.
     */
    public void testSetTextField7() {
        System.out.println("setTextField7");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField7(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField9 method, of class lib1.Staff.
     */
    public void testGetTextField9() {
        System.out.println("getTextField9");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField9();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField9 method, of class lib1.Staff.
     */
    public void testSetTextField9() {
        System.out.println("setTextField9");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField9(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField10 method, of class lib1.Staff.
     */
    public void testGetTextField10() {
        System.out.println("getTextField10");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField10();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField10 method, of class lib1.Staff.
     */
    public void testSetTextField10() {
        System.out.println("setTextField10");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField10(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField11 method, of class lib1.Staff.
     */
    public void testGetTextField11() {
        System.out.println("getTextField11");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField11();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField11 method, of class lib1.Staff.
     */
    public void testSetTextField11() {
        System.out.println("setTextField11");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField11(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField12 method, of class lib1.Staff.
     */
    public void testGetTextField12() {
        System.out.println("getTextField12");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField12();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField12 method, of class lib1.Staff.
     */
    public void testSetTextField12() {
        System.out.println("setTextField12");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField12(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField8 method, of class lib1.Staff.
     */
    public void testGetTextField8() {
        System.out.println("getTextField8");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField8();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField8 method, of class lib1.Staff.
     */
    public void testSetTextField8() {
        System.out.println("setTextField8");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField8(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDropDown2 method, of class lib1.Staff.
     */
    public void testGetDropDown2() {
        System.out.println("getDropDown2");
        
        Staff instance = new Staff();
        
        DropDown expResult = null;
        DropDown result = instance.getDropDown2();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDropDown2 method, of class lib1.Staff.
     */
    public void testSetDropDown2() {
        System.out.println("setDropDown2");
        
        DropDown dd = null;
        Staff instance = new Staff();
        
        instance.setDropDown2(dd);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDropDown2DefaultOptions method, of class lib1.Staff.
     */
    public void testGetDropDown2DefaultOptions() {
        System.out.println("getDropDown2DefaultOptions");
        
        Staff instance = new Staff();
        
        SingleSelectOptionsList expResult = null;
        SingleSelectOptionsList result = instance.getDropDown2DefaultOptions();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDropDown2DefaultOptions method, of class lib1.Staff.
     */
    public void testSetDropDown2DefaultOptions() {
        System.out.println("setDropDown2DefaultOptions");
        
        SingleSelectOptionsList ssol = null;
        Staff instance = new Staff();
        
        instance.setDropDown2DefaultOptions(ssol);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDropDown3 method, of class lib1.Staff.
     */
    public void testGetDropDown3() {
        System.out.println("getDropDown3");
        
        Staff instance = new Staff();
        
        DropDown expResult = null;
        DropDown result = instance.getDropDown3();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDropDown3 method, of class lib1.Staff.
     */
    public void testSetDropDown3() {
        System.out.println("setDropDown3");
        
        DropDown dd = null;
        Staff instance = new Staff();
        
        instance.setDropDown3(dd);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDropDown3DefaultOptions method, of class lib1.Staff.
     */
    public void testGetDropDown3DefaultOptions() {
        System.out.println("getDropDown3DefaultOptions");
        
        Staff instance = new Staff();
        
        SingleSelectOptionsList expResult = null;
        SingleSelectOptionsList result = instance.getDropDown3DefaultOptions();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDropDown3DefaultOptions method, of class lib1.Staff.
     */
    public void testSetDropDown3DefaultOptions() {
        System.out.println("setDropDown3DefaultOptions");
        
        SingleSelectOptionsList ssol = null;
        Staff instance = new Staff();
        
        instance.setDropDown3DefaultOptions(ssol);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_enable method, of class lib1.Staff.
     */
    public void testGet_enable() {
        System.out.println("get_enable");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.get_enable();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_enable method, of class lib1.Staff.
     */
    public void testSet_enable() {
        System.out.println("set_enable");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.set_enable(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton3 method, of class lib1.Staff.
     */
    public void testGetButton3() {
        System.out.println("getButton3");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton3();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton3 method, of class lib1.Staff.
     */
    public void testSetButton3() {
        System.out.println("setButton3");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton3(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_clearall method, of class lib1.Staff.
     */
    public void testGet_clearall() {
        System.out.println("get_clearall");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.get_clearall();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_clearall method, of class lib1.Staff.
     */
    public void testSet_clearall() {
        System.out.println("set_clearall");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.set_clearall(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton5 method, of class lib1.Staff.
     */
    public void testGetButton5() {
        System.out.println("getButton5");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton5();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton5 method, of class lib1.Staff.
     */
    public void testSetButton5() {
        System.out.println("setButton5");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton5(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_disable method, of class lib1.Staff.
     */
    public void testGet_disable() {
        System.out.println("get_disable");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.get_disable();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_disable method, of class lib1.Staff.
     */
    public void testSet_disable() {
        System.out.println("set_disable");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.set_disable(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton7 method, of class lib1.Staff.
     */
    public void testGetButton7() {
        System.out.println("getButton7");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton7();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton7 method, of class lib1.Staff.
     */
    public void testSetButton7() {
        System.out.println("setButton7");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton7(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_title method, of class lib1.Staff.
     */
    public void testGet_title() {
        System.out.println("get_title");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.get_title();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_title method, of class lib1.Staff.
     */
    public void testSet_title() {
        System.out.println("set_title");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.set_title(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_type method, of class lib1.Staff.
     */
    public void testGet_type() {
        System.out.println("get_type");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.get_type();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_type method, of class lib1.Staff.
     */
    public void testSet_type() {
        System.out.println("set_type");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.set_type(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_group method, of class lib1.Staff.
     */
    public void testGet_group() {
        System.out.println("get_group");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.get_group();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_group method, of class lib1.Staff.
     */
    public void testSet_group() {
        System.out.println("set_group");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.set_group(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_description method, of class lib1.Staff.
     */
    public void testGet_description() {
        System.out.println("get_description");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.get_description();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_description method, of class lib1.Staff.
     */
    public void testSet_description() {
        System.out.println("set_description");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.set_description(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_isbn method, of class lib1.Staff.
     */
    public void testGet_isbn() {
        System.out.println("get_isbn");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.get_isbn();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_isbn method, of class lib1.Staff.
     */
    public void testSet_isbn() {
        System.out.println("set_isbn");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.set_isbn(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_edition method, of class lib1.Staff.
     */
    public void testGet_edition() {
        System.out.println("get_edition");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.get_edition();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_edition method, of class lib1.Staff.
     */
    public void testSet_edition() {
        System.out.println("set_edition");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.set_edition(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_status method, of class lib1.Staff.
     */
    public void testGet_status() {
        System.out.println("get_status");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.get_status();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_status method, of class lib1.Staff.
     */
    public void testSet_status() {
        System.out.println("set_status");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.set_status(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_availability method, of class lib1.Staff.
     */
    public void testGet_availability() {
        System.out.println("get_availability");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.get_availability();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_availability method, of class lib1.Staff.
     */
    public void testSet_availability() {
        System.out.println("set_availability");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.set_availability(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_authors method, of class lib1.Staff.
     */
    public void testGet_authors() {
        System.out.println("get_authors");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.get_authors();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_authors method, of class lib1.Staff.
     */
    public void testSet_authors() {
        System.out.println("set_authors");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.set_authors(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_location method, of class lib1.Staff.
     */
    public void testGet_location() {
        System.out.println("get_location");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.get_location();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_location method, of class lib1.Staff.
     */
    public void testSet_location() {
        System.out.println("set_location");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.set_location(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_cost method, of class lib1.Staff.
     */
    public void testGet_cost() {
        System.out.println("get_cost");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.get_cost();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_cost method, of class lib1.Staff.
     */
    public void testSet_cost() {
        System.out.println("set_cost");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.set_cost(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_publisher method, of class lib1.Staff.
     */
    public void testGet_publisher() {
        System.out.println("get_publisher");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.get_publisher();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_publisher method, of class lib1.Staff.
     */
    public void testSet_publisher() {
        System.out.println("set_publisher");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.set_publisher(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_yearofpublish method, of class lib1.Staff.
     */
    public void testGet_yearofpublish() {
        System.out.println("get_yearofpublish");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.get_yearofpublish();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_yearofpublish method, of class lib1.Staff.
     */
    public void testSet_yearofpublish() {
        System.out.println("set_yearofpublish");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.set_yearofpublish(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSingleSelectOptionsList1 method, of class lib1.Staff.
     */
    public void testGetSingleSelectOptionsList1() {
        System.out.println("getSingleSelectOptionsList1");
        
        Staff instance = new Staff();
        
        SingleSelectOptionsList expResult = null;
        SingleSelectOptionsList result = instance.getSingleSelectOptionsList1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSingleSelectOptionsList1 method, of class lib1.Staff.
     */
    public void testSetSingleSelectOptionsList1() {
        System.out.println("setSingleSelectOptionsList1");
        
        SingleSelectOptionsList ssol = null;
        Staff instance = new Staff();
        
        instance.setSingleSelectOptionsList1(ssol);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSingleSelectOptionsList2 method, of class lib1.Staff.
     */
    public void testGetSingleSelectOptionsList2() {
        System.out.println("getSingleSelectOptionsList2");
        
        Staff instance = new Staff();
        
        SingleSelectOptionsList expResult = null;
        SingleSelectOptionsList result = instance.getSingleSelectOptionsList2();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSingleSelectOptionsList2 method, of class lib1.Staff.
     */
    public void testSetSingleSelectOptionsList2() {
        System.out.println("setSingleSelectOptionsList2");
        
        SingleSelectOptionsList ssol = null;
        Staff instance = new Staff();
        
        instance.setSingleSelectOptionsList2(ssol);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class lib1.Staff.
     */
    public void testGetAddress() {
        System.out.println("getAddress");
        
        Staff instance = new Staff();
        
        Tab expResult = null;
        Tab result = instance.getAddress();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddress method, of class lib1.Staff.
     */
    public void testSetAddress() {
        System.out.println("setAddress");
        
        Tab t = null;
        Staff instance = new Staff();
        
        instance.setAddress(t);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLayoutPanel3 method, of class lib1.Staff.
     */
    public void testGetLayoutPanel3() {
        System.out.println("getLayoutPanel3");
        
        Staff instance = new Staff();
        
        PanelLayout expResult = null;
        PanelLayout result = instance.getLayoutPanel3();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLayoutPanel3 method, of class lib1.Staff.
     */
    public void testSetLayoutPanel3() {
        System.out.println("setLayoutPanel3");
        
        PanelLayout pl = null;
        Staff instance = new Staff();
        
        instance.setLayoutPanel3(pl);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel18 method, of class lib1.Staff.
     */
    public void testGetLabel18() {
        System.out.println("getLabel18");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel18();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel18 method, of class lib1.Staff.
     */
    public void testSetLabel18() {
        System.out.println("setLabel18");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel18(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel19 method, of class lib1.Staff.
     */
    public void testGetLabel19() {
        System.out.println("getLabel19");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel19();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel19 method, of class lib1.Staff.
     */
    public void testSetLabel19() {
        System.out.println("setLabel19");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel19(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel20 method, of class lib1.Staff.
     */
    public void testGetLabel20() {
        System.out.println("getLabel20");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel20();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel20 method, of class lib1.Staff.
     */
    public void testSetLabel20() {
        System.out.println("setLabel20");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel20(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel21 method, of class lib1.Staff.
     */
    public void testGetLabel21() {
        System.out.println("getLabel21");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel21();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel21 method, of class lib1.Staff.
     */
    public void testSetLabel21() {
        System.out.println("setLabel21");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel21(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel22 method, of class lib1.Staff.
     */
    public void testGetLabel22() {
        System.out.println("getLabel22");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel22();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel22 method, of class lib1.Staff.
     */
    public void testSetLabel22() {
        System.out.println("setLabel22");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel22(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel23 method, of class lib1.Staff.
     */
    public void testGetLabel23() {
        System.out.println("getLabel23");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel23();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel23 method, of class lib1.Staff.
     */
    public void testSetLabel23() {
        System.out.println("setLabel23");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel23(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel24 method, of class lib1.Staff.
     */
    public void testGetLabel24() {
        System.out.println("getLabel24");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel24();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel24 method, of class lib1.Staff.
     */
    public void testSetLabel24() {
        System.out.println("setLabel24");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel24(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel25 method, of class lib1.Staff.
     */
    public void testGetLabel25() {
        System.out.println("getLabel25");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel25();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel25 method, of class lib1.Staff.
     */
    public void testSetLabel25() {
        System.out.println("setLabel25");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel25(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel26 method, of class lib1.Staff.
     */
    public void testGetLabel26() {
        System.out.println("getLabel26");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel26();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel26 method, of class lib1.Staff.
     */
    public void testSetLabel26() {
        System.out.println("setLabel26");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel26(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_country method, of class lib1.Staff.
     */
    public void testGet_country() {
        System.out.println("get_country");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.get_country();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_country method, of class lib1.Staff.
     */
    public void testSet_country() {
        System.out.println("set_country");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.set_country(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_userName1 method, of class lib1.Staff.
     */
    public void testGet_userName1() {
        System.out.println("get_userName1");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.get_userName1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_userName1 method, of class lib1.Staff.
     */
    public void testSet_userName1() {
        System.out.println("set_userName1");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.set_userName1(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_city method, of class lib1.Staff.
     */
    public void testGet_city() {
        System.out.println("get_city");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.get_city();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_city method, of class lib1.Staff.
     */
    public void testSet_city() {
        System.out.println("set_city");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.set_city(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_street method, of class lib1.Staff.
     */
    public void testGet_street() {
        System.out.println("get_street");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.get_street();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_street method, of class lib1.Staff.
     */
    public void testSet_street() {
        System.out.println("set_street");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.set_street(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_status1 method, of class lib1.Staff.
     */
    public void testGet_status1() {
        System.out.println("get_status1");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.get_status1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_status1 method, of class lib1.Staff.
     */
    public void testSet_status1() {
        System.out.println("set_status1");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.set_status1(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_zipcode method, of class lib1.Staff.
     */
    public void testGet_zipcode() {
        System.out.println("get_zipcode");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.get_zipcode();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_zipcode method, of class lib1.Staff.
     */
    public void testSet_zipcode() {
        System.out.println("set_zipcode");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.set_zipcode(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_state method, of class lib1.Staff.
     */
    public void testGet_state() {
        System.out.println("get_state");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.get_state();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_state method, of class lib1.Staff.
     */
    public void testSet_state() {
        System.out.println("set_state");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.set_state(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_type2 method, of class lib1.Staff.
     */
    public void testGet_type2() {
        System.out.println("get_type2");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.get_type2();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_type2 method, of class lib1.Staff.
     */
    public void testSet_type2() {
        System.out.println("set_type2");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.set_type2(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_creationDate method, of class lib1.Staff.
     */
    public void testGet_creationDate() {
        System.out.println("get_creationDate");
        
        Staff instance = new Staff();
        
        Calendar expResult = null;
        Calendar result = instance.get_creationDate();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_creationDate method, of class lib1.Staff.
     */
    public void testSet_creationDate() {
        System.out.println("set_creationDate");
        
        Calendar c = null;
        Staff instance = new Staff();
        
        instance.set_creationDate(c);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListbox2 method, of class lib1.Staff.
     */
    public void testGetListbox2() {
        System.out.println("getListbox2");
        
        Staff instance = new Staff();
        
        Listbox expResult = null;
        Listbox result = instance.getListbox2();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListbox2 method, of class lib1.Staff.
     */
    public void testSetListbox2() {
        System.out.println("setListbox2");
        
        Listbox l = null;
        Staff instance = new Staff();
        
        instance.setListbox2(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListbox2DefaultOptions method, of class lib1.Staff.
     */
    public void testGetListbox2DefaultOptions() {
        System.out.println("getListbox2DefaultOptions");
        
        Staff instance = new Staff();
        
        DefaultOptionsList expResult = null;
        DefaultOptionsList result = instance.getListbox2DefaultOptions();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListbox2DefaultOptions method, of class lib1.Staff.
     */
    public void testSetListbox2DefaultOptions() {
        System.out.println("setListbox2DefaultOptions");
        
        DefaultOptionsList dol = null;
        Staff instance = new Staff();
        
        instance.setListbox2DefaultOptions(dol);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton6 method, of class lib1.Staff.
     */
    public void testGetButton6() {
        System.out.println("getButton6");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton6();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton6 method, of class lib1.Staff.
     */
    public void testSetButton6() {
        System.out.println("setButton6");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton6(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton8 method, of class lib1.Staff.
     */
    public void testGetButton8() {
        System.out.println("getButton8");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton8();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton8 method, of class lib1.Staff.
     */
    public void testSetButton8() {
        System.out.println("setButton8");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton8(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCalendar1 method, of class lib1.Staff.
     */
    public void testGetCalendar1() {
        System.out.println("getCalendar1");
        
        Staff instance = new Staff();
        
        Calendar expResult = null;
        Calendar result = instance.getCalendar1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCalendar1 method, of class lib1.Staff.
     */
    public void testSetCalendar1() {
        System.out.println("setCalendar1");
        
        Calendar c = null;
        Staff instance = new Staff();
        
        instance.setCalendar1(c);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsers method, of class lib1.Staff.
     */
    public void testGetUsers() {
        System.out.println("getUsers");
        
        Staff instance = new Staff();
        
        Tab expResult = null;
        Tab result = instance.getUsers();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsers method, of class lib1.Staff.
     */
    public void testSetUsers() {
        System.out.println("setUsers");
        
        Tab t = null;
        Staff instance = new Staff();
        
        instance.setUsers(t);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLayoutPanel6 method, of class lib1.Staff.
     */
    public void testGetLayoutPanel6() {
        System.out.println("getLayoutPanel6");
        
        Staff instance = new Staff();
        
        PanelLayout expResult = null;
        PanelLayout result = instance.getLayoutPanel6();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLayoutPanel6 method, of class lib1.Staff.
     */
    public void testSetLayoutPanel6() {
        System.out.println("setLayoutPanel6");
        
        PanelLayout pl = null;
        Staff instance = new Staff();
        
        instance.setLayoutPanel6(pl);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel27 method, of class lib1.Staff.
     */
    public void testGetLabel27() {
        System.out.println("getLabel27");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel27();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel27 method, of class lib1.Staff.
     */
    public void testSetLabel27() {
        System.out.println("setLabel27");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel27(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel28 method, of class lib1.Staff.
     */
    public void testGetLabel28() {
        System.out.println("getLabel28");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel28();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel28 method, of class lib1.Staff.
     */
    public void testSetLabel28() {
        System.out.println("setLabel28");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel28(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel29 method, of class lib1.Staff.
     */
    public void testGetLabel29() {
        System.out.println("getLabel29");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel29();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel29 method, of class lib1.Staff.
     */
    public void testSetLabel29() {
        System.out.println("setLabel29");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel29(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel30 method, of class lib1.Staff.
     */
    public void testGetLabel30() {
        System.out.println("getLabel30");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel30();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel30 method, of class lib1.Staff.
     */
    public void testSetLabel30() {
        System.out.println("setLabel30");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel30(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel31 method, of class lib1.Staff.
     */
    public void testGetLabel31() {
        System.out.println("getLabel31");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel31();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel31 method, of class lib1.Staff.
     */
    public void testSetLabel31() {
        System.out.println("setLabel31");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel31(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel32 method, of class lib1.Staff.
     */
    public void testGetLabel32() {
        System.out.println("getLabel32");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel32();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel32 method, of class lib1.Staff.
     */
    public void testSetLabel32() {
        System.out.println("setLabel32");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel32(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel33 method, of class lib1.Staff.
     */
    public void testGetLabel33() {
        System.out.println("getLabel33");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel33();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel33 method, of class lib1.Staff.
     */
    public void testSetLabel33() {
        System.out.println("setLabel33");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel33(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel34 method, of class lib1.Staff.
     */
    public void testGetLabel34() {
        System.out.println("getLabel34");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel34();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel34 method, of class lib1.Staff.
     */
    public void testSetLabel34() {
        System.out.println("setLabel34");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel34(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel36 method, of class lib1.Staff.
     */
    public void testGetLabel36() {
        System.out.println("getLabel36");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel36();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel36 method, of class lib1.Staff.
     */
    public void testSetLabel36() {
        System.out.println("setLabel36");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel36(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel37 method, of class lib1.Staff.
     */
    public void testGetLabel37() {
        System.out.println("getLabel37");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel37();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel37 method, of class lib1.Staff.
     */
    public void testSetLabel37() {
        System.out.println("setLabel37");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel37(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel38 method, of class lib1.Staff.
     */
    public void testGetLabel38() {
        System.out.println("getLabel38");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel38();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel38 method, of class lib1.Staff.
     */
    public void testSetLabel38() {
        System.out.println("setLabel38");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel38(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel39 method, of class lib1.Staff.
     */
    public void testGetLabel39() {
        System.out.println("getLabel39");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel39();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel39 method, of class lib1.Staff.
     */
    public void testSetLabel39() {
        System.out.println("setLabel39");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel39(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel40 method, of class lib1.Staff.
     */
    public void testGetLabel40() {
        System.out.println("getLabel40");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel40();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel40 method, of class lib1.Staff.
     */
    public void testSetLabel40() {
        System.out.println("setLabel40");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel40(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel41 method, of class lib1.Staff.
     */
    public void testGetLabel41() {
        System.out.println("getLabel41");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel41();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel41 method, of class lib1.Staff.
     */
    public void testSetLabel41() {
        System.out.println("setLabel41");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel41(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel42 method, of class lib1.Staff.
     */
    public void testGetLabel42() {
        System.out.println("getLabel42");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel42();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel42 method, of class lib1.Staff.
     */
    public void testSetLabel42() {
        System.out.println("setLabel42");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel42(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel43 method, of class lib1.Staff.
     */
    public void testGetLabel43() {
        System.out.println("getLabel43");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel43();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel43 method, of class lib1.Staff.
     */
    public void testSetLabel43() {
        System.out.println("setLabel43");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel43(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField14 method, of class lib1.Staff.
     */
    public void testGetTextField14() {
        System.out.println("getTextField14");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField14();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField14 method, of class lib1.Staff.
     */
    public void testSetTextField14() {
        System.out.println("setTextField14");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField14(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField15 method, of class lib1.Staff.
     */
    public void testGetTextField15() {
        System.out.println("getTextField15");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField15();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField15 method, of class lib1.Staff.
     */
    public void testSetTextField15() {
        System.out.println("setTextField15");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField15(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField16 method, of class lib1.Staff.
     */
    public void testGetTextField16() {
        System.out.println("getTextField16");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField16();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField16 method, of class lib1.Staff.
     */
    public void testSetTextField16() {
        System.out.println("setTextField16");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField16(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDropDown4 method, of class lib1.Staff.
     */
    public void testGetDropDown4() {
        System.out.println("getDropDown4");
        
        Staff instance = new Staff();
        
        DropDown expResult = null;
        DropDown result = instance.getDropDown4();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDropDown4 method, of class lib1.Staff.
     */
    public void testSetDropDown4() {
        System.out.println("setDropDown4");
        
        DropDown dd = null;
        Staff instance = new Staff();
        
        instance.setDropDown4(dd);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDropDown4DefaultOptions method, of class lib1.Staff.
     */
    public void testGetDropDown4DefaultOptions() {
        System.out.println("getDropDown4DefaultOptions");
        
        Staff instance = new Staff();
        
        SingleSelectOptionsList expResult = null;
        SingleSelectOptionsList result = instance.getDropDown4DefaultOptions();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDropDown4DefaultOptions method, of class lib1.Staff.
     */
    public void testSetDropDown4DefaultOptions() {
        System.out.println("setDropDown4DefaultOptions");
        
        SingleSelectOptionsList ssol = null;
        Staff instance = new Staff();
        
        instance.setDropDown4DefaultOptions(ssol);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDropDown5 method, of class lib1.Staff.
     */
    public void testGetDropDown5() {
        System.out.println("getDropDown5");
        
        Staff instance = new Staff();
        
        DropDown expResult = null;
        DropDown result = instance.getDropDown5();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDropDown5 method, of class lib1.Staff.
     */
    public void testSetDropDown5() {
        System.out.println("setDropDown5");
        
        DropDown dd = null;
        Staff instance = new Staff();
        
        instance.setDropDown5(dd);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDropDown5DefaultOptions method, of class lib1.Staff.
     */
    public void testGetDropDown5DefaultOptions() {
        System.out.println("getDropDown5DefaultOptions");
        
        Staff instance = new Staff();
        
        SingleSelectOptionsList expResult = null;
        SingleSelectOptionsList result = instance.getDropDown5DefaultOptions();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDropDown5DefaultOptions method, of class lib1.Staff.
     */
    public void testSetDropDown5DefaultOptions() {
        System.out.println("setDropDown5DefaultOptions");
        
        SingleSelectOptionsList ssol = null;
        Staff instance = new Staff();
        
        instance.setDropDown5DefaultOptions(ssol);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDropDown7 method, of class lib1.Staff.
     */
    public void testGetDropDown7() {
        System.out.println("getDropDown7");
        
        Staff instance = new Staff();
        
        DropDown expResult = null;
        DropDown result = instance.getDropDown7();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDropDown7 method, of class lib1.Staff.
     */
    public void testSetDropDown7() {
        System.out.println("setDropDown7");
        
        DropDown dd = null;
        Staff instance = new Staff();
        
        instance.setDropDown7(dd);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDropDown7DefaultOptions method, of class lib1.Staff.
     */
    public void testGetDropDown7DefaultOptions() {
        System.out.println("getDropDown7DefaultOptions");
        
        Staff instance = new Staff();
        
        SingleSelectOptionsList expResult = null;
        SingleSelectOptionsList result = instance.getDropDown7DefaultOptions();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDropDown7DefaultOptions method, of class lib1.Staff.
     */
    public void testSetDropDown7DefaultOptions() {
        System.out.println("setDropDown7DefaultOptions");
        
        SingleSelectOptionsList ssol = null;
        Staff instance = new Staff();
        
        instance.setDropDown7DefaultOptions(ssol);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDropDown8 method, of class lib1.Staff.
     */
    public void testGetDropDown8() {
        System.out.println("getDropDown8");
        
        Staff instance = new Staff();
        
        DropDown expResult = null;
        DropDown result = instance.getDropDown8();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDropDown8 method, of class lib1.Staff.
     */
    public void testSetDropDown8() {
        System.out.println("setDropDown8");
        
        DropDown dd = null;
        Staff instance = new Staff();
        
        instance.setDropDown8(dd);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDropDown8DefaultOptions method, of class lib1.Staff.
     */
    public void testGetDropDown8DefaultOptions() {
        System.out.println("getDropDown8DefaultOptions");
        
        Staff instance = new Staff();
        
        SingleSelectOptionsList expResult = null;
        SingleSelectOptionsList result = instance.getDropDown8DefaultOptions();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDropDown8DefaultOptions method, of class lib1.Staff.
     */
    public void testSetDropDown8DefaultOptions() {
        System.out.println("setDropDown8DefaultOptions");
        
        SingleSelectOptionsList ssol = null;
        Staff instance = new Staff();
        
        instance.setDropDown8DefaultOptions(ssol);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDropDown9 method, of class lib1.Staff.
     */
    public void testGetDropDown9() {
        System.out.println("getDropDown9");
        
        Staff instance = new Staff();
        
        DropDown expResult = null;
        DropDown result = instance.getDropDown9();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDropDown9 method, of class lib1.Staff.
     */
    public void testSetDropDown9() {
        System.out.println("setDropDown9");
        
        DropDown dd = null;
        Staff instance = new Staff();
        
        instance.setDropDown9(dd);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDropDown9DefaultOptions method, of class lib1.Staff.
     */
    public void testGetDropDown9DefaultOptions() {
        System.out.println("getDropDown9DefaultOptions");
        
        Staff instance = new Staff();
        
        SingleSelectOptionsList expResult = null;
        SingleSelectOptionsList result = instance.getDropDown9DefaultOptions();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDropDown9DefaultOptions method, of class lib1.Staff.
     */
    public void testSetDropDown9DefaultOptions() {
        System.out.println("setDropDown9DefaultOptions");
        
        SingleSelectOptionsList ssol = null;
        Staff instance = new Staff();
        
        instance.setDropDown9DefaultOptions(ssol);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField17 method, of class lib1.Staff.
     */
    public void testGetTextField17() {
        System.out.println("getTextField17");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField17();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField17 method, of class lib1.Staff.
     */
    public void testSetTextField17() {
        System.out.println("setTextField17");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField17(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField18 method, of class lib1.Staff.
     */
    public void testGetTextField18() {
        System.out.println("getTextField18");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField18();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField18 method, of class lib1.Staff.
     */
    public void testSetTextField18() {
        System.out.println("setTextField18");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField18(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField19 method, of class lib1.Staff.
     */
    public void testGetTextField19() {
        System.out.println("getTextField19");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField19();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField19 method, of class lib1.Staff.
     */
    public void testSetTextField19() {
        System.out.println("setTextField19");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField19(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField20 method, of class lib1.Staff.
     */
    public void testGetTextField20() {
        System.out.println("getTextField20");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField20();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField20 method, of class lib1.Staff.
     */
    public void testSetTextField20() {
        System.out.println("setTextField20");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField20(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField21 method, of class lib1.Staff.
     */
    public void testGetTextField21() {
        System.out.println("getTextField21");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField21();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField21 method, of class lib1.Staff.
     */
    public void testSetTextField21() {
        System.out.println("setTextField21");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField21(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField22 method, of class lib1.Staff.
     */
    public void testGetTextField22() {
        System.out.println("getTextField22");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField22();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField22 method, of class lib1.Staff.
     */
    public void testSetTextField22() {
        System.out.println("setTextField22");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField22(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField23 method, of class lib1.Staff.
     */
    public void testGetTextField23() {
        System.out.println("getTextField23");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField23();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField23 method, of class lib1.Staff.
     */
    public void testSetTextField23() {
        System.out.println("setTextField23");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField23(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCalendar2 method, of class lib1.Staff.
     */
    public void testGetCalendar2() {
        System.out.println("getCalendar2");
        
        Staff instance = new Staff();
        
        Calendar expResult = null;
        Calendar result = instance.getCalendar2();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCalendar2 method, of class lib1.Staff.
     */
    public void testSetCalendar2() {
        System.out.println("setCalendar2");
        
        Calendar c = null;
        Staff instance = new Staff();
        
        instance.setCalendar2(c);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDropDown6 method, of class lib1.Staff.
     */
    public void testGetDropDown6() {
        System.out.println("getDropDown6");
        
        Staff instance = new Staff();
        
        DropDown expResult = null;
        DropDown result = instance.getDropDown6();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDropDown6 method, of class lib1.Staff.
     */
    public void testSetDropDown6() {
        System.out.println("setDropDown6");
        
        DropDown dd = null;
        Staff instance = new Staff();
        
        instance.setDropDown6(dd);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDropDown6DefaultOptions method, of class lib1.Staff.
     */
    public void testGetDropDown6DefaultOptions() {
        System.out.println("getDropDown6DefaultOptions");
        
        Staff instance = new Staff();
        
        SingleSelectOptionsList expResult = null;
        SingleSelectOptionsList result = instance.getDropDown6DefaultOptions();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDropDown6DefaultOptions method, of class lib1.Staff.
     */
    public void testSetDropDown6DefaultOptions() {
        System.out.println("setDropDown6DefaultOptions");
        
        SingleSelectOptionsList ssol = null;
        Staff instance = new Staff();
        
        instance.setDropDown6DefaultOptions(ssol);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField24 method, of class lib1.Staff.
     */
    public void testGetTextField24() {
        System.out.println("getTextField24");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField24();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField24 method, of class lib1.Staff.
     */
    public void testSetTextField24() {
        System.out.println("setTextField24");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField24(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton20 method, of class lib1.Staff.
     */
    public void testGetButton20() {
        System.out.println("getButton20");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton20();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton20 method, of class lib1.Staff.
     */
    public void testSetButton20() {
        System.out.println("setButton20");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton20(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListbox3 method, of class lib1.Staff.
     */
    public void testGetListbox3() {
        System.out.println("getListbox3");
        
        Staff instance = new Staff();
        
        Listbox expResult = null;
        Listbox result = instance.getListbox3();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListbox3 method, of class lib1.Staff.
     */
    public void testSetListbox3() {
        System.out.println("setListbox3");
        
        Listbox l = null;
        Staff instance = new Staff();
        
        instance.setListbox3(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListbox3DefaultOptions method, of class lib1.Staff.
     */
    public void testGetListbox3DefaultOptions() {
        System.out.println("getListbox3DefaultOptions");
        
        Staff instance = new Staff();
        
        DefaultOptionsList expResult = null;
        DefaultOptionsList result = instance.getListbox3DefaultOptions();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListbox3DefaultOptions method, of class lib1.Staff.
     */
    public void testSetListbox3DefaultOptions() {
        System.out.println("setListbox3DefaultOptions");
        
        DefaultOptionsList dol = null;
        Staff instance = new Staff();
        
        instance.setListbox3DefaultOptions(dol);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton29 method, of class lib1.Staff.
     */
    public void testGetButton29() {
        System.out.println("getButton29");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton29();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton29 method, of class lib1.Staff.
     */
    public void testSetButton29() {
        System.out.println("setButton29");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton29(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton30 method, of class lib1.Staff.
     */
    public void testGetButton30() {
        System.out.println("getButton30");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton30();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton30 method, of class lib1.Staff.
     */
    public void testSetButton30() {
        System.out.println("setButton30");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton30(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton31 method, of class lib1.Staff.
     */
    public void testGetButton31() {
        System.out.println("getButton31");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton31();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton31 method, of class lib1.Staff.
     */
    public void testSetButton31() {
        System.out.println("setButton31");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton31(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton32 method, of class lib1.Staff.
     */
    public void testGetButton32() {
        System.out.println("getButton32");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton32();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton32 method, of class lib1.Staff.
     */
    public void testSetButton32() {
        System.out.println("setButton32");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton32(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton33 method, of class lib1.Staff.
     */
    public void testGetButton33() {
        System.out.println("getButton33");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton33();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton33 method, of class lib1.Staff.
     */
    public void testSetButton33() {
        System.out.println("setButton33");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton33(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton34 method, of class lib1.Staff.
     */
    public void testGetButton34() {
        System.out.println("getButton34");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton34();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton34 method, of class lib1.Staff.
     */
    public void testSetButton34() {
        System.out.println("setButton34");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton34(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton35 method, of class lib1.Staff.
     */
    public void testGetButton35() {
        System.out.println("getButton35");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton35();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton35 method, of class lib1.Staff.
     */
    public void testSetButton35() {
        System.out.println("setButton35");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton35(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMyAccount method, of class lib1.Staff.
     */
    public void testGetMyAccount() {
        System.out.println("getMyAccount");
        
        Staff instance = new Staff();
        
        Tab expResult = null;
        Tab result = instance.getMyAccount();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMyAccount method, of class lib1.Staff.
     */
    public void testSetMyAccount() {
        System.out.println("setMyAccount");
        
        Tab t = null;
        Staff instance = new Staff();
        
        instance.setMyAccount(t);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLayoutPanel7 method, of class lib1.Staff.
     */
    public void testGetLayoutPanel7() {
        System.out.println("getLayoutPanel7");
        
        Staff instance = new Staff();
        
        PanelLayout expResult = null;
        PanelLayout result = instance.getLayoutPanel7();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLayoutPanel7 method, of class lib1.Staff.
     */
    public void testSetLayoutPanel7() {
        System.out.println("setLayoutPanel7");
        
        PanelLayout pl = null;
        Staff instance = new Staff();
        
        instance.setLayoutPanel7(pl);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel35 method, of class lib1.Staff.
     */
    public void testGetLabel35() {
        System.out.println("getLabel35");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel35();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel35 method, of class lib1.Staff.
     */
    public void testSetLabel35() {
        System.out.println("setLabel35");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel35(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel44 method, of class lib1.Staff.
     */
    public void testGetLabel44() {
        System.out.println("getLabel44");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel44();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel44 method, of class lib1.Staff.
     */
    public void testSetLabel44() {
        System.out.println("setLabel44");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel44(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel46 method, of class lib1.Staff.
     */
    public void testGetLabel46() {
        System.out.println("getLabel46");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel46();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel46 method, of class lib1.Staff.
     */
    public void testSetLabel46() {
        System.out.println("setLabel46");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel46(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel47 method, of class lib1.Staff.
     */
    public void testGetLabel47() {
        System.out.println("getLabel47");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel47();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel47 method, of class lib1.Staff.
     */
    public void testSetLabel47() {
        System.out.println("setLabel47");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel47(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel49 method, of class lib1.Staff.
     */
    public void testGetLabel49() {
        System.out.println("getLabel49");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel49();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel49 method, of class lib1.Staff.
     */
    public void testSetLabel49() {
        System.out.println("setLabel49");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel49(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel50 method, of class lib1.Staff.
     */
    public void testGetLabel50() {
        System.out.println("getLabel50");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel50();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel50 method, of class lib1.Staff.
     */
    public void testSetLabel50() {
        System.out.println("setLabel50");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel50(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel51 method, of class lib1.Staff.
     */
    public void testGetLabel51() {
        System.out.println("getLabel51");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel51();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel51 method, of class lib1.Staff.
     */
    public void testSetLabel51() {
        System.out.println("setLabel51");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel51(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel53 method, of class lib1.Staff.
     */
    public void testGetLabel53() {
        System.out.println("getLabel53");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel53();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel53 method, of class lib1.Staff.
     */
    public void testSetLabel53() {
        System.out.println("setLabel53");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel53(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel54 method, of class lib1.Staff.
     */
    public void testGetLabel54() {
        System.out.println("getLabel54");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel54();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel54 method, of class lib1.Staff.
     */
    public void testSetLabel54() {
        System.out.println("setLabel54");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel54(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_duedays method, of class lib1.Staff.
     */
    public void testGet_duedays() {
        System.out.println("get_duedays");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.get_duedays();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_duedays method, of class lib1.Staff.
     */
    public void testSet_duedays() {
        System.out.println("set_duedays");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.set_duedays(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_noofrenews method, of class lib1.Staff.
     */
    public void testGet_noofrenews() {
        System.out.println("get_noofrenews");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.get_noofrenews();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_noofrenews method, of class lib1.Staff.
     */
    public void testSet_noofrenews() {
        System.out.println("set_noofrenews");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.set_noofrenews(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_email2 method, of class lib1.Staff.
     */
    public void testGet_email2() {
        System.out.println("get_email2");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.get_email2();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_email2 method, of class lib1.Staff.
     */
    public void testSet_email2() {
        System.out.println("set_email2");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.set_email2(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_currentpass method, of class lib1.Staff.
     */
    public void testGet_currentpass() {
        System.out.println("get_currentpass");
        
        Staff instance = new Staff();
        
        PasswordField expResult = null;
        PasswordField result = instance.get_currentpass();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_currentpass method, of class lib1.Staff.
     */
    public void testSet_currentpass() {
        System.out.println("set_currentpass");
        
        PasswordField pf = null;
        Staff instance = new Staff();
        
        instance.set_currentpass(pf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_newpass method, of class lib1.Staff.
     */
    public void testGet_newpass() {
        System.out.println("get_newpass");
        
        Staff instance = new Staff();
        
        PasswordField expResult = null;
        PasswordField result = instance.get_newpass();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_newpass method, of class lib1.Staff.
     */
    public void testSet_newpass() {
        System.out.println("set_newpass");
        
        PasswordField pf = null;
        Staff instance = new Staff();
        
        instance.set_newpass(pf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_newpass1 method, of class lib1.Staff.
     */
    public void testGet_newpass1() {
        System.out.println("get_newpass1");
        
        Staff instance = new Staff();
        
        PasswordField expResult = null;
        PasswordField result = instance.get_newpass1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_newpass1 method, of class lib1.Staff.
     */
    public void testSet_newpass1() {
        System.out.println("set_newpass1");
        
        PasswordField pf = null;
        Staff instance = new Staff();
        
        instance.set_newpass1(pf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton36 method, of class lib1.Staff.
     */
    public void testGetButton36() {
        System.out.println("getButton36");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton36();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton36 method, of class lib1.Staff.
     */
    public void testSetButton36() {
        System.out.println("setButton36");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton36(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton37 method, of class lib1.Staff.
     */
    public void testGetButton37() {
        System.out.println("getButton37");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton37();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton37 method, of class lib1.Staff.
     */
    public void testSetButton37() {
        System.out.println("setButton37");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton37(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton38 method, of class lib1.Staff.
     */
    public void testGetButton38() {
        System.out.println("getButton38");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton38();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton38 method, of class lib1.Staff.
     */
    public void testSetButton38() {
        System.out.println("setButton38");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton38(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_item method, of class lib1.Staff.
     */
    public void testGet_item() {
        System.out.println("get_item");
        
        Staff instance = new Staff();
        
        DropDown expResult = null;
        DropDown result = instance.get_item();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_item method, of class lib1.Staff.
     */
    public void testSet_item() {
        System.out.println("set_item");
        
        DropDown dd = null;
        Staff instance = new Staff();
        
        instance.set_item(dd);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_itemDefaultOptions method, of class lib1.Staff.
     */
    public void testGet_itemDefaultOptions() {
        System.out.println("get_itemDefaultOptions");
        
        Staff instance = new Staff();
        
        SingleSelectOptionsList expResult = null;
        SingleSelectOptionsList result = instance.get_itemDefaultOptions();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_itemDefaultOptions method, of class lib1.Staff.
     */
    public void testSet_itemDefaultOptions() {
        System.out.println("set_itemDefaultOptions");
        
        SingleSelectOptionsList ssol = null;
        Staff instance = new Staff();
        
        instance.set_itemDefaultOptions(ssol);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_issuedate method, of class lib1.Staff.
     */
    public void testGet_issuedate() {
        System.out.println("get_issuedate");
        
        Staff instance = new Staff();
        
        Calendar expResult = null;
        Calendar result = instance.get_issuedate();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_issuedate method, of class lib1.Staff.
     */
    public void testSet_issuedate() {
        System.out.println("set_issuedate");
        
        Calendar c = null;
        Staff instance = new Staff();
        
        instance.set_issuedate(c);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_duedate method, of class lib1.Staff.
     */
    public void testGet_duedate() {
        System.out.println("get_duedate");
        
        Staff instance = new Staff();
        
        Calendar expResult = null;
        Calendar result = instance.get_duedate();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_duedate method, of class lib1.Staff.
     */
    public void testSet_duedate() {
        System.out.println("set_duedate");
        
        Calendar c = null;
        Staff instance = new Staff();
        
        instance.set_duedate(c);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel52 method, of class lib1.Staff.
     */
    public void testGetLabel52() {
        System.out.println("getLabel52");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel52();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel52 method, of class lib1.Staff.
     */
    public void testSetLabel52() {
        System.out.println("setLabel52");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel52(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_totalfine method, of class lib1.Staff.
     */
    public void testGet_totalfine() {
        System.out.println("get_totalfine");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.get_totalfine();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_totalfine method, of class lib1.Staff.
     */
    public void testSet_totalfine() {
        System.out.println("set_totalfine");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.set_totalfine(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton39 method, of class lib1.Staff.
     */
    public void testGetButton39() {
        System.out.println("getButton39");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton39();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton39 method, of class lib1.Staff.
     */
    public void testSetButton39() {
        System.out.println("setButton39");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton39(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton40 method, of class lib1.Staff.
     */
    public void testGetButton40() {
        System.out.println("getButton40");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton40();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton40 method, of class lib1.Staff.
     */
    public void testSetButton40() {
        System.out.println("setButton40");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton40(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDepartments method, of class lib1.Staff.
     */
    public void testGetDepartments() {
        System.out.println("getDepartments");
        
        Staff instance = new Staff();
        
        Tab expResult = null;
        Tab result = instance.getDepartments();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDepartments method, of class lib1.Staff.
     */
    public void testSetDepartments() {
        System.out.println("setDepartments");
        
        Tab t = null;
        Staff instance = new Staff();
        
        instance.setDepartments(t);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLayoutPanel8 method, of class lib1.Staff.
     */
    public void testGetLayoutPanel8() {
        System.out.println("getLayoutPanel8");
        
        Staff instance = new Staff();
        
        PanelLayout expResult = null;
        PanelLayout result = instance.getLayoutPanel8();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLayoutPanel8 method, of class lib1.Staff.
     */
    public void testSetLayoutPanel8() {
        System.out.println("setLayoutPanel8");
        
        PanelLayout pl = null;
        Staff instance = new Staff();
        
        instance.setLayoutPanel8(pl);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel45 method, of class lib1.Staff.
     */
    public void testGetLabel45() {
        System.out.println("getLabel45");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel45();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel45 method, of class lib1.Staff.
     */
    public void testSetLabel45() {
        System.out.println("setLabel45");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel45(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField25 method, of class lib1.Staff.
     */
    public void testGetTextField25() {
        System.out.println("getTextField25");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField25();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField25 method, of class lib1.Staff.
     */
    public void testSetTextField25() {
        System.out.println("setTextField25");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField25(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField26 method, of class lib1.Staff.
     */
    public void testGetTextField26() {
        System.out.println("getTextField26");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField26();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField26 method, of class lib1.Staff.
     */
    public void testSetTextField26() {
        System.out.println("setTextField26");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField26(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField27 method, of class lib1.Staff.
     */
    public void testGetTextField27() {
        System.out.println("getTextField27");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField27();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField27 method, of class lib1.Staff.
     */
    public void testSetTextField27() {
        System.out.println("setTextField27");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField27(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel48 method, of class lib1.Staff.
     */
    public void testGetLabel48() {
        System.out.println("getLabel48");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel48();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel48 method, of class lib1.Staff.
     */
    public void testSetLabel48() {
        System.out.println("setLabel48");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel48(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel55 method, of class lib1.Staff.
     */
    public void testGetLabel55() {
        System.out.println("getLabel55");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel55();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel55 method, of class lib1.Staff.
     */
    public void testSetLabel55() {
        System.out.println("setLabel55");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel55(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListbox4 method, of class lib1.Staff.
     */
    public void testGetListbox4() {
        System.out.println("getListbox4");
        
        Staff instance = new Staff();
        
        Listbox expResult = null;
        Listbox result = instance.getListbox4();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListbox4 method, of class lib1.Staff.
     */
    public void testSetListbox4() {
        System.out.println("setListbox4");
        
        Listbox l = null;
        Staff instance = new Staff();
        
        instance.setListbox4(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListbox4DefaultOptions method, of class lib1.Staff.
     */
    public void testGetListbox4DefaultOptions() {
        System.out.println("getListbox4DefaultOptions");
        
        Staff instance = new Staff();
        
        DefaultOptionsList expResult = null;
        DefaultOptionsList result = instance.getListbox4DefaultOptions();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListbox4DefaultOptions method, of class lib1.Staff.
     */
    public void testSetListbox4DefaultOptions() {
        System.out.println("setListbox4DefaultOptions");
        
        DefaultOptionsList dol = null;
        Staff instance = new Staff();
        
        instance.setListbox4DefaultOptions(dol);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton41 method, of class lib1.Staff.
     */
    public void testGetButton41() {
        System.out.println("getButton41");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton41();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton41 method, of class lib1.Staff.
     */
    public void testSetButton41() {
        System.out.println("setButton41");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton41(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton42 method, of class lib1.Staff.
     */
    public void testGetButton42() {
        System.out.println("getButton42");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton42();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton42 method, of class lib1.Staff.
     */
    public void testSetButton42() {
        System.out.println("setButton42");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton42(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton43 method, of class lib1.Staff.
     */
    public void testGetButton43() {
        System.out.println("getButton43");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton43();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton43 method, of class lib1.Staff.
     */
    public void testSetButton43() {
        System.out.println("setButton43");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton43(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton44 method, of class lib1.Staff.
     */
    public void testGetButton44() {
        System.out.println("getButton44");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton44();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton44 method, of class lib1.Staff.
     */
    public void testSetButton44() {
        System.out.println("setButton44");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton44(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPayment method, of class lib1.Staff.
     */
    public void testGetPayment() {
        System.out.println("getPayment");
        
        Staff instance = new Staff();
        
        Tab expResult = null;
        Tab result = instance.getPayment();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPayment method, of class lib1.Staff.
     */
    public void testSetPayment() {
        System.out.println("setPayment");
        
        Tab t = null;
        Staff instance = new Staff();
        
        instance.setPayment(t);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLayoutPanel9 method, of class lib1.Staff.
     */
    public void testGetLayoutPanel9() {
        System.out.println("getLayoutPanel9");
        
        Staff instance = new Staff();
        
        PanelLayout expResult = null;
        PanelLayout result = instance.getLayoutPanel9();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLayoutPanel9 method, of class lib1.Staff.
     */
    public void testSetLayoutPanel9() {
        System.out.println("setLayoutPanel9");
        
        PanelLayout pl = null;
        Staff instance = new Staff();
        
        instance.setLayoutPanel9(pl);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel57 method, of class lib1.Staff.
     */
    public void testGetLabel57() {
        System.out.println("getLabel57");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel57();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel57 method, of class lib1.Staff.
     */
    public void testSetLabel57() {
        System.out.println("setLabel57");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel57(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel58 method, of class lib1.Staff.
     */
    public void testGetLabel58() {
        System.out.println("getLabel58");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel58();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel58 method, of class lib1.Staff.
     */
    public void testSetLabel58() {
        System.out.println("setLabel58");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel58(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel59 method, of class lib1.Staff.
     */
    public void testGetLabel59() {
        System.out.println("getLabel59");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel59();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel59 method, of class lib1.Staff.
     */
    public void testSetLabel59() {
        System.out.println("setLabel59");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel59(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel60 method, of class lib1.Staff.
     */
    public void testGetLabel60() {
        System.out.println("getLabel60");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel60();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel60 method, of class lib1.Staff.
     */
    public void testSetLabel60() {
        System.out.println("setLabel60");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel60(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel61 method, of class lib1.Staff.
     */
    public void testGetLabel61() {
        System.out.println("getLabel61");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel61();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel61 method, of class lib1.Staff.
     */
    public void testSetLabel61() {
        System.out.println("setLabel61");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel61(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton45 method, of class lib1.Staff.
     */
    public void testGetButton45() {
        System.out.println("getButton45");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton45();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton45 method, of class lib1.Staff.
     */
    public void testSetButton45() {
        System.out.println("setButton45");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton45(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton46 method, of class lib1.Staff.
     */
    public void testGetButton46() {
        System.out.println("getButton46");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton46();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton46 method, of class lib1.Staff.
     */
    public void testSetButton46() {
        System.out.println("setButton46");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton46(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton47 method, of class lib1.Staff.
     */
    public void testGetButton47() {
        System.out.println("getButton47");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton47();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton47 method, of class lib1.Staff.
     */
    public void testSetButton47() {
        System.out.println("setButton47");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton47(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton48 method, of class lib1.Staff.
     */
    public void testGetButton48() {
        System.out.println("getButton48");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton48();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton48 method, of class lib1.Staff.
     */
    public void testSetButton48() {
        System.out.println("setButton48");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton48(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField28 method, of class lib1.Staff.
     */
    public void testGetTextField28() {
        System.out.println("getTextField28");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField28();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField28 method, of class lib1.Staff.
     */
    public void testSetTextField28() {
        System.out.println("setTextField28");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField28(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField29 method, of class lib1.Staff.
     */
    public void testGetTextField29() {
        System.out.println("getTextField29");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField29();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField29 method, of class lib1.Staff.
     */
    public void testSetTextField29() {
        System.out.println("setTextField29");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField29(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField30 method, of class lib1.Staff.
     */
    public void testGetTextField30() {
        System.out.println("getTextField30");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField30();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField30 method, of class lib1.Staff.
     */
    public void testSetTextField30() {
        System.out.println("setTextField30");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField30(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField31 method, of class lib1.Staff.
     */
    public void testGetTextField31() {
        System.out.println("getTextField31");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField31();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField31 method, of class lib1.Staff.
     */
    public void testSetTextField31() {
        System.out.println("setTextField31");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField31(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextArea1 method, of class lib1.Staff.
     */
    public void testGetTextArea1() {
        System.out.println("getTextArea1");
        
        Staff instance = new Staff();
        
        TextArea expResult = null;
        TextArea result = instance.getTextArea1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextArea1 method, of class lib1.Staff.
     */
    public void testSetTextArea1() {
        System.out.println("setTextArea1");
        
        TextArea ta = null;
        Staff instance = new Staff();
        
        instance.setTextArea1(ta);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhones method, of class lib1.Staff.
     */
    public void testGetPhones() {
        System.out.println("getPhones");
        
        Staff instance = new Staff();
        
        Tab expResult = null;
        Tab result = instance.getPhones();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhones method, of class lib1.Staff.
     */
    public void testSetPhones() {
        System.out.println("setPhones");
        
        Tab t = null;
        Staff instance = new Staff();
        
        instance.setPhones(t);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLayoutPanel10 method, of class lib1.Staff.
     */
    public void testGetLayoutPanel10() {
        System.out.println("getLayoutPanel10");
        
        Staff instance = new Staff();
        
        PanelLayout expResult = null;
        PanelLayout result = instance.getLayoutPanel10();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLayoutPanel10 method, of class lib1.Staff.
     */
    public void testSetLayoutPanel10() {
        System.out.println("setLayoutPanel10");
        
        PanelLayout pl = null;
        Staff instance = new Staff();
        
        instance.setLayoutPanel10(pl);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel56 method, of class lib1.Staff.
     */
    public void testGetLabel56() {
        System.out.println("getLabel56");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel56();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel56 method, of class lib1.Staff.
     */
    public void testSetLabel56() {
        System.out.println("setLabel56");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel56(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel62 method, of class lib1.Staff.
     */
    public void testGetLabel62() {
        System.out.println("getLabel62");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel62();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel62 method, of class lib1.Staff.
     */
    public void testSetLabel62() {
        System.out.println("setLabel62");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel62(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel63 method, of class lib1.Staff.
     */
    public void testGetLabel63() {
        System.out.println("getLabel63");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel63();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel63 method, of class lib1.Staff.
     */
    public void testSetLabel63() {
        System.out.println("setLabel63");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel63(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel64 method, of class lib1.Staff.
     */
    public void testGetLabel64() {
        System.out.println("getLabel64");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel64();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel64 method, of class lib1.Staff.
     */
    public void testSetLabel64() {
        System.out.println("setLabel64");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel64(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField32 method, of class lib1.Staff.
     */
    public void testGetTextField32() {
        System.out.println("getTextField32");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField32();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField32 method, of class lib1.Staff.
     */
    public void testSetTextField32() {
        System.out.println("setTextField32");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField32(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField33 method, of class lib1.Staff.
     */
    public void testGetTextField33() {
        System.out.println("getTextField33");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField33();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField33 method, of class lib1.Staff.
     */
    public void testSetTextField33() {
        System.out.println("setTextField33");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField33(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField34 method, of class lib1.Staff.
     */
    public void testGetTextField34() {
        System.out.println("getTextField34");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField34();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField34 method, of class lib1.Staff.
     */
    public void testSetTextField34() {
        System.out.println("setTextField34");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField34(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField35 method, of class lib1.Staff.
     */
    public void testGetTextField35() {
        System.out.println("getTextField35");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField35();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField35 method, of class lib1.Staff.
     */
    public void testSetTextField35() {
        System.out.println("setTextField35");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField35(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField36 method, of class lib1.Staff.
     */
    public void testGetTextField36() {
        System.out.println("getTextField36");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField36();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField36 method, of class lib1.Staff.
     */
    public void testSetTextField36() {
        System.out.println("setTextField36");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField36(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton49 method, of class lib1.Staff.
     */
    public void testGetButton49() {
        System.out.println("getButton49");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton49();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton49 method, of class lib1.Staff.
     */
    public void testSetButton49() {
        System.out.println("setButton49");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton49(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListbox5 method, of class lib1.Staff.
     */
    public void testGetListbox5() {
        System.out.println("getListbox5");
        
        Staff instance = new Staff();
        
        Listbox expResult = null;
        Listbox result = instance.getListbox5();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListbox5 method, of class lib1.Staff.
     */
    public void testSetListbox5() {
        System.out.println("setListbox5");
        
        Listbox l = null;
        Staff instance = new Staff();
        
        instance.setListbox5(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListbox5DefaultOptions method, of class lib1.Staff.
     */
    public void testGetListbox5DefaultOptions() {
        System.out.println("getListbox5DefaultOptions");
        
        Staff instance = new Staff();
        
        DefaultOptionsList expResult = null;
        DefaultOptionsList result = instance.getListbox5DefaultOptions();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListbox5DefaultOptions method, of class lib1.Staff.
     */
    public void testSetListbox5DefaultOptions() {
        System.out.println("setListbox5DefaultOptions");
        
        DefaultOptionsList dol = null;
        Staff instance = new Staff();
        
        instance.setListbox5DefaultOptions(dol);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLoans method, of class lib1.Staff.
     */
    public void testGetLoans() {
        System.out.println("getLoans");
        
        Staff instance = new Staff();
        
        Tab expResult = null;
        Tab result = instance.getLoans();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLoans method, of class lib1.Staff.
     */
    public void testSetLoans() {
        System.out.println("setLoans");
        
        Tab t = null;
        Staff instance = new Staff();
        
        instance.setLoans(t);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLayoutPanel11 method, of class lib1.Staff.
     */
    public void testGetLayoutPanel11() {
        System.out.println("getLayoutPanel11");
        
        Staff instance = new Staff();
        
        PanelLayout expResult = null;
        PanelLayout result = instance.getLayoutPanel11();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLayoutPanel11 method, of class lib1.Staff.
     */
    public void testSetLayoutPanel11() {
        System.out.println("setLayoutPanel11");
        
        PanelLayout pl = null;
        Staff instance = new Staff();
        
        instance.setLayoutPanel11(pl);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel65 method, of class lib1.Staff.
     */
    public void testGetLabel65() {
        System.out.println("getLabel65");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel65();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel65 method, of class lib1.Staff.
     */
    public void testSetLabel65() {
        System.out.println("setLabel65");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel65(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel66 method, of class lib1.Staff.
     */
    public void testGetLabel66() {
        System.out.println("getLabel66");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel66();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel66 method, of class lib1.Staff.
     */
    public void testSetLabel66() {
        System.out.println("setLabel66");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel66(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel67 method, of class lib1.Staff.
     */
    public void testGetLabel67() {
        System.out.println("getLabel67");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel67();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel67 method, of class lib1.Staff.
     */
    public void testSetLabel67() {
        System.out.println("setLabel67");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel67(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel68 method, of class lib1.Staff.
     */
    public void testGetLabel68() {
        System.out.println("getLabel68");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel68();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel68 method, of class lib1.Staff.
     */
    public void testSetLabel68() {
        System.out.println("setLabel68");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel68(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel69 method, of class lib1.Staff.
     */
    public void testGetLabel69() {
        System.out.println("getLabel69");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel69();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel69 method, of class lib1.Staff.
     */
    public void testSetLabel69() {
        System.out.println("setLabel69");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel69(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel70 method, of class lib1.Staff.
     */
    public void testGetLabel70() {
        System.out.println("getLabel70");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel70();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel70 method, of class lib1.Staff.
     */
    public void testSetLabel70() {
        System.out.println("setLabel70");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel70(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField37 method, of class lib1.Staff.
     */
    public void testGetTextField37() {
        System.out.println("getTextField37");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField37();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField37 method, of class lib1.Staff.
     */
    public void testSetTextField37() {
        System.out.println("setTextField37");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField37(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField38 method, of class lib1.Staff.
     */
    public void testGetTextField38() {
        System.out.println("getTextField38");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField38();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField38 method, of class lib1.Staff.
     */
    public void testSetTextField38() {
        System.out.println("setTextField38");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField38(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField39 method, of class lib1.Staff.
     */
    public void testGetTextField39() {
        System.out.println("getTextField39");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField39();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField39 method, of class lib1.Staff.
     */
    public void testSetTextField39() {
        System.out.println("setTextField39");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField39(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField40 method, of class lib1.Staff.
     */
    public void testGetTextField40() {
        System.out.println("getTextField40");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField40();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField40 method, of class lib1.Staff.
     */
    public void testSetTextField40() {
        System.out.println("setTextField40");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField40(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCalendar3 method, of class lib1.Staff.
     */
    public void testGetCalendar3() {
        System.out.println("getCalendar3");
        
        Staff instance = new Staff();
        
        Calendar expResult = null;
        Calendar result = instance.getCalendar3();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCalendar3 method, of class lib1.Staff.
     */
    public void testSetCalendar3() {
        System.out.println("setCalendar3");
        
        Calendar c = null;
        Staff instance = new Staff();
        
        instance.setCalendar3(c);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCalendar4 method, of class lib1.Staff.
     */
    public void testGetCalendar4() {
        System.out.println("getCalendar4");
        
        Staff instance = new Staff();
        
        Calendar expResult = null;
        Calendar result = instance.getCalendar4();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCalendar4 method, of class lib1.Staff.
     */
    public void testSetCalendar4() {
        System.out.println("setCalendar4");
        
        Calendar c = null;
        Staff instance = new Staff();
        
        instance.setCalendar4(c);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCalendar5 method, of class lib1.Staff.
     */
    public void testGetCalendar5() {
        System.out.println("getCalendar5");
        
        Staff instance = new Staff();
        
        Calendar expResult = null;
        Calendar result = instance.getCalendar5();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCalendar5 method, of class lib1.Staff.
     */
    public void testSetCalendar5() {
        System.out.println("setCalendar5");
        
        Calendar c = null;
        Staff instance = new Staff();
        
        instance.setCalendar5(c);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDropDown10 method, of class lib1.Staff.
     */
    public void testGetDropDown10() {
        System.out.println("getDropDown10");
        
        Staff instance = new Staff();
        
        DropDown expResult = null;
        DropDown result = instance.getDropDown10();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDropDown10 method, of class lib1.Staff.
     */
    public void testSetDropDown10() {
        System.out.println("setDropDown10");
        
        DropDown dd = null;
        Staff instance = new Staff();
        
        instance.setDropDown10(dd);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDropDown10DefaultOptions method, of class lib1.Staff.
     */
    public void testGetDropDown10DefaultOptions() {
        System.out.println("getDropDown10DefaultOptions");
        
        Staff instance = new Staff();
        
        SingleSelectOptionsList expResult = null;
        SingleSelectOptionsList result = instance.getDropDown10DefaultOptions();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDropDown10DefaultOptions method, of class lib1.Staff.
     */
    public void testSetDropDown10DefaultOptions() {
        System.out.println("setDropDown10DefaultOptions");
        
        SingleSelectOptionsList ssol = null;
        Staff instance = new Staff();
        
        instance.setDropDown10DefaultOptions(ssol);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListbox6 method, of class lib1.Staff.
     */
    public void testGetListbox6() {
        System.out.println("getListbox6");
        
        Staff instance = new Staff();
        
        Listbox expResult = null;
        Listbox result = instance.getListbox6();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListbox6 method, of class lib1.Staff.
     */
    public void testSetListbox6() {
        System.out.println("setListbox6");
        
        Listbox l = null;
        Staff instance = new Staff();
        
        instance.setListbox6(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListbox6DefaultOptions method, of class lib1.Staff.
     */
    public void testGetListbox6DefaultOptions() {
        System.out.println("getListbox6DefaultOptions");
        
        Staff instance = new Staff();
        
        DefaultOptionsList expResult = null;
        DefaultOptionsList result = instance.getListbox6DefaultOptions();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListbox6DefaultOptions method, of class lib1.Staff.
     */
    public void testSetListbox6DefaultOptions() {
        System.out.println("setListbox6DefaultOptions");
        
        DefaultOptionsList dol = null;
        Staff instance = new Staff();
        
        instance.setListbox6DefaultOptions(dol);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton50 method, of class lib1.Staff.
     */
    public void testGetButton50() {
        System.out.println("getButton50");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton50();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton50 method, of class lib1.Staff.
     */
    public void testSetButton50() {
        System.out.println("setButton50");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton50(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserGroups method, of class lib1.Staff.
     */
    public void testGetUserGroups() {
        System.out.println("getUserGroups");
        
        Staff instance = new Staff();
        
        Tab expResult = null;
        Tab result = instance.getUserGroups();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserGroups method, of class lib1.Staff.
     */
    public void testSetUserGroups() {
        System.out.println("setUserGroups");
        
        Tab t = null;
        Staff instance = new Staff();
        
        instance.setUserGroups(t);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLayoutPanel12 method, of class lib1.Staff.
     */
    public void testGetLayoutPanel12() {
        System.out.println("getLayoutPanel12");
        
        Staff instance = new Staff();
        
        PanelLayout expResult = null;
        PanelLayout result = instance.getLayoutPanel12();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLayoutPanel12 method, of class lib1.Staff.
     */
    public void testSetLayoutPanel12() {
        System.out.println("setLayoutPanel12");
        
        PanelLayout pl = null;
        Staff instance = new Staff();
        
        instance.setLayoutPanel12(pl);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel71 method, of class lib1.Staff.
     */
    public void testGetLabel71() {
        System.out.println("getLabel71");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel71();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel71 method, of class lib1.Staff.
     */
    public void testSetLabel71() {
        System.out.println("setLabel71");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel71(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField41 method, of class lib1.Staff.
     */
    public void testGetTextField41() {
        System.out.println("getTextField41");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField41();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField41 method, of class lib1.Staff.
     */
    public void testSetTextField41() {
        System.out.println("setTextField41");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField41(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel73 method, of class lib1.Staff.
     */
    public void testGetLabel73() {
        System.out.println("getLabel73");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel73();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel73 method, of class lib1.Staff.
     */
    public void testSetLabel73() {
        System.out.println("setLabel73");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel73(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel74 method, of class lib1.Staff.
     */
    public void testGetLabel74() {
        System.out.println("getLabel74");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel74();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel74 method, of class lib1.Staff.
     */
    public void testSetLabel74() {
        System.out.println("setLabel74");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel74(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel75 method, of class lib1.Staff.
     */
    public void testGetLabel75() {
        System.out.println("getLabel75");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel75();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel75 method, of class lib1.Staff.
     */
    public void testSetLabel75() {
        System.out.println("setLabel75");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel75(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField42 method, of class lib1.Staff.
     */
    public void testGetTextField42() {
        System.out.println("getTextField42");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField42();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField42 method, of class lib1.Staff.
     */
    public void testSetTextField42() {
        System.out.println("setTextField42");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField42(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField43 method, of class lib1.Staff.
     */
    public void testGetTextField43() {
        System.out.println("getTextField43");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField43();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField43 method, of class lib1.Staff.
     */
    public void testSetTextField43() {
        System.out.println("setTextField43");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField43(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField44 method, of class lib1.Staff.
     */
    public void testGetTextField44() {
        System.out.println("getTextField44");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField44();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField44 method, of class lib1.Staff.
     */
    public void testSetTextField44() {
        System.out.println("setTextField44");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField44(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField45 method, of class lib1.Staff.
     */
    public void testGetTextField45() {
        System.out.println("getTextField45");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField45();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField45 method, of class lib1.Staff.
     */
    public void testSetTextField45() {
        System.out.println("setTextField45");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField45(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel76 method, of class lib1.Staff.
     */
    public void testGetLabel76() {
        System.out.println("getLabel76");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel76();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel76 method, of class lib1.Staff.
     */
    public void testSetLabel76() {
        System.out.println("setLabel76");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel76(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListbox7 method, of class lib1.Staff.
     */
    public void testGetListbox7() {
        System.out.println("getListbox7");
        
        Staff instance = new Staff();
        
        Listbox expResult = null;
        Listbox result = instance.getListbox7();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListbox7 method, of class lib1.Staff.
     */
    public void testSetListbox7() {
        System.out.println("setListbox7");
        
        Listbox l = null;
        Staff instance = new Staff();
        
        instance.setListbox7(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListbox7DefaultOptions method, of class lib1.Staff.
     */
    public void testGetListbox7DefaultOptions() {
        System.out.println("getListbox7DefaultOptions");
        
        Staff instance = new Staff();
        
        DefaultOptionsList expResult = null;
        DefaultOptionsList result = instance.getListbox7DefaultOptions();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListbox7DefaultOptions method, of class lib1.Staff.
     */
    public void testSetListbox7DefaultOptions() {
        System.out.println("setListbox7DefaultOptions");
        
        DefaultOptionsList dol = null;
        Staff instance = new Staff();
        
        instance.setListbox7DefaultOptions(dol);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton51 method, of class lib1.Staff.
     */
    public void testGetButton51() {
        System.out.println("getButton51");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton51();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton51 method, of class lib1.Staff.
     */
    public void testSetButton51() {
        System.out.println("setButton51");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton51(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton52 method, of class lib1.Staff.
     */
    public void testGetButton52() {
        System.out.println("getButton52");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton52();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton52 method, of class lib1.Staff.
     */
    public void testSetButton52() {
        System.out.println("setButton52");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton52(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton53 method, of class lib1.Staff.
     */
    public void testGetButton53() {
        System.out.println("getButton53");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton53();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton53 method, of class lib1.Staff.
     */
    public void testSetButton53() {
        System.out.println("setButton53");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton53(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton54 method, of class lib1.Staff.
     */
    public void testGetButton54() {
        System.out.println("getButton54");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton54();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton54 method, of class lib1.Staff.
     */
    public void testSetButton54() {
        System.out.println("setButton54");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton54(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton55 method, of class lib1.Staff.
     */
    public void testGetButton55() {
        System.out.println("getButton55");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton55();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton55 method, of class lib1.Staff.
     */
    public void testSetButton55() {
        System.out.println("setButton55");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton55(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemGroups method, of class lib1.Staff.
     */
    public void testGetItemGroups() {
        System.out.println("getItemGroups");
        
        Staff instance = new Staff();
        
        Tab expResult = null;
        Tab result = instance.getItemGroups();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemGroups method, of class lib1.Staff.
     */
    public void testSetItemGroups() {
        System.out.println("setItemGroups");
        
        Tab t = null;
        Staff instance = new Staff();
        
        instance.setItemGroups(t);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLayoutPanel13 method, of class lib1.Staff.
     */
    public void testGetLayoutPanel13() {
        System.out.println("getLayoutPanel13");
        
        Staff instance = new Staff();
        
        PanelLayout expResult = null;
        PanelLayout result = instance.getLayoutPanel13();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLayoutPanel13 method, of class lib1.Staff.
     */
    public void testSetLayoutPanel13() {
        System.out.println("setLayoutPanel13");
        
        PanelLayout pl = null;
        Staff instance = new Staff();
        
        instance.setLayoutPanel13(pl);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel77 method, of class lib1.Staff.
     */
    public void testGetLabel77() {
        System.out.println("getLabel77");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel77();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel77 method, of class lib1.Staff.
     */
    public void testSetLabel77() {
        System.out.println("setLabel77");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel77(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel78 method, of class lib1.Staff.
     */
    public void testGetLabel78() {
        System.out.println("getLabel78");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel78();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel78 method, of class lib1.Staff.
     */
    public void testSetLabel78() {
        System.out.println("setLabel78");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel78(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel79 method, of class lib1.Staff.
     */
    public void testGetLabel79() {
        System.out.println("getLabel79");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel79();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel79 method, of class lib1.Staff.
     */
    public void testSetLabel79() {
        System.out.println("setLabel79");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel79(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel80 method, of class lib1.Staff.
     */
    public void testGetLabel80() {
        System.out.println("getLabel80");
        
        Staff instance = new Staff();
        
        Label expResult = null;
        Label result = instance.getLabel80();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabel80 method, of class lib1.Staff.
     */
    public void testSetLabel80() {
        System.out.println("setLabel80");
        
        Label l = null;
        Staff instance = new Staff();
        
        instance.setLabel80(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextField46 method, of class lib1.Staff.
     */
    public void testGetTextField46() {
        System.out.println("getTextField46");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.getTextField46();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextField46 method, of class lib1.Staff.
     */
    public void testSetTextField46() {
        System.out.println("setTextField46");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.setTextField46(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_groupName method, of class lib1.Staff.
     */
    public void testGet_groupName() {
        System.out.println("get_groupName");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.get_groupName();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_groupName method, of class lib1.Staff.
     */
    public void testSet_groupName() {
        System.out.println("set_groupName");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.set_groupName(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_description1 method, of class lib1.Staff.
     */
    public void testGet_description1() {
        System.out.println("get_description1");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.get_description1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_description1 method, of class lib1.Staff.
     */
    public void testSet_description1() {
        System.out.println("set_description1");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.set_description1(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_issueDays method, of class lib1.Staff.
     */
    public void testGet_issueDays() {
        System.out.println("get_issueDays");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.get_issueDays();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_issueDays method, of class lib1.Staff.
     */
    public void testSet_issueDays() {
        System.out.println("set_issueDays");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.set_issueDays(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_possibleRenews method, of class lib1.Staff.
     */
    public void testGet_possibleRenews() {
        System.out.println("get_possibleRenews");
        
        Staff instance = new Staff();
        
        TextField expResult = null;
        TextField result = instance.get_possibleRenews();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_possibleRenews method, of class lib1.Staff.
     */
    public void testSet_possibleRenews() {
        System.out.println("set_possibleRenews");
        
        TextField tf = null;
        Staff instance = new Staff();
        
        instance.set_possibleRenews(tf);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDropDown11 method, of class lib1.Staff.
     */
    public void testGetDropDown11() {
        System.out.println("getDropDown11");
        
        Staff instance = new Staff();
        
        DropDown expResult = null;
        DropDown result = instance.getDropDown11();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDropDown11 method, of class lib1.Staff.
     */
    public void testSetDropDown11() {
        System.out.println("setDropDown11");
        
        DropDown dd = null;
        Staff instance = new Staff();
        
        instance.setDropDown11(dd);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDropDown11DefaultOptions method, of class lib1.Staff.
     */
    public void testGetDropDown11DefaultOptions() {
        System.out.println("getDropDown11DefaultOptions");
        
        Staff instance = new Staff();
        
        SingleSelectOptionsList expResult = null;
        SingleSelectOptionsList result = instance.getDropDown11DefaultOptions();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDropDown11DefaultOptions method, of class lib1.Staff.
     */
    public void testSetDropDown11DefaultOptions() {
        System.out.println("setDropDown11DefaultOptions");
        
        SingleSelectOptionsList ssol = null;
        Staff instance = new Staff();
        
        instance.setDropDown11DefaultOptions(ssol);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListbox8 method, of class lib1.Staff.
     */
    public void testGetListbox8() {
        System.out.println("getListbox8");
        
        Staff instance = new Staff();
        
        Listbox expResult = null;
        Listbox result = instance.getListbox8();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListbox8 method, of class lib1.Staff.
     */
    public void testSetListbox8() {
        System.out.println("setListbox8");
        
        Listbox l = null;
        Staff instance = new Staff();
        
        instance.setListbox8(l);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListbox8DefaultOptions method, of class lib1.Staff.
     */
    public void testGetListbox8DefaultOptions() {
        System.out.println("getListbox8DefaultOptions");
        
        Staff instance = new Staff();
        
        DefaultOptionsList expResult = null;
        DefaultOptionsList result = instance.getListbox8DefaultOptions();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListbox8DefaultOptions method, of class lib1.Staff.
     */
    public void testSetListbox8DefaultOptions() {
        System.out.println("setListbox8DefaultOptions");
        
        DefaultOptionsList dol = null;
        Staff instance = new Staff();
        
        instance.setListbox8DefaultOptions(dol);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton1 method, of class lib1.Staff.
     */
    public void testGetButton1() {
        System.out.println("getButton1");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton1 method, of class lib1.Staff.
     */
    public void testSetButton1() {
        System.out.println("setButton1");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton1(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton2 method, of class lib1.Staff.
     */
    public void testGetButton2() {
        System.out.println("getButton2");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton2();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton2 method, of class lib1.Staff.
     */
    public void testSetButton2() {
        System.out.println("setButton2");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton2(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton4 method, of class lib1.Staff.
     */
    public void testGetButton4() {
        System.out.println("getButton4");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton4();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton4 method, of class lib1.Staff.
     */
    public void testSetButton4() {
        System.out.println("setButton4");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton4(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButton9 method, of class lib1.Staff.
     */
    public void testGetButton9() {
        System.out.println("getButton9");
        
        Staff instance = new Staff();
        
        Button expResult = null;
        Button result = instance.getButton9();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setButton9 method, of class lib1.Staff.
     */
    public void testSetButton9() {
        System.out.println("setButton9");
        
        Button b = null;
        Staff instance = new Staff();
        
        instance.setButton9(b);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIntegerConverter1 method, of class lib1.Staff.
     */
    public void testGetIntegerConverter1() {
        System.out.println("getIntegerConverter1");
        
        Staff instance = new Staff();
        
        IntegerConverter expResult = null;
        IntegerConverter result = instance.getIntegerConverter1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIntegerConverter1 method, of class lib1.Staff.
     */
    public void testSetIntegerConverter1() {
        System.out.println("setIntegerConverter1");
        
        IntegerConverter ic = null;
        Staff instance = new Staff();
        
        instance.setIntegerConverter1(ic);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIntegerConverter2 method, of class lib1.Staff.
     */
    public void testGetIntegerConverter2() {
        System.out.println("getIntegerConverter2");
        
        Staff instance = new Staff();
        
        IntegerConverter expResult = null;
        IntegerConverter result = instance.getIntegerConverter2();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIntegerConverter2 method, of class lib1.Staff.
     */
    public void testSetIntegerConverter2() {
        System.out.println("setIntegerConverter2");
        
        IntegerConverter ic = null;
        Staff instance = new Staff();
        
        instance.setIntegerConverter2(ic);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init method, of class lib1.Staff.
     */
    public void testInit() {
        System.out.println("init");
        
        Staff instance = new Staff();
        
        instance.init();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of preprocess method, of class lib1.Staff.
     */
    public void testPreprocess() {
        System.out.println("preprocess");
        
        Staff instance = new Staff();
        
        instance.preprocess();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prerender method, of class lib1.Staff.
     */
    public void testPrerender() {
        System.out.println("prerender");
        
        Staff instance = new Staff();
        
        instance.prerender();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class lib1.Staff.
     */
    public void testDestroy() {
        System.out.println("destroy");
        
        Staff instance = new Staff();
        
        instance.destroy();
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRequestBean1 method, of class lib1.Staff.
     */
    public void testGetRequestBean1() {
        System.out.println("getRequestBean1");
        
        Staff instance = new Staff();
        
        RequestBean1 expResult = null;
        RequestBean1 result = instance.getRequestBean1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApplicationBean1 method, of class lib1.Staff.
     */
    public void testGetApplicationBean1() {
        System.out.println("getApplicationBean1");
        
        Staff instance = new Staff();
        
        ApplicationBean1 expResult = null;
        ApplicationBean1 result = instance.getApplicationBean1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSessionBean1 method, of class lib1.Staff.
     */
    public void testGetSessionBean1() {
        System.out.println("getSessionBean1");
        
        Staff instance = new Staff();
        
        SessionBean1 expResult = null;
        SessionBean1 result = instance.getSessionBean1();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addItem_action method, of class lib1.Staff.
     */
    public void testAddItem_action() {
        System.out.println("addItem_action");
        
        Staff instance = new Staff();
        
        String expResult = "";
        String result = instance.addItem_action();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of _department_processValueChange method, of class lib1.Staff.
     */
    public void test_department_processValueChange() {
        System.out.println("_department_processValueChange");
        
        ValueChangeEvent event = null;
        Staff instance = new Staff();
        
        instance._department_processValueChange(event);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of address_action method, of class lib1.Staff.
     */
    public void testAddress_action() {
        System.out.println("address_action");
        
        Staff instance = new Staff();
        
        String expResult = "";
        String result = instance.address_action();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of button10_action method, of class lib1.Staff.
     */
    public void testButton10_action() {
        System.out.println("button10_action");
        
        Staff instance = new Staff();
        
        String expResult = "";
        String result = instance.button10_action();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tab4_action method, of class lib1.Staff.
     */
    public void testTab4_action() {
        System.out.println("tab4_action");
        
        Staff instance = new Staff();
        
        String expResult = "";
        String result = instance.tab4_action();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of users_action method, of class lib1.Staff.
     */
    public void testUsers_action() {
        System.out.println("users_action");
        
        Staff instance = new Staff();
        
        String expResult = "";
        String result = instance.users_action();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of payment_action method, of class lib1.Staff.
     */
    public void testPayment_action() {
        System.out.println("payment_action");
        
        Staff instance = new Staff();
        
        String expResult = "";
        String result = instance.payment_action();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listbox5_processValueChange method, of class lib1.Staff.
     */
    public void testListbox5_processValueChange() {
        System.out.println("listbox5_processValueChange");
        
        ValueChangeEvent event = null;
        Staff instance = new Staff();
        
        instance.listbox5_processValueChange(event);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calendar3_validate method, of class lib1.Staff.
     */
    public void testCalendar3_validate() {
        System.out.println("calendar3_validate");
        
        FacesContext context = null;
        UIComponent component = null;
        Object value = null;
        Staff instance = new Staff();
        
        instance.calendar3_validate(context, component, value);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of itemGroups_action method, of class lib1.Staff.
     */
    public void testItemGroups_action() {
        System.out.println("itemGroups_action");
        
        Staff instance = new Staff();
        
        String expResult = "";
        String result = instance.itemGroups_action();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of button2_action method, of class lib1.Staff.
     */
    public void testButton2_action() {
        System.out.println("button2_action");
        
        Staff instance = new Staff();
        
        String expResult = "";
        String result = instance.button2_action();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of button9_action method, of class lib1.Staff.
     */
    public void testButton9_action() {
        System.out.println("button9_action");
        
        Staff instance = new Staff();
        
        String expResult = "";
        String result = instance.button9_action();
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
