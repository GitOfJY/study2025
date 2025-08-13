package answer.section3;

import java.util.Scanner;

public class Answer5 {
    public static void main(String[] args) {
        Answer5 T = new Answer5();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(T.solution(n));
    }

    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        int lt = 0;
        int m = n/2 + 1;
        int[] arr = new int[m];

        for (int i =0; i < m; i++) {
            arr[i] = i+1;
        }

        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if (sum == n) {
                answer ++;
            }
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) {
                    answer ++;
                }
            }
        }
        return answer;
    }
}
