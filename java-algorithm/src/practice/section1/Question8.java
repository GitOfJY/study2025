package practice.section1;
import java.util.Arrays;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {

       /*
       설명
       앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
       문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
       단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
       알파벳 이외의 문자들의 무시합니다.

       입력
       첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.

       출력
       첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.

       found7, time: study; Yduts; emit, 7Dnuof
       YES
       */

        Question8 T = new Question8();
        Scanner kb = new Scanner(System.in);
        String input = kb.nextLine();
        System.out.println(T.solution(T.getArr(input)));

    }

    public String[] getArr (String str) {
        String[] arr = str.split(" ");
        String[] resultArr = new String[arr.length];
        int i = 0;

        for (String s : arr) {
            String[] temp = s.split("");
            String tempStr = "";
            for (String x : temp) {
                char c = x.charAt(0);
                if ((65<=c && c<=90) || (97<=c && c<=122)) {
                    tempStr += c;
                }
            }
            resultArr[i] = tempStr;
            i++;
        }
        return resultArr;
    }

    public String solution (String[] arr) {
        String answer = "";

        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();

        if (arr.length < 2) {
            int tempInt = arr[0].length();
            sb1.append(arr[0].substring(0, tempInt/2));
            sb2.append(arr[0].substring(tempInt-tempInt/2, tempInt)).reverse();
        } else {
            for (int i=0; i<arr.length/2; i++) {
                StringBuffer temp = new StringBuffer();
                sb1.append(arr[i].toLowerCase());
                temp.append(arr[arr.length-1-i].toLowerCase());
                sb2.append(temp.reverse());
            }
        }

        if (sb1.toString().equals(sb2.toString())) {
            answer = "YES";
        } else {
            answer = "NO";
        }

        return answer;
    }

}
