
package net.abbht.lamo.persistence.users ;
/**
 * 
 *
 * @hibernate.class
 *     table="USER_GROUP"
 *
 */
public class UserGroup {

   // <editor-fold defaultstate="collapsed" desc=" PrimaryKey:   long id ">
   private long id;
/**
  *   @hibernate.id
  *     generator-class="increment"
  *     type="java.lang.Long"
  */
   public long getId () {
      return id;
   } 
   public void setId (long id) {
      this.id = id;
   }
   //</editor-fold>
   
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
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String groupdesc ">
   private String groupdesc;
   /**
    *   @hibernate.property
    */
   public String getGroupdesc() {
       return groupdesc;
   }
   public void setGroupdesc(String groupdesc) {
       this.groupdesc = groupdesc;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String maxnoofbooks ">
   private Integer maxnoofbooks;
   /**
    *   @hibernate.property
    */
   public Integer getMaxnoofbooks() {
       return maxnoofbooks;
   }
   public void setMaxnoofbooks(Integer maxnoofbooks) {
       this.maxnoofbooks = maxnoofbooks;
   }
   // </editor-fold>

}