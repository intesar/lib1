package main;

import csvvalidator.CsvValidator;
import csvvalidator.CsvValidatorImpl;
import csvvalidator.Field;
import csvvalidator.Type;
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

    public static void main(String[] args) {
        String inputFile = args[0];
        String specFile = args[1];

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
    private static List<Field> list = new ArrayList<Field>();
    private static String delimiter = "\\|";
    private static int lineNum = 0;

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
