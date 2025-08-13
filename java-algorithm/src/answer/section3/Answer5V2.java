package answer.section3;

import java.util.Scanner;

public class Answer5V2 {
    public static void main(String[] args) {
        Answer5V2 T = new Answer5V2();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(T.solution(n));
    }

    public int solution(int n) {
        int answer = 0;
        int cnt = 1;

        n--;

        while (n > 0) {
            cnt ++;
            n = n - cnt;
            if (n % cnt == 0) {
                answer++;
            }
        }
        return answer;
    }
}
