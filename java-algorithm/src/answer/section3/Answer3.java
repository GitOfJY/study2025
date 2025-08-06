package answer.section3;

import java.util.Scanner;

public class Answer3 {
    public static void main(String[] args) {
        // 슬라이딩 윈도우?
        // 이중for문으로 돌면 시간이 너무 오래걸림

        Answer3 T = new Answer3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = sc.nextInt();
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.Solution(n, k, arr));

    }

    public int Solution(int n, int k, int[] arr) {
        int answer = 0, sum = 0;
        for (int i=0; i<k; i++) {
            sum += arr[i];
        }
        answer = sum;
        for (int i=k; i<n; i++) {
            sum += (arr[i] - arr[i-k]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }

}
