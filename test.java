import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class test {

    @Test
    public void testSumOfDigits() {
        assertEquals(9, main.calculateSumOfDigits(12345)); // 1+2+3+4+5 = 15 -> 1+5 = 6
        assertEquals(3, main.calculateSumOfDigits(987654321)); // 9+8+7+6+5+4+3+2+1 = 45 -> 4+5 = 9
    }
    @Test
    public void testSingleDigitInput() {
        assertEquals(5, main.calculateSumOfDigits(5));
    }
    @Test
    public void testTwoDigitInput() {
        assertEquals(3, main.calculateSumOfDigits(12)); // 1+2 = 3
    }
}