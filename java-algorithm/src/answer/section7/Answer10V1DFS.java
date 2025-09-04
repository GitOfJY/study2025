package answer.section7;

import java.util.Scanner;

public class Answer10V1DFS {
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;

    public void DFS(int v) {
        if (v == n) {
            answer++;
        } else {
            for (int i = 0; i < n; i++) {
                if (graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1; // 호출 전 시점에서는 방문 체크 > 1
                    DFS(i);
                    ch[i] = 0; // 호출 후 돌아온 시점에서는 방문 체크 > 0
                }
            }
        }
    }

    public static void main(String[] args) {
        // 경로 > 방문한 노드를 재방문할 수 없음 > 재귀함수는 방문 확인용 체크 배열을 만들어야함
        // DFS 풀이

        Answer10V1DFS answer10 = new Answer10V1DFS();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n+1][n+1];
        ch = new int[n+1];
        for (int i = 1; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1; // 출발점
        answer10.DFS(1);
        System.out.println(answer);
    }
}
