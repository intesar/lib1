package net.abbht.lamo.facades.loans;

import java.util.Iterator;
import net.abbht.lamo.persistence.loans.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *  @netbeans.hibernate.facade beanClass=net.abbht.lamo.persistence.loans.Payment
 */
public class PaymentFacade { 
    public void savePayment(Payment payment) {
        Session session = net.abbht.lamo.utils.HibernateUtil.currentSession();
        Transaction tx = session.beginTransaction();
        session.save(payment);
        tx.commit();
        net.abbht.lamo.utils.HibernateUtil.closeSession();
    }
    
    public Payment findByPrimaryKey(Object key)
    {
        return this.findByPrimaryKey(key);
    }
    public Payment findByPrimary(String username)
    {
         String sql = "from Payment p where p.username =" + username;
        Iterator i = net.abbht.lamo.utils.HibernateUtil.currentSession().createQuery(sql).iterate();
        return (Payment)i.next();
    }
    


}
