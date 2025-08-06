package answer.section1;

import java.util.Scanner;


public class Answer6 {
    public static void main(String[] args) {
        Answer6 T = new Answer6();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.Solution(str));
    }

    public String Solution(String str) {
        String answer = "";

        for (int i=0; i<str.length(); i++) {
            //System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            if (str.indexOf(str.charAt(i))==i) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }

}
