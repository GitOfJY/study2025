package answer.section7;

import java.util.Scanner;

public class Answer1 {
    public static void main(String[] args) {
        // 재귀함수 > 자기 자신을 호출하는 함수
        Answer1 T = new Answer1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        T.DFS(n);
    }

    public void DFS(int n) {
        System.out.println("DFS 호출 " + n);
        if (n == 0) {
            return;
        } else {
            DFS(n-1);
            // DFS(3) > DFS(2) 호출 > DFS(1) 호출 > ...
            // 반복문의 형태
            System.out.print(n + " ");
        }
    }
}
