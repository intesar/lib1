/*
 * Staff.java
 *
 * Created on December 1, 2006, 5:01 PM
 * Copyright home
 */
package lib1;

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
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class Staff extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Definition">
    private int __placeholder;
    
    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        dropDown5DefaultOptions.setOptions(new com.sun.rave.web.ui.model.Option[] {new com.sun.rave.web.ui.model.Option("male", "male"), new com.sun.rave.web.ui.model.Option("female", "female")});
    }
    
    private Page page1 = new Page();
    
    public Page getPage1() {
        return page1;
    }
    
    public void setPage1(Page p) {
        this.page1 = p;
    }
    
    private Html html1 = new Html();
    
    public Html getHtml1() {
        return html1;
    }
    
    public void setHtml1(Html h) {
        this.html1 = h;
    }
    
    private Head head1 = new Head();
    
    public Head getHead1() {
        return head1;
    }
    
    public void setHead1(Head h) {
        this.head1 = h;
    }
    
    private Link link1 = new Link();
    
    public Link getLink1() {
        return link1;
    }
    
    public void setLink1(Link l) {
        this.link1 = l;
    }
    
    private Body body1 = new Body();
    
    public Body getBody1() {
        return body1;
    }
    
    public void setBody1(Body b) {
        this.body1 = b;
    }
    
    private Form form1 = new Form();
    
    public Form getForm1() {
        return form1;
    }
    
    public void setForm1(Form f) {
        this.form1 = f;
    }

    private TabSet tabSet1 = new TabSet();

    public TabSet getTabSet1() {
        return tabSet1;
    }

    public void setTabSet1(TabSet ts) {
        this.tabSet1 = ts;
    }

    private Tab addItem = new Tab();

    public Tab getAddItem() {
        return addItem;
    }

    public void setAddItem(Tab t) {
        this.addItem = t;
    }

    private PanelLayout layoutPanel1 = new PanelLayout();

    public PanelLayout getLayoutPanel1() {
        return layoutPanel1;
    }

    public void setLayoutPanel1(PanelLayout pl) {
        this.layoutPanel1 = pl;
    }

    private DropDown dropDown1 = new DropDown();

    public DropDown getDropDown1() {
        return dropDown1;
    }

    public void setDropDown1(DropDown dd) {
        this.dropDown1 = dd;
    }

    private SingleSelectOptionsList dropDown1DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDropDown1DefaultOptions() {
        return dropDown1DefaultOptions;
    }

    public void setDropDown1DefaultOptions(SingleSelectOptionsList ssol) {
        this.dropDown1DefaultOptions = ssol;
    }

    private TextField textField1 = new TextField();

    public TextField getTextField1() {
        return textField1;
    }

    public void setTextField1(TextField tf) {
        this.textField1 = tf;
    }

    private Button _search = new Button();

    public Button get_search() {
        return _search;
    }

    public void set_search(Button b) {
        this._search = b;
    }

    private Listbox listbox1 = new Listbox();

    public Listbox getListbox1() {
        return listbox1;
    }

    public void setListbox1(Listbox l) {
        this.listbox1 = l;
    }

    private DefaultOptionsList listbox1DefaultOptions = new DefaultOptionsList();

    public DefaultOptionsList getListbox1DefaultOptions() {
        return listbox1DefaultOptions;
    }

    public void setListbox1DefaultOptions(DefaultOptionsList dol) {
        this.listbox1DefaultOptions = dol;
    }

    private TextField textField2 = new TextField();

    public TextField getTextField2() {
        return textField2;
    }

    public void setTextField2(TextField tf) {
        this.textField2 = tf;
    }

    private TextField textField3 = new TextField();

    public TextField getTextField3() {
        return textField3;
    }

    public void setTextField3(TextField tf) {
        this.textField3 = tf;
    }

    private TextField textField4 = new TextField();

    public TextField getTextField4() {
        return textField4;
    }

    public void setTextField4(TextField tf) {
        this.textField4 = tf;
    }

    private TextField textField5 = new TextField();

    public TextField getTextField5() {
        return textField5;
    }

    public void setTextField5(TextField tf) {
        this.textField5 = tf;
    }

    private TextField textField6 = new TextField();

    public TextField getTextField6() {
        return textField6;
    }

    public void setTextField6(TextField tf) {
        this.textField6 = tf;
    }

    private TextField textField7 = new TextField();

    public TextField getTextField7() {
        return textField7;
    }

    public void setTextField7(TextField tf) {
        this.textField7 = tf;
    }

    private TextField textField9 = new TextField();

    public TextField getTextField9() {
        return textField9;
    }

    public void setTextField9(TextField tf) {
        this.textField9 = tf;
    }

    private TextField textField10 = new TextField();

    public TextField getTextField10() {
        return textField10;
    }

    public void setTextField10(TextField tf) {
        this.textField10 = tf;
    }

    private TextField textField11 = new TextField();

    public TextField getTextField11() {
        return textField11;
    }

    public void setTextField11(TextField tf) {
        this.textField11 = tf;
    }

    private TextField textField12 = new TextField();

    public TextField getTextField12() {
        return textField12;
    }

    public void setTextField12(TextField tf) {
        this.textField12 = tf;
    }

    private TextField textField8 = new TextField();

    public TextField getTextField8() {
        return textField8;
    }

    public void setTextField8(TextField tf) {
        this.textField8 = tf;
    }

    private DropDown dropDown2 = new DropDown();

    public DropDown getDropDown2() {
        return dropDown2;
    }

    public void setDropDown2(DropDown dd) {
        this.dropDown2 = dd;
    }

    private SingleSelectOptionsList dropDown2DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDropDown2DefaultOptions() {
        return dropDown2DefaultOptions;
    }

    public void setDropDown2DefaultOptions(SingleSelectOptionsList ssol) {
        this.dropDown2DefaultOptions = ssol;
    }

    private DropDown dropDown3 = new DropDown();

    public DropDown getDropDown3() {
        return dropDown3;
    }

    public void setDropDown3(DropDown dd) {
        this.dropDown3 = dd;
    }

    private SingleSelectOptionsList dropDown3DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDropDown3DefaultOptions() {
        return dropDown3DefaultOptions;
    }

    public void setDropDown3DefaultOptions(SingleSelectOptionsList ssol) {
        this.dropDown3DefaultOptions = ssol;
    }

    private Button _enable = new Button();

    public Button get_enable() {
        return _enable;
    }

    public void set_enable(Button b) {
        this._enable = b;
    }

    private Button button3 = new Button();

    public Button getButton3() {
        return button3;
    }

    public void setButton3(Button b) {
        this.button3 = b;
    }

    private Button _clearall = new Button();

    public Button get_clearall() {
        return _clearall;
    }

    public void set_clearall(Button b) {
        this._clearall = b;
    }

    private Button button5 = new Button();

    public Button getButton5() {
        return button5;
    }

    public void setButton5(Button b) {
        this.button5 = b;
    }

    private Button _disable = new Button();

    public Button get_disable() {
        return _disable;
    }

    public void set_disable(Button b) {
        this._disable = b;
    }

    private Button button7 = new Button();

    public Button getButton7() {
        return button7;
    }

    public void setButton7(Button b) {
        this.button7 = b;
    }

    private Label _title = new Label();

    public Label get_title() {
        return _title;
    }

    public void set_title(Label l) {
        this._title = l;
    }

    private Label _type = new Label();

    public Label get_type() {
        return _type;
    }

    public void set_type(Label l) {
        this._type = l;
    }

    private Label _group = new Label();

    public Label get_group() {
        return _group;
    }

    public void set_group(Label l) {
        this._group = l;
    }

    private Label _description = new Label();

    public Label get_description() {
        return _description;
    }

    public void set_description(Label l) {
        this._description = l;
    }

    private Label _isbn = new Label();

    public Label get_isbn() {
        return _isbn;
    }

    public void set_isbn(Label l) {
        this._isbn = l;
    }

    private Label _edition = new Label();

    public Label get_edition() {
        return _edition;
    }

    public void set_edition(Label l) {
        this._edition = l;
    }

    private Label _status = new Label();

    public Label get_status() {
        return _status;
    }

    public void set_status(Label l) {
        this._status = l;
    }

    private Label _availability = new Label();

    public Label get_availability() {
        return _availability;
    }

    public void set_availability(Label l) {
        this._availability = l;
    }

    private Label _authors = new Label();

    public Label get_authors() {
        return _authors;
    }

    public void set_authors(Label l) {
        this._authors = l;
    }

    private Label _location = new Label();

    public Label get_location() {
        return _location;
    }

    public void set_location(Label l) {
        this._location = l;
    }

    private Label _cost = new Label();

    public Label get_cost() {
        return _cost;
    }

    public void set_cost(Label l) {
        this._cost = l;
    }

    private Label _publisher = new Label();

    public Label get_publisher() {
        return _publisher;
    }

    public void set_publisher(Label l) {
        this._publisher = l;
    }

    private Label _yearofpublish = new Label();

    public Label get_yearofpublish() {
        return _yearofpublish;
    }

    public void set_yearofpublish(Label l) {
        this._yearofpublish = l;
    }

    private SingleSelectOptionsList singleSelectOptionsList1 = new SingleSelectOptionsList();

    public SingleSelectOptionsList getSingleSelectOptionsList1() {
        return singleSelectOptionsList1;
    }

    public void setSingleSelectOptionsList1(SingleSelectOptionsList ssol) {
        this.singleSelectOptionsList1 = ssol;
    }

    private SingleSelectOptionsList singleSelectOptionsList2 = new SingleSelectOptionsList();

    public SingleSelectOptionsList getSingleSelectOptionsList2() {
        return singleSelectOptionsList2;
    }

    public void setSingleSelectOptionsList2(SingleSelectOptionsList ssol) {
        this.singleSelectOptionsList2 = ssol;
    }

    private Tab address = new Tab();

    public Tab getAddress() {
        return address;
    }

    public void setAddress(Tab t) {
        this.address = t;
    }

    private PanelLayout layoutPanel3 = new PanelLayout();

    public PanelLayout getLayoutPanel3() {
        return layoutPanel3;
    }

    public void setLayoutPanel3(PanelLayout pl) {
        this.layoutPanel3 = pl;
    }

    private Label label18 = new Label();

    public Label getLabel18() {
        return label18;
    }

    public void setLabel18(Label l) {
        this.label18 = l;
    }

    private Label label19 = new Label();

    public Label getLabel19() {
        return label19;
    }

    public void setLabel19(Label l) {
        this.label19 = l;
    }

    private Label label20 = new Label();

    public Label getLabel20() {
        return label20;
    }

    public void setLabel20(Label l) {
        this.label20 = l;
    }

    private Label label21 = new Label();

    public Label getLabel21() {
        return label21;
    }

    public void setLabel21(Label l) {
        this.label21 = l;
    }

    private Label label22 = new Label();

    public Label getLabel22() {
        return label22;
    }

    public void setLabel22(Label l) {
        this.label22 = l;
    }

    private Label label23 = new Label();

    public Label getLabel23() {
        return label23;
    }

    public void setLabel23(Label l) {
        this.label23 = l;
    }

    private Label label24 = new Label();

    public Label getLabel24() {
        return label24;
    }

    public void setLabel24(Label l) {
        this.label24 = l;
    }

    private Label label25 = new Label();

    public Label getLabel25() {
        return label25;
    }

    public void setLabel25(Label l) {
        this.label25 = l;
    }

    private Label label26 = new Label();

    public Label getLabel26() {
        return label26;
    }

    public void setLabel26(Label l) {
        this.label26 = l;
    }

    private TextField _country = new TextField();

    public TextField get_country() {
        return _country;
    }

    public void set_country(TextField tf) {
        this._country = tf;
    }

    private TextField _userName1 = new TextField();

    public TextField get_userName1() {
        return _userName1;
    }

    public void set_userName1(TextField tf) {
        this._userName1 = tf;
    }

    private TextField _city = new TextField();

    public TextField get_city() {
        return _city;
    }

    public void set_city(TextField tf) {
        this._city = tf;
    }

    private TextField _street = new TextField();

    public TextField get_street() {
        return _street;
    }

    public void set_street(TextField tf) {
        this._street = tf;
    }

    private TextField _status1 = new TextField();

    public TextField get_status1() {
        return _status1;
    }

    public void set_status1(TextField tf) {
        this._status1 = tf;
    }

    private TextField _zipcode = new TextField();

    public TextField get_zipcode() {
        return _zipcode;
    }

    public void set_zipcode(TextField tf) {
        this._zipcode = tf;
    }

    private TextField _state = new TextField();

    public TextField get_state() {
        return _state;
    }

    public void set_state(TextField tf) {
        this._state = tf;
    }

    private TextField _type2 = new TextField();

    public TextField get_type2() {
        return _type2;
    }

    public void set_type2(TextField tf) {
        this._type2 = tf;
    }

    private Calendar _creationDate = new Calendar();

    public Calendar get_creationDate() {
        return _creationDate;
    }

    public void set_creationDate(Calendar c) {
        this._creationDate = c;
    }

    private Listbox listbox2 = new Listbox();

    public Listbox getListbox2() {
        return listbox2;
    }

    public void setListbox2(Listbox l) {
        this.listbox2 = l;
    }

    private DefaultOptionsList listbox2DefaultOptions = new DefaultOptionsList();

    public DefaultOptionsList getListbox2DefaultOptions() {
        return listbox2DefaultOptions;
    }

    public void setListbox2DefaultOptions(DefaultOptionsList dol) {
        this.listbox2DefaultOptions = dol;
    }

    private Button button6 = new Button();

    public Button getButton6() {
        return button6;
    }

    public void setButton6(Button b) {
        this.button6 = b;
    }

    private Button button8 = new Button();

    public Button getButton8() {
        return button8;
    }

    public void setButton8(Button b) {
        this.button8 = b;
    }

    private Calendar calendar1 = new Calendar();

    public Calendar getCalendar1() {
        return calendar1;
    }

    public void setCalendar1(Calendar c) {
        this.calendar1 = c;
    }

    private Tab users = new Tab();

    public Tab getUsers() {
        return users;
    }

    public void setUsers(Tab t) {
        this.users = t;
    }

    private PanelLayout layoutPanel6 = new PanelLayout();

    public PanelLayout getLayoutPanel6() {
        return layoutPanel6;
    }

    public void setLayoutPanel6(PanelLayout pl) {
        this.layoutPanel6 = pl;
    }

    private Label label27 = new Label();

    public Label getLabel27() {
        return label27;
    }

    public void setLabel27(Label l) {
        this.label27 = l;
    }

    private Label label28 = new Label();

    public Label getLabel28() {
        return label28;
    }

    public void setLabel28(Label l) {
        this.label28 = l;
    }

    private Label label29 = new Label();

    public Label getLabel29() {
        return label29;
    }

    public void setLabel29(Label l) {
        this.label29 = l;
    }

    private Label label30 = new Label();

    public Label getLabel30() {
        return label30;
    }

    public void setLabel30(Label l) {
        this.label30 = l;
    }

    private Label label31 = new Label();

    public Label getLabel31() {
        return label31;
    }

    public void setLabel31(Label l) {
        this.label31 = l;
    }

    private Label label32 = new Label();

    public Label getLabel32() {
        return label32;
    }

    public void setLabel32(Label l) {
        this.label32 = l;
    }

    private Label label33 = new Label();

    public Label getLabel33() {
        return label33;
    }

    public void setLabel33(Label l) {
        this.label33 = l;
    }

    private Label label34 = new Label();

    public Label getLabel34() {
        return label34;
    }

    public void setLabel34(Label l) {
        this.label34 = l;
    }

    private Label label36 = new Label();

    public Label getLabel36() {
        return label36;
    }

    public void setLabel36(Label l) {
        this.label36 = l;
    }

    private Label label37 = new Label();

    public Label getLabel37() {
        return label37;
    }

    public void setLabel37(Label l) {
        this.label37 = l;
    }

    private Label label38 = new Label();

    public Label getLabel38() {
        return label38;
    }

    public void setLabel38(Label l) {
        this.label38 = l;
    }

    private Label label39 = new Label();

    public Label getLabel39() {
        return label39;
    }

    public void setLabel39(Label l) {
        this.label39 = l;
    }

    private Label label40 = new Label();

    public Label getLabel40() {
        return label40;
    }

    public void setLabel40(Label l) {
        this.label40 = l;
    }

    private Label label41 = new Label();

    public Label getLabel41() {
        return label41;
    }

    public void setLabel41(Label l) {
        this.label41 = l;
    }

    private Label label42 = new Label();

    public Label getLabel42() {
        return label42;
    }

    public void setLabel42(Label l) {
        this.label42 = l;
    }

    private Label label43 = new Label();

    public Label getLabel43() {
        return label43;
    }

    public void setLabel43(Label l) {
        this.label43 = l;
    }

    private TextField textField14 = new TextField();

    public TextField getTextField14() {
        return textField14;
    }

    public void setTextField14(TextField tf) {
        this.textField14 = tf;
    }

    private TextField textField15 = new TextField();

    public TextField getTextField15() {
        return textField15;
    }

    public void setTextField15(TextField tf) {
        this.textField15 = tf;
    }

    private TextField textField16 = new TextField();

    public TextField getTextField16() {
        return textField16;
    }

    public void setTextField16(TextField tf) {
        this.textField16 = tf;
    }

    private DropDown dropDown4 = new DropDown();

    public DropDown getDropDown4() {
        return dropDown4;
    }

    public void setDropDown4(DropDown dd) {
        this.dropDown4 = dd;
    }

    private SingleSelectOptionsList dropDown4DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDropDown4DefaultOptions() {
        return dropDown4DefaultOptions;
    }

    public void setDropDown4DefaultOptions(SingleSelectOptionsList ssol) {
        this.dropDown4DefaultOptions = ssol;
    }

    private DropDown dropDown5 = new DropDown();

    public DropDown getDropDown5() {
        return dropDown5;
    }

    public void setDropDown5(DropDown dd) {
        this.dropDown5 = dd;
    }

    private SingleSelectOptionsList dropDown5DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDropDown5DefaultOptions() {
        return dropDown5DefaultOptions;
    }

    public void setDropDown5DefaultOptions(SingleSelectOptionsList ssol) {
        this.dropDown5DefaultOptions = ssol;
    }

    private DropDown dropDown7 = new DropDown();

    public DropDown getDropDown7() {
        return dropDown7;
    }

    public void setDropDown7(DropDown dd) {
        this.dropDown7 = dd;
    }

    private SingleSelectOptionsList dropDown7DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDropDown7DefaultOptions() {
        return dropDown7DefaultOptions;
    }

    public void setDropDown7DefaultOptions(SingleSelectOptionsList ssol) {
        this.dropDown7DefaultOptions = ssol;
    }

    private DropDown dropDown8 = new DropDown();

    public DropDown getDropDown8() {
        return dropDown8;
    }

    public void setDropDown8(DropDown dd) {
        this.dropDown8 = dd;
    }

    private SingleSelectOptionsList dropDown8DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDropDown8DefaultOptions() {
        return dropDown8DefaultOptions;
    }

    public void setDropDown8DefaultOptions(SingleSelectOptionsList ssol) {
        this.dropDown8DefaultOptions = ssol;
    }

    private DropDown dropDown9 = new DropDown();

    public DropDown getDropDown9() {
        return dropDown9;
    }

    public void setDropDown9(DropDown dd) {
        this.dropDown9 = dd;
    }

    private SingleSelectOptionsList dropDown9DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDropDown9DefaultOptions() {
        return dropDown9DefaultOptions;
    }

    public void setDropDown9DefaultOptions(SingleSelectOptionsList ssol) {
        this.dropDown9DefaultOptions = ssol;
    }

    private TextField textField17 = new TextField();

    public TextField getTextField17() {
        return textField17;
    }

    public void setTextField17(TextField tf) {
        this.textField17 = tf;
    }

    private TextField textField18 = new TextField();

    public TextField getTextField18() {
        return textField18;
    }

    public void setTextField18(TextField tf) {
        this.textField18 = tf;
    }

    private TextField textField19 = new TextField();

    public TextField getTextField19() {
        return textField19;
    }

    public void setTextField19(TextField tf) {
        this.textField19 = tf;
    }

    private TextField textField20 = new TextField();

    public TextField getTextField20() {
        return textField20;
    }

    public void setTextField20(TextField tf) {
        this.textField20 = tf;
    }

    private TextField textField21 = new TextField();

    public TextField getTextField21() {
        return textField21;
    }

    public void setTextField21(TextField tf) {
        this.textField21 = tf;
    }

    private TextField textField22 = new TextField();

    public TextField getTextField22() {
        return textField22;
    }

    public void setTextField22(TextField tf) {
        this.textField22 = tf;
    }

    private TextField textField23 = new TextField();

    public TextField getTextField23() {
        return textField23;
    }

    public void setTextField23(TextField tf) {
        this.textField23 = tf;
    }

    private Calendar calendar2 = new Calendar();

    public Calendar getCalendar2() {
        return calendar2;
    }

    public void setCalendar2(Calendar c) {
        this.calendar2 = c;
    }

    private DropDown dropDown6 = new DropDown();

    public DropDown getDropDown6() {
        return dropDown6;
    }

    public void setDropDown6(DropDown dd) {
        this.dropDown6 = dd;
    }

    private SingleSelectOptionsList dropDown6DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDropDown6DefaultOptions() {
        return dropDown6DefaultOptions;
    }

    public void setDropDown6DefaultOptions(SingleSelectOptionsList ssol) {
        this.dropDown6DefaultOptions = ssol;
    }

    private TextField textField24 = new TextField();

    public TextField getTextField24() {
        return textField24;
    }

    public void setTextField24(TextField tf) {
        this.textField24 = tf;
    }

    private Button button20 = new Button();

    public Button getButton20() {
        return button20;
    }

    public void setButton20(Button b) {
        this.button20 = b;
    }

    private Listbox listbox3 = new Listbox();

    public Listbox getListbox3() {
        return listbox3;
    }

    public void setListbox3(Listbox l) {
        this.listbox3 = l;
    }

    private DefaultOptionsList listbox3DefaultOptions = new DefaultOptionsList();

    public DefaultOptionsList getListbox3DefaultOptions() {
        return listbox3DefaultOptions;
    }

    public void setListbox3DefaultOptions(DefaultOptionsList dol) {
        this.listbox3DefaultOptions = dol;
    }

    private Button button29 = new Button();

    public Button getButton29() {
        return button29;
    }

    public void setButton29(Button b) {
        this.button29 = b;
    }

    private Button button30 = new Button();

    public Button getButton30() {
        return button30;
    }

    public void setButton30(Button b) {
        this.button30 = b;
    }

    private Button button31 = new Button();

    public Button getButton31() {
        return button31;
    }

    public void setButton31(Button b) {
        this.button31 = b;
    }

    private Button button32 = new Button();

    public Button getButton32() {
        return button32;
    }

    public void setButton32(Button b) {
        this.button32 = b;
    }

    private Button button33 = new Button();

    public Button getButton33() {
        return button33;
    }

    public void setButton33(Button b) {
        this.button33 = b;
    }

    private Button button34 = new Button();

    public Button getButton34() {
        return button34;
    }

    public void setButton34(Button b) {
        this.button34 = b;
    }

    private Button button35 = new Button();

    public Button getButton35() {
        return button35;
    }

    public void setButton35(Button b) {
        this.button35 = b;
    }

    private Tab myAccount = new Tab();

    public Tab getMyAccount() {
        return myAccount;
    }

    public void setMyAccount(Tab t) {
        this.myAccount = t;
    }

    private PanelLayout layoutPanel7 = new PanelLayout();

    public PanelLayout getLayoutPanel7() {
        return layoutPanel7;
    }

    public void setLayoutPanel7(PanelLayout pl) {
        this.layoutPanel7 = pl;
    }

    private Label label35 = new Label();

    public Label getLabel35() {
        return label35;
    }

    public void setLabel35(Label l) {
        this.label35 = l;
    }

    private Label label44 = new Label();

    public Label getLabel44() {
        return label44;
    }

    public void setLabel44(Label l) {
        this.label44 = l;
    }

    private Label label46 = new Label();

    public Label getLabel46() {
        return label46;
    }

    public void setLabel46(Label l) {
        this.label46 = l;
    }

    private Label label47 = new Label();

    public Label getLabel47() {
        return label47;
    }

    public void setLabel47(Label l) {
        this.label47 = l;
    }

    private Label label49 = new Label();

    public Label getLabel49() {
        return label49;
    }

    public void setLabel49(Label l) {
        this.label49 = l;
    }

    private Label label50 = new Label();

    public Label getLabel50() {
        return label50;
    }

    public void setLabel50(Label l) {
        this.label50 = l;
    }

    private Label label51 = new Label();

    public Label getLabel51() {
        return label51;
    }

    public void setLabel51(Label l) {
        this.label51 = l;
    }

    private Label label53 = new Label();

    public Label getLabel53() {
        return label53;
    }

    public void setLabel53(Label l) {
        this.label53 = l;
    }

    private Label label54 = new Label();

    public Label getLabel54() {
        return label54;
    }

    public void setLabel54(Label l) {
        this.label54 = l;
    }

    private TextField _duedays = new TextField();

    public TextField get_duedays() {
        return _duedays;
    }

    public void set_duedays(TextField tf) {
        this._duedays = tf;
    }

    private TextField _noofrenews = new TextField();

    public TextField get_noofrenews() {
        return _noofrenews;
    }

    public void set_noofrenews(TextField tf) {
        this._noofrenews = tf;
    }

    private TextField _email2 = new TextField();

    public TextField get_email2() {
        return _email2;
    }

    public void set_email2(TextField tf) {
        this._email2 = tf;
    }

    private PasswordField _currentpass = new PasswordField();

    public PasswordField get_currentpass() {
        return _currentpass;
    }

    public void set_currentpass(PasswordField pf) {
        this._currentpass = pf;
    }

    private PasswordField _newpass = new PasswordField();

    public PasswordField get_newpass() {
        return _newpass;
    }

    public void set_newpass(PasswordField pf) {
        this._newpass = pf;
    }

    private PasswordField _newpass1 = new PasswordField();

    public PasswordField get_newpass1() {
        return _newpass1;
    }

    public void set_newpass1(PasswordField pf) {
        this._newpass1 = pf;
    }

    private Button button36 = new Button();

    public Button getButton36() {
        return button36;
    }

    public void setButton36(Button b) {
        this.button36 = b;
    }

    private Button button37 = new Button();

    public Button getButton37() {
        return button37;
    }

    public void setButton37(Button b) {
        this.button37 = b;
    }

    private Button button38 = new Button();

    public Button getButton38() {
        return button38;
    }

    public void setButton38(Button b) {
        this.button38 = b;
    }

    private DropDown _item = new DropDown();

    public DropDown get_item() {
        return _item;
    }

    public void set_item(DropDown dd) {
        this._item = dd;
    }

    private SingleSelectOptionsList _itemDefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList get_itemDefaultOptions() {
        return _itemDefaultOptions;
    }

    public void set_itemDefaultOptions(SingleSelectOptionsList ssol) {
        this._itemDefaultOptions = ssol;
    }

    private Calendar _issuedate = new Calendar();

    public Calendar get_issuedate() {
        return _issuedate;
    }

    public void set_issuedate(Calendar c) {
        this._issuedate = c;
    }

    private Calendar _duedate = new Calendar();

    public Calendar get_duedate() {
        return _duedate;
    }

    public void set_duedate(Calendar c) {
        this._duedate = c;
    }

    private Label label52 = new Label();

    public Label getLabel52() {
        return label52;
    }

    public void setLabel52(Label l) {
        this.label52 = l;
    }

    private TextField _totalfine = new TextField();

    public TextField get_totalfine() {
        return _totalfine;
    }

    public void set_totalfine(TextField tf) {
        this._totalfine = tf;
    }

    private Button button39 = new Button();

    public Button getButton39() {
        return button39;
    }

    public void setButton39(Button b) {
        this.button39 = b;
    }

    private Button button40 = new Button();

    public Button getButton40() {
        return button40;
    }

    public void setButton40(Button b) {
        this.button40 = b;
    }

    private Tab departments = new Tab();

    public Tab getDepartments() {
        return departments;
    }

    public void setDepartments(Tab t) {
        this.departments = t;
    }

    private PanelLayout layoutPanel8 = new PanelLayout();

    public PanelLayout getLayoutPanel8() {
        return layoutPanel8;
    }

    public void setLayoutPanel8(PanelLayout pl) {
        this.layoutPanel8 = pl;
    }

    private Label label45 = new Label();

    public Label getLabel45() {
        return label45;
    }

    public void setLabel45(Label l) {
        this.label45 = l;
    }

    private TextField textField25 = new TextField();

    public TextField getTextField25() {
        return textField25;
    }

    public void setTextField25(TextField tf) {
        this.textField25 = tf;
    }

    private TextField textField26 = new TextField();

    public TextField getTextField26() {
        return textField26;
    }

    public void setTextField26(TextField tf) {
        this.textField26 = tf;
    }

    private TextField textField27 = new TextField();

    public TextField getTextField27() {
        return textField27;
    }

    public void setTextField27(TextField tf) {
        this.textField27 = tf;
    }

    private Label label48 = new Label();

    public Label getLabel48() {
        return label48;
    }

    public void setLabel48(Label l) {
        this.label48 = l;
    }

    private Label label55 = new Label();

    public Label getLabel55() {
        return label55;
    }

    public void setLabel55(Label l) {
        this.label55 = l;
    }

    private Listbox listbox4 = new Listbox();

    public Listbox getListbox4() {
        return listbox4;
    }

    public void setListbox4(Listbox l) {
        this.listbox4 = l;
    }

    private DefaultOptionsList listbox4DefaultOptions = new DefaultOptionsList();

    public DefaultOptionsList getListbox4DefaultOptions() {
        return listbox4DefaultOptions;
    }

    public void setListbox4DefaultOptions(DefaultOptionsList dol) {
        this.listbox4DefaultOptions = dol;
    }

    private Button button41 = new Button();

    public Button getButton41() {
        return button41;
    }

    public void setButton41(Button b) {
        this.button41 = b;
    }

    private Button button42 = new Button();

    public Button getButton42() {
        return button42;
    }

    public void setButton42(Button b) {
        this.button42 = b;
    }

    private Button button43 = new Button();

    public Button getButton43() {
        return button43;
    }

    public void setButton43(Button b) {
        this.button43 = b;
    }

    private Button button44 = new Button();

    public Button getButton44() {
        return button44;
    }

    public void setButton44(Button b) {
        this.button44 = b;
    }

    private Tab payment = new Tab();

    public Tab getPayment() {
        return payment;
    }

    public void setPayment(Tab t) {
        this.payment = t;
    }

    private PanelLayout layoutPanel9 = new PanelLayout();

    public PanelLayout getLayoutPanel9() {
        return layoutPanel9;
    }

    public void setLayoutPanel9(PanelLayout pl) {
        this.layoutPanel9 = pl;
    }

    private Label label57 = new Label();

    public Label getLabel57() {
        return label57;
    }

    public void setLabel57(Label l) {
        this.label57 = l;
    }

    private Label label58 = new Label();

    public Label getLabel58() {
        return label58;
    }

    public void setLabel58(Label l) {
        this.label58 = l;
    }

    private Label label59 = new Label();

    public Label getLabel59() {
        return label59;
    }

    public void setLabel59(Label l) {
        this.label59 = l;
    }

    private Label label60 = new Label();

    public Label getLabel60() {
        return label60;
    }

    public void setLabel60(Label l) {
        this.label60 = l;
    }

    private Label label61 = new Label();

    public Label getLabel61() {
        return label61;
    }

    public void setLabel61(Label l) {
        this.label61 = l;
    }

    private Button button45 = new Button();

    public Button getButton45() {
        return button45;
    }

    public void setButton45(Button b) {
        this.button45 = b;
    }

    private Button button46 = new Button();

    public Button getButton46() {
        return button46;
    }

    public void setButton46(Button b) {
        this.button46 = b;
    }

    private Button button47 = new Button();

    public Button getButton47() {
        return button47;
    }

    public void setButton47(Button b) {
        this.button47 = b;
    }

    private Button button48 = new Button();

    public Button getButton48() {
        return button48;
    }

    public void setButton48(Button b) {
        this.button48 = b;
    }

    private TextField textField28 = new TextField();

    public TextField getTextField28() {
        return textField28;
    }

    public void setTextField28(TextField tf) {
        this.textField28 = tf;
    }

    private TextField textField29 = new TextField();

    public TextField getTextField29() {
        return textField29;
    }

    public void setTextField29(TextField tf) {
        this.textField29 = tf;
    }

    private TextField textField30 = new TextField();

    public TextField getTextField30() {
        return textField30;
    }

    public void setTextField30(TextField tf) {
        this.textField30 = tf;
    }

    private TextField textField31 = new TextField();

    public TextField getTextField31() {
        return textField31;
    }

    public void setTextField31(TextField tf) {
        this.textField31 = tf;
    }

    private TextArea textArea1 = new TextArea();

    public TextArea getTextArea1() {
        return textArea1;
    }

    public void setTextArea1(TextArea ta) {
        this.textArea1 = ta;
    }

    private Tab phones = new Tab();

    public Tab getPhones() {
        return phones;
    }

    public void setPhones(Tab t) {
        this.phones = t;
    }

    private PanelLayout layoutPanel10 = new PanelLayout();

    public PanelLayout getLayoutPanel10() {
        return layoutPanel10;
    }

    public void setLayoutPanel10(PanelLayout pl) {
        this.layoutPanel10 = pl;
    }

    private Label label56 = new Label();

    public Label getLabel56() {
        return label56;
    }

    public void setLabel56(Label l) {
        this.label56 = l;
    }

    private Label label62 = new Label();

    public Label getLabel62() {
        return label62;
    }

    public void setLabel62(Label l) {
        this.label62 = l;
    }

    private Label label63 = new Label();

    public Label getLabel63() {
        return label63;
    }

    public void setLabel63(Label l) {
        this.label63 = l;
    }

    private Label label64 = new Label();

    public Label getLabel64() {
        return label64;
    }

    public void setLabel64(Label l) {
        this.label64 = l;
    }

    private TextField textField32 = new TextField();

    public TextField getTextField32() {
        return textField32;
    }

    public void setTextField32(TextField tf) {
        this.textField32 = tf;
    }

    private TextField textField33 = new TextField();

    public TextField getTextField33() {
        return textField33;
    }

    public void setTextField33(TextField tf) {
        this.textField33 = tf;
    }

    private TextField textField34 = new TextField();

    public TextField getTextField34() {
        return textField34;
    }

    public void setTextField34(TextField tf) {
        this.textField34 = tf;
    }

    private TextField textField35 = new TextField();

    public TextField getTextField35() {
        return textField35;
    }

    public void setTextField35(TextField tf) {
        this.textField35 = tf;
    }

    private TextField textField36 = new TextField();

    public TextField getTextField36() {
        return textField36;
    }

    public void setTextField36(TextField tf) {
        this.textField36 = tf;
    }

    private Button button49 = new Button();

    public Button getButton49() {
        return button49;
    }

    public void setButton49(Button b) {
        this.button49 = b;
    }

    private Listbox listbox5 = new Listbox();

    public Listbox getListbox5() {
        return listbox5;
    }

    public void setListbox5(Listbox l) {
        this.listbox5 = l;
    }

    private DefaultOptionsList listbox5DefaultOptions = new DefaultOptionsList();

    public DefaultOptionsList getListbox5DefaultOptions() {
        return listbox5DefaultOptions;
    }

    public void setListbox5DefaultOptions(DefaultOptionsList dol) {
        this.listbox5DefaultOptions = dol;
    }

    private Tab loans = new Tab();

    public Tab getLoans() {
        return loans;
    }

    public void setLoans(Tab t) {
        this.loans = t;
    }

    private PanelLayout layoutPanel11 = new PanelLayout();

    public PanelLayout getLayoutPanel11() {
        return layoutPanel11;
    }

    public void setLayoutPanel11(PanelLayout pl) {
        this.layoutPanel11 = pl;
    }

    private Label label65 = new Label();

    public Label getLabel65() {
        return label65;
    }

    public void setLabel65(Label l) {
        this.label65 = l;
    }

    private Label label66 = new Label();

    public Label getLabel66() {
        return label66;
    }

    public void setLabel66(Label l) {
        this.label66 = l;
    }

    private Label label67 = new Label();

    public Label getLabel67() {
        return label67;
    }

    public void setLabel67(Label l) {
        this.label67 = l;
    }

    private Label label68 = new Label();

    public Label getLabel68() {
        return label68;
    }

    public void setLabel68(Label l) {
        this.label68 = l;
    }

    private Label label69 = new Label();

    public Label getLabel69() {
        return label69;
    }

    public void setLabel69(Label l) {
        this.label69 = l;
    }

    private Label label70 = new Label();

    public Label getLabel70() {
        return label70;
    }

    public void setLabel70(Label l) {
        this.label70 = l;
    }

    private TextField textField37 = new TextField();

    public TextField getTextField37() {
        return textField37;
    }

    public void setTextField37(TextField tf) {
        this.textField37 = tf;
    }

    private TextField textField38 = new TextField();

    public TextField getTextField38() {
        return textField38;
    }

    public void setTextField38(TextField tf) {
        this.textField38 = tf;
    }

    private TextField textField39 = new TextField();

    public TextField getTextField39() {
        return textField39;
    }

    public void setTextField39(TextField tf) {
        this.textField39 = tf;
    }

    private TextField textField40 = new TextField();

    public TextField getTextField40() {
        return textField40;
    }

    public void setTextField40(TextField tf) {
        this.textField40 = tf;
    }

    private Calendar calendar3 = new Calendar();

    public Calendar getCalendar3() {
        return calendar3;
    }

    public void setCalendar3(Calendar c) {
        this.calendar3 = c;
    }

    private Calendar calendar4 = new Calendar();

    public Calendar getCalendar4() {
        return calendar4;
    }

    public void setCalendar4(Calendar c) {
        this.calendar4 = c;
    }

    private Calendar calendar5 = new Calendar();

    public Calendar getCalendar5() {
        return calendar5;
    }

    public void setCalendar5(Calendar c) {
        this.calendar5 = c;
    }

    private DropDown dropDown10 = new DropDown();

    public DropDown getDropDown10() {
        return dropDown10;
    }

    public void setDropDown10(DropDown dd) {
        this.dropDown10 = dd;
    }

    private SingleSelectOptionsList dropDown10DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDropDown10DefaultOptions() {
        return dropDown10DefaultOptions;
    }

    public void setDropDown10DefaultOptions(SingleSelectOptionsList ssol) {
        this.dropDown10DefaultOptions = ssol;
    }

    private Listbox listbox6 = new Listbox();

    public Listbox getListbox6() {
        return listbox6;
    }

    public void setListbox6(Listbox l) {
        this.listbox6 = l;
    }

    private DefaultOptionsList listbox6DefaultOptions = new DefaultOptionsList();

    public DefaultOptionsList getListbox6DefaultOptions() {
        return listbox6DefaultOptions;
    }

    public void setListbox6DefaultOptions(DefaultOptionsList dol) {
        this.listbox6DefaultOptions = dol;
    }

    private Button button50 = new Button();

    public Button getButton50() {
        return button50;
    }

    public void setButton50(Button b) {
        this.button50 = b;
    }

    private Tab userGroups = new Tab();

    public Tab getUserGroups() {
        return userGroups;
    }

    public void setUserGroups(Tab t) {
        this.userGroups = t;
    }

    private PanelLayout layoutPanel12 = new PanelLayout();

    public PanelLayout getLayoutPanel12() {
        return layoutPanel12;
    }

    public void setLayoutPanel12(PanelLayout pl) {
        this.layoutPanel12 = pl;
    }

    private Label label71 = new Label();

    public Label getLabel71() {
        return label71;
    }

    public void setLabel71(Label l) {
        this.label71 = l;
    }

    private TextField textField41 = new TextField();

    public TextField getTextField41() {
        return textField41;
    }

    public void setTextField41(TextField tf) {
        this.textField41 = tf;
    }

    private Label label73 = new Label();

    public Label getLabel73() {
        return label73;
    }

    public void setLabel73(Label l) {
        this.label73 = l;
    }

    private Label label74 = new Label();

    public Label getLabel74() {
        return label74;
    }

    public void setLabel74(Label l) {
        this.label74 = l;
    }

    private Label label75 = new Label();

    public Label getLabel75() {
        return label75;
    }

    public void setLabel75(Label l) {
        this.label75 = l;
    }

    private TextField textField42 = new TextField();

    public TextField getTextField42() {
        return textField42;
    }

    public void setTextField42(TextField tf) {
        this.textField42 = tf;
    }

    private TextField textField43 = new TextField();

    public TextField getTextField43() {
        return textField43;
    }

    public void setTextField43(TextField tf) {
        this.textField43 = tf;
    }

    private TextField textField44 = new TextField();

    public TextField getTextField44() {
        return textField44;
    }

    public void setTextField44(TextField tf) {
        this.textField44 = tf;
    }

    private TextField textField45 = new TextField();

    public TextField getTextField45() {
        return textField45;
    }

    public void setTextField45(TextField tf) {
        this.textField45 = tf;
    }

    private Label label76 = new Label();

    public Label getLabel76() {
        return label76;
    }

    public void setLabel76(Label l) {
        this.label76 = l;
    }

    private Listbox listbox7 = new Listbox();

    public Listbox getListbox7() {
        return listbox7;
    }

    public void setListbox7(Listbox l) {
        this.listbox7 = l;
    }

    private DefaultOptionsList listbox7DefaultOptions = new DefaultOptionsList();

    public DefaultOptionsList getListbox7DefaultOptions() {
        return listbox7DefaultOptions;
    }

    public void setListbox7DefaultOptions(DefaultOptionsList dol) {
        this.listbox7DefaultOptions = dol;
    }

    private Button button51 = new Button();

    public Button getButton51() {
        return button51;
    }

    public void setButton51(Button b) {
        this.button51 = b;
    }

    private Button button52 = new Button();

    public Button getButton52() {
        return button52;
    }

    public void setButton52(Button b) {
        this.button52 = b;
    }

    private Button button53 = new Button();

    public Button getButton53() {
        return button53;
    }

    public void setButton53(Button b) {
        this.button53 = b;
    }

    private Button button54 = new Button();

    public Button getButton54() {
        return button54;
    }

    public void setButton54(Button b) {
        this.button54 = b;
    }

    private Button button55 = new Button();

    public Button getButton55() {
        return button55;
    }

    public void setButton55(Button b) {
        this.button55 = b;
    }

    private Tab itemGroups = new Tab();

    public Tab getItemGroups() {
        return itemGroups;
    }

    public void setItemGroups(Tab t) {
        this.itemGroups = t;
    }

    private PanelLayout layoutPanel13 = new PanelLayout();

    public PanelLayout getLayoutPanel13() {
        return layoutPanel13;
    }

    public void setLayoutPanel13(PanelLayout pl) {
        this.layoutPanel13 = pl;
    }

    private Label label77 = new Label();

    public Label getLabel77() {
        return label77;
    }

    public void setLabel77(Label l) {
        this.label77 = l;
    }

    private Label label78 = new Label();

    public Label getLabel78() {
        return label78;
    }

    public void setLabel78(Label l) {
        this.label78 = l;
    }

    private Label label79 = new Label();

    public Label getLabel79() {
        return label79;
    }

    public void setLabel79(Label l) {
        this.label79 = l;
    }

    private Label label80 = new Label();

    public Label getLabel80() {
        return label80;
    }

    public void setLabel80(Label l) {
        this.label80 = l;
    }

    private TextField textField46 = new TextField();

    public TextField getTextField46() {
        return textField46;
    }

    public void setTextField46(TextField tf) {
        this.textField46 = tf;
    }

    private TextField _groupName = new TextField();

    public TextField get_groupName() {
        return _groupName;
    }

    public void set_groupName(TextField tf) {
        this._groupName = tf;
    }

    private TextField _description1 = new TextField();

    public TextField get_description1() {
        return _description1;
    }

    public void set_description1(TextField tf) {
        this._description1 = tf;
    }

    private TextField _issueDays = new TextField();

    public TextField get_issueDays() {
        return _issueDays;
    }

    public void set_issueDays(TextField tf) {
        this._issueDays = tf;
    }

    private TextField _possibleRenews = new TextField();

    public TextField get_possibleRenews() {
        return _possibleRenews;
    }

    public void set_possibleRenews(TextField tf) {
        this._possibleRenews = tf;
    }

    private DropDown dropDown11 = new DropDown();

    public DropDown getDropDown11() {
        return dropDown11;
    }

    public void setDropDown11(DropDown dd) {
        this.dropDown11 = dd;
    }

    private SingleSelectOptionsList dropDown11DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDropDown11DefaultOptions() {
        return dropDown11DefaultOptions;
    }

    public void setDropDown11DefaultOptions(SingleSelectOptionsList ssol) {
        this.dropDown11DefaultOptions = ssol;
    }

    private Listbox listbox8 = new Listbox();

    public Listbox getListbox8() {
        return listbox8;
    }

    public void setListbox8(Listbox l) {
        this.listbox8 = l;
    }

    private DefaultOptionsList listbox8DefaultOptions = new DefaultOptionsList();

    public DefaultOptionsList getListbox8DefaultOptions() {
        return listbox8DefaultOptions;
    }

    public void setListbox8DefaultOptions(DefaultOptionsList dol) {
        this.listbox8DefaultOptions = dol;
    }

    private Button button1 = new Button();

    public Button getButton1() {
        return button1;
    }

    public void setButton1(Button b) {
        this.button1 = b;
    }

    private Button button2 = new Button();

    public Button getButton2() {
        return button2;
    }

    public void setButton2(Button b) {
        this.button2 = b;
    }

    private Button button4 = new Button();

    public Button getButton4() {
        return button4;
    }

    public void setButton4(Button b) {
        this.button4 = b;
    }

    private Button button9 = new Button();

    public Button getButton9() {
        return button9;
    }

    public void setButton9(Button b) {
        this.button9 = b;
    }

    private IntegerConverter integerConverter1 = new IntegerConverter();

    public IntegerConverter getIntegerConverter1() {
        return integerConverter1;
    }

    public void setIntegerConverter1(IntegerConverter ic) {
        this.integerConverter1 = ic;
    }

    private IntegerConverter integerConverter2 = new IntegerConverter();

    public IntegerConverter getIntegerConverter2() {
        return integerConverter2;
    }

    public void setIntegerConverter2(IntegerConverter ic) {
        this.integerConverter2 = ic;
    }
    
    // </editor-fold>
    
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public Staff() {
    }
    
    /**
     * <p>Callback method that is called whenever a page is navigated to,
     * either directly via a URL, or indirectly via page navigation.
     * Customize this method to acquire resources that will be needed
     * for event handlers and lifecycle methods, whether or not this
     * page is performing post back processing.</p>
     *
     * <p>Note that, if the current request is a postback, the property
     * values of the components do <strong>not</strong> represent any
     * values submitted with this request.  Instead, they represent the
     * property values that were saved for this view when it was rendered.</p>
     */
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here
        
        // <editor-fold defaultstate="collapsed" desc="Creator-managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("Page2 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
    }
    
    /**
     * <p>Callback method that is called after the component tree has been
     * restored, but before any event processing takes place.  This method
     * will <strong>only</strong> be called on a postback request that
     * is processing a form submit.  Customize this method to allocate
     * resources that will be required in your event handlers.</p>
     */
    public void preprocess() {
    }
    
    /**
     * <p>Callback method that is called just before rendering takes place.
     * This method will <strong>only</strong> be called for the page that
     * will actually be rendered (and not, for example, on a page that
     * handled a postback and then navigated to a different page).  Customize
     * this method to allocate resources that will be required for rendering
     * this page.</p>
     */
    public void prerender() {
    }
    
    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called (regardless of whether
     * or not this was the page that was actually rendered).  Customize this
     * method to release resources acquired in the <code>init()</code>,
     * <code>preprocess()</code>, or <code>prerender()</code> methods (or
     * acquired during execution of an event handler).</p>
     */
    public void destroy() {
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1)getBean("RequestBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1)getBean("ApplicationBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1)getBean("SessionBean1");
    }

    public String addItem_action() {
        // TODO: Replace with your code
        
        return null;
    }

    public void _department_processValueChange(ValueChangeEvent event) {
        // TODO: Replace with your code
        
    }

    public String address_action() {
        // TODO: Replace with your code
        
        return null;
    }

    public String button10_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        
        return null;
    }

    public String tab4_action() {
        // TODO: Replace with your code
        
        return null;
    }

    public String users_action() {
        // TODO: Replace with your code
        
        return null;
    }

    public String payment_action() {
        // TODO: Replace with your code
        
        return null;
    }

    public void listbox5_processValueChange(ValueChangeEvent event) {
        // TODO: Replace with your code
        
    }

    public void calendar3_validate(FacesContext context, UIComponent component, Object value) {
        // TODO: Replace with your code
        
    }

    public String itemGroups_action() {
        ItemGroup ig = getItemGroupObject();
        try {
            ItemBOFactory.newInstance().addItemGroup(ig);
        } catch (Exception ex) {
            ex.printStackTrace();
        }        
        return null;
    }

    private ItemGroup getItemGroupObject() {
        // TODO: Replace with your code
        String gn = (String) this._groupName.getText();
        String d1 = (String) this._description1.getText();
        Integer days = (Integer) this._possibleRenews.getText();
        Integer renews = (Integer) this._issueDays.getText();
        //this._issueDays.setText(days);
        ItemGroup ig = new ItemGroup();
        ig.setDescription(d1);
        ig.setGroupname(gn);
        ig.setNoofdays(days.intValue());
        ig.setPossibleRenews(renews.intValue());
        return ig;
    }

    public String button2_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        fillItemGroupForm(new ItemGroup());
        return null;
    }
    
    private void fillItemGroupForm(ItemGroup ig) {
        _groupName.setText(ig.getGroupname());
        _description1.setText(ig.getDescription());
        _possibleRenews.setText(new Integer(ig.getPossibleRenews()));
        _issueDays.setText(new Integer(ig.getNoofdays()));
        
    }

    public String button9_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        ItemGroup ig = getItemGroupObject();
        try {
            ItemGroup igs = ItemBOFactory.newInstance().findItemGroup(ig.getGroupname());
            ItemBOFactory.newInstance().addItemGroup(igs);
        } catch (Exception ex) {
            ex.printStackTrace();
        }               
        return null;
    }

    public String button1_action() {
        // TODO: Process the button click action. Return value is a navigation
        // case name where null will return to the same page.
        
        ItemGroup ig = getItemGroupObject();
        System.out.println("Button ");
        ig.setDescription("ldjf");
        System.out.println("Button hello");
        
       //this.fillItemGroupForm(ig);
        try {
            //ItemGroup igs = ItemBOFactory.newInstance().findItemGroup(ig.getGroupname());
            //ItemBOFactory.newInstance().addItemGroup(ig);
        } catch (Exception ex) {
            ex.printStackTrace();
        }               
        return null;
    }
}

