/*
 * ItemsBO.java
 *
 * Created on October 14, 2006, 10:36 AM
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
import net.abbht.lamo.facades.items.ItemTypesFacade;

/**
 *
 * @author home
 */
public class ItemsBOImpl implements ItemsBO {
    private ItemFacade itemFacade;
    private ItemGroupFacade itemGroupFacade;
    private AuthorFacade authorFacade;
    private ItemTypesFacade itemTypesFacade;
    
    /** Creates a new instance of ItemsBO */
    public ItemsBOImpl() {
    }
    
    public void addItem(Item item ) throws Exception {
        //add item to facade
        itemFacade.saveItem(item);
    }
    
    public void addAuthors(Author[] authors ) throws Exception {
        for(int i =0; i <authors.length;i++)
        {
            authorFacade.saveAuthor(authors[i]);
        }        
   
    }
    public void addItemGroup(ItemGroup itemGroup) throws Exception {
        //add item group to itemgroupfacade
        this.itemGroupFacade.saveItemGroup(itemGroup);
    }
    
    public void setStatus(String itemNo, String status) throws Exception {
        //todo
      Item item = this.itemFacade.findByItemNo(itemNo);
      item.setStatus(status);
      this.itemFacade.saveItem(item);
       
    }
    
    public void assignGroup(String itemNo, String groupName) throws Exception  {
        //todo
         Item item = this.itemFacade.findByItemNo(itemNo);
         item.setGroupname(groupName);
         this.itemFacade.saveItem(item);
    }
    
    public List getItemGroups() throws Exception { 
        //todo
    return this.itemGroupFacade.findAll();  
    }

    public void editItem(Item item) throws Exception {
      this.itemFacade.saveItem(item);
        
    }
    
    public Item findByItemNo(String itemNo) throws Exception {
        return this.itemFacade.findByItemNo(itemNo);
    }
    
    public ItemGroup findItemGroup(String groupName) throws Exception {
        return this.itemGroupFacade.findByGroupName(groupName);
    }

    public void addEditItemType(ItemTypes itemType) throws Exception {
        this.itemTypesFacade.saveItemTypes(itemType);
    }

    public void setItemFacade(ItemFacade itemFacade) {
        this.itemFacade = itemFacade;
    }

    public void setItemGroupFacade(ItemGroupFacade itemGroupFacade) {
        this.itemGroupFacade = itemGroupFacade;
    }

    public void setAuthorFacade(AuthorFacade authorFacade) {
        this.authorFacade = authorFacade;
    }

    public void setItemTypesFacade(ItemTypesFacade itemTypesFacade) {
        this.itemTypesFacade = itemTypesFacade;
    }


}
