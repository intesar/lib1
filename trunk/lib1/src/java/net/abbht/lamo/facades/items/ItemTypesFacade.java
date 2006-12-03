package net.abbht.lamo.facades.items;

import java.sql.Date;
import java.util.Iterator;
import net.abbht.lamo.persistence.items.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *  @netbeans.hibernate.facade beanClass=net.abbht.lamo.persistence.items.ItemTypes
 */
public class ItemTypesFacade { 
    public void saveItemTypes(ItemTypes itemTypes) {
        Session session = net.abbht.lamo.utils.HibernateUtil.currentSession();
        Transaction tx = session.beginTransaction();
        session.save(itemTypes);
        tx.commit();
        net.abbht.lamo.utils.HibernateUtil.closeSession();
    } 
    public ItemTypes findByPrimaryKey(Object key)
    {
        return this.findByPrimaryKey(key);
    }
    public ItemTypes findByCreationDate(Date date)
    {
         String sql = "from ItemTypes u where u.creationDate =" + date;
        Iterator i = net.abbht.lamo.utils.HibernateUtil.currentSession().createQuery(sql).iterate();
        return (ItemTypes)i.next();
    }
}
