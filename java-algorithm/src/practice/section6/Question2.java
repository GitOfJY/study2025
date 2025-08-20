package practice.section6;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
       /*
       [버블정렬]
       N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
       정렬하는 방법은 버블정렬입니다.

       입력설명
       첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
       두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.

       출력설명
       오름차순으로 정렬된 수열을 출력합니다.

       입력예제 1
       6
       13 5 11 7 23 15

       출력예제 1
       5 7 11 13 15 23
       */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }

    public static int[] solution (int n, int[] arr) {
        // 버블 정렬은 첫 번째 자료와 두 번째 자료를, 두 번째 자료와 세 번째 자료를, 세 번째와 네 번째를, … 이런 식으로 (마지막-1)번째 자료와 마지막 자료를 비교하여 교환하면서 자료를 정렬한다.
        // 1회전을 수행하고 나면 가장 큰 자료가 맨 뒤로 이동하므로 2회전에서는 맨 끝에 있는 자료는 정렬에서 제외되고, 2회전을 수행하고 나면 끝에서 두 번째 자료까지는 정렬에서 제외된다.
        // 이렇게 정렬을 1회전 수행할 때마다 정렬에서 제외되는 데이터가 하나씩 늘어난다.

        // 두개씩 비교 필요
        int x = n-1;
        while (x > 0) {
            for (int i = 0; i < x; i ++) {
                if (arr[i+1] < arr[i]) {
                    int tmpInt = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmpInt;
                }
            }
            x = x-1;
        }
        return arr;
    }
}
