
package net.abbht.lamo.persistence.loans ;
/**
 * 
 *
 * @hibernate.class
 *     table="RENEW"
 *
 */
public class Renew {

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
   
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   java.sql.Date renewdate ">
   private java.sql.Date renewdate;
   /**
    *   @hibernate.property
    */
   public java.sql.Date getRenewdate() {
       return renewdate;
   }
   public void setRenewdate(java.sql.Date renewdate) {
       this.renewdate = renewdate;
   }
   // </editor-fold>

   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String itemid ">
   private String itemid;
   /**
    *   @hibernate.property
    */
   public String getItemid() {
       return itemid;
   }
   public void setItemid(String itemid) {
       this.itemid = itemid;
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