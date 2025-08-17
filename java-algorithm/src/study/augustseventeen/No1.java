package study.augustseventeen;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        /*
        Example 1:
        Input: s = "a1b2"
        Output: ["a1b2","a1B2","A1b2","A1B2"]

        Example 2:
        Input: s = "3z4"
        Output: ["3z4","3Z4"]

        Example 3:
        Input: s = "a1b2c"
        Output: ["a1b2c","a1B2c","a1b2C", "a1B2C", "A1b2c", "A1b2C", "A1B2c", "A1B2C"] > 8개
        */

        // 10:50 시작

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }

    public static String[] solution(String str) {
        Queue<Character> queue = new LinkedList<>();

        // str에 몇 개의 문자가 있는지 확인
        int charCnt = 1;
        String tmpStr = "";
        for (char x : str.toCharArray()) {
            queue.offer(x);
            if (!Character.isDigit(x)) {
                charCnt = charCnt * 2;
                tmpStr += x;
            }
        }
        System.out.println("charcnt : " + charCnt);
        System.out.println("tmpStr : " + tmpStr);

        // 큐 구조에서 한글자씩 빼서 대문자/소문자 각각 저장, 숫자면 그냥 붙임
        // a1b2c

        // a1 > a1B a1b
        // A1 > A1B A1b
        // a1 A1 / a1B a1b A1B A1b / 8
        // 2 4 8 16

        String[] answer = new String[charCnt];
        String[] tmpAnswer = new String[str.length()];

        // {{a,A}, {1}, {b, B}, {3}, {C,c} }

        for (int i = 0; i < str.length(); i++) {
            char tmpChar = str.charAt(i);
            for (int y = 0; y < (i+1)*2; y++) {
                if (i ==0) {
                    String[] tmpArr = new String[(i+1)*2];
                    tmpArr[y] = String.valueOf(tmpChar).toUpperCase(Locale.ROOT);
                    tmpArr[y] = String.valueOf(tmpChar).toUpperCase(Locale.ROOT);
                }
                // tmpArr[y] = String.valueOf(tmpChar).toUpperCase(Locale.ROOT);
            }
        }



        return answer;

    }

    /*
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        backTracking(result, s.toCharArray(), 0);
        return result;
    }

    private void backTracking(List<String> result, char[] chars, int i){
        if (i == chars.length){
            result.add(new String(chars));
            return;
        }

        char c = chars[i];
        if (Character.isLetter(c)) {
            backTracking(result,chars,i+1);
            if (c >= 'a' && c <= 'z'){
                chars[i] = Character.toUpperCase(c);
                backTracking(result,chars,i+1);
            } else if (c >= 'A' && c <= 'Z'){
                chars[i] = Character.toLowerCase(c);
                backTracking(result,chars,i+1);
           }
        } else{
            backTracking(result,chars,i+1);
        }
    }
    */
}
