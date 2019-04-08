package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class GenericUtils {
    public static <T extends Comparable> Iterable<? extends Iterable<T>> powerSet(Set<T> originalSet) {
        Set<Set<T>> powerSet = new HashSet<>();
        powerSet.add(new HashSet<>());
        for (T element : originalSet) {
            Set<Set<T>> previousSets = new HashSet<>(powerSet);
            for (Set<T> subSet : previousSets) {
                Set<T> innerSet = new HashSet<>(subSet);
                innerSet.add(element);
                powerSet.add(innerSet);
            }
        }
        return powerSet;
    }

    public static <T extends Comparable> Iterable<? extends Iterable<T>> powerSet(T... originalSet) {
        return powerSet(new TreeSet<>(Arrays.asList(originalSet)));
    }
}

