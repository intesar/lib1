package net.abbht.lamo.facades.loans;

import java.util.Date;
import java.util.Iterator;
import net.abbht.lamo.persistence.loans.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *  @netbeans.hibernate.facade beanClass=net.abbht.lamo.persistence.loans.Renew
 */
public class RenewFacade { 
    public void saveRenew(Renew renew) {
        Session session = net.abbht.lamo.utils.HibernateUtil.currentSession();
        Transaction tx = session.beginTransaction();
        session.save(renew);
        tx.commit();
        net.abbht.lamo.utils.HibernateUtil.closeSession();
    }  
    
    public Renew findByPrimaryKey(Object key)
    {
        return this.findByPrimaryKey(key);
    }
    
    public Renew findByUserName(String username)
    {
         String sql = "from Renew r where r.username =" + username;
        Iterator i = net.abbht.lamo.utils.HibernateUtil.currentSession().createQuery(sql).iterate();
        return (Renew)i.next();
    }
    
    public Renew findByRenewDate(Date renewDate)
    {
        String sql = "from Renew r where r.renewdate =" + renewDate;
        Iterator i = net.abbht.lamo.utils.HibernateUtil.currentSession().createQuery(sql).iterate();
        return (Renew)i.next();
    }
    
    public Renew findByItemId(String itemid)
    {
     String sql = "from Renew r where r.itemid =" + itemid;
        Iterator i = net.abbht.lamo.utils.HibernateUtil.currentSession().createQuery(sql).iterate();
        return (Renew)i.next();   
    }
}
