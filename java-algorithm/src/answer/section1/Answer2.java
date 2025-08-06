package answer.section1;
import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {

        Answer2 T = new Answer2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.Solution(str));

    }

    public String Solution(String str) {
        String answer = "";

        // SOL1.
        // for (char x : str.toCharArray()) {
        //    if (Character.isLowerCase(x)) {
        //        answer += Character.toUpperCase(x);
        //    } else {
        //        answer += Character.toLowerCase(x);
        //    }
        // }

        // SOL2. 아스키넘버 (대소문자 차이 - 32)
        for (char x : str.toCharArray()) {
            if (x>=97 && x<=122) {
                answer += (char)(x-32);
            } else {
                answer += (char)(x+32);
            }
        }

        return answer;
    }
}
