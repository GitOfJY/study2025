package lang.string.chaining;

public class MethodChainingMain2 {
    public static void main(String[] args) {

        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1);
        ValueAdder adder2 = adder1.add(2);
        ValueAdder adder3 = adder2.add(3);

        int result = adder.getValue();
        System.out.println("result : " + result);

        System.out.println("adder : " + adder);
        System.out.println("adder1 : " + adder1);
        System.out.println("adder2 : " + adder2);
        System.out.println("adder3 : " + adder3);

        /*
        result : 6
        adder : lang.string.chaining.ValueAdder@27973e9b
        adder1 : lang.string.chaining.ValueAdder@27973e9b
        adder2 : lang.string.chaining.ValueAdder@27973e9b
        adder3 : lang.string.chaining.ValueAdder@27973e9b
        > add() 메서드는 자기 자신(this)의 참조값을 반환한다.
        */

    }
}
