import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaxTest {

    @Test
    public void calculateTaxFor(){
           double expected = new VATaxType().calculateTaxFor(232002);
           double actual = 190241.63999999998;
        Assertions.assertEquals(expected,actual);
    }


    @Test
    public void calculateTaxFor_Not_Null(){
        double expected = new ProgressiveTaxType().calculateTaxFor(232002);
        Assertions.assertNotNull(expected);
    }

    @Test
    public void calculateTaxFor2(){
        double expected = new IncomeTaxType().calculateTaxFor(90000);
        double actual = 78300.0;
        Assertions.assertEquals(expected,actual);
    }


}
