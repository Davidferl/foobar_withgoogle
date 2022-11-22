import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    public void testSolution() {

        int number = 15324;
        int[] answer = Solution.solution(number);

        assertArrayEquals(new int[]{15129, 169, 25, 1}, answer);
    }
}
