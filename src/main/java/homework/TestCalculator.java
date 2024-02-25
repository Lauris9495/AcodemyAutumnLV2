package homework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {
    Calculator calculator = new Calculator();
    @Test

    public void testCalculator(){

        int sum = calculator.sum(2,3);

        Assert.assertEquals(sum,5);


    }
    @Test
    public void testCalculatorDalisana(){

        double dalisana = calculator.dalisana(6,2);

        Assert.assertEquals(dalisana,3);
    }
    @Test
    public void testCalculatorReizinasana(){

        int reizinasana = calculator.reizinasana(2,3);

        Assert.assertEquals(reizinasana,6);
    }

    @Test
    public void testCalculatorAtnemsana(){

        int atnemsana = calculator.atnemsana(6,3);

        Assert.assertEquals(atnemsana,3);
    }
}
