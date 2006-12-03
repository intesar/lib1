/*
 * UserUtilityBOImpl.java
 *
 * Created on October 29, 2006, 2:41 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.abbht.lamo.bo.utils;

import java.sql.Date;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import net.abbht.lamo.bo.users.UsersBOFactory;
import net.abbht.lamo.facades.loans.LoanFacade;
import net.abbht.lamo.facades.loans.PaymentFacade;
import net.abbht.lamo.persistence.loans.Loan;
import net.abbht.lamo.persistence.loans.Payment;
import net.abbht.lamo.persistence.users.User;

/**
 *
 * @author home
 */
public class UserUtilityBOImpl implements UserUtilityBO {
    private PaymentFacade paymentFacade;
    private LoanFacade loanFacade;
    
    /** Creates a new instance of UserUtilityBOImpl */
    public UserUtilityBOImpl() {
    }

    public int getFine(String username) throws Exception {
        return UsersBOFactory.newInstance().findByUsername(username).getTotalduedays();
    }

    public int payFine(String username, int amt, int daysFor, String description, String staff) throws Exception {
      
        User user = UsersBOFactory.newInstance().findByUsername(username);
        int pDays = user.getTotalduedays();
        user.setTotalduedays(pDays-daysFor);      
        
        Payment payment = new Payment();
        payment.setDate(new Date(Calendar.getInstance().getTimeInMillis()));
        payment.setDaysfor(daysFor );
        payment.setDescrib(description);
        payment.setFine(amt);
        payment.setPaidto(staff);
        payment.setUsername(username);
        paymentFacade.savePayment(payment);
        UsersBOFactory.newInstance().updateUser(user);
        
        
        
        return pDays-daysFor;
        
    }

    public void removeUserHoldOnBook(String username, String itemNo) throws Exception {
        List list = this.loanFacade.findByUserName(username);
        Iterator iter = list.iterator();
        while ( iter.hasNext() ) {
            Loan loan = (Loan) iter.next();
            if ( loan.getUsername().equalsIgnoreCase(username) && 
                    loan.getItemid().equalsIgnoreCase(itemNo) )
                loanFacade.deleteLoanRecord(loan);
        }
    }

    public void setPaymentFacade(PaymentFacade paymentFacade) {
        this.paymentFacade = paymentFacade;
    }

    public void setLoanFacade(LoanFacade loanFacade) {
        this.loanFacade = loanFacade;
    }
    
}
