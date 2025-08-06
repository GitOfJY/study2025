package answer.section1;
import java.util.Scanner;

public class Answer3 {
    public static void main(String[] args) {
        Answer3 T = new Answer3();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.Solution(str));
    }

    public String Solution(String str) {
        String answer = "";

        // SOL1. split
        // int m = Integer.MIN_VALUE;
        // String[] s = str.split(" ");
        // for (String x : s) {
        //     int len = x.length();
        //     if (len>m) {
        //         m = len;
        //         answer = x;
        //     }
        // }

        // SOL2. indexOf+substring
        int m = Integer.MIN_VALUE, pos;
        while ((pos = str.indexOf(" ")) != -1) {
            String temp = str.substring(0, pos);
            int len = temp.length();
            if (len>m) {
                m = len;
                answer = temp;
            }
            str = str.substring(pos+1);
        }

        if (str.length()>m) {
            answer = str;
        }

        return answer;
    }

}
