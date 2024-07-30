package unittesting;

import org.junit.jupiter.api.Test;
import testing.Calculator;

import static org.junit.jupiter.api.Assertions.*;

public class CalcTester {

    @Test
    public void test() throws Throwable {

        // throw new Throwable();
        int x = 1 + 1;

        // Assertion is a way to determine if a certain end result was achieved.
        assertEquals(2, x);
        assertTrue(x == 2);
    }

    @Test
    public void add() {

        int actual = Calculator.add(2, 3);
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void multiply() {

        int actual = Calculator.multiply(2, 3);
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void divideSuccess() {
        int actual = Calculator.divide(4, 2);
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void divideFailure() {
        assertThrows(ArithmeticException.class, () -> Calculator.divide(10, 0));
    }

    @Test
    public void isGreaterSuccess() {
        assertTrue(Calculator.isGreater(5, 2));
    }

    @Test
    public void isGreaterFailure() {
        assertFalse(Calculator.isGreater(2, 5));
    }

}