
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator c = new Calculator();

    @Test
    public void add() {
        int result = c.add(5,3);
        assertEquals(8,result);
    }

    @Test
    public void sqRoot() {
        double number = 9.0;
        double expectedResult = 3.0;
        double delta = 0.0001; // acceptable error margin

        assertEquals(expectedResult, c.sqRoot(number), delta);

         number = 0.0;
         expectedResult = 0.0;
         delta = 0.0001; // acceptable error margin

        assertEquals(expectedResult, Calculator.sqRoot(number), delta);

         number = -9.0;
        // Square root of a negative number should throw an exception
        try {
            Calculator.sqRoot(number);
        } catch (IllegalArgumentException e) {
            assertEquals("Square root of a negative number is undefined", e.getMessage());
        }
    }

    @Test
    public void factorial() {
        int number = 0;
        int expectedResult = 1;

        assertEquals(expectedResult, Calculator.factorial(number));

         number = 5;
         expectedResult = 120;

        assertEquals(expectedResult, Calculator.factorial(number));

        number = -5;
        try {
            Calculator.factorial(number);
        } catch (IllegalArgumentException e) {
            assertEquals("Factorial of a negative number is undefined", e.getMessage());
        }
    }

    @Test
    public void naturalLog() {
        double number = 1.0;
        double expectedResult = 0.0;
        double delta = 0.0001; // acceptable error margin

        assertEquals(expectedResult, Calculator.naturalLog(number), delta);

         number = Math.E; // e, approximately 2.71828
         expectedResult = 1.0;
         delta = 0.0001; // acceptable error margin

        assertEquals(expectedResult, Calculator.naturalLog(number), delta);

        number = -5.0;

        try {
            Calculator.naturalLog(number);
        } catch (IllegalArgumentException e) {
            assertEquals("Natural logarithm is undefined for non-positive numbers", e.getMessage());
        }



        number = 0.0;

        try {
            Calculator.naturalLog(number);
        } catch (IllegalArgumentException e) {
            assertEquals("Natural logarithm is undefined for non-positive numbers", e.getMessage());
        }
    }

    @Test
    public void power() {
        double base = 2.0;
        double exponent = 3.0;
        double expectedResult = 8.0;
        double delta = 0.0001; // acceptable error margin

        assertEquals(expectedResult,Calculator.power(base, exponent), delta);

        base = 5.0;
         exponent = 0.0;
         expectedResult = 1.0;

        assertEquals(expectedResult, Calculator.power(base, exponent), 0);

        base = 3.0;
         exponent = -2.0;
         expectedResult = 1.0 / 9.0;
         delta = 0.0001; // acceptable error margin

        assertEquals(expectedResult, Calculator.power(base, exponent), delta);

        base = 4.0;
         exponent = 0.5;
         expectedResult = 2.0;
         delta = 0.0001; // acceptable error margin

        assertEquals(expectedResult, Calculator.power(base, exponent), delta);

        base = -4.0;
         exponent = 0.5;

        try {
            Calculator.power(base,exponent);
        } catch (IllegalArgumentException e) {
            assertEquals("Cannot raise negative base to a non-integer exponent", e.getMessage());
        }

    }


}
