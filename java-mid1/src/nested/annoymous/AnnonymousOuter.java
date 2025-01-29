package nested.annoymous;

import nested.local.Printer;

public class AnnonymousOuter {

    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar = 1;

        Printer printer = new Printer(){

            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };

        printer.print();
        System.out.println("Printer.class : " + printer.getClass());

    }

    public static void main(String[] args) {

        AnnonymousOuter main = new AnnonymousOuter();
        main.process(2);
        // Printer.class : class nested.annoymous.AnnonymousOuter$1
        // 익명클래스 > (자바 내부에서 바깥 클래스 이름 + $ + 숫자)로 정의
        // 익명클래스 장점 : 익명 클래스를 사용하면 클래스를 별도로 정의하지 않고 인터페이스나 추상 클래스를 즉석에서 구현할 수 있어 코드가 더 간결해진다.

    }

}
