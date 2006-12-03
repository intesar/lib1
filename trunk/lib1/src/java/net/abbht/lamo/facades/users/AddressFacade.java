package net.abbht.lamo.facades.users;

import java.util.Iterator;
import net.abbht.lamo.persistence.users.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *  @netbeans.hibernate.facade beanClass=net.abbht.lamo.persistence.users.Address
 */
public class AddressFacade { 
    public void saveAddress(Address address) {
        Session session = net.abbht.lamo.utils.HibernateUtil.currentSession();
        Transaction tx = session.beginTransaction();
        session.save(address);
        tx.commit();
        net.abbht.lamo.utils.HibernateUtil.closeSession();
    }
    
    public void updateAddress(Address address) {
        Session session = net.abbht.lamo.utils.HibernateUtil.currentSession();
        Transaction tx = session.beginTransaction();
        session.update(address);
        tx.commit();
        net.abbht.lamo.utils.HibernateUtil.closeSession();
    }    
     public Address findByPrimaryKey(Object key) {
        
        return this.findByPrimaryKey(key);
        
    }
     
     public Address findByName(String username) {
        String sql = "from Address u where u.name =" + username;
        Iterator i = net.abbht.lamo.utils.HibernateUtil.currentSession().createQuery(sql).iterate();
        return (Address)i.next();
    }
}
