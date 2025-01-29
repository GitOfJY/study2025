package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {
    public static void main(String[] args) {

        // 1. Object의 기본 hashCode는 객체의 참조값을 기반으로 생성
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hasCode() = " + obj1.hashCode());
        System.out.println("obj2.hasCode() = " + obj2.hashCode());
        // obj1.hasCode() = 1324119927
        // obj2.hasCode() = 81628611


        // 2. 각 클래스마다 hashCode를 이미 오버라이딩 해두었다
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";


        System.out.println("10.hashCode = " + i.hashCode());
        System.out.println("strA.hashCode = " + strA.hashCode());
        System.out.println("strAB.hashCode = " + strAB.hashCode());
        // 10.hashCode = 10
        // strA.hashCode = 65
        // strAB.hashCode = 2081


        // hashCode는 마이너스 값이 들어올 수 있다.
        System.out.println("-1.hashCode = " + Integer.valueOf(-1).hashCode());
        // -1.hashCode = -1


        // 인스턴스는 다르지만 equals는 같다 (물리적으로 다르지만, 논리적으로 같다)
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");


        // equals, hashCode를 오버라이딩 하지 않은 경우의 한 경우 비교
        System.out.println("(member1 == member2) = " + (member1 == member2));
        System.out.println("(member1 equals member2) = " + (member1.equals(member2)));
        System.out.println("(member1.hashCode) = " + member1.hashCode());
        System.out.println("(member2.hashCode) = " + member2.hashCode());
        // (member1 == member2) = false
        // (member1 equals member2) = true
        // (member1.hashCode) = 104070
        // (member2.hashCode) = 104070

        // 동일성(==)은 물리적으로 같은 메모리에 있는 객체인지 참조값을 확인하는 것
        // 동등성(equals)은 논리적으로 같은지 확인하는 것

    }

}
