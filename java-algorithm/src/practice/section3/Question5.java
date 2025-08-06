package practice.section3;

import java.util.Arrays;
import java.util.Scanner;

public class Question5 {
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

        Question5 T = new Question5();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.Solution(n));
    }

    public int Solution(int n) {
        int answer = 0;
        int[] arr = new int[n/2+1];

        for (int i=1; i<=n/2+1; i++) {
            arr[i-1] = i;
        }

        for (int i=2; i<n/2+1; i++) {
            answer += getSlide(i, n, arr);
        }

        return answer;
    }

    public int getSlide(int n, int m, int[] arr) {
        int cnt = 0, sum = 0;

        for (int i=0; i<n; i++) {
            sum += arr[i];
        }
        if (sum==m) {
            cnt++;
        }

        for (int i=n; i<arr.length; i++) {
            sum += (arr[i] - arr[i-n]);
            if (sum==m) {
                cnt++;
            }
        }
        return cnt;
    }
}
