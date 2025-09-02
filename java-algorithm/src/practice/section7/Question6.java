package practice.section7;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        /*
        부분집합 구하기(DFS)
        자연수 N이 주어지면 1부터 N까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램을 작성하세요.

        입력설명
        첫 번째 줄에 자연수 N(1<=N<=10)이 주어집니다.

        출력설명
        첫 번째 줄부터 각줄에 하나씩 부분집합을 아래와 출력예제와 같은 순서로 출력한다.
        단 공집합은 출력하지 않습니다.

        입력예제 1
        3

        출력예제 1
        1 2 3
        1 2
        1 3
        1
        2 3
        2
        3
        */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    }

    public void DFS(int n) {
        /*
                   1
              2          3
        - 이걸 어떻게 DFS로 풀지 ,,,?

        방법1. 부모노드 > 1. 자기 자신 출력
                      > 2. 자기 자신 + 오른쪽 노드 출력
                      > 3. 자기 자신 + 왼쪽 노드 출력
                      > 4. 자기 자신 + 오른쪽 노드 + 왼쪽 노드 출력
                      > 아래로 내려감 > 다시 부모노드
                      >> 4 5 추가 되면 안됨
                      >> 2 3 이런 부분 집합은 출력 불가함
         방법2. ...
               DFS를 사용하지 않는다면 이중 for 문을 돌려서 부분집합 구할 수 있을 것 같음
        */


    }
}
