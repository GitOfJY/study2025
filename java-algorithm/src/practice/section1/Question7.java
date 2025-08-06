package practice.section1;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

       /*
       설명
       앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
       문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
       단 회문을 검사할 때 대소문자를 구분하지 않습니다.

       입력
       첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.

       출력
       첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.

       gooG
       YES
       */

        Question7 T = new Question7();
        Scanner kb = new Scanner(System.in);
        String input = kb.next();
        System.out.println(T.solution(input));

    }

    public String solution (String str) {
        String answer = "";
        String[] arr = str.toLowerCase().split("");
        boolean result = true;

        for (int i=0; i<str.length()/2; i++) {
            if (!arr[i].equals(arr[str.length()-1-i])) {
                result = false;
            }
        }

        if (result==true) {
            answer = "YES";
        } else {
            answer = "NO";
        }
        return answer;
    }

}
