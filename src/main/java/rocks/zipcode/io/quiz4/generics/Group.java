package rocks.zipcode.io.quiz4.generics;

import rocks.zipcode.io.quiz4.objectorientation.StringAssembler;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 * Jeremy McCray's work
 */
public class Group<T> implements GroupInterface<T>{

    List<T> list = new LinkedList<>();


    public Group() {
        list = new LinkedList<>();
    }

    public Integer count() {
        return list.size();
    }

    public void insert(T value) {
        list.add(value);
    }

    public Boolean has(T value) {
        return list.contains(value);
    }

    public T fetch(int indexOfValue) {
        return list.get(indexOfValue);
    }

    public void delete(T value) {
        list.remove(value);
    }

    public void clear() {
        list.clear();
    }

    public Iterator<T> iterator() {
        return list.iterator();
    }

    @Override
    public String toString() {
        String ans = "[";
        for (int i = 0; i < list.size()-1; i++) {
            ans+= list.get(i) + ", ";
        }
        ans += list.get(list.size()-1) + "]";

        return ans;
    }
}
