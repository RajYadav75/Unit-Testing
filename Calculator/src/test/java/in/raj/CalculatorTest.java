package in.raj;

import static junit.framework.Assert.assertEquals;
import org.junit.jupiter.api.Test;
public class CalculatorTest {

    @Test
    public void testAdd(){
        Calculator c = new Calculator();
        int actualResult = c.add(1, 2);
        int expectedResult = 3;
        assertEquals(expectedResult,actualResult);
    }
    @Test 
    public void testMultiply(){
        Calculator c = new Calculator();
        int actual = c.mul(2, 2);
        int expectedResult = 4;
        assertEquals(expectedResult,actual);
    }


}
