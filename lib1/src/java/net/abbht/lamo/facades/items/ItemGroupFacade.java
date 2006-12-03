package net.abbht.lamo.facades.items;

import java.util.Iterator;
import java.util.List;
import net.abbht.lamo.persistence.items.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *  @netbeans.hibernate.facade beanClass=net.abbht.lamo.persistence.items.ItemGroup
 */
public class ItemGroupFacade { 
    public void saveItemGroup(ItemGroup itemGroup) {
        Session session = net.abbht.lamo.utils.HibernateUtil.currentSession();
        Transaction tx = session.beginTransaction();
        session.save(itemGroup);
        tx.commit();
        net.abbht.lamo.utils.HibernateUtil.closeSession();
    }   
    
    public Item findByPrimaryKey(Object key)
    {
        return this.findByPrimaryKey(key);
    }
    public Item findByPossibleRenews(int noofrenews)
    {
        String sql = "from ItemGroup u where u.possibleRenews =" + noofrenews;
        Iterator i = net.abbht.lamo.utils.HibernateUtil.currentSession().createQuery(sql).iterate();
        return (Item)i.next();
    }
    
    public ItemGroup findByGroupName(String groupName)
    {
        String sql = "from ItemGroup u where u.groupName =" + groupName;
        Iterator i = net.abbht.lamo.utils.HibernateUtil.currentSession().createQuery(sql).iterate();
        return (ItemGroup)i.next();
    }
    public List findAll()
    {
         String sql = "from ItemGroup u ";
         return net.abbht.lamo.utils.HibernateUtil.currentSession().createQuery(sql).list();
    }
    
}
