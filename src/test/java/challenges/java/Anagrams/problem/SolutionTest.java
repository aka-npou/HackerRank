package challenges.java.Anagrams.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isAnagram1() {
        boolean actual = Solution.isAnagram("anagramm", "marganaa");
        boolean expected = false;
        assertEquals(actual, expected);
    }

    @Test
    void isAnagram2() {
        boolean actual = Solution.isAnagram("Hello", "hello");
        boolean expected = true;
        assertEquals(actual, expected);
    }
}