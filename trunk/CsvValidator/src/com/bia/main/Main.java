package com.bia.main;

import com.bia.csvvalidator.CsvValidator;
import com.bia.csvvalidator.CsvValidatorImpl;
import com.bia.csvvalidator.Field;
import com.bia.csvvalidator.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Intesar Mohammed
 * 
 *  Reference Integration code
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean optional = true;
        boolean notOptional = false;

        // List item holds information about each field.
        List<Field> list = new ArrayList<Field>();
        
        // Field represent each item which contains 4 elements 
        // element 1 --> name of field
        // element 2 --> type of the field
        // element 3 --> optional flag
        // element 4 --> regex if any
        
        list.add(new Field(1, Type.NUMBER, notOptional));
        list.add(new Field(2, Type.NUMBER, notOptional));
        list.add(new Field(3, Type.TEXT, notOptional));
        list.add(new Field(4, Type.TEXT, notOptional));
        list.add(new Field(5, Type.NUMBER, notOptional));
        list.add(new Field(6, "Purchase Date", Type.DATE, notOptional, "yyyy-MM-dd HH:mm:ss"));
        list.add(new Field(7, Type.NUMBER, notOptional));
        list.add(new Field(8, Type.NUMBER, notOptional));
        list.add(new Field(9, "Campaign ID", Type.TEXT, optional));
        list.add(new Field(10, "Promo Code", Type.TEXT, optional));
        list.add(new Field(11, Type.TEXT, notOptional));
        list.add(new Field(12, Type.NUMBER, optional));
        list.add(new Field(13, Type.NUMBER, optional));
        list.add(new Field(14, Type.TEXT, notOptional));

        // Instantiating Valiator
        CsvValidator validator1 = new CsvValidatorImpl("CPD_20110626120000_TO_20110627120000_20110627120000.txt", list, "\\|");

        // checking isValid
        if (!validator1.isValid()) {
            // printing to console if not valid
            // you can print this to email or log
            System.out.println(validator1.getValidationDetails());
        }

    }
}
