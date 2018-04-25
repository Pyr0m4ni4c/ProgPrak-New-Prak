package prog.prak;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void calcArr() {
        assertArrayEquals(new int[]{3, 5, 7}, Calculator.calcArr(new int[]{1, 2, 3}, new int[]{2,3,4}, operators.A));
    }
}