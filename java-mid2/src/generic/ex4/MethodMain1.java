package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {

        Integer i = 10;
        Object obj = GenericMethod.objMethod(i);
        // Integer integerResult = (Integer)GenericMethod.objMethod(i);

        // 타입 인자 (Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.2);

        // 제너릭 메서드 타입 추론
        Integer result1 = GenericMethod.genericMethod(i);
        Integer integerValue1 = GenericMethod.numberMethod(10);
        Double doubleValue1 = GenericMethod.numberMethod(20.2);

    }
}
