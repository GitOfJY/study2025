package practice.section1;
import java.util.Arrays;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

       /*
        설명
        소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
        중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.

        입력
        첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.

        출력
        첫 줄에 중복문자가 제거된 문자열을 출력합니다.

        ksekkset
        kset
        */

        Question6 T = new Question6();
        Scanner kb = new Scanner(System.in);
        String input = kb.next();
        System.out.println(T.solution(input));

    }

    public String solution(String str) {
        String answer = "";
        String[] tempArr = str.split("");
        String[] tempAnswer = str.split("");

        for (int i=0; i<tempArr.length; i++) {
            for (int j=i+1; j<tempArr.length; j++) {
                if (tempArr[i].equals(tempArr[j])) {
                    tempAnswer[j] = null;
                }
            }
        }

        for (String s : tempAnswer) {
            if (s!=null) {
                answer += s;
            }
        }
        return answer;
    }

}
