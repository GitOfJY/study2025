package answer.section7;

import java.util.ArrayList;
import java.util.Scanner;

public class Answer10V2AdjacencyList {
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph; // 인접리스트
    static int[] ch; // 체크배열

    public void ALS(int v) {
        if (v == 1) {
            answer++;
        } else {
            for (int nv : graph.get(v)) {
                // v 번 arraylist
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    ALS(nv);
                    ch[nv] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        // N이 너무 커지면 인접행렬로 풀기 어렵다 > 인접리스트 사용
        Answer10V2AdjacencyList T = new Answer10V2AdjacencyList();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        ch = new int[n+1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }

        ch[1] = 1;
        T.ALS(1);
    }
}
