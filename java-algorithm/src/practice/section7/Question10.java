package practice.section7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        /*
        경로탐색(인접행렬)
        방향그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의 가지 수를 출력하는 프로그램을 작성하세요
        아래 그래프에서 1번 정점에서 5번 정점으로 가는 가지 수는
        1 2 3 4 5
        1 2 5
        1 3 4 2 5
        1 3 4 5
        1 4 2 5
        1 4 5
        총 6가지입니다

        입력설명
        첫째 줄에는 정점의 수 N(1<=N<=20)와 간선의 수 M가 주어진다
        그 다음부터 M줄에 걸쳐 연결정보가 주어진다

        출력설명
        총 가지수를 출력한다

        입력예제1
        5 9
        1 2
        1 3
        1 4
        2 1
        2 3
        2 5
        3 4
        4 2
        4 5

        출력예제1
        6
        */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n+1][n+1];

        for (int i = 0; i < m; i++) {
            int rt = sc.nextInt();
            int lt = sc.nextInt();
            arr[rt-1][lt-1] = 1;
        }
        System.out.println(solution(n, arr));
    }

    public static int solution(int n, int[][] arr) {
        int answer = 0;

        /*
        0 1 1 1 0
        1 0 1 0 1
        0 0 0 1 0
        0 1 0 0 1
        0 0 0 0 0
        
        1에서 5로 이동하는 방법
        - 시작은 무조건 [0][0], 도착은 [1,5] or [3,5]
        - 일단 0행 돌면서 1 확인 > [0][1] [0][2] [0][3]
        > 1 있는 좌표의 열 숫자 get : 1, 2, 3
        - 다시 열 숫자들의 행 돌면서 1 확인 > 예) y=1, [1,2] [1,4]
        > 1 있는 좌표의 열 숫자 get : 2, 4
        > 열 숫자가 종점 4 면 count +1 하고 return
        - 다시 열 숫자들의 행 돌면서 1 확인
        ... 큐 BFS로 풀면 될 것 같긴한데 ...
        */

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0}); // 시작점

        while (!queue.isEmpty()) {
            for (int i = 0; i < n; i++) {
                int[] cur = queue.poll();

                // 열 == 4 면 answer +1, return
                if (cur[1] == 4) {
                    answer++;
                }

                if (cur[0] < 4 && arr[cur[0]][cur[1]] == 1) {
                    queue.offer(new int[]{cur[0], i});
                }
            }
        }


        return answer;
    }
}
