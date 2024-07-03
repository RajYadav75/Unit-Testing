package in.raj;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {
    @ParameterizedTest
    @ValueSource(strings = {"liril", "madam", "racecar", "ashok"})
    public void testIsPalindrome(String str) {

        Palindrome pc = new Palindrome();
        boolean actual = pc.isPalidrome(str);

        assertTrue(actual);
    }

}
