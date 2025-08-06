package answer.section1;
import java.util.Scanner;

public class Answer1 {
    public static void main(String[] args) {

        Answer1 T = new Answer1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);

        System.out.println(T.Solution(str, c));

    }

    public int Solution(String str, char t) {
        int answer = 0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);

       /*
       SOL1.
       for (int i=0; i<str.length(); i++) {
           if (str.charAt(i)==t) {
               answer++;
           }
       }
       */

        // SOL2. for each + 스트링배열 생성
        for (char x : str.toCharArray()) {
            if (x==t) {
                answer++;
            }
        }

        return answer;
    }
}
