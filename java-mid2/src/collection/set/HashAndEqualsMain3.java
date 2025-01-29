package collection.set;

import collection.set.member.Member;

public class HashAndEqualsMain3 {
    public static void main(String[] args) {

        MyHashSetV2 set = new MyHashSetV2(10);
        Member m1 = new Member("A");
        Member m2 = new Member("A");

        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        // m1.hashCode() = 65
        // m2.hashCode() = 65
        // m1.equals(m2) = true
        // 중복 등록 안 됨

        set.add(m1);
        set.add(m2);
        System.out.println(set);
        // MyHashSetV2{buckets=[[], [], [], [], [], [Member{id='A'}], [], [], [], []], size=1, capacity=10}

        // 검색성공
        Member searchValue = new Member("A");
        System.out.println("searchValue.hashCode() = "+searchValue.hashCode());
        // searchValue.hashCode() = 65
        boolean contains = set.contains(searchValue);
        System.out.println("contains = "+contains);
        // contains = true

    }
}
