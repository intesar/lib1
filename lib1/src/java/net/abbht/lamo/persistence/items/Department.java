
package net.abbht.lamo.persistence.items ;
/**
 * 
 *
 * @hibernate.class
 *     table="DEPARTMENT"
 *
 */
public class Department {

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
   
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String deptname ">
   private String deptname;
   /**
    *   @hibernate.property
    */
   public String getDeptname() {
       return deptname;
   }
   public void setDeptname(String deptname) {
       this.deptname = deptname;
   }
   // </editor-fold>
   
   // <editor-fold defaultstate="collapsed" desc=" Property:   String deptdesc ">
   private String deptdesc;
   /**
    *   @hibernate.property
    */
   public String getDeptdesc() {
       return deptdesc;
   }
   public void setDeptdesc(String deptdesc) {
       this.deptdesc = deptdesc;
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