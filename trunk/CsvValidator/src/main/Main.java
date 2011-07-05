package main;

import csvvalidator.CsvValidator;
import csvvalidator.CsvValidatorImpl;
import csvvalidator.Field;
import csvvalidator.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Intesar Mohammed
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean optional = true;
        boolean notOptional = false;

        List<Field> list = new ArrayList<Field>();
        
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

        CsvValidator validator1 = new CsvValidatorImpl("CPD_20110626120000_TO_20110627120000_20110627120000.txt", list, "\\|");


        if (!validator1.isValid()) {
            System.out.println(validator1.getValidationDetails());
        }

    }
}
