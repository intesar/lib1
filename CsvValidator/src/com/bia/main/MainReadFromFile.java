package com.bia.main;

import com.bia.csvvalidator.CsvValidator;
import com.bia.csvvalidator.CsvValidatorImpl;
import com.bia.csvvalidator.Field;
import com.bia.csvvalidator.Type;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Intesar Mohammed
 */
public class MainReadFromFile {

    private static List<Field> list = new ArrayList<Field>();
    private static String delimiter = "\\|";
    private static int lineNum = 0;

    public static void main(String[] args) {
        String inputFile = args[0];
        String specFile = args[1];
        boolean isValidInput = true;
        if ( inputFile == null || inputFile.length() == 0 ) {
            System.out.println ("First argument cannot be null and is the csv file name");
            isValidInput = false;
        }
        if ( specFile == null || specFile.length() == 0 ) {
            System.out.println ("Second argument cannot be null and is the spec file name");
            isValidInput = false;
        }
        
        if ( !isValidInput) {
            System.out.println ( " Stopping validation..");
            return;
        }
        try {
            FileInputStream fstream = new FileInputStream(specFile);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                handleLine(strLine);
                lineNum++;
            }
            in.close();
            CsvValidator validator1 = new CsvValidatorImpl(inputFile, list, delimiter);

            validator1.isValid();
            System.out.println(validator1.getValidationDetails());


        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }

    private static void handleLine(String line) {
        if (lineNum == 0) {
            delimiter = line.length() > 0 ? line : ",";
            return;
        }
        String[] tokens = line.split(",");
        String field = (tokens.length > 0 && tokens[0].length() > 0) ? tokens[0] : "Field-" + lineNum;
        Type type = Type.get((tokens.length > 1 && tokens[1].length() > 0) ? tokens[1] : "n");
        boolean optional = ((tokens.length > 2 && tokens[2].length() > 0 && tokens[2].equalsIgnoreCase("r"))) ? false : true;
        String regex = (tokens.length > 3 && tokens[3].length() > 0) ? tokens[3] : "";
        list.add(new Field(lineNum, field, type, optional, regex));
    }
}
