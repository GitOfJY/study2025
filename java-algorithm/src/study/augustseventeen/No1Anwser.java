package study.augustseventeen;

import java.util.*;

public class No1Anwser {
    public static void main(String[] args) {
        letterCasePermutation("a1b2c");
    }

    public static List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        backTracking(result, s.toCharArray(), 0);
        return result;
    }

    private static void backTracking(List<String> result, char[] chars, int i){
        System.out.println("### backTracking");

        for (char x : chars) {
            System.out.println("x : " + x);
        }
        System.out.println();
        System.out.println();

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
}
