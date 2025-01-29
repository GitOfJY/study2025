package collection.iteratable;

import java.util.*;

public class JavaIterableMain {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

//        Iterator<Integer> listIter = list.iterator();
//        while (listIter.hasNext()) {
//            System.out.println("listIter.next() : " + listIter.next());
//        }
        printAll(list.iterator());
        forEach(list);

        System.out.println();
        System.out.println();
        System.out.println();

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

//        Iterator<Integer> setIter = set.iterator();
//        while (setIter.hasNext()) {
//            System.out.println("setIter.next() : " + setIter.next());
//        }
        printAll(set.iterator());
        forEach(set);

    }

    private static void printAll(Iterator<Integer> iterator) {
        System.out.println("iterator = " + iterator.getClass());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void forEach(Iterable<Integer> iterable) {
        // foreach > iterable 필요
        System.out.println("iterable = " + iterable.getClass());
        for (Integer i : iterable) {
            System.out.println(i);
        }
    }

}
