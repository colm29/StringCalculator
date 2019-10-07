import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    StringCalculator calc = new StringCalculator();

    @Test
    void testEnsureNonNumericThrowsException() {
        assertThrows(NumberFormatException.class, () -> calc.Add("l,4"));
    }

    @Test
    void testAdditionWorks() {
        assertTrue(calc.Add("1,8") == 9);
    }

    @Test
    void testEmptyReturnsZero() {
        assertTrue(calc.Add("") == 0);
    }

//    @Test
//    void testNumberCountNotGreaterThanTwo() {
//        assertThrows(IllegalArgumentException.class, () -> calc.Add("2,4,6"));
//    }


    @Test
    void testMoreThanTwoElementsAllowed() {
        assertTrue(calc.Add("3,4,9") == 16);
    }

    @Test
    void testNewLinesInsteadOfCommasAllowed() {
        assertTrue(calc.Add("3\n6,8") == 17);
    }

    @Test
    void testNegativeThrowsException() {
        assertThrows(RuntimeException.class, () -> calc.Add("3,-4,10"), "Negatives not allowed");
    }

    @Test
    void testIgnoreGreaterThanOneThousand() {
        assertTrue(calc.Add("4,1,1500") == 5);
    }
}