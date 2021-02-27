package test.com.sultana.assignment4;

import main.com.sultana.assignment4.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class PalindromeTest {
    @Test
    public void testForLoop() {
        Palindrome palindrome = new Palindrome();
        //palindrome.getReverse();
        boolean isOdd = palindrome.isOdd(100);
        assertFalse(isOdd);
        isOdd = palindrome.isOdd(99);
        assertTrue(isOdd);

    }
}
