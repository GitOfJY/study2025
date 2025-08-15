package practice.section4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        /*
         Anagram이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 합니다.
         예를 들면 AbaAeCe 와 baeeACA 는 알파벳을 나열 순서는 다르지만 그 구성을 살펴보면
         A(2), a(1), b(1), C(1), e(2)로 알파벳과 그 개수가 모두 일치합니다. 즉 어느 한 단어를 재배열하면 상대편 단어가 될 수 있는 것을 아나그램이라 합니다.
         길이가 같은 두 개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램을 작성하세요. 아나그램 판별시 대소문자가 구분됩니다.

         입력설명
         첫 줄에 첫 번째 단어가 입력되고, 두 번째 줄에 두 번째 단어가 입력됩니다.
         단어의 길이는 100을 넘지 않습니다.

         출력설명
         두 단어가 아나그램이면 “YES"를 출력하고, 아니면 ”NO"를 출력합니다.

         입력예제 1
         AbaAeCe
         baeeACA

         출력예제 1
         YES

         입력예제 2
         abaCC
         Caaab

         출력예제 2
         NO
        */
        Question2 T = new Question2();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(T.solution(str1, str2));
    }

    public String solution (String str1, String str2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // str1 > map1
        for (Character x : str1.toCharArray()) {
            map1.put(x, map1.getOrDefault(x, 0)+1);
        }

        // str2 > map2
        for (Character x : str2.toCharArray()) {
            map2.put(x, map2.getOrDefault(x, 0)+1);
        }

        // map1, map2 비교 (문자)
        for (Character key : map1.keySet()) {
            if (!map2.containsKey(key)) {
                return "NO";
            }
        }

        // map1, map2 비교 (숫자)
        for (Map.Entry<Character, Integer> x : map1.entrySet()) {
            for (Map.Entry<Character, Integer> y : map2.entrySet()) {
                if (x.getKey().equals(y.getKey())) {
                    if (x.getValue() != y.getValue()) {
                        return "NO";
                    }
                }
            }
        }

        return "YES";
    }
}
