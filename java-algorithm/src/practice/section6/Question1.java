package practice.section6;

import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        /*
        [선택정렬]
        N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
        정렬하는 방법은 선택정렬입니다.

        입력설명
        첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
        두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.

        출력설명
        오름차순으로 정렬된 수열을 출력합니다.

        입력예제 1
        6
        13 5 11 7 23 15

        출력예제 1
        5 7 11 13 15 23
        */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }

    public static int[] solution(int n, int[] arr) {
        // 선택 정렬 > 배열 첫번재부터 비교하는데 min_value 찾아서 자리 바꿈
        for (int i = 0; i < n; i++) {
            int minValue = arr[i];
            int key = 0;
            Map<Integer, Integer> minMap = new HashMap<>();

            for (int j = i + 1; j < n; j++) {
                if (minValue > arr[j]) {
                    minValue = arr[j];
                    key = j;
                    if (minMap.isEmpty()) {
                        minMap.put(j, arr[j]);
                    } else {
                        minMap.clear();
                        minMap.put(j, arr[j]);
                    }
                } else {
                    // minValue <= arr[j]
                    if (minMap.isEmpty()) {
                        minMap.put(i, minValue);
                    } else {
                        minMap.clear();
                        minMap.put(i, minValue);
                        // 비어있지 않을 때 처리 필요
                    }
                }
            }
            if (arr[i] != minValue) {
                int tmp = arr[i];
                arr[i] = minValue;
                arr[key] = tmp;
            }
        }
        return arr;
    }
}
