package practice.section2;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

       /*
       설명
       N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
       (첫 번째 수는 무조건 출력한다)

       입력
       첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.

       출력
       자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.

       예시 입력 1
       6
       7 3 9 5 6 12
       예시 출력 1
       7 9 6 12

       3
       1 2 3
       */

        Question1 T = new Question1();
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[inputNum];
        for (int i=0; i<inputNum; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(arr, inputNum));

    }

    public String solution(int[] arr, int inputNum) {
        String result = "";
        result += arr[0] + " ";

        if (arr[0] < arr[1]) {
            result += arr[1] + " ";
        }

        for (int i=1; i<inputNum-1; i++) {
            if (arr[i] < arr[i+1]) {
                result += arr[i+1] + " ";
            }
        }

        int lnt = result.length();
        result = result.substring(0, lnt-1);

        return result;
    }

}
