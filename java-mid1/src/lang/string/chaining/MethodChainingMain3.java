package lang.string.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {

        ValueAdder adder = new ValueAdder();
        int result = adder.add(1).add(2).add(3).getValue();
        System.out.println("result : " + result);
        // 반환된 참조값을 변수에 담지 않고 즉시 사용해서 바로 메서드를 호출할 수 있다.
        // 메서드 체이닝이 가능한 이유는 자기 자신의 참조값을 반환하기 때문이다.
        // 메서드 체이닝 기법은 코드를 간결하고 읽기 쉽게 만들어 준다.

    }
}
