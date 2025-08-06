package answer.section2;

import java.util.Scanner;

public class Answer11 {
    public static void main(String[] args) {
        Answer11 T = new Answer11();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][6];
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
    }

    public int Solution(int n, int[][] arr) {
        int answer = 0;
        return answer;
    }
}
