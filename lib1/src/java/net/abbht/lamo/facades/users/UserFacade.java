package net.abbht.lamo.facades.users;

import java.util.Iterator;
import java.util.List;
import net.abbht.lamo.persistence.users.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * 
 * 
 * @netbeans.hibernate.facade beanClass = "net.abbht.lamo.persistence.users.User
 "
 */
public class UserFacade { 
    public void saveUser(User user) {
        Session session = net.abbht.lamo.utils.HibernateUtil.currentSession();
        Transaction tx = session.beginTransaction();
        session.save(user);
        
        tx.commit();
        net.abbht.lamo.utils.HibernateUtil.closeSession();
    }
    
    public void saveOrUpdateUser(User user) {
        Session session = net.abbht.lamo.utils.HibernateUtil.currentSession();
        Transaction tx = session.beginTransaction();
        session.update(user);        
        tx.commit();
        net.abbht.lamo.utils.HibernateUtil.closeSession();
    }    
    
      public User findByPrimaryKey(Object key) {
        
        return this.findByPrimaryKey(key);
        
    }
      
       public List findByName(String lastname) {
        String sql = "from User u where u.lastname = '" + lastname + "'";
        return  net.abbht.lamo.utils.HibernateUtil.currentSession().createQuery(sql).list();
       
    }
       public User findByUserName(String username)
       {
            String sql = "from User u where u.username = '" + username + "'";
        Iterator i = net.abbht.lamo.utils.HibernateUtil.currentSession().createQuery(sql).iterate();
        return (User)i.next();
       }
}
