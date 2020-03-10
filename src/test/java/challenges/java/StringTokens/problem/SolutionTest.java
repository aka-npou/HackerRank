package challenges.java.StringTokens.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void printTokens0() {
        String actual = Solution.getStringTokens("He is a very very good boy, isn't he?");
        String expected = "10\n" +
                "He\n" +
                "is\n" +
                "a\n" +
                "very\n" +
                "very\n" +
                "good\n" +
                "boy\n" +
                "isn\n" +
                "t\n" +
                "he";
        assertEquals(actual, expected);
    }

    @Test
    void printTokens10() {
        String actual = Solution.getStringTokens("                a                    ");
        String expected = "1\n" +
                "a";
        assertEquals(actual, expected);
    }

    @Test
    void printTokens9() {
        String actual = Solution.getStringTokens("");
        String expected = "0";
        assertEquals(actual, expected);
    }
}