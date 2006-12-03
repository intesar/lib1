
package net.abbht.lamo.persistence.users ;
/**
 * 
 *
 * @hibernate.class
 *     table="AUTHORITY"
 *
 */
public class Authority {

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
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String authorityname ">
   private String authorityname;
   /**
    *   @hibernate.property
    */
   public String getAuthorityname() {
       return authorityname;
   }
   public void setAuthorityname(String authorityname) {
       this.authorityname = authorityname;
   }
   // </editor-fold>

}