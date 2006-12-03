/*
 * ItemBOFactory.java
 *
 * Created on October 14, 2006, 11:33 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.abbht.lamo.bo.items;

import net.abbht.lamo.utils.SpringFactory;



/**
 *
 * @author home
 */
public class ItemBOFactory {
    
    /** Creates a new instance of ItemBOFactory */
    private ItemBOFactory() {
    }
    
    public static ItemsBO newInstance() {
        return (ItemsBO) SpringFactory.instance().getBean("itemsBO");

    }
}
