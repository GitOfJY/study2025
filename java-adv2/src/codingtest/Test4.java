package codingtest;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {

//        int[] arr = {6, 10, 15};
//        System.out.println(solution(arr));

//        int n = 2;
//        String[] words = {"ab","ba","ab","cd"};
//        int[] answer = solution(n, words);
//        System.out.println(Arrays.toString(answer));

        int n = 5;
        System.out.println(solution(n));
    }

    public static long solution(int n) {
        long answer = 0;
        int oneCnt = n;
        int twoCnt = 0;
        answer++;

        // 4
        // 1 1 1 1
        // 1 2 1
        // 2 2

        while (oneCnt > 1) {
            twoCnt++;
            oneCnt = oneCnt - 2;
            if (oneCnt == 0) {
                answer += 1;
            } else{
                answer += factorial(oneCnt + twoCnt) / (factorial(oneCnt) * factorial(twoCnt));
            }
        }

        //  1234567를 나눈 나머지를 리턴하는 함수,
        return answer%1234567;
    }

    private static int factorial(int n) {
        return n == 1 ? 1 : n * factorial(n - 1);
    }

    public static int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        int faultNo = 0;
        Set<String> wordSet = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            System.out.println("=======" + i + "==========");
            System.out.println("words[i] : " + words[i]);

            // 2. 중복확인
            wordSet.add(words[i]);

            System.out.println("words[i] : " + words[i]);
            System.out.println("i+1 : " + (i+1));
            System.out.println("wordSet.size() : " + wordSet.size());


            if (wordSet.size() != i+1) {
                System.out.println("중복발생");
                System.out.println("words[i]: " + words[i]);
                faultNo = i;
                break;
            }

            // 1. 끝문자 == 뒷문자확인
            if (i != words.length-1) {
                char endWord = words[i].charAt(words[i].length() -1);
                char StartWord = words[i+1].charAt(0);

                if (endWord != StartWord) {
                    faultNo = i+1;
                    break;
                }
            }
        }

        if (faultNo != 0) {
            answer[0] = (faultNo%n) + 1;
            answer[1] = (faultNo/n) + 1;
        }
        return answer;
    }

    public static int solution(int[] A) {
        int answer = 1;
        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            int target = A[i];
            A[i] = 1;
            answer = answer * target;

            System.out.println("=========" + i + "=========");
            System.out.println("target : " + target);
            System.out.println(Arrays.toString(A));
            System.out.println("answer : " + answer);

            for (int k = 2; k <= target; k++) {
                while (target % k == 0) {
                    target /= k;
                    for (int j = i + 1; j < A.length; j++) {
                        if ((A[j]%k) ==0) {
                            A[j] = A[j] / k;
                        }
                    }
                    Arrays.sort(A);
                }
            }
            Arrays.sort(A);
        }
        return answer;
    }
}
