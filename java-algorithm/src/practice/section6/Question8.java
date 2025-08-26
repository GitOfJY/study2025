package practice.section6;

import java.util.Arrays;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        /*
        이분검색
        임의의 N개의 숫자가 입력으로 주어집니다.
        N개의 수를 오름차순으로 정렬한 다음 N개의 수 중 한 개의 수인 M이 주어지면 이분검색으로 M이 정렬된 상태에서 몇 번째에 있는지 구하는 프로그램을 작성하세요.
        단 중복값은 존재하지 않습니다.

        입력설명
        첫 줄에 한 줄에 자연수 N(3<=N<=1,000,000)과 M이 주어집니다.
        두 번째 줄에 N개의 수가 공백을 사이에 두고 주어집니다.

        출력설명
        첫 줄에 정렬 후 M의 값의 위치 번호를 출력한다.

        입력예제 1
        8 32
        23 87 65 12 57 32 99 81

        15 99
        73 32 31 49 94 37 40 62 78 66 27 100 99 29 9

        출력예제 1
        3
        */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(m, arr));
    }

    public static int solution(int m, int[] arr) {
        int idx = 0;
        int pl = 0;
        int pr = arr.length - 1;

        // 정렬
        Arrays.sort(arr);

        // 이분검색으로 index 찾기
        for (int i = 0; i < arr.length; i++) {
            int pc = (pl + pr) / 2;

            if (arr[pc] == m) {
                idx = pc;
                break;
            }

            if (arr[pc] > m) { // 중앙 기준 오른쪽 위치
                pr = pc - 1;
            } else if (arr[pc] < m) {  // 중앙 기준 왼쪽 위치
                pl = pc + 1;
            }
        }

        return idx + 1;
    }
}

