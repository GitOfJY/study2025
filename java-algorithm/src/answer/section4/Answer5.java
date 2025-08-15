package answer.section4;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Answer5 {

    public int solution (int[] arr, int n, int k) {
        TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i<n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int l = j+1; l < n; l++) {
                    tSet.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;
        for (int x : tSet) {
            cnt ++;
            if (cnt == k) {
                return x;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Answer5 T = new Answer5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(arr, n, k));
    }
}

