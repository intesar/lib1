package net.abbht.lamo.facades.users;

import net.abbht.lamo.persistence.users.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *  @netbeans.hibernate.facade beanClass=net.abbht.lamo.persistence.users.Authority
 */
public class AuthorityFacade { 
    public void saveAuthority(Authority authority) {
        Session session = net.abbht.lamo.utils.HibernateUtil.currentSession();
        Transaction tx = session.beginTransaction();
        session.save(authority);
        tx.commit();
        net.abbht.lamo.utils.HibernateUtil.closeSession();
    }
    
    public Authority findByPrimaryKey(Object key)
    {
        return this.findByPrimaryKey(key);
    }
    
    public void removeAuthorities(String username)
    {
      String str ="delete Authority a where a.username = :username";
     net.abbht.lamo.utils.HibernateUtil.currentSession().createQuery(str).setString("username",username).executeUpdate();
      
    }
    
}
