package practice.section1;
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        /*
        설명
        한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.

        입력
        첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
        문자열의 길이는 100을 넘지 않는다.

        출력
        첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.

        teachermode e
        1 0 1 2 1 0 1 2 2 1 0
        */

        Question10 T = new Question10();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(T.solution(input));

    }

    public String solution(String str) {
        String answer = "";

        String[] strArr = str.split(" ");
        String[] wordS = strArr[0].split("");
        String wordT = strArr[1];

        for (int i=0; i<wordS.length; i++) {
            if (i == 0) {
                answer += spaceR(i, wordS, wordT) + " ";
            } else if (i == wordS.length-1) {
                answer += spaceL(i, wordS, wordT);
            } else {
                if (spaceR(i, wordS, wordT) > spaceL(i, wordS, wordT)) {
                    answer += spaceL(i, wordS, wordT) + " ";
                } else {
                    answer += spaceR(i, wordS, wordT) + " ";
                }
            }
        }

        return answer;
    }

    public int spaceR(int index, String[] arr, String word) {
        int cnt = 0;

        if (arr[index].equals(word)) return cnt;

        for (int i=index+1; i<arr.length; i++) {
            if (!arr[i].equals(word)) {
                cnt++;
            } else {
                cnt++;
                return cnt;
            }
        }

        return cnt;
    }

    public int spaceL(int index, String[] arr, String word) {
        int cnt = 0;

        if (arr[index].equals(word)) return cnt;

        for (int i=index; i>-1; i--) {
            if (!arr[i].equals(word)) {
                cnt++;
            } else {
                return cnt;
            }
        }

        return cnt;
    }
}
