package answer.section1;
import java.util.Scanner;

public class Answer8 {
    public static void main(String[] args) {
        Answer8 T = new Answer8();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.Solution(str));
    }

    public String Solution(String s) {
        String answer = "NO";

        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        if (s.equals(tmp)) {
            return "YES";
        }

        return answer;
    }

}
