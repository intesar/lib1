/*
 * UsersBOImpl.java
 *
 * Created on October 14, 2006, 10:45 AM
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
public class UsersBOImpl implements UsersBO {
    
    private AddressFacade addressFacade;
    private AuthorityFacade authorityFacade;
    private PhoneFacade phoneFacade;
    private UserFacade userFacade;
    private UserGroupFacade userGroupFacade;
    
    /** Creates a new instance of UsersBOImpl */
    public UsersBOImpl() {
    }
    
    public void addUser(User user) throws Exception {
        
        this.userFacade.saveUser(user);
    }

    public void setStatus(String username, boolean status) throws Exception {
        
     User user = this.userFacade.findByUserName(username);
     user.setEnabled(status);
     this.userFacade.saveUser(user);
    }
    
    public void assignAuthorities(Authority[] authories) throws Exception {
        
        for(int i =0;i<authories.length;i++)
        {
           this.authorityFacade.saveAuthority(authories[i]);
        }
        
    }
    
    public void removeAuthority( String username) throws Exception {
        
         this.authorityFacade.removeAuthorities(username);
        
    }
    
    public void addGroup(UserGroup userGroup) throws Exception {
        
        this.userGroupFacade.saveUserGroup(userGroup);
    }
    
    public void updateGroup(UserGroup userGroup) throws Exception {
        
        this.userGroupFacade.updateUserGroup(userGroup);
    }
    
    public void addAddress( Address address) throws Exception {
        
        this.addressFacade.saveAddress(address);
    }
    
    public void updateAddress(Address address) throws Exception {
        this.addressFacade.updateAddress(address);
    }

    public void updatePhone(Phone phone) throws Exception {
        this.phoneFacade.updatePhone(phone);
    }

    
    public void addPhone( Phone phone ) throws Exception {
        
        this.phoneFacade.savePhone(phone);
        
    }
    
    public void resetPassword(String username) throws Exception {
         User user= this.userFacade.findByUserName(username);
         user.setPassword(username);
         this.userFacade.saveUser(user);
         
    }

    public void changePassword(String username, String oldPassword, String newPassword) throws Exception {
     User user = this.userFacade.findByUserName(username);
     if(user.getPassword().equals(oldPassword))
     {
         user.setPassword(newPassword);
     }
     this.userFacade.saveUser(user);
    }

    public User findByUsername(String username) throws Exception {
        return this.userFacade.findByUserName(username);
    }

    public UserGroup findUserGroup(String groupName) throws Exception {
        return this.userGroupFacade.findByGroupName(groupName);
    }

    public void updateUser(User user) throws Exception {
        this.userFacade.saveOrUpdateUser(user);
    }
        

    public void setAddressFacade(AddressFacade addressFacade) {
        this.addressFacade = addressFacade;
    }

    public void setAuthorityFacade(AuthorityFacade authorityFacade) {
        this.authorityFacade = authorityFacade;
    }

    public void setPhoneFacade(PhoneFacade phoneFacade) {
        this.phoneFacade = phoneFacade;
    }

    public void setUserFacade(UserFacade userFacade) {
        this.userFacade = userFacade;
    }

    public void setUserGroupFacade(UserGroupFacade userGroupFacade) {
        this.userGroupFacade = userGroupFacade;
    }

 
}
