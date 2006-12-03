package net.abbht.lamo.facades.users;

import java.util.Iterator;
import net.abbht.lamo.persistence.users.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *  @netbeans.hibernate.facade beanClass=net.abbht.lamo.persistence.users.Phone
 */
public class PhoneFacade { 
    public void savePhone(Phone phone) {
        Session session = net.abbht.lamo.utils.HibernateUtil.currentSession();
        Transaction tx = session.beginTransaction();
        session.save(phone);
        tx.commit();
        net.abbht.lamo.utils.HibernateUtil.closeSession();
    }    
    
    public void updatePhone(Phone phone) {
        Session session = net.abbht.lamo.utils.HibernateUtil.currentSession();
        Transaction tx = session.beginTransaction();
        session.update(phone);
        tx.commit();
        net.abbht.lamo.utils.HibernateUtil.closeSession();
    }       
    public Phone findByPrimaryKey(Object key)
    {
        return this.findByPrimaryKey(key);
    }
    
    public Phone findByPhoneNo(String ph)
    {
         String sql = "from Phone u where u.phoneNo =" + ph;
        Iterator i = net.abbht.lamo.utils.HibernateUtil.currentSession().createQuery(sql).iterate();
        return (Phone)i.next();
    }
}
