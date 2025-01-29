package nested.annoymous.ex;

import java.util.Random;

public class Ex1RefMainV5 {
    
    public static void hello(Process process){
        System.out.println("프로그램시작");

        // 코드 조각 시작
        process.run();
        // 코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        hello(() -> {
            int randomValue = new Random().nextInt(6)+1;
            System.out.println("주사위 = " + randomValue);
        });
        // 람다
        // 클래스나 인스턴스를 정의하지 않고 메서드(함수)의 코드 블럭을 직접 전달
        // 지역변수 선언 불가, 익명함수의 경우 지역변수 선언 가능

        hello(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        });
        
    }

}
