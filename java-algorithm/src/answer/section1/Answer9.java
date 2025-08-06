package answer.section1;
import java.util.Scanner;

public class Answer9 {
    public static void main(String[] args) {
        Answer9 T = new Answer9();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.Solution(str));
    }

    // SOL1.
//    public int solution(String s) {
//        int answer = 0;
//        for (char x : s.toCharArray()) {
//            if (x>=48 && x<=57) {
//                answer = answer*10+(x-48);
//            }
//        }
//        return answer;
//    }

    // SOL2.
    public int Solution(String s) {
        String answer = "";
        for (char x : s.toCharArray()) {
            if (Character.isDigit(x)) {
                answer += x;
            }
        }
        return Integer.parseInt(answer);
    }

}
