package answer.section6;

import java.util.Arrays;
import java.util.Scanner;

public class Answer9 {
    public static void main(String[] args) {
        Answer9 T = new Answer9();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while (lt <= rt) {
            int mid = (lt + rt)/2;
            if (count(arr, mid) <= 3) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return answer;
    }

    public int count(int[] arr, int capacity) {
        int cnt = 1; // dvd 장수
        int sum = 0; // dvd 담아내는 장수

        for (int x : arr) {
            if (sum + x > capacity) {
                cnt ++;
                sum = x;
            } else {
                sum += x;
            }
        }
        return cnt;
    }
}
