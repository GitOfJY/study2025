package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {

        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        // 생성 시점에 T의 타입 결정
        integerBox.set(10);
        // integerBox.set("문자열");
        // Integer 타입만 허용, 컴파일 오류
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello"); // String 타입만 허용
        String str = stringBox.get();
        System.out.println("str = " + str);

        // 원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(20.5);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);

        // 타입 추론 : 생성하는 제네릭 타입 생략 가능
        // 자바가 스스로 타입 정보를 추론해서 개발자가 타입 정보를 생략할 수 있다.
        // 자바 컴파일러가 타입을 추론할 수 있는 상황에만 가능하다.
        GenericBox<Integer> integerBox2 = new GenericBox<>();

    }
}
