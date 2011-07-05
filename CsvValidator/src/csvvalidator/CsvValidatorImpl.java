package csvvalidator;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Intesar Mohammed
 */
public class CsvValidatorImpl implements CsvValidator {

    private String filename;
    private int noOfFields;
    private List<Field> list;
    private Map<Integer, Field> map = new HashMap<Integer, Field>();
    private String delimiter;
    private StringBuilder errors = new StringBuilder();
    private int count = 1;
    private int errorsInitialSize;
    private int totalErrors = 0;
    private boolean jobDone = false;
    private boolean success = false;

    public CsvValidatorImpl(String filename, List<Field> list, String delimiter) {
        this.filename = filename;
        this.noOfFields = list.size();
        this.list = list;
        this.delimiter = delimiter;
        errorsInitialSize = this.errors.length();
    }

    @Override
    public boolean isValid() {
        if (!jobDone) {
            getValidationDetails();
        }
        return this.success;
    }

    @Override
    public String getValidationDetails() {
        if (jobDone) {
            return this.errors.toString();
        }
        try {
            listToMap();
            FileInputStream fstream = new FileInputStream(filename);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                validateLine(strLine);
                count++;
            }
            in.close();
        } catch (Exception e) {
            this.errors.append("Error: ");
            this.errors.append(e.getMessage());
            this.errors.append("\n");
        }

        jobDone = true;

        if (this.errors.length() == errorsInitialSize) {
            this.success = true;

        }

        this.errors.append("Filename : ");
        this.errors.append(filename);
        this.errors.append("\n");
        this.errors.append("Total Lines # ");
        this.errors.append(count-1);
        this.errors.append("\n");
        this.errors.append("Total Errors # ");
        this.errors.append(totalErrors);
        return this.errors.toString();

    }

    private void validateLine(String line) {
        if (line == null) {
            this.errors.append("line ");
            this.errors.append(this.count);
            this.errors.append(" is empty ");
            this.errors.append("\n");
            totalErrors++;
        }
        String[] tokens = line.split(delimiter);
        if (tokens.length != noOfFields) {
            this.errors.append("line ");
            this.errors.append(this.count);
            this.errors.append(" is invalid, contains ");
            this.errors.append(tokens.length);
            this.errors.append(" required ");
            this.errors.append(this.noOfFields);
            this.errors.append(" fields ");
            this.errors.append("\n");
            totalErrors++;
        } else if (count == 1) {
            if (!isFirstLineHeader(tokens)) {
                Integer index = 1;
                for (String token : tokens) {
                    Field f = map.get(index);
                    handle(token, f);
                    index++;
                }
            }
        } else {
            // each field should be of given type
            Integer index = 1;
            for (String token : tokens) {
                Field f = map.get(index);
                handle(token, f);
                index++;
            }
        }
    }

    private boolean isFirstLineHeader(String[] tokens) {
        Integer index = 1;
        for (String t : tokens) {
            Field f = map.get(index);
            index++;
            if (t.equalsIgnoreCase(f.getName())) {
                return true;
            }
        }
        return false;
    }

    private void handle(String token, Field f) {
        try {
            // handle optional
            if (f.isIsOptional() && (token == null || token.trim().length() == 0)) {
                return;
            }

            if (token == null || token.trim().length() == 0) {
                throw new RuntimeException();
            }

            if (f.getType().equals(Type.NUMBER)) {
                checkRegex(f, token);
                Double.parseDouble(token);
            } else if (f.getType().equals(Type.TEXT)) {
                checkRegex(f, token);
            } else if (f.getType().equals(Type.DATE)) {
                if (f.getRegex() != null && f.getRegex().trim().length() > 0) {
                    DateFormat df = new SimpleDateFormat(f.getRegex());
                    df.parse(token);
                }
            }

        } catch (Exception ex) {
            this.errors.append("Invalid data ");
            this.errors.append("Line # ");
            this.errors.append(this.count);
            this.errors.append(" Required ");
            this.errors.append(f.getType());
            this.errors.append(" found '");
            this.errors.append(token);
            this.errors.append("'");
            this.errors.append(" for Column ");
            this.errors.append(f.getName() != null ? f.getName() : "" + f.getIndex());
            this.errors.append(" indexed at ");
            this.errors.append(f.getIndex());
            this.errors.append(" \n");
            totalErrors++;
        }
    }

    private void checkRegex(Field f, String token) throws RuntimeException {
        if (f.getRegex() != null && f.getRegex().trim().length() > 0) {
            Pattern p = Pattern.compile(f.getRegex());
            Matcher m = p.matcher(token);
            if (!m.matches()) {
                throw new RuntimeException();
            }
        }
    }

    private void listToMap() {
        Collections.sort(list);
        Set<Field> set = new HashSet<Field>(list);

        if (list.get(0).getIndex() != 1 || list.get(list.size() - 1).getIndex() != list.size()
                || set.size() < list.size()) {
            this.errors.append("Invalid indexes found if you have 10 fields your index starts from 0 to 9\n");
            this.errors.append("You need to correct these indexes before we can proceed. \n");
            this.errors.append("You supplied Field indexes - ");
            this.errors.append(list);
            totalErrors++;
        }


        for (Field f : list) {
            map.put(f.getIndex(), f);
        }
    }
}
