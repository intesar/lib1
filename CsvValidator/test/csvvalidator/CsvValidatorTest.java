package csvvalidator;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Intesar Mohammed
 */
public class CsvValidatorTest {

    public CsvValidatorTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    private List<Field> list = new ArrayList<Field>();

    @Before
    public void setUp() {
        boolean optional = true;
        boolean notOptional = false;


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

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of isValid method, of class CsvValidatorImpl.
     */
    @Test
    public void testIsValidate() {
        validateAndPrint("CPD_20110626120000_TO_20110627120000_20110627120000.txt", true);
        validateAndPrint("CPD_20110626120000_TO_20110627120000_20110627120000_1.txt", false);
        validateAndPrint("CPD_20110626120000_TO_20110627120000_20110627120000_2.txt", true);
        validateAndPrint("CPD_20110626120000_TO_20110627120000_20110627120000_3.txt", false);
        validateAndPrint("CPD_20110626120000_TO_20110627120000_20110627120000_4.txt", false);
        validateAndPrint("CPD_20110626120000_TO_20110627120000_20110627120000_5.txt", false);
    }

    private void validateAndPrint(String filename, boolean isValid) {
        CsvValidatorImpl validator1 = new CsvValidatorImpl(filename, list, "\\|");
        assertEquals(isValid, validator1.isValid());
        System.out.println(validator1.getValidationDetails());
    }
}
