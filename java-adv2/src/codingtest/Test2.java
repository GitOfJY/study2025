package codingtest;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {

        /*
        * k	           tangerine    	result
        * 6	[1, 3, 2, 5, 4, 5, 2, 3]	3
        * 4	[1, 3, 2, 5, 4, 5, 2, 3]	2
        * 2	[1, 1, 1, 1, 2, 2, 2, 3]	1
        */
        int k = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        solution(k, tangerine);
        System.out.println(solution(k, tangerine));
    }

    public static int solution(int k, int[] tangerine) {
        Arrays.sort(tangerine);

        int[] cntArr = new int[tangerine.length];
        int idx = 0;
        cntArr[idx] = 1;

        for (int i = 1; i < tangerine.length; i++) {
            int target = tangerine[i-1];
            if (target == tangerine[i]) {
                cntArr[idx] = cntArr[idx] + 1;
            } else {
                idx++;
                cntArr[idx] = 1;
            }
        }

        Arrays.sort(cntArr);
        int kCnt = 0;
        int answer = 0;

        for (int i = cntArr.length - 1; i >= 0; i--) {
            kCnt = kCnt + cntArr[i];
            if (kCnt == k || kCnt > k) {
                answer++;
                return answer;
            } else {
                answer++;
            }
        }
        return answer;
    }
}
