import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SolutionTest {

    @Test
    public void test1() {
        assertEquals(1, Solution.solution("1221", 10));
    }

    @Test
    public void test2() {
        assertEquals(3, Solution.solution("210022", 3));
    }

    @Test
    public void testConvertToBaseTen() {
        List<String> toConvert = new ArrayList<>();
        toConvert.add("2");
        toConvert.add("1");
        toConvert.add("0");


        int result = Solution.convertNumberToBaseTen(toConvert, 10);

        System.out.println(result);
    }

    @Test
    public void testBaseTenToOtherBase() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(1);
        expected.add(0);

        List<String> actual = Solution.convertBaseTenToOtherBase(21, 10, 3);

        System.out.println(actual);
    }
}
