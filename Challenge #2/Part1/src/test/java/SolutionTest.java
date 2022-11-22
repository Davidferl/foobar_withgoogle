import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    public void testSplit() {
        String tosplit = "0";
        String[] answer = tosplit.split(",");

        assertArrayEquals(new String[]{"0"}, answer);
    }


    @Test
    public void testIndexOf() {
        String myStr = "Hello, planet, earth, you, are, a, great, planet.";
        String[] arrayStr = myStr.split(",");
        ArrayList<String> listStr = new ArrayList<>(Arrays.asList(arrayStr));

        System.out.println(listStr.indexOf(" earth"));

        listStr.add(2, "hello");

        System.out.println(listStr.get(2));
        System.out.println(listStr.get(3));
        System.out.println(listStr.size());
    }

    @Test
    public void testMajors() {
        String[] answer = Solution.solution(new String[]{"4", "3", "2", "0", "1"});

        assertArrayEquals(new String[]{"0", "1", "2", "3", "4"}, answer);
    }

    @Test
    public void testMinors() {
        String[] answer = Solution.solution(new String[]{"4.1", "3", "3.3", "0.1", "3.1", "3.2", "2"});

        assertArrayEquals(new String[]{"0.1", "2", "3", "3.1", "3.2", "3.3", "4.1"}, answer);
    }

    @Test
    public void testVersions() {
        String[] answer = Solution.solution(new String[]{"1.1.2", "1.0", "1.3.3", "1.0.12", "1.0.2"});

        assertArrayEquals(new String[]{"1.0", "1.0.2", "1.0.12", "1.1.2", "1.3.3"}, answer);
    }

    @Test
    public void testVersions2() {
        String[] answer = Solution.solution(new String[]{"1.12","1.11", "3", "2.0.0", "1.2","3.2.3", "0.1.0","3.2.1", "2", "0.1","1.0.2", "0", "1.2.1", "1.1.1","3.2.2", "2.0", "1.1.0", "3.2.0", "1.13.0","3.1.19","3.3"});

        assertArrayEquals(new String[]{"0", "0.1", "0.1.0", "1.0.2" ,"1.1.0","1.1.1","1.2","1.2.1","1.11","1.12","1.13.0","2","2.0","2.0.0", "3","3.1.19", "3.2.0","3.2.1","3.2.2","3.2.3", "3.3"}, answer);

    }
}


