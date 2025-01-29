package static2;

import static static2.DecoData.staticCall;

public class DecoDataMain {
    public static void main(String[] args) {
        // main 메서드 > 대표적인 정적 메서드, 객체 생성 없이 바로 실행

        System.out.println("1. 정적 호출");
        // DecoData.staticCall();

        // 정적 메서드가 여러번 실행될 경우 import 사용해 클래스명 생략할 수 있다.
        // import static static2.DecoData.*;
        // import static static2.DecoData.staticCall;
        staticCall();
        staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        /*
        1. 정적 호출
        staticValue=1
        2. 인스턴스 호출1
        instanceValue=1
        staticValue=2
        3. 인스턴스 호출2
        instanceValue=1
        staticValue=3
        */

        DecoData.staticCall(data1);
        // instanceValue=2

        // 1. 인스턴스를 통한 정적 메서드 접근, 마찬가지의 이유로 권장하지 않는다.
        DecoData data3 = new DecoData();
        data3.staticCall();

        // 2. 클래스를 통한 정적 메서드 접근
        DecoData.staticCall();

    }
}
