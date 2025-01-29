package collection.compare;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class SortMain5 {
    public static void main(String[] args) {

        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        TreeSet<MyUser> treeSet1 = new TreeSet<>();
        treeSet1.add(myUser1);
        treeSet1.add(myUser2);
        treeSet1.add(myUser3);
        System.out.println("Comparable 기본 데이터");
        System.out.println(treeSet1);
        // [MyUser{id='c', age=10}, MyUser{id='b', age=20}, MyUser{id='a', age=30}]

        TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator());
        treeSet2.add(myUser1);
        treeSet2.add(myUser2);
        treeSet2.add(myUser3);
        System.out.println("IdComparator 정렬");
        System.out.println(treeSet2);
        // [MyUser{id='a', age=30}, MyUser{id='b', age=20}, MyUser{id='c', age=10}]

    }

}
