package practice.section5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        /*
         학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.
         투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.
         선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.
         반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정합니다.

         입력설명
         첫 줄에는 반 학생수 N(5<=N<=50)이 주어집니다.
         두 번째 줄에 N개의 투표용지에 쓰여져 있던 각 후보의 기호가 선생님이 발표한 순서대로 문자열로 입력됩니다.

         출력설명
         학급 회장으로 선택된 기호를 출력합니다.

         입력예제 1
         15
         BACBACCACCBDEDE

         출력예제 1
         C
        */

        Question1 T = new Question1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(T.solution(n, str));
    }

    public String solution (int n, String str) {
        String answer = "";

        // list로 쪼개서 담기
        List<String> strList = new ArrayList<>();
        for (int i=0; i<n; i++) {
            strList.add(str.substring(i, i+1));
        }

        // list에 같은 단어이면 +1 숫자 함께 담기
        HashMap<String, Integer> rslt = new HashMap<>();
        Integer max = -1;
        for (String s : strList) {
            if (!rslt.containsKey(s)) {
                rslt.put(s,0);
            } else {
                rslt.put(s, rslt.get(s) + 1);
            }

            if (max < rslt.get(s) + 1) {
                max = rslt.get(s);
            }
        }

        // {A=2, B=2, C=4, D=1, E=1}
        // max, value 비교해서 최댓값 뽑기
        for (String key : rslt.keySet()) {
            if (rslt.get(key) == max) {
                answer = key;
            }

        }
        return answer;
    }
}
