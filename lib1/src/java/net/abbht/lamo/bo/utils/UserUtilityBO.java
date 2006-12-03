/*
 * UserUtilityBO.java
 *
 * Created on October 29, 2006, 2:37 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.abbht.lamo.bo.utils;

/**
 *
 * @author home
 */
public interface UserUtilityBO {
    
    int getFine(String username) throws Exception;
    
    int payFine(String username, int amt, int daysFor, String description, String staff) throws Exception;
    
    void removeUserHoldOnBook(String username, String itemNo) throws Exception;
}
