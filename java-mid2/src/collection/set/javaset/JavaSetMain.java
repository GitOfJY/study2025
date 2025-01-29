package collection.set.javaset;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {

        // Set<String> hashSet = new HashSet<>();
        // Set<String> linkedHashSet = new LinkedHashSet<>();
        // Set<String> treeSet = new TreeSet<>();

        run(new HashSet<>());
       /*
       set : class java.util.HashSet
       A 1 B 2 C
       - 입력 순서 보장하지 않는다. : O(1)
       * */

        run(new LinkedHashSet<>());
       /*
       set : class java.util.LinkedHashSet
       C B A 1 2
       - 입력 순서를 보장한다. : O(1)
       * */

        run(new TreeSet<>());
       /*
       set : class java.util.TreeSet
       1 2 A B C
       - 데이터 값을 기준으로 정렬한다. : O(logN)
       * */

    }

    private static void run(Set<String> set){
        System.out.println("set : " + set.getClass());

        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
        System.out.println();

    }

}
