package poly.ex.pay0.answer;

import java.util.Scanner;

public class PayMain1 {
    public static void main(String[] args) {

        PayService payService = new PayService();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("결제 수단을 입력하세요.");
            String payOption = scanner.nextLine();

            if (payOption.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            System.out.println("결제 금액을 입력하세요.");
            int amount = scanner.nextInt();
            scanner.nextLine(); // \n

            payService.processPay(payOption, amount);

        }

        /*
        // kakao 결제
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        // naver 결제
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);

        // 잘못된 결제 수단 선택
        String payOption3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOption3, amount3);
        */

    }
}
