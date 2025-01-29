package lang.immutable.address;

public class PrimitiveMain {
    public static void main(String[] args) {

        // 기본형은 절대로 같은 값을 공유하지 않는다.
        int a = 10;
        int b = a;
        System.out.println("a = "+a);
        System.out.println("b = "+b); // a -> b, 값을 복사 후 대입
        // 자바에서는 항상 값을 복사해서 대입한다.
        // 메모리 상에서도 a에 속하는 10과 b에 속하는 10이 각각 별도로 존재한다.

        a = 20;
        // 기본형 변수는 하나의 값을 절대로 공유하지 않는다.
        // 따라서 값을 변경해도 변수 하나의 값만 변경된다.

        System.out.println("20 -> b");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        // a = 20
        // b = 10

    }
}
