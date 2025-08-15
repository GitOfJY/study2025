package practice.section5;

import java.util.Scanner;
import java.util.Stack;

public class Question4 {
    public static void main(String[] args) {
       /*
       후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
       만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.

       입력설명
       첫 줄에 후위연산식이 주어집니다. 연산식의 길이는 50을 넘지 않습니다.
       식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.

       출력설명
       연산한 결과를 출력합니다.

       입력예제 1
       352+*9-
       출력예제 1
       12
       */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }

    public static int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        int whileCnt = 0;

        for (char x : str.toCharArray()) {
            if (x == '+' || x == '*' || x == '-' || x == '/') {
                whileCnt += 1;
            }
            stack.push(x);
        }

        // System.out.println("stack.toString(): " + stack.toString());
        // stack.toString(): [3, 5, 2, +, *, 9, -]

        while (whileCnt > 0) {
            whileCnt--;
            for (int i = 0; i < stack.size(); i++) {
                System.out.println("stack.get(i) : " + stack.get(i));
                if (stack.get(i) == '+' || stack.get(i) == '*' || stack.get(i) == '-' || stack.get(i) == '/') {
                    char tmpValue = getNum(stack.pop(), stack.pop(), stack.get(i));
                    stack.push(tmpValue);
                    break;
                } else {
                    continue;
                }
            }
        }

//            for (char x : str.toCharArray()) {
//                System.out.println("x : " + x);
//
//                // 1~9의 숫자와 +, -, *, / 연산자
//                if (stack.isEmpty()) {
//                    stack.push(x);
//                } else {
//                    if (x == '+' || x == '*' || x == '-' || x == '/') {
//                        System.out.println("stack.toString() : " + stack.toString());
//                        char tmpValue = getNum(stack.pop(), stack.pop(), x);
//                        System.out.println("x : " + x);
//                        System.out.println("tmpValue : " + tmpValue);
//                        stack.push(tmpValue);
//                        System.out.println();
//                        break;
//                    } else {
//                        stack.push(x);
//                    }
//                }
//            }

        // 352+*9-
        // 37*9-
        // 219-
        // 21 - 9

        return answer;
    }

    // 1~9의 숫자와 +, -, *, / 연산자
    private static char getNum(char x, char y,char operator) {
        int tmpAnswer = 0;

        switch (operator) {
            case '+' :
                tmpAnswer = Character.getNumericValue(x) + Character.getNumericValue(y);
                break;
            case '-' :
                tmpAnswer = Character.getNumericValue(x) - Character.getNumericValue(y);
                break;
            case '*' :
                tmpAnswer = Character.getNumericValue(x) * Character.getNumericValue(y);
                break;
            case '/' :
                tmpAnswer = Character.getNumericValue(x) / Character.getNumericValue(y);
                break;
        }
        return (char)(tmpAnswer+ '0');
    }
}