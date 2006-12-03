
package net.abbht.lamo.persistence.users ;
/**
 * 
 *
 * @hibernate.class
 *     table="USER"
 *
 */
public class User {

   // <editor-fold defaultstate="collapsed" desc=" PrimaryKey:   Long id ">
   private Long id;
/**
  *   @hibernate.id
  *     generator-class="increment"
  *     type="long"
  */
   public Long getId () {
      return id;
   } 
   public void setId (Long id) {
      this.id = id;
   }
   //</editor-fold>
   
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String campus ">
   private String campus;
   /**
    *   @hibernate.property
    */
   public String getCampus() {
       return campus;
   }
   public void setCampus(String campus) {
       this.campus = campus;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String department ">
   private String department;
   /**
    *   @hibernate.property
    */
   public String getDepartment() {
       return department;
   }
   public void setDepartment(String department) {
       this.department = department;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String password ">
   private String password;
   /**
    *   @hibernate.property
    */
   public String getPassword() {
       return password;
   }
   public void setPassword(String password) {
       this.password = password;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String type ">
   private String type;
   /**
    *   @hibernate.property
    */
   public String getType() {
       return type;
   }
   public void setType(String type) {
       this.type = type;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String firstname ">
   private String firstname;
   /**
    *   @hibernate.property
    */
   public String getFirstname() {
       return firstname;
   }
   public void setFirstname(String firstname) {
       this.firstname = firstname;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   int totalduedays ">
   private int totalduedays;
   /**
    *   @hibernate.property
    */
   public int getTotalduedays() {
       return totalduedays;
   }
   public void setTotalduedays(int totalduedays) {
       this.totalduedays = totalduedays;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String middlename ">
   private String middlename;
   /**
    *   @hibernate.property
    */
   public String getMiddlename() {
       return middlename;
   }
   public void setMiddlename(String middlename) {
       this.middlename = middlename;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   boolean enabled ">
   private boolean enabled;
   /**
    *   @hibernate.propertys
    */
   public boolean getEnabled() {
       return enabled;
   }
   public void setEnabled(boolean enabled) {
       this.enabled = enabled;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String groupname ">
   private String groupname;
   /**
    *   @hibernate.property
    */
   public String getGroupname() {
       return groupname;
   }
   public void setGroupname(String groupname) {
       this.groupname = groupname;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   java.sql.Date dob ">
   private java.sql.Date dob;
   /**
    *   @hibernate.property
    */
   public java.sql.Date getDob() {
       return dob;
   }
   public void setDob(java.sql.Date dob) {
       this.dob = dob;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   java.sql.Date dateofjoin ">
   private java.sql.Date dateofjoin;
   /**
    *   @hibernate.property
    */
   public java.sql.Date getDateofjoin() {
       return dateofjoin;
   }
   public void setDateofjoin(java.sql.Date dateofjoin) {
       this.dateofjoin = dateofjoin;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String lastname ">
   private String lastname;
   /**
    *   @hibernate.property
    */
   public String getLastname() {
       return lastname;
   }
   public void setLastname(String lastname) {
       this.lastname = lastname;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String motherName ">
   private String motherName;
   /**
    *   @hibernate.property
    */
   public String getMotherName() {
       return motherName;
   }
   public void setMotherName(String motherName) {
       this.motherName = motherName;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String title ">
   private String title;
   /**
    *   @hibernate.property
    */
   public String getTitle() {
       return title;
   }
   public void setTitle(String title) {
       this.title = title;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String email ">
   private String email;
   /**
    *   @hibernate.property
    */
   public String getEmail() {
       return email;
   }
   public void setEmail(String email) {
       this.email = email;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String sex ">
   private String sex;
   /**
    *   @hibernate.property
    */
   public String getSex() {
       return sex;
   }
   public void setSex(String sex) {
       this.sex = sex;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String favouriteColor ">
   private String favouriteColor;
   /**
    *   @hibernate.property
    */
   public String getFavouriteColor() {
       return favouriteColor;
   }
   public void setFavouriteColor(String favouriteColor) {
       this.favouriteColor = favouriteColor;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String favouriteBook ">
   private String favouriteBook;
   /**
    *   @hibernate.property
    */
   public String getFavouriteBook() {
       return favouriteBook;
   }
   public void setFavouriteBook(String favouriteBook) {
       this.favouriteBook = favouriteBook;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String favouritePlace ">
   private String favouritePlace;
   /**
    *   @hibernate.property
    */
   public String getFavouritePlace() {
       return favouritePlace;
   }
   public void setFavouritePlace(String favouritePlace) {
       this.favouritePlace = favouritePlace;
   }
   // </editor-fold>

  
   // <editor-fold defaultstate="collapsed" desc=" Property:   int passwordEncrypted ">
   private boolean passwordEncrypted;
   /**
    *   @hibernate.property
    */
   public boolean getPasswordEncrypted() {
       return passwordEncrypted;
   }
   public void setPasswordEncrypted(boolean passwordEncrypted) {
       this.passwordEncrypted = passwordEncrypted;
   }
   // </editor-fold>
   
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String username ">
   private String username;
   /**
    *   @hibernate.property
    */
   public String getUsername() {
       return username;
   }
   public void setUsername(String username) {
       this.username = username;
   }
   // </editor-fold>

}