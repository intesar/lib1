
package net.abbht.lamo.persistence.users ;
/**
 * 
 *
 * @hibernate.class
 *     table="PHONE"
 *
 */
public class Phone {

   // <editor-fold defaultstate="collapsed" desc=" PrimaryKey:   Long id ">
   private Long id;
/**
  *   @hibernate.id
  *     generator-class="increment"
  *     type="java.lang.Long"
  */
   public Long getId () {
      return id;
   } 
   public void setId (Long id) {
      this.id = id;
   }
   //</editor-fold>
   
   
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
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String phoneNo ">
   private String phoneNo;
   /**
    *   @hibernate.property
    */
   public String getPhoneNo() {
       return phoneNo;
   }
   public void setPhoneNo(String phoneNo) {
       this.phoneNo = phoneNo;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   java.sql.Date creationDate  ">
   private java.sql.Date creationDate ;
   /**
    *   @hibernate.property
    */
   public java.sql.Date getCreationDate  () {
       return creationDate ;
   }
   public void setCreationDate  (java.sql.Date creationDate ) {
       this.creationDate  = creationDate ;
   }
   // </editor-fold>

}