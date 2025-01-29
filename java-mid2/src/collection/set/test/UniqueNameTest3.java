package collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNameTest3 {
    public static void main(String[] args) {

        // Integer[] inputArr = {30, 20, 20, 10, 10};
        // Set<Integer> set = new TreeSet<>(List.of(inputArr));
        Set<Integer> set = new TreeSet<>(List.of(30, 20, 20, 10, 10));

        for (Integer s : set) {
            System.out.println(s);
        }

    }
}
