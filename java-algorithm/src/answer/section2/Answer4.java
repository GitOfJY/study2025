package answer.section2;
import java.util.Scanner;

public class Answer4 {
    public static void main(String[] args) {
        Answer4 T = new Answer4();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int x : T.Solution(n)) {
            System.out.println(x + " ");
        }
    }

    // SOL1. 배열
    public int[] Solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for (int i=2; i<n; i++) {
            answer[i] = answer[i-2] + answer[i-1];
        }
        return answer;
    }

    // SOL2. 배열 사용하지 않고 손코딩
    public void solution1(int n) {
        int a=1, b=1, c;
        System.out.print(a+ " " + b + " ");
        for (int i=2; i<n; i++) {
            c = a+b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

}
