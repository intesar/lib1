/*
 * ValidateUser.java
 *
 * Created on October 27, 2006, 10:49 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.abbht.lamo.bo.loans;

import java.util.Iterator;
import java.util.List;
import net.abbht.lamo.bo.users.UsersBO;
import net.abbht.lamo.bo.users.UsersBOFactory;
import net.abbht.lamo.facades.loans.LoanFacade;
import net.abbht.lamo.persistence.loans.Loan;
import net.abbht.lamo.persistence.users.User;
import net.abbht.lamo.persistence.users.UserGroup;

/**
 *
 * @author home
 */
class ValidateUser {
    private final String username;
    /** Creates a new instance of ValidateUser */
    public ValidateUser(final String username) {
        this.username = username;
    }

    public void vaidateUser() throws Exception, Exception {
        if (! this.findUser().getEnabled() )
            throw new Exception("User is Blocked");
        int allowedBooks = allowedBooks();
        int borrowedBooks = 0;
        List list = new LoanFacade().findByUserName(username);
        Iterator iterator = list.iterator();
        while ( iterator.hasNext() ) 
            if (! ((Loan)iterator.next()).getIsreturned() ) 
                borrowedBooks++;
        if ( allowedBooks <= borrowedBooks )
            throw new Exception("Exceeded Maximum Borrowing Limit");
    }

    private int allowedBooks() throws Exception {
        User user = findUser();
        String groupName = user.getGroupname();
        return this.findMaxAllowedBooks(groupName);
    }
    
    private User findUser() throws Exception {
        UsersBO usersBO = UsersBOFactory.newInstance();
        return usersBO.findByUsername(username);
    }
    
    private int findMaxAllowedBooks(String groupName) throws Exception {
        UsersBO usersBO = UsersBOFactory.newInstance();
        UserGroup userGroup = usersBO.findUserGroup(groupName);
        return userGroup.getMaxnoofbooks().intValue();

    }    
}
