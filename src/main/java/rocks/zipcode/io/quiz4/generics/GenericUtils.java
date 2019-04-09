package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class GenericUtils {
    public static <T extends Comparable> Iterable<? extends Iterable<T>> powerSet(Set<T> originalSet) {
        Set<Set<T>> powerSet = new HashSet<>();
        List<T> setAsList = new ArrayList<>(originalSet);
        for (int i = setAsList.size(); i >= 0; i--) {
            Set<T> innerSet = new HashSet<>();
            for (int j = 0; j < i; j++) {
                innerSet.add(setAsList.get(j));
            }
            powerSet.add(innerSet);
        }
        return powerSet;
    }

    public static <T extends Comparable> Iterable<? extends Iterable<T>> powerSet(T... originalSet) {
        return powerSet(new TreeSet<>(Arrays.asList(originalSet)));
    }
}

