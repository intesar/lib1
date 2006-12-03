package net.abbht.lamo.facades.loans;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import net.abbht.lamo.persistence.loans.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *  @netbeans.hibernate.facade beanClass=net.abbht.lamo.persistence.loans.Loan
 */
public class LoanFacade { 
    public void saveLoan(Loan loan) {
        Session session = net.abbht.lamo.utils.HibernateUtil.currentSession();
        Transaction tx = session.beginTransaction();
        session.save(loan);
        tx.commit();
        net.abbht.lamo.utils.HibernateUtil.closeSession();
    }    
    
    public Loan findByPrimaryKey(Object key)
    {
       return this.findByPrimaryKey(key);
    }
    
    public Loan findByLoan(Date duedate)
    {
         String sql = "from Loan p where p.duedate =" + duedate;
        Iterator i = net.abbht.lamo.utils.HibernateUtil.currentSession().createQuery(sql).iterate();
        return (Loan)i.next();
    }
    
    public List findByUserName(String username)
    {
        
         String sql = "from Loan p where p.username=" + username;
        return net.abbht.lamo.utils.HibernateUtil.currentSession().createQuery(sql).list();
        
              
    }
    
   public List findByItemId(String itemid)
   {
         String sql = "from Loan p where p.itemid=" + itemid;
        return net.abbht.lamo.utils.HibernateUtil.currentSession().createQuery(sql).list();
        
   }
   
   public Loan findByUserAndItem(String username, String itemNo) {
       String sql = "from Loan l where l.username = " + username + " and l.itemid = " + itemNo;
       Iterator iter = net.abbht.lamo.utils.HibernateUtil.currentSession().createQuery(sql).iterate();
       if ( iter.hasNext())
           return (Loan) iter.next();
       return null;
   }
   
   public void deleteLoanRecord(Loan loan)
   {
       net.abbht.lamo.utils.HibernateUtil.currentSession().delete(loan);
   }
}
