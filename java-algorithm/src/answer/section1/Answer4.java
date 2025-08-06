package answer.section1;

import java.util.ArrayList;
import java.util.Scanner;

public class Answer4 {
    public static void main(String[] args) {
        Answer4 T = new Answer4();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i=0; i<n; i++) {
            str[i] = sc.next();
        }
        for (String x : T.Solution(n, str)) {
            System.out.println(x);
        }
    }

    // SOL1
//    public ArrayList<String> solution (int n, String[] str) {
//        ArrayList<String> answer = new ArrayList<>();
//
//        for (String x : str) {
//            String temp = new StringBuilder(x).reverse().toString();
//            answer.add(temp);
//        }
//
//        return answer;
//    }

    // SOL2
    public ArrayList<String> Solution (int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length()-1;
            while (lt<rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            // valueOf : static으로 선언된 메서드
            answer.add(tmp);
        }

        return answer;
    }

}
