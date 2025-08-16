package answer.section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Answer7 {
    public static void main(String[] args) {
        Answer7 T = new Answer7();
        Scanner sc = new Scanner(System.in);
        String need = sc.next();
        String plan = sc.next();
        System.out.println(T.solution(need, plan));
    }
    public String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();

        for (char x : need.toCharArray()) {
            Q.offer(x);
        }

        for (char x : plan.toCharArray()) {
            if (Q.contains(x)) {
                if (x != Q.poll()) {
                    return "NO";
                }
            }
        }
        if (!Q.isEmpty()) {
            return "NO";
        }
        return answer;
    }
}
