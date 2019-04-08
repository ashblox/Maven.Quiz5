package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        ArrayList<String> substrings = getAllSubstrings(string);
        Set<String> palindromesUnique = new LinkedHashSet<>();
        for (int i = 0; i < substrings.size(); i++) {
            if (isPalindrome(substrings.get(i))) {
                palindromesUnique.add(substrings.get(i));
            }
        }
        String[] palindromes = new String[palindromesUnique.size()];
        return palindromesUnique.toArray(palindromes);
    }

    public static ArrayList<String> getAllSubstrings(String string) {
        ArrayList<String> substrings = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j <= string.length(); j++) {
                substrings.add(string.substring(i, j));
            }
        }
        return substrings;
    }

    public static Boolean isPalindrome(String string) {
        return string.equals(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder sb = new StringBuilder(string);
        return sb.reverse().toString();
    }
}
