import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void canAdd(){
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.canAdd(2, 3));
    }

    @Test
    public void canSubtract(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.canSubtract(4, 2));
    }

    @Test
    public void canMultiply(){
        Calculator calculator = new Calculator();
        assertEquals(9, calculator.canMultiply(3, 3));
    }

    @Test
    public void canDivide(){
        Calculator calculator = new Calculator();
        assertEquals(5.00, calculator.canDivide(10.00, 2.00), 0.01);
    }

}
