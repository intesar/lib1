
package net.abbht.lamo.persistence.items ;
/**
 * 
 *
 * @hibernate.class
 *     table="ITEM_TYPES"
 *
 */
public class ItemTypes {

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
   
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String name ">
   private String name;
   /**
    *   @hibernate.property
    */
   public String getName() {
       return name;
   }
   public void setName(String name) {
       this.name = name;
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
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   java.sql.Date creationDate ">
   private java.sql.Date creationDate;
   /**
    *   @hibernate.property
    */
   public java.sql.Date getCreationDate() {
       return creationDate;
   }
   public void setCreationDate(java.sql.Date creationDate) {
       this.creationDate = creationDate;
   }
   // </editor-fold>

 
   
}