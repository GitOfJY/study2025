package collection.set;

import collection.set.member.MemberNoHashNoEq;

public class HashAndEqualsMain1 {
    public static void main(String[] args) {

        MyHashSetV2 set = new MyHashSetV2(10);
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");


        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));


        // m1.hashCode() = 1096979270
        // m2.hashCode() = 1452126962
        // m1.equals(m2) = false
        // 기본으로 JAVA가 제공하는 equals는 == 비교


        set.add(m1);
        set.add(m2);
        System.out.println(set);
        // MyHashSetV2{buckets=[[MemberNoHashNoEq{id='A'}], [], [MemberNoHashNoEq{id='A'}], [], [], [], [], [], [], []], size=2, capacity=10}


        // 중복등록 + 검색실패
        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
        System.out.println("searchValue.hashCode() = "+searchValue.hashCode());
        // searchValue.hashCode() = 885284298
        boolean contains = set.contains(searchValue);
        System.out.println("contains = "+contains);
        // contains = false

    }
}
