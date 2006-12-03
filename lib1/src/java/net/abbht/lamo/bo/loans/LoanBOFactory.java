/*
 * LoanBOFactory.java
 *
 * Created on October 14, 2006, 11:51 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package net.abbht.lamo.bo.loans;

import net.abbht.lamo.bo.items.ItemsBO;
import net.abbht.lamo.utils.SpringFactory;

/**
 *
 * @author home
 */
public class LoanBOFactory {
    
    /** Creates a new instance of LoanBOFactory */
    private LoanBOFactory() {
    }
    
    public static LoanBO newInstance() {
        return (LoanBO) SpringFactory.instance().getBean("loanBO");

    }    
}
