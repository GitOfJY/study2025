package codingtest;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test5 {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 2};
        // System.out.println(solutionV2(arr));


        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        // "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", 4
        //  "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", 3
        // "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana" 5
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        System.out.println(solutionV3(want, number, discount));
    }

    private static int solutionV3(String[] want, int[] number, String[] discount) {
        int firstDay = 0;
        int lastDay = 0;
        int tmpDay = 0;
        List<Integer> indexes;

        for (int i = 0; i < want.length; i++) {
            String target = want[i];
            int itemNum = number[i];
            indexes = IntStream.range(0, discount.length)
                    .filter(k -> discount[k].equals(target))
                    .boxed()
                    .toList();
            // [3, 7, 11, 13] banana 3 > 3 7 > (3 11) (7 13)
            // [1, 2, 5, 12]  apple 2 > 1 2 5
            // [4, 9]         rice 2 > 4
            // [6, 8]         pork 2 > 6
            // [10]           pot 1 > 10
            // 0 0 0 0 0 0 0 0 0 0 0 0 0 0
            // 4, 13 > 9일
            // 2 3 4

            System.out.println("indexes: " + indexes);
            System.out.println("target: " + target);
            System.out.println("itemNum: " + itemNum);

            if (indexes.isEmpty()) {
                return 0;
            }
            tmpDay = indexes.get(indexes.size() - itemNum);
            if (firstDay == 0 || firstDay > tmpDay) {
                firstDay = tmpDay;
            }
        }
        return firstDay;
    }

    private static int solutionV2(int[] arr) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(arr);

        // 5, 2, 8, 1, 3
        // 1 2 3 5 8 1 2 3 5 8
        // 7 15 12

        int[] tmpArr = new int[arr.length*2];
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            tmpArr[i] = arr[i];
            tmpArr[i+arr.length] = arr[i];
            set.add(arr[i]);
            totalSum += arr[i];
        }
        set.add(totalSum);

        for (int i = 2; i < arr.length; i++) {
            System.out.println("=== " + i + " ===");
            int windowSum = 0;

            // 첫 윈도우 합 계산
            for (int j =0; j < i; j++) {
                windowSum += arr[j];
            }
            set.add(windowSum);
            System.out.println("첫 윈도우 합 계산 : " + windowSum);

            for (int j = 1; j < arr.length; j++) {
                System.out.println("=== " + j + " ===");
                System.out.println("tmpArr[j-1] : " + tmpArr[j-1]);
                System.out.println("tmpArr[j+i-1] : " + tmpArr[j+i-1]);
                // 1 2 3 5 8 1 2 3 5 8

                windowSum = windowSum - tmpArr[j-1] + tmpArr[j+i-1];
                System.out.println("windowSum : " + windowSum);
                set.add(windowSum);
            }
            System.out.println();
            System.out.println();
            System.out.println();
        }
        System.out.println("set: " + set);
        // [1, 2, 3, 5, 6, 8, 9, 10, 11, 13, 14, 16, 17, 18, 19]
        // [5, 2, 8, 1, 3, 7, 10, 11, 9, 6, 15, 14, 16, 13, 12, 19, 18]
        // 7 15 12
        return set.size();
    }

    private static int solution(int n, int a, int b) {
        int answer = 0;

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        } // 무조건 a < b

        while (answer < n) {
            if ((a+1==b) && (a%2 ==1)) {
                answer++;
                break;
            } else {
                answer++;
                a = getNextIn(a);
                b = getNextIn(b);
            }
        }

        return answer;
    }

    private static int getNextIn(int a) {
        if (a %2 == 1) {
            a = a /2 + 1;
        } else {
            a = a /2;
        }
        return a;
    }
}
