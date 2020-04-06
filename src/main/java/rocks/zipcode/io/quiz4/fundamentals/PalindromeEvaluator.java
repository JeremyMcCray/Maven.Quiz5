package rocks.zipcode.io.quiz4.fundamentals;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 * Jeremy McCray's work
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        Set<String> ans = new HashSet<>();

        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j <string.length() ; j++) {
                if(isPalindrome(string.substring(i,j))){
                    ans.add(string.substring(i,j));
                }
            }
        }
        ans.add(string);
        return ans.toArray(new String[ans.size()]);
    }

    public static Boolean isPalindrome(String string) {
       String rev = reverseString(string);

        return rev.equals(string);
    }

    public static String reverseString(String string) {
        String ans = "";
        for (int i = string.length()-1; i >= 0 ; i--) {
           ans+= string.charAt(i);
        }
        return ans;
    }
}
