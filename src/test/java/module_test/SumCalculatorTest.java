package module_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    private SumCalculator calculator;

    @BeforeEach
    void beforeEach() {
        calculator = new SumCalculator();
    }

    @Test
    void testThatSumCalculatorWorksOkFor1() {
        int actual = calculator.sum(1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testThatSumCalculatorWorksOkFor3() {
        int actual = calculator.sum(3);
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testThatSumCalculatorThrowExceptionFor0() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
    }

}