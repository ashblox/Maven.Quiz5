package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<T extends Comparable<T>> extends Group<T> {

    private List<T> sortedList;

    public SortedGroup() {
        this.sortedList = new ArrayList<>();
    }

    @Override
    public void insert(T value) {
        sortedList.add(value);
        Collections.sort(sortedList);
    }

    @Override
    public void delete(T value) {
        sortedList.remove(value);
        Collections.sort(sortedList);
    }

    public Integer indexOf(T value) {
        return sortedList.indexOf(value);
    }
}
