
package net.abbht.lamo.persistence.items ;
/**
 * 
 *
 * @hibernate.class
 *     table="ITEM"
 *
 */
public class Item {

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
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String itemtype ">
   private String itemtype;
   /**
    *   @hibernate.property
    */
   public String getItemtype() {
       return itemtype;
   }
   public void setItemtype(String itemtype) {
       this.itemtype = itemtype;
   }
   // </editor-fold>

   
   // <editor-fold defaultstate="collapsed" desc=" Property:   int yearofissue ">
   private int yearofissue;
   /**
    *   @hibernate.property
    */
   public int getYearofissue() {
       return yearofissue;
   }
   public void setYearofissue(int yearofissue) {
       this.yearofissue = yearofissue;
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
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String status ">
   private String status;
   /**
    *   @hibernate.property
    */
   public String getStatus() {
       return status;
   }
   public void setStatus(String status) {
       this.status = status;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   java.sql.Date dateofissue ">
   private java.sql.Date dateofissue;
   /**
    *   @hibernate.property
    */
   public java.sql.Date getDateofissue() {
       return dateofissue;
   }
   public void setDateofissue(java.sql.Date dateofissue) {
       this.dateofissue = dateofissue;
   }
   // </editor-fold>

   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String isbn ">
   private String isbn;
   /**
    *   @hibernate.property
    */
   public String getIsbn() {
       return isbn;
   }
   public void setIsbn(String isbn) {
       this.isbn = isbn;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String publisher ">
   private String publisher;
   /**
    *   @hibernate.property
    */
   public String getPublisher() {
       return publisher;
   }
   public void setPublisher(String publisher) {
       this.publisher = publisher;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String edition ">
   private String edition;
   /**
    *   @hibernate.property
    */
   public String getEdition() {
       return edition;
   }
   public void setEdition(String edition) {
       this.edition = edition;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String location ">
   private String location;
   /**
    *   @hibernate.property
    */
   public String getLocation() {
       return location;
   }
   public void setLocation(String location) {
       this.location = location;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   double cost ">
   private double cost;
   /**
    *   @hibernate.property
    */
   public double getCost() {
       return cost;
   }
   public void setCost(double cost) {
       this.cost = cost;
   }
   // </editor-fold>


}