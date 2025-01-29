package collection.set;

import collection.set.member.MemberOnlyHash;

public class HashAndEqualsMain2 {
    public static void main(String[] args) {

        MyHashSetV2 set = new MyHashSetV2(10);
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");


        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));


        // m1.hashCode() = 65
        // m2.hashCode() = 65
        // m1.equals(m2) = false
        // Object의 equals()를 상속받아 사용하기 때문에 인스턴스의 참조값을 비교한다. > 중복등록


        set.add(m1);
        set.add(m2);
        System.out.println(set);
        // MyHashSetV2{buckets=[[], [], [], [], [], [MemberOnlyHash{id='A'}, MemberOnlyHash{id='A'}], [], [], [], []], size=2, capacity=10}


        // 중복등록 + 검색실패
        MemberOnlyHash searchValue = new MemberOnlyHash("A");
        System.out.println("searchValue.hashCode() = "+searchValue.hashCode());
        // searchValue.hashCode() = 65
        boolean contains = set.contains(searchValue);
        System.out.println("contains = "+contains);
        // contains = false

    }
}
