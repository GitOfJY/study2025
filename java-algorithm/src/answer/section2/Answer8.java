package answer.section2;
import java.util.Scanner;

public class Answer8 {
    public static void main(String[] args) {
        Answer8 T = new Answer8();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x: T.Solution(n, arr)) {
            System.out.println(x + " ");
        }
    }

    public int[] Solution(int n, int[] arr){
        int[] answer = new int[n];

        for (int i=0; i<n; i++) {
            int cnt = 1;
            for (int j=0; j<n; j++) {
                if (arr[j]>arr[i]) {
                    cnt ++;
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }

}
