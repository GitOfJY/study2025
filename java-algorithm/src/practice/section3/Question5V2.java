package practice.section3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question5V2 {
    public static void main(String[] args) {
       /*
       설명
       N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
       만약 N=15이면
       7+8=15
       4+5+6=15
       1+2+3+4+5=15
       와 같이 총 3가지의 경우가 존재한다.

       입력
       첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.

       출력
       첫 줄에 총 경우수를 출력합니다.

       예시 입력 1
       15
       예시 출력 1
       3
       */

        Question5V2 T = new Question5V2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.Solution(n));
    }

    public int Solution(int n) {
        // 1부터 N까지 배열 만들기
        // 투포인트로 합 구하기 ?
        List<Integer> tmpIntArr = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            tmpIntArr.add(i);
        }

        for (int a : tmpIntArr) {
            System.out.print(a + " ");
        }

        int cnt = 0;
        int lt = 0;
        int sum = 0;

        // 1 2 3 4 5 6 7 8 9 10 11 12 ...
        //  1+2+3+4+5=15
        for (int rt = 0; rt < n-1; rt++) {
            sum += tmpIntArr.get(rt);
            if (sum == n) {
                cnt ++;
            }

            while (sum >= n) {
                sum -= tmpIntArr.get(lt++);
                if (sum == n) {
                    cnt ++;
                }
            }
        }

        return cnt;
    }
}
