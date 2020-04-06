package rocks.zipcode.io.quiz4.generics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

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
        return Integer.valueOf(null);
    }



    @Override
    public String toString() {
        return "ComparableTreeSet{" +
                "list=" + Arrays.toString(list) +
                '}';
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
