package answer.section2;
import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {
        Answer2 T = new Answer2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for ( int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.Solution(n, arr));
    }

    public int Solution(int n, int[] arr) {
        int answer=1, max=arr[0];
        for (int i=1; i<n; i++) {
            if (arr[i]>max) {
                answer++;
                max=arr[i];
            }
        }
        return answer;
    }
}
