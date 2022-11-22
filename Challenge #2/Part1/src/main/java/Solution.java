import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static String[] solution(String[] l) {
        List<String> orderedVersionNumbers = new ArrayList<>();
        List<String> unorderedVersionNumbers = new ArrayList<>(Arrays.asList(l));

        for(String versionNumberToAppend : unorderedVersionNumbers) {
            orderedVersionNumbers = orderer(orderedVersionNumbers, versionNumberToAppend);
        }

        return orderedVersionNumbers.toArray(new String[0]);
    }

    public static List<String> orderer(List<String> versionNumbers, String versionNumberToAppend) {

        String[] splittedVersionNumberToAppend = versionNumberToAppend.split("\\.");

        if (versionNumbers.size() == 0) {
            versionNumbers.add(versionNumberToAppend);
            return versionNumbers;
        }

        for (String versionNumber : versionNumbers) {
            String[] splittedVersionNumber = versionNumber.split("\\.");

            if (Integer.parseInt(splittedVersionNumberToAppend[0]) < Integer.parseInt(versionNumber.split("\\.")[0])) {
                int indexToAppendTo = versionNumbers.indexOf(versionNumber);
                versionNumbers.add(indexToAppendTo, versionNumberToAppend);
                return versionNumbers;
            }

            if (Integer.parseInt(splittedVersionNumberToAppend[0]) == Integer.parseInt(versionNumber.split("\\.")[0])) {

               if (splittedVersionNumberToAppend.length < splittedVersionNumber.length) {

                   if(splittedVersionNumberToAppend.length > 1) {
                       int indexToAppendTo = versionNumbers.indexOf(versionNumber);

                       if (Integer.parseInt(splittedVersionNumberToAppend[1]) < Integer.parseInt(versionNumber.split("\\.")[1])) {
                           versionNumbers.add(indexToAppendTo, versionNumberToAppend);
                           return versionNumbers;
                       }

                       if (Integer.parseInt(splittedVersionNumberToAppend[1]) == Integer.parseInt(versionNumber.split("\\.")[1])) {
                           versionNumbers.add(indexToAppendTo, versionNumberToAppend);
                           return versionNumbers;
                       }

                       if (Integer.parseInt(splittedVersionNumberToAppend[1]) > Integer.parseInt(versionNumber.split("\\.")[1])) {
                           if (indexToAppendTo == versionNumbers.size() - 1) {
                               versionNumbers.add(versionNumberToAppend);
                               return versionNumbers;
                           }
                       }
                   } else {
                       int indexToAppendTo = versionNumbers.indexOf(versionNumber);
                       versionNumbers.add(indexToAppendTo, versionNumberToAppend);
                       return versionNumbers;
                   }
                }

                if (splittedVersionNumberToAppend.length == splittedVersionNumber.length) {

                    if (splittedVersionNumberToAppend.length == 2) {
                        int indexToAppendTo = versionNumbers.indexOf(versionNumber);

                        if (Integer.parseInt(splittedVersionNumberToAppend[1]) < Integer.parseInt(versionNumber.split("\\.")[1])) {
                            versionNumbers.add(indexToAppendTo, versionNumberToAppend);
                            return versionNumbers;
                        }
                        else if (indexToAppendTo == versionNumbers.size() - 1) {
                            versionNumbers.add(versionNumberToAppend);
                            return versionNumbers;
                        }
                    }


                    if (splittedVersionNumberToAppend.length == 3) {
                        int indexToAppendTo = versionNumbers.indexOf(versionNumber);

                        if (Integer.parseInt(splittedVersionNumberToAppend[1]) < Integer.parseInt(versionNumber.split("\\.")[1])) {
                            versionNumbers.add(indexToAppendTo, versionNumberToAppend);
                            return versionNumbers;
                        }

                        if (Integer.parseInt(splittedVersionNumberToAppend[1]) == Integer.parseInt(versionNumber.split("\\.")[1])) {
                            if (Integer.parseInt(splittedVersionNumberToAppend[2]) < Integer.parseInt(versionNumber.split("\\.")[2])) {
                                versionNumbers.add(indexToAppendTo, versionNumberToAppend);
                                return versionNumbers;
                            }

                            else if (indexToAppendTo == versionNumbers.size() - 1) {
                                versionNumbers.add(versionNumberToAppend);
                                return versionNumbers;
                            }
                        }
                        if (Integer.parseInt(splittedVersionNumberToAppend[1]) > Integer.parseInt(versionNumber.split("\\.")[1])) {
                            if (indexToAppendTo == versionNumbers.size() - 1) {
                                versionNumbers.add(versionNumberToAppend);
                                return versionNumbers;
                            }
                        }
                    }
                }

                if (splittedVersionNumberToAppend.length > splittedVersionNumber.length) {
                    int indexToAppendTo = versionNumbers.indexOf(versionNumber);

                    if (splittedVersionNumber.length > 1) {
                        if (Integer.parseInt(splittedVersionNumberToAppend[1]) < Integer.parseInt(versionNumber.split("\\.")[1])) {
                            versionNumbers.add(indexToAppendTo, versionNumberToAppend);
                            return versionNumbers;
                        }
                    }

                    if (indexToAppendTo == versionNumbers.size() - 1) {
                        versionNumbers.add(versionNumberToAppend);
                        return versionNumbers;
                    }
                }
            }

            if (Integer.parseInt(splittedVersionNumberToAppend[0]) > Integer.parseInt(versionNumber.split("\\.")[0])) {
                int indexToAppendTo = versionNumbers.indexOf(versionNumber);

                if (indexToAppendTo == versionNumbers.size() - 1) {
                    versionNumbers.add(versionNumberToAppend);
                    return versionNumbers;
                }
            }
        }

        return new ArrayList<>();
    }
}

