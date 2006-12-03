
package net.abbht.lamo.persistence.loans ;
/**
 * 
 *
 * @hibernate.class
 *     table="LOAN"
 *
 */
public class Loan {

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
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   java.sql.Date returndate ">
   private java.sql.Date returndate;
   /**
    *   @hibernate.property
    */
   public java.sql.Date getReturndate() {
       return returndate;
   }
   public void setReturndate(java.sql.Date returndate) {
       this.returndate = returndate;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   int isreturned ">
   private boolean isreturned;
   /**
    *   @hibernate.property
    */
   public boolean getIsreturned() {
       return isreturned;
   }
   public void setIsreturned(boolean isreturned) {
       this.isreturned = isreturned;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   int noofrenews ">
   private int noofrenews;
   /**
    *   @hibernate.property
    */
   public int getNoofrenews() {
       return noofrenews;
   }
   public void setNoofrenews(int noofrenews) {
       this.noofrenews = noofrenews;
   }
   // </editor-fold>

   // <editor-fold defaultstate="collapsed" desc=" Property:   java.sql.Date duedate ">
   private java.sql.Date duedate;
   /**
    *   @hibernate.property
    */
   public java.sql.Date getDuedate() {
       return duedate;
   }
   public void setDuedate(java.sql.Date duedate) {
       this.duedate = duedate;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   int totalduedays ">
   private int totalduedays;
   /**
    *   @hibernate.property
    */
   public int getTotalduedays() {
       return totalduedays;
   }
   public void setTotalduedays(int totalduedays) {
       this.totalduedays = totalduedays;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String returnto ">
   private String returnto;
   /**
    *   @hibernate.property
    */
   public String getReturnto() {
       return returnto;
   }
   public void setReturnto(String returnto) {
       this.returnto = returnto;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   java.sql.Date issuedate ">
   private java.sql.Date issuedate;
   /**
    *   @hibernate.property
    */
   public java.sql.Date getIssuedate() {
       return issuedate;
   }
   public void setIssuedate(java.sql.Date issuedate) {
       this.issuedate = issuedate;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String issueby ">
   private String issueby;
   /**
    *   @hibernate.property
    */
   public String getIssueby() {
       return issueby;
   }
   public void setIssueby(String issueby) {
       this.issueby = issueby;
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