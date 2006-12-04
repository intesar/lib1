/*
 * LoanBOImpl.java
 *
 * Created on October 14, 2006, 10:56 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.abbht.lamo.bo.loans;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;
import net.abbht.lamo.facades.items.ItemGroupFacade;
import net.abbht.lamo.facades.loans.LoanFacade;
import net.abbht.lamo.facades.loans.RenewFacade;
import net.abbht.lamo.persistence.loans.Loan;

/**
 *
 * @author home
 */
public class LoanBOImpl implements LoanBO {
    
    private LoanFacade loanFacade;
    private RenewFacade renewFacade;
    private ItemGroupFacade itemGroupFacade;


    /** Creates a new instance of LoanBOImpl */
    public LoanBOImpl() {
    }
    
    public void issue(String username, String ItemNo, String staff) throws Exception {
        //validating user
        new ValidateUser(username).vaidateUser();
        
        //validating item
        ValidateItem validateItem = new ValidateItem(ItemNo);
        ValidateRenew validateRenew = new ValidateRenew(ItemNo);
        
        validateItem.validateItem();
        
        
        //get allowed loan days
       /* int allowedDays = validateItem.getAllowedDays();
        if ( allowedDays <= 0 )
            throw new Exception ("Days to Loan is less than 1 ");
        //creating dates
        
        long oneDay = 24*60*60*1000;
        long dueTime = time +  oneDay * allowedDays;*/

        //creating loan object and populating it
        long time = new java.util.Date().getTime();
        Date todayDate = new Date(time);
        Loan loan = new Loan();
        loan.setDuedate(new Date(validateRenew.getDueDays()));
        loan.setIssueby(staff);
        loan.setIssuedate(todayDate);
        loan.setItemid(ItemNo);
        loan.setUsername(username);
        this.loanFacade.saveLoan(loan); 
    }

 

    public void renew(String username, String ItemNo, String staff) throws Exception {
        //Loan loan = loanFacade.findByUserAndItem(username, ItemNo);
        //loan.set
        
        List itemList =  loanFacade.findByItemId(ItemNo);
        
        ValidateRenew vr = new ValidateRenew(ItemNo);
        Iterator iter = itemList.iterator();
        while(iter.hasNext())
        {
            Loan loan =(Loan)iter.next();
            //itemGroupFacade.findByGroupName(loan.g)
          if (loan.getIsreturned()==false){
              if(loan.getNoofrenews() ==0 )
                   throw new Exception("Limit of Renews became zero");
             loan.setDuedate(new Date(vr.getDueDays()));
             loan.setNoofrenews(loan.getNoofrenews()-1);
             loan.setIssueby(staff);
             this.loanFacade.saveLoan(loan);
             
          }
        }
      
    }   
    public void renew(String userName ,String ItemNo) throws Exception {
        
        //todo
        List itemList = loanFacade.findByItemId(ItemNo);
        ValidateRenew vr = new ValidateRenew(ItemNo);
        Iterator iter = itemList.iterator();
        
        
        
        
     
        
        
    }
        
    public void returnItem (String ItemNo, String staff ) throws Exception {
        //todo
    }

    public void setLoanFacade(LoanFacade loanFacade) {
        this.loanFacade = loanFacade;
    }

    public void setRenewFacade(RenewFacade renewFacade) {
        this.renewFacade = renewFacade;
    }
    public void setItemGroupFacade(ItemGroupFacade itemGroupFacade) {
this.itemGroupFacade = itemGroupFacade;
}

    
    

 
    
    
}
