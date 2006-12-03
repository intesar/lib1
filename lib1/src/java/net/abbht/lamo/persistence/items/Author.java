
package net.abbht.lamo.persistence.items ;
/**
 * 
 *
 * @hibernate.class
 *     table="AUTHOR"
 *
 */
public class Author {

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
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String authorname ">
   private String authorname;
   /**
    *   @hibernate.property
    */
   public String getAuthorname() {
       return authorname;
   }
   public void setAuthorname(String authorname) {
       this.authorname = authorname;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String description ">
   private String description;
   /**
    *   @hibernate.property
    */
   public String getDescription() {
       return description;
   }
   public void setDescription(String description) {
       this.description = description;
   }
   // </editor-fold>



}