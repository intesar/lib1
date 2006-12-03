/*
 * ValidateItem.java
 *
 * Created on October 27, 2006, 11:22 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.abbht.lamo.bo.loans;

import net.abbht.lamo.bo.items.ItemBOFactory;
import net.abbht.lamo.bo.items.ItemsBO;
import net.abbht.lamo.persistence.items.Item;
import net.abbht.lamo.persistence.items.ItemGroup;

/**
 *
 * @author home
 */
public class ValidateItem {
    private String itemNo;
    /** Creates a new instance of ValidateItem */
    public ValidateItem(String itemNo) {
        this.itemNo = itemNo;
    }
    public void validateItem() throws Exception  {
        try {
            isAvailable();
        } catch (Exception ex) {
            throw new Exception("Item is already issued ");
        }
        try {
            isReference();
        } catch (Exception ex) {
            throw new Exception("Item is Reference Item cannot be Loaned ");
        }        
        
    }

    public void isAvailable() throws Exception {
        Item item = getItem();
        if (!"Avail".equals(item.getStatus()))
            throw new Exception();
        
    }

    private Item getItem() throws Exception {
        ItemsBO itemsBO = ItemBOFactory.newInstance();
        Item item = itemsBO.findByItemNo(itemNo);
        return item;
    }
    public int getAllowedDays() throws Exception {
        Item item = getItem();
        ItemGroup itemGroup = ItemBOFactory.newInstance().findItemGroup(item.getGroupname());
        return itemGroup.getNoofdays();
        
    }

    private void isReference() throws Exception {
        Item item = getItem();
        if ( item.getGroupname().equals("reference") )
           throw new Exception();

    }
    
}
