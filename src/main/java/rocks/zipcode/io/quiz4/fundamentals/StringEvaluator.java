package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> substringsSet = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length() ; j++) {
                substringsSet.add(string.substring(i, j));
            }
        }
        String[] substrings = new String[substringsSet.size()];
        return substringsSet.toArray(substrings);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        String[] string1Substrings = getAllSubstrings(string1);
        String[] string2Substrings = getAllSubstrings(string2);
        List<String> commonSubstringsList = new ArrayList<>();
        for (int i = 0; i < string1Substrings.length; i++) {
            for (int j = 0; j < string2Substrings.length; j++) {
                if (string1Substrings[i].equals(string2Substrings[j])) {
                    commonSubstringsList.add(string1Substrings[i]);
                }
            }
        }
        String[] commonSubstrings = new String[commonSubstringsList.size()];
        return commonSubstringsList.toArray(commonSubstrings);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] commonSubstrings = getCommonSubstrings(string1, string2);
        String largestCommon = commonSubstrings[0];
        for (int i = 1; i < commonSubstrings.length; i++) {
            if (commonSubstrings[i].length() > largestCommon.length()) {
                largestCommon = commonSubstrings[i];
            }
        }
        return largestCommon;
    }
}
