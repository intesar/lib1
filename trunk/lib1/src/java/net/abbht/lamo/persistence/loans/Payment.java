
package net.abbht.lamo.persistence.loans ;
/**
 * 
 *
 * @hibernate.class
 *     table="PAYMENT"
 *
 */
public class Payment {

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
   
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   int fine ">
   private int fine;
   /**
    *   @hibernate.property
    */
   public int getFine() {
       return fine;
   }
   public void setFine(int fine) {
       this.fine = fine;
   }
   // </editor-fold>

   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String paidto ">
   private String paidto;
   /**
    *   @hibernate.property
    */
   public String getPaidto() {
       return paidto;
   }
   public void setPaidto(String paidto) {
       this.paidto = paidto;
   }
   // </editor-fold>

   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String describ ">
   private String describ;
   /**
    *   @hibernate.property
    */
   public String getDescrib() {
       return describ;
   }
   public void setDescrib(String describ) {
       this.describ = describ;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   int daysfor ">
   private int daysfor;
   /**
    *   @hibernate.property
    */
   public int getDaysfor() {
       return daysfor;
   }
   public void setDaysfor(int daysfor) {
       this.daysfor = daysfor;
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
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   java.sql.Date date ">
   private java.sql.Date date;
   /**
    *   @hibernate.property
    */
   public java.sql.Date getDate() {
       return date;
   }
   public void setDate(java.sql.Date date) {
       this.date = date;
   }
   // </editor-fold>
   


}