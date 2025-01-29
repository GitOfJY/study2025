package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {

        String a = "hello";
        String b = " java";;

        String result1 = a.concat(b);
        String result2 = a + b;
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        // String은 클래스이다. 따라서 기본형이 아니라 참조형이다.
        // 참조형은 변수에 계산할 수 있는 값이 들어있는 것이 아니라 계산할 수 없는 참조값이 들어있다.
        // 원칙적으로 + 같은 연산이 불가하다.
        // String에서 문자열을 더할 때 concat()과 같은 메서드를 사용해야 한다.
        // 하지만 문자열은 너무 자주 사용되어 편의상 + 연산을 제공한다.

    }
}
