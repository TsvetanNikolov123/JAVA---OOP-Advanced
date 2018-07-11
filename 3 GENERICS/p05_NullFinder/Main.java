package p05_NullFinder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer>  integers = new ArrayList<>();
        Collections.addAll(integers, 1, 2, null, 2, null);

        Iterable<Integer> integerNulls = ListUtils.getNullIndices(integers);

//        Iterable<String> strings = new ArrayList<>();
//        Collections.addAll(strings, "a", null, "c");
    }
}
