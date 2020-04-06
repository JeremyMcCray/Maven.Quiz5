package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 * Jeremy McCray's work
 */
public class    ComparableTreeSet<T> extends TreeSet<T> implements Comparable<T> {

    T[] list;

    public ComparableTreeSet(T... arr) {
        this.list=arr;
    }


    public ComparableTreeSet() {
    }

    public int compareTo(ComparableTreeSet<T> o) {
        List<T> listt =  Arrays.asList(this.list);
        for (int i = 0; i < listt.size() ; i++) {
            if(listt.containsAll(Arrays.asList(o.list))){
                return 0;
            }
        }

        return Integer.valueOf(null);
    }



    @Override
    public String toString() {
        // sort this then return the sorted version
        Arrays.sort(list);
        return  Arrays.toString(list);

    }

    @Override
    public int compareTo(T o) {
        String temp1 = o.toString();
        String temp2 = Arrays.toString(list);
        return temp1.compareTo(temp2);
    }
}
