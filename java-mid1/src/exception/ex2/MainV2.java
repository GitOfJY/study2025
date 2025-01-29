package exception.ex2;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2 {

        // NetworkServiceV2_1 networkService = new NetworkServiceV2_1();
        // NetworkServiceV2_2 networkService = new NetworkServiceV2_2();
        // NetworkServiceV2_3 networkService = new NetworkServiceV2_3();
        // NetworkServiceV2_4 networkService = new NetworkServiceV2_4();
        NetworkServiceV2_5 networkService = new NetworkServiceV2_5();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자 : ");
            String input = scanner.nextLine();
            if (input.equals("exit")){
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }

        System.out.println("프로그램을 정상 종료합니다.");

        /*
        전송할 문자 : error1
        [오류] 코드 : connectError 메세지 : http://example.com 서버 연결 실패

        전송할 문자 : error2
        http://example.com 서버 연결 성공
        [오류] 코드 : sendError 메세지 : http://example.com 서버에 데이터 전송 실패: error2
        */

    }
}
