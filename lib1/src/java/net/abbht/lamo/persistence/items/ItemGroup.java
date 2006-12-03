
package net.abbht.lamo.persistence.items ;
/**
 * 
 *
 * @hibernate.class
 *     table="ITEM_GROUP"
 *
 */
public class ItemGroup {

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
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   int noofdays ">
   private int noofdays;
   /**
    *   @hibernate.property
    */
   public int getNoofdays() {
       return noofdays;
   }
   public void setNoofdays(int noofdays) {
       this.noofdays = noofdays;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   int possibleRenews ">
   private int possibleRenews;
   /**
    *   @hibernate.property
    */
   public int getPossibleRenews() {
       return possibleRenews;
   }
   public void setPossibleRenews(int possibleRenews) {
       this.possibleRenews = possibleRenews;
   }
   // </editor-fold>

}