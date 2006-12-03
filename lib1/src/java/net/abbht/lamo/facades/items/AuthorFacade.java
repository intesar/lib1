package net.abbht.lamo.facades.items;

import java.util.Iterator;
import net.abbht.lamo.persistence.items.*;
import net.abbht.lamo.persistence.loans.Loan;
import net.abbht.lamo.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *  @netbeans.hibernate.facade beanClass=net.abbht.lamo.persistence.items.Author
 */
public class AuthorFacade { 
    public void saveAuthor(Author author) {
        Session session = HibernateUtil.currentSession();
        Transaction tx = session.beginTransaction();
        session.save(author);
        tx.commit();
        HibernateUtil.closeSession();
        
    } 
    
    public Author findByPrimaryKey(Object key)
    {
        return this.findByPrimaryKey(key);
    }
    public Author findByPrimaryAuthorName(String authorname)
    {
         String sql = "from Author p where p.authorname=" + authorname;
        Iterator i =net.abbht.lamo.utils.HibernateUtil.currentSession().createQuery(sql).iterate();
        return (Author)i.next();
              
    }
    
    public Author findByDescription(String desc)
    {
         String sql = "from Loan p where p.description=" + desc;
        Iterator i = net.abbht.lamo.utils.HibernateUtil.currentSession().createQuery(sql).iterate();
        return (Author)i.next();
              
    }
    
    public Author findByItemId(String itemid)
    {
        String sql = "from Loan p where p.username=" + itemid;
        Iterator i = net.abbht.lamo.utils.HibernateUtil.currentSession().createQuery(sql).iterate();
        return (Author)i.next();
               
    }
}
