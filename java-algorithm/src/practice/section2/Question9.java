package practice.section2;
import java.util.Arrays;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {

       /*
       설명
       5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
       N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.

       입력
       첫 줄에 자연수 N이 주어진다.(2<=N<=50)
       두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.

       출력
       최대합을 출력합니다.

       예시 입력 1
       5
       10 13 10 12 15
       12 39 30 23 11
       11 25 50 53 15
       19 27 29 37 27
       19 13 30 13 19
       예시 출력 1
       155
       */

        Question9 T = new Question9();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(T.solution(n, arr));

    }

    public int solution(int n, int[][] arr) {
        int answer = 0;
        int tmpW=0, tmpH=0, tmpRD=0, tmpLD=0;
        int max=0;

        for (int i=0; i<n; i++) {
            tmpRD += arr[i][i];
            tmpLD += arr[i][n-i-1];

            for (int j=0; j<n; j++) {
                tmpW += arr[i][j];
                tmpH += arr[j][i];
            }

            if (tmpW>tmpH && tmpW>max) {
                max = tmpW;
            } else if (tmpH>tmpW && tmpH>max) {
                max = tmpH;
            }

            answer = max;
            tmpW=0;
            tmpH=0;
        }

        if (tmpRD > answer && tmpRD > tmpLD) {
            answer = tmpRD;
        } else if (tmpLD > tmpRD && tmpLD > answer) {
            answer = tmpLD;
        }

        return answer;
    }


}
