package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<T extends Comparable<T>> extends TreeSet<T> implements Comparable<ComparableTreeSet<T>> {

    private TreeSet<T> treeSet;

    public ComparableTreeSet(T... arr) {
        treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(arr));
    }


    public ComparableTreeSet() {
        this.treeSet = new TreeSet<>();
    }

    public int compareTo(ComparableTreeSet<T> o) {
        int compare = 0;
        do {
            compare = treeSet.pollFirst().compareTo(o.pollFirst());
        } while (compare == 0);
        return compare;
    }

    @Override
    public String toString() {
        return treeSet.toString();
    }
}
