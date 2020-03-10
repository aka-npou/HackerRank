package challenges.java.Substring.problem;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void main() {
        String actual = Solution.getSubString("Helloworld", 3, 7);
        String expected = "lowo";
        assertEquals(actual, expected);
    }
}