package net.abbht.lamo.facades.users;

import java.util.Iterator;
import net.abbht.lamo.persistence.users.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *  @netbeans.hibernate.facade beanClass=net.abbht.lamo.persistence.users.UserGroup
 */
public class UserGroupFacade { 
    public void saveUserGroup(UserGroup userGroup) {
        Session session = net.abbht.lamo.utils.HibernateUtil.currentSession();
        Transaction tx = session.beginTransaction();
        session.save(userGroup);
        tx.commit();
        net.abbht.lamo.utils.HibernateUtil.closeSession();
    }
    
    public void updateUserGroup(UserGroup userGroup) {
        Session session = net.abbht.lamo.utils.HibernateUtil.currentSession();
        Transaction tx = session.beginTransaction();
        session.update(userGroup);
        tx.commit();
        net.abbht.lamo.utils.HibernateUtil.closeSession();
    }    
    public UserGroup findByPrimaryKey(Object key)
    {
        return this.findByPrimaryKey(key);
        
    }
    
    public UserGroup findByGroupName(String gname)
    {
         String sql = "from UserGroup u where u.groupname =" + gname;
        Iterator i = net.abbht.lamo.utils.HibernateUtil.currentSession().createQuery(sql).iterate();
        return (UserGroup)i.next();
    }
}
