import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    StringCalculator calc = new StringCalculator();

    @Test
    void testAdditionWorks() {
        assertTrue(calc.Add("1,8") == 9);
    }

    @Test
    void testEmptyReturnsZero() {
        assertTrue(calc.Add("") == 0);
    }

    @Test
    void testNumberCountNotGreaterThanTwo() {
        assertThrows(IllegalArgumentException.class, () -> calc.Add("2,4,6"));
    }
}