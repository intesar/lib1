/*
 * ItemsBO.java
 *
 * Created on October 14, 2006, 10:45 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.abbht.lamo.bo.items;

import java.util.List;
import net.abbht.lamo.facades.items.AuthorFacade;
import net.abbht.lamo.facades.items.ItemFacade;
import net.abbht.lamo.facades.items.ItemGroupFacade;
import net.abbht.lamo.persistence.items.Author;
import net.abbht.lamo.persistence.items.Item;
import net.abbht.lamo.persistence.items.ItemGroup;
import net.abbht.lamo.persistence.items.ItemTypes;

/**
 *
 * @author home
 */
public interface ItemsBO {
    void addItem(Item item) throws Exception;
    
    void addAuthors(Author[] authors) throws Exception;

    void editItem(Item item) throws Exception;
    
    void addItemGroup(ItemGroup itemGroup) throws Exception;

    void addEditItemType(ItemTypes itemType) throws Exception;
    
    void assignGroup(String itemNo, String groupNo) throws Exception;

    List getItemGroups() throws Exception;

    void setStatus(String itemNo, String status) throws Exception;
    
    Item findByItemNo(String itemNo) throws Exception;
    
    ItemGroup findItemGroup(String groupName) throws Exception;
    
    void setItemFacade(ItemFacade itemFacade);

    void setItemGroupFacade(ItemGroupFacade itemGroupFacade);

    void setAuthorFacade(AuthorFacade authorFacade);
       
    
    
    
    
}
