/*
 * ValidateRenew.java
 *
 * Created on October 30, 2006, 6:06 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.abbht.lamo.bo.loans;

import java.util.Date;

/**
 *
 * @author Mohammed Hamed
 */
public class ValidateRenew {
    private String ItemNo;
    /** Creates a new instance of ValidateRenew */
    public ValidateRenew(String ItemNo) {
        this.ItemNo=ItemNo;
    }
    
    public long getDueDays() throws Exception  {
        ValidateItem validateItem = new ValidateItem(ItemNo);
      
        
        //get allowed loan days
        int allowedDays = validateItem.getAllowedDays();
        if ( allowedDays <= 0 )
            throw new Exception("Days to Loan is less than 1 ");
        //creating dates
        long time = new java.util.Date().getTime();
        long oneDay = 24*60*60*1000;
        return time +  oneDay * allowedDays;
      
    }    
}
