import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int[] solution(int area) {
        List<Integer> squareNumbers = new ArrayList<>();

        while(area > 0) {
            int biggestSquareNumber = findBiggestSquareNumber(area);
            squareNumbers.add(biggestSquareNumber);
            area -= biggestSquareNumber;
        }

        return squareNumbers.stream().mapToInt(i -> i).toArray();
    }

    public static int findBiggestSquareNumber(int numberToCheck) {
        while (numberToCheck > 0) {
            if (isSquare(numberToCheck)) {
                return numberToCheck;
            } else {
                numberToCheck -= 1;
            }
        }
        return numberToCheck;
    }

    public static boolean isSquare(int numberToCheck) {
        return Math.sqrt(numberToCheck) % 1 == 0;
    }
}
