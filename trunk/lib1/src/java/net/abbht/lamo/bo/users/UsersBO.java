/*
 * UsersBO.java
 *
 * Created on October 14, 2006, 10:55 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.abbht.lamo.bo.users;

import net.abbht.lamo.facades.users.AddressFacade;
import net.abbht.lamo.facades.users.AuthorityFacade;
import net.abbht.lamo.facades.users.PhoneFacade;
import net.abbht.lamo.facades.users.UserFacade;
import net.abbht.lamo.facades.users.UserGroupFacade;
import net.abbht.lamo.persistence.users.Address;
import net.abbht.lamo.persistence.users.Authority;
import net.abbht.lamo.persistence.users.Phone;
import net.abbht.lamo.persistence.users.User;
import net.abbht.lamo.persistence.users.UserGroup;

/**
 *
 * @author home
 */
public interface UsersBO {
    
    void addAddress(Address address) throws Exception;
    
    void updateAddress(Address address) throws Exception;
    
    void addGroup(UserGroup userGroup) throws Exception;
    
    void updateGroup(UserGroup userGroup) throws Exception;

    void addPhone(Phone phone) throws Exception;
    
    void updatePhone(Phone phone) throws Exception;

    void addUser(User user) throws Exception;
    
    void updateUser(User user) throws Exception;

    void assignAuthorities( Authority[] authories) throws Exception;

    void removeAuthority( String username) throws Exception;

    void setStatus(String username, boolean status) throws Exception;    
    
    void resetPassword(String username) throws Exception;
    
    void changePassword(String username, String oldPasswor, String newPassword) throws Exception;
   
    User findByUsername(String username) throws Exception;
   
    UserGroup findUserGroup(String groupName) throws Exception;    
    
    public void setAddressFacade(AddressFacade addressFacade);

    public void setAuthorityFacade(AuthorityFacade authorityFacade);

    public void setPhoneFacade(PhoneFacade phoneFacade);

    public void setUserFacade(UserFacade userFacade);

    public void setUserGroupFacade(UserGroupFacade userGroupFacade);

}
