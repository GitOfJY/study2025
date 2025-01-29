package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar){
        int localVar = 1;
        // 지역변수는 스택 프레임이 종료되는 순간 함께 제거된다.

        // localVar = 2;
        // 사실상 final(effectively final) 지역변수 선언, 변경하는 순간 compile error 발생

        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                // 인스턴스는 지역변수보다 더 오래 살아남는다.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }

        }

        LocalPrinter printer = new LocalPrinter();
        // printer.print();
        // Printer 인스턴스만 반환한다.

        return printer;

    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2);
        
        // printer.print();를 나중에 실행한다.
        // process()의 스택 프레임이 사라진 이후에 실행
        printer.print();

        // 추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field : " + field);
        }

        /*
        1. 인스턴스 변수
        field : int nested.local.LocalOuterV3$1LocalPrinter.value
        
        2. 캡처 변수
        field : final int nested.local.LocalOuterV3$1LocalPrinter.val$localVar
        field : final int nested.local.LocalOuterV3$1LocalPrinter.val$paramVar
        
        3. 바깥 클래스 참조
        field : final nested.local.LocalOuterV3 nested.local.LocalOuterV3$1LocalPrinter.this$0
        */

    }

}
