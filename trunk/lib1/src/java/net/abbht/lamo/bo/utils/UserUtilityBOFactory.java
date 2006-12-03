/*
 * UserUtilityBOFactory.java
 *
 * Created on October 29, 2006, 2:40 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.abbht.lamo.bo.utils;

import net.abbht.lamo.utils.SpringFactory;

/**
 *
 * @author home
 */
public class UserUtilityBOFactory {
    
    /** Creates a new instance of UserUtilityBOFactory */
    private UserUtilityBOFactory() {
    }
    
    public static UserUtilityBO newInstance() {
        return (UserUtilityBO) SpringFactory.instance().getBean("userUtilityBO");

    }
}
