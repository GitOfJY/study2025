package practice.section5;

import java.util.*;

public class Question2 {
    public static void main(String[] args) {
       /*
       입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.

       입력설명
       첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.

       출력설명
       남은 문자만 출력한다.

       입력예제 1
       (A(BC)D)EF(G(H)(IJ)K)LM(N)

       출력예제 1
       EFLM
       */

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }


    public static String solution(String s) {
        String answer = "";
        Stack<Character> stack = new Stack<>();

        // (A(BC)D)EF(G(H)(IJ)K)LM(N)
        for (char x : s.toCharArray()) {
            if (x != ')') {
                stack.push(x);
            } else {
                while (!stack.pop().equals('(')) {
                    stack.peek();
                }
            }
        }

        for (char x : stack) {
            answer += x;
        }
        return answer;
    }
}

