/*
 * SpringFactory.java
 *
 * Created on October 14, 2006, 11:48 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.abbht.lamo.utils;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author home
 */
public class SpringFactory {
    static {
            
        Resource res = new FileSystemResource("SpringBeansFile.xml");
        factory = new XmlBeanFactory(res);

    }
    private static BeanFactory factory;
    //private static final SpringFactory instance = new SpringFactory();
    /** Creates a new instance of SpringFactory */
    private SpringFactory() {

    }
    
    public static BeanFactory instance() {
        return factory;
    }
}
