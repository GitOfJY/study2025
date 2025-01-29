package nested.annoymous.ex;

import java.util.Random;

public class Ex1RefMainV2 {
    
    public static void hello(Process process){
        System.out.println("프로그램시작");

        // 코드 조각 시작
        process.run();
        // 코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        // main에서만 사용 > 지역 클래스로 생성
        class Dice implements Process{
            @Override
            public void run(){
                int randomValue = new Random().nextInt(6)+1;
                System.out.println("주사위 = " + randomValue);
            }
        }

        class Sum implements Process{
            @Override
            public void run(){
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        }

        Dice dice = new Dice();
        // Process dice = new Dice();
        // 부모는 자식을 담을 수 있다.
        hello(dice);

        //hello(new Dice());
        hello(new Sum());
        
    }

}
