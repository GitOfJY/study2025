package practice.section2;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

       /*
       설명
       자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
       만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.

       입력
       첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.

       출력
       첫 줄에 소수의 개수를 출력합니다.

       예시 입력 1
       20
       예시 출력 1
       8
       */

        Question5 T = new Question5();
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        System.out.println(T.solution(inputNum));

    }

    public int solution(int inputNum) {
        int cnt = 0;

        for (int i=2; i<inputNum+1; i++) {
            if (chkNum(i)) {
                cnt ++;
            }
        }

        return cnt;

    }

    public boolean chkNum(int num) {
        for (int i=2; i<num; i++) {
            if ((num%i)==0) {
                return false;
            }
        }
        return true;
    }

    // SOL1. Time Limit Exceeded
//    public int solution(int inputNum) {
//        int cnt = 0;
//
//        for (int i=2; i<inputNum+1; i++) {
//            if (chkNum(i)) {
//                cnt ++;
//            }
//        }
//
//        return cnt;
//
//    }
//
//    public boolean chkNum(int num) {
//        for (int i=2; i<num; i++) {
//            if ((num%i)==0) {
//                return false;
//            }
//        }
//        return true;
//    }

    // SOL2. Time Limit Exceeded
//    public int solution(int inputNum) {
//        int cnt = 0;
//
//        for (int i=2; i<inputNum+1; i++) {
//            boolean rslt = true;
//            for (int j=2; j<i; j++) {
//                if ((i%j)==0) {
//                    rslt = false;
//                }
//            }
//            if (rslt==true) {
//                cnt++;
//            }
//            rslt = true;
//        }
//
//        return cnt;
//    }

}
