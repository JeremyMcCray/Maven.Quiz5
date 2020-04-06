package rocks.zipcode.io.quiz4.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 * Jeremy McCray's work
 */
public class SimpleStringGroup implements Iterable<String>{

    List<String> listofStrings;
    public SimpleStringGroup() {
        this.listofStrings = new LinkedList<>();
    }

    public Integer count() {
        return listofStrings.size();
    }

    public void insert(String string) {
        listofStrings.add(string);
    }

    public Boolean has(String string) {
        return listofStrings.contains(string);
    }

    public String fetch(int indexOfValue) {
        return listofStrings.get(indexOfValue);
    }

    public void delete(String string) {
        listofStrings.remove(string);
    }

    public void clear() {
        listofStrings.clear();
    }

    @Override
    public Iterator<String> iterator() {
        return listofStrings.iterator();
    }
}
