package practice.section5;

import java.util.*;

public class Question1 {
    public static void main(String[] args) {
       /*
       괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
       (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.

       입력설명
       첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.

       출력설명
       첫 번째 줄에 YES, NO를 출력한다.

       입력예제 1
       (()(()))(()

       출력예제 1
       NO
       */

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }


    public static String solution(String s) {
        String answer = "YES";

        // 리스트로 만들기
        // ( 다음 ) 오는 순서대로 리스트에서 삭제
        // 한바퀴 돈 후 처음과 마지막 (,) 짝인이 확인
        // 계속 진행 > 시간이 오래 걸릴지 모르겠다 ...

        List<Character> tmpList = new ArrayList<>();

        for (char x : s.toCharArray()) {
            tmpList.add(x);
        }

        while (!tmpList.isEmpty()) {
            for (int i = 0; i < tmpList.size()-1; i ++) {
                if (!tmpList.get(0).equals('(') || !tmpList.get(tmpList.size() - 1).equals(')')) {
                    return "NO";
                }

                if (tmpList.get(i).equals('(') && tmpList.get(i+1).equals(')')) {
                    tmpList.set(i, '0');
                    tmpList.set(i+1, '0');
                }
            }

            Iterator<Character> iterator = tmpList.iterator();
            while (iterator.hasNext()) {
                Character character = iterator.next();
                if ('0' == character) {
                    iterator.remove();
                }
            }
        }

        return answer;
    }
}
