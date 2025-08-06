package practice.section1;
import java.util.Arrays;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
       /*
       설명
       문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
       만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
       추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.

       입력
       첫 줄에 숫자가 섞인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.

       출력
       첫 줄에 자연수를 출력합니다.

       g0en2T0s8eSoft
       208
       */

        Question9 T = new Question9();
        Scanner kb = new Scanner(System.in);
        String input = kb.next();
        System.out.println(T.solution(input));

    }

    public int solution(String str) {
        String answer = "";
        String[] arr = str.split("");
        Boolean isNum = false;

        for (String x : arr) {
            char temp = x.charAt(0);
            isNum = Character.isDigit(temp);
            if (isNum==true) {
                answer += temp;
            }
        }

        return Integer.parseInt(answer);
    }

}
