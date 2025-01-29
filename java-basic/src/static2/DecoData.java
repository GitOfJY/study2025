package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {

        // instanceValue++;
        // 인스턴스 변수 접근, compoile error
        // Non-static field 'instanceValue' cannot be referenced from a static context

        // instanceMethod();
        // 인스턴스 메서드 접근, compile error

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
        // static은 static만 접근할 수 있다 !!

    }

    public static void staticCall(DecoData data) {
        // 객체의 참조값을 직접 매개변수로 전달하면 정적 메서드도 인스턴스의 변수나 메서드를 호출할 수 있다.
        data.instanceValue++;
        data.instanceMethod();
    }

    public void instanceCall() {

        instanceValue++; // 인스턴스 변수 접근
        instanceMethod(); // 인스턴스 메서드 접근

        staticValue++; // 정적 변수 접근, DecoData.staticValue++;
        staticMethod(); // 정적 메서드 접근, DecoData.staticMethod();

    }

    private void instanceMethod(){
        System.out.println("instanceValue="+instanceValue);
    }

    private static void staticMethod(){
        System.out.println("staticValue="+staticValue);
    }

}
