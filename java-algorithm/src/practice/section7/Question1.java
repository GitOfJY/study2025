package practice.section7;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        /*
        재귀함수
        자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지를 출력하는 프로그램을 작성하세요

        입력설명
        첫 번째 줄은 정수 N(3<=N<=10)이 입력된다

        출력설명
        첫째 줄에 출력한다

        입력예제 1
        3

        출력예제 1
        1 2 3
        */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int x : solution(n)) {
            System.out.print(x + " ");
        }
    }

    public static int[] solution(int n) {
        int[] answer = new int[n];
        int idx = 0;

        while (idx < n) {
            System.out.println("idx : " + idx);
            tmpFun(idx+1, answer);
            idx ++;
        }

        return answer;
    }

    private static void tmpFun(int idx, int[] arr) {
        arr[idx-1] = idx;
    }
}
