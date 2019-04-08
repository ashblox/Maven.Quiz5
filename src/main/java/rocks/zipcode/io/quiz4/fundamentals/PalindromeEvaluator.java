package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        String[] substrings = StringEvaluator.getAllSubstrings(string);
        List<String> palindromesList = new ArrayList<>();
        for (int i = 0; i < substrings.length; i++) {
            if (isPalindrome(substrings[i])) {
                palindromesList.add(substrings[i]);
            }
        }
        String[] palindromes = new String[palindromesList.size()];
        return palindromesList.toArray(palindromes);
    }

    public static Boolean isPalindrome(String string) {
        return string.equals(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder sb = new StringBuilder(string);
        return sb.reverse().toString();
    }
}
