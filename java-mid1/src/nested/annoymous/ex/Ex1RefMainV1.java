package nested.annoymous.ex;

import java.util.Random;

public class Ex1RefMainV1 {
    
    public static void hello(Process process){
        System.out.println("프로그램시작");

        // 코드 조각 시작
        // 메서드 자체만을 전달할 수 없음
        // 인스턴스를 전달하고 인스턴스의 메서드를 실행
        process.run();
        // 코드 조각 종료

        System.out.println("프로그램 종료");
    }

    static class Dice implements Process{

        @Override
        public void run(){
            int randomValue = new Random().nextInt(6)+1;
            System.out.println("주사위 = " + randomValue);
        }

    }

    static class Sum implements Process{

        @Override
        public void run(){
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        }

    }

    public static void main(String[] args) {

        Dice dice = new Dice();
        hello(dice);

        //hello(new Dice());
        hello(new Sum());

    }

}
