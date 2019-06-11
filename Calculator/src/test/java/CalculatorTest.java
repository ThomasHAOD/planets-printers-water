import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {




    @Test
    public void adds(){
        Calculator calculator = new Calculator();
        assertEquals(16.5, calculator.add(5.5, 11.0));
    }

    @Test
    public void subtracts(){
        Calculator calculator = new Calculator();
        assertEquals(55.0, calculator.subtract(58.4, 3.4));
    }

    @Test
    public void multiplies(){
        Calculator calculator = new Calculator();
        assertEquals(55.0, calculator.multiply(10.0, 5.5));
    }
    @Test
    public void divides(){
        Calculator calculator = new Calculator();
        assertEquals(3.0, calculator.divide(12, 4.0));
    }

}
