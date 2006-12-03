
package net.abbht.lamo.persistence.users ;
/**
 * 
 *
 * @hibernate.class
 *     table="ADDRESS"
 *
 */
public class Address {

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
   
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String city ">
   private String city;
   /**
    *   @hibernate.property
    */
   public String getCity() {
       return city;
   }
   public void setCity(String city) {
       this.city = city;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String state ">
   private String state;
   /**
    *   @hibernate.property
    */
   public String getState() {
       return state;
   }
   public void setState(String state) {
       this.state = state;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String street ">
   private String street;
   /**
    *   @hibernate.property
    */
   public String getStreet() {
       return street;
   }
   public void setStreet(String street) {
       this.street = street;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String zipcode ">
   private String zipcode;
   /**
    *   @hibernate.property
    */
   public String getZipcode() {
       return zipcode;
   }
   public void setZipcode(String zipcode) {
       this.zipcode = zipcode;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String country ">
   private String country;
   /**
    *   @hibernate.property
    */
   public String getCountry() {
       return country;
   }
   public void setCountry(String country) {
       this.country = country;
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
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   int enable ">
   private int enable;
   /**
    *   @hibernate.property
    */
   public int getEnable() {
       return enable;
   }
   public void setEnable(int enable) {
       this.enable = enable;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   java.sql.Date UpdationDate ">
   private java.sql.Date UpdationDate;
   /**
    *   @hibernate.property
    */
   public java.sql.Date getUpdationDate() {
       return UpdationDate;
   }
   public void setUpdationDate(java.sql.Date UpdationDate) {
       this.UpdationDate = UpdationDate;
   }
   // </editor-fold>
   



}