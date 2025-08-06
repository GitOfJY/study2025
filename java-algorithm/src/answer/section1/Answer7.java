package answer.section1;
import java.util.Scanner;

public class Answer7 {
    public static void main(String[] args) {
        Answer7 T = new Answer7();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.Solution(str));
    }

    public String Solution(String str) {
        String answer = "NO";

        // SOL1. toUpperCase
        // str = str.toUpperCase();
        // int len = str.length();
        // for (int i=0; i<len/2; i++) {
        //    if (str.charAt(i)!=str.charAt(len-i-1)) {
        //        return "NO";
        //    }
        //}

        // SOL2. StringBuilder + equals
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) {
            answer = " YES";
        }
        return answer;

    }

}
