package collection.set.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNameTest2 {
    public static void main(String[] args) {

        Integer[] inputArr = {30, 20, 20, 10, 10};

        // 방법1.
        // Set<Integer> set = new LinkedHashSet<>();
        // for (Integer s : inputArr) {
        //    set.add(s);
        // }

        // 방법2.
        // List<Integer> list = List.of(inputArr);
        // List<Integer> list = Arrays.asList(inputArr);
        // Set<Integer> set = new LinkedHashSet<>(list);
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));

        for (Integer s : set) {
            System.out.println(s);
        }

    }
}
