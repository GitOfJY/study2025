package answer.section7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Answer8 {
    int[] dis = {1, -1, 5};                // 움직일 수 있는 경우
    int[] ch;                              // 체크배열
    Queue<Integer> Q = new LinkedList<>(); // 정수 저장

    public int BFS(int s, int e) {
        ch = new int[10001]; // 인덱스번호가 10000일때까지 있어야함
        ch[s] = 1;
        Q.offer(s);
        int L = 0; // leverl 값
        while (!Q.isEmpty()) {
            // 레벨탐색
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int x = Q.poll();

                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j]; // x의 자식노드

                    // 송아지 위치
                    if (x == e) {
                        return L+1;
                    }

                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Answer8 T = new Answer8();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(T.BFS(s, e));
    }
}
