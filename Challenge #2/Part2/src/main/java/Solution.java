import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static int solution(String Id, int base) {
        int output = 0;
        List<Integer> values = new ArrayList<>();

        while (true) {
            int currentId = Integer.parseInt(findNextId(Id, base));

            if (values.contains(currentId)) {
                int indexOfCurrentId = values.indexOf(currentId);
                output = values.size() - indexOfCurrentId;
                break;
            }
            values.add(currentId);
            Id = String.valueOf(currentId);
            output += 1;
        }

        return output;
    }

    public static String findNextId(String Id, int base) {
        List<String> ascStrNumbers = Arrays.asList(Id.split(""));
        List<String> descStrNumbers = Arrays.asList(Id.split(""));

        Collections.sort(ascStrNumbers);
        descStrNumbers.sort(Collections.reverseOrder());

        List<String> diff = findDiff(descStrNumbers, ascStrNumbers, base);

        return String.join("", diff);
    }

    public static List<String> findDiff(List<String> descNumber, List<String> ascNumber, int base) {
        int descNumberBaseTen = convertNumberToBaseTen(descNumber, base);
        int ascNumberBaseTen = convertNumberToBaseTen(ascNumber, base);

        int z = descNumberBaseTen - ascNumberBaseTen;

        return convertBaseTenToOtherBase(z, base, descNumber.size());
    }

    public static int convertNumberToBaseTen(List<String> number, int base) {
        int resultBaseTen = 0;

        for (int i = 0; i < number.size(); i++) {
            int currentDigit = Integer.parseInt(number.get(i));
            resultBaseTen += Math.pow(base, number.size() - 1 - i) * currentDigit;
        }

        return resultBaseTen;
    }

    public static List<String> convertBaseTenToOtherBase(int number, int base, int maxLength) {
        List<String> output = new ArrayList<>();

        double totalValue = 0;
        for (int i = 0; i < maxLength; i++) {
            int digit = 1;
            while (true) {
                double value = Math.pow(base, maxLength - 1 - i) * digit;

                if (totalValue + value > number) {
                    output.add(String.valueOf(digit - 1));
                    totalValue += Math.pow(base, maxLength - 1 - i) * (digit - 1);
                    break;
                }
                digit += 1;
            }
        }
        return output;
    }
}
