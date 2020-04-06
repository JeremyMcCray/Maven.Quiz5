package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<T> extends Group<T> {

    TreeSet<T> set = new TreeSet<>();
    @Override
    public void insert(T value) {
        set.add(value);
    }

    @Override
    public void delete(T value) {
        set.remove(value);
    }

    public Integer indexOf(T value) {
        List<T> sett = new ArrayList<>(set);
        return sett.indexOf(value);
    }
}
