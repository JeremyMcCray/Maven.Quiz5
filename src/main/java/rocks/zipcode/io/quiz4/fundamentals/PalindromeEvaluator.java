package rocks.zipcode.io.quiz4.fundamentals;

/**
 * @author leon on 18/12/2018.
 * Jeremy McCray's work
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        return null;
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
