package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> toArrayed = new LinkedHashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j <= string.length() ; j++) {
                toArrayed.add( string.substring(i,j));
            }
        }

        return toArrayed.toArray(new String[toArrayed.size()]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        List<String> arr1 = Arrays.asList(getAllSubstrings(string1));
        List<String> arr2 = Arrays.asList(getAllSubstrings(string2));
        ArrayList<String> toArray = new ArrayList<>();

        for (String elem: arr1) {
            if(arr2.contains(elem)){
                toArray.add(elem);
            }
        }



        return toArray.toArray(new String[toArray.size()]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] comm = getCommonSubstrings(string1,string2);
        String temp = "";
        for (String elem: comm) {
            if (elem.length() > temp.length())
                temp = elem;
        }


        return temp;
    }
}
