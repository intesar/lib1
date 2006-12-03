/*
 * UsersBOFactory.java
 *
 * Created on October 14, 2006, 11:52 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.abbht.lamo.bo.users;

import net.abbht.lamo.utils.SpringFactory;

/**
 *
 * @author home
 */
public class UsersBOFactory {
    
    /** Creates a new instance of UsersBOFactory */
    private UsersBOFactory() {
    }
    
    public static UsersBO newInstance() {
        return (UsersBO) SpringFactory.instance().getBean("usersBO");

    }
    
}
