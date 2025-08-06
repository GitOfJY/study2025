package practice.section1;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        /*
        설명
        알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
        문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
        단 반복횟수가 1인 경우 생략합니다.

        입력
        첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.

        출력
        첫 줄에 압축된 문자열을 출력한다.

        KKHSSSSSSSE
        K2HS7E

        KSTTTSEEKFKKKDJJGG
        KST3SE2KFK3DJ2G2
        */

        Question11 T = new Question11();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(T.solution(input));

    }

    public String solution (String str) {

        String answer = "";
        String[] strArr = str.split("");

        for (int i=0; i<strArr.length-1; i++) {
            answer += strArr[i];
            answer += getSpace(i, strArr);
            if (!strArr[i].equals(strArr[i+1])) {
                answer += " ";
            }
        }

        String[] rsl = answer.split(" ");

        answer = "";

        for (String s : rsl) {
            if (s.substring(1,2).equals("1")) {
                answer += s.substring(0,1);
            } else {
                answer += s.substring(0,2);
            }
        }

        if (!strArr[strArr.length-1].equals(strArr[strArr.length-2])) {
            answer += strArr[strArr.length-1];
        }

        return answer;
    }

    public int getSpace(int index, String[] arr) {
        int cnt = 1;

        for (int i=index; i< arr.length-1; i++) {
            if (arr[i].equals(arr[i+1])) {
                cnt++;
            } else {
                return cnt;
            }
        }

        return cnt;
    }
}
