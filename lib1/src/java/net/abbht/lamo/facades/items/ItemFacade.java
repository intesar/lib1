package net.abbht.lamo.facades.items;

import java.util.Iterator;
import java.util.List;
import net.abbht.lamo.persistence.items.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *  @netbeans.hibernate.facade beanClass=net.abbht.lamo.persistence.items.Item
 */
public class ItemFacade { 
    public void saveItem(Item item) {
        Session session = net.abbht.lamo.utils.HibernateUtil.currentSession();
        Transaction tx = session.beginTransaction();
        session.save(item);
        tx.commit();
        net.abbht.lamo.utils.HibernateUtil.closeSession();
    }    
    
   
    public List findByGroupName(String groupname)
    {
        String sql = "from Item u where u.groupname =" +groupname;
        return  net.abbht.lamo.utils.HibernateUtil.currentSession().createQuery(sql).list();
      
    }
    
    public List findByTitle(String title)
    {
        String sql = "from Item u where u.title =" + title;
        return net.abbht.lamo.utils.HibernateUtil.currentSession().createQuery(sql).list();
        
    }
    
    public List findByYearOfIssue(String yearOfIssue)
    {
        String sql = "from Item u where u.yearofissue =" + yearOfIssue;
        return net.abbht.lamo.utils.HibernateUtil.currentSession().createQuery(sql).list();
       
    }
    public List findByIsbn(String isbn)
    {
        String sql = "from Item u where u.isbn =" + isbn;
        return net.abbht.lamo.utils.HibernateUtil.currentSession().createQuery(sql).list();
  
    }
    
    public List findByPublisher(String publisher)
    {
        String sql = "from Item u where u.publisher =" + publisher;
        return net.abbht.lamo.utils.HibernateUtil.currentSession().createQuery(sql).list();
       
    }
    public List findByEdition(String edition)
    {
        String sql = "from Item u where u.edition =" + edition;
         return  net.abbht.lamo.utils.HibernateUtil.currentSession().createQuery(sql).list();
        
    }
    public Item findByItemNo(String itemId)
    {
            String sql = "from Item u where u.itemid =" + itemId;
         Iterator i= net.abbht.lamo.utils.HibernateUtil.currentSession().createQuery(sql).iterate();
           return (Item)i.next();
             
    }
    
    
}
