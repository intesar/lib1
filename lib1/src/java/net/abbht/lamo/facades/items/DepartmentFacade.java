package net.abbht.lamo.facades.items;

import java.util.Iterator;
import net.abbht.lamo.persistence.items.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *  @netbeans.hibernate.facade beanClass=net.abbht.lamo.persistence.items.Department
 */
public class DepartmentFacade { 
    public void saveDepartment(Department department) {
        Session session = net.abbht.lamo.utils.HibernateUtil.currentSession();
        Transaction tx = session.beginTransaction();
        session.save(department);
        tx.commit();
        net.abbht.lamo.utils.HibernateUtil.closeSession();
    }
    
    public Department findByPrimaryKey(Object key)
    {
        return this.findByPrimaryKey(key);
    }
    
    public Department findByDepartmentName(String deptname)
    {
         String sql = "from Author p where p.deptname=" + deptname;
        Iterator i = net.abbht.lamo.utils.HibernateUtil.currentSession().createQuery(sql).iterate();
        return (Department)i.next();
    }
    
    
    
}
