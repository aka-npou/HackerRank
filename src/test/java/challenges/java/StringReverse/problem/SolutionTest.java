package challenges.java.StringReverse.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isPalindromeTrue() {
        String actual = Solution.isPalindrome("madam");
        String expected = "Yes";
        assertEquals(actual, expected);
    }

    @Test
    void isPalindromeFalse() {
        String actual = Solution.isPalindrome("madam");
        String expected = "No";
        assertEquals(actual, expected);
    }
}