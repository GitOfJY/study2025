package answer.section2;
import java.util.Scanner;

public class Answer7 {
    public static void main(String[] args) {
        Answer7 T = new Answer7();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.Solution(n, arr));
    }

    public int Solution(int n, int[] arr) {
        int answer = 0, cnt=0;

        for (int i=0; i<n; i++) {
            if (arr[i]==1) {
                cnt++;
                answer += cnt;
            } else {
                cnt = 0;
            }
        }

        return answer;
    }

}
