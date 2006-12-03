/*
 * LoanBO.java
 *
 * Created on October 14, 2006, 11:31 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.abbht.lamo.bo.loans;

import net.abbht.lamo.facades.items.ItemGroupFacade;
import net.abbht.lamo.facades.loans.LoanFacade;
import net.abbht.lamo.facades.loans.RenewFacade;

/**
 *
 * @author home
 */
public interface LoanBO {
    void issue(String username, String ItemNo, String staff) throws Exception;

  public void renew(String userName ,String ItemNo) throws Exception ;

    void renew(String username, String ItemNo, String staff) throws Exception;

    void returnItem(String ItemNo, String staff) throws Exception;

    void setLoanFacade(LoanFacade loanFacade);

    void setRenewFacade(RenewFacade renewFacade);
    
     public void setItemGroupFacade(ItemGroupFacade itemGroupFacade) ;
}
