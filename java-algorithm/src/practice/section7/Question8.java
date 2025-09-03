package practice.section7;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        /*
        송아지 찾기 (BFS : 상태트리탐색)
        현수는 송아지를 잃어버렸다 다행히 송아지에는 위치추적기가 달려 있다
        현수의 위치와 송아지의 위치가 수직선상의 좌표 점으로 주어지면 현수는 현재 위치에서 송아지의 위치까지 다음과 같은 방법으로 이동한다
        송아지는 움직이지 않고 제자리에 있다
        현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수있다
        최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하는 프로그램을 작성하세요

        입력설명
        첫 번째 줄에 현수의 위치 S와 송아지의 위치 E가 주어진다 직선의 좌표 점은 1부터 10,000까지이다

        출력설명
        점프의 최소횟수를 구한다 답은 이상이며 반드시 존재합니다

        입력예제 1
        5 14

        출력예제 1
        3

        입력예제 2
        8 3

        출력예제 2
        5
        */
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(solution(s, e));
    }

    public static int solution(int s, int e) {
        int answer = 0;
        int district = e - s;

        if (district > 0) {
            // 현수보다 송아지가 앞 선 경우 >  1 로 앞으로 가거나 5로 앞으로 가거나
            //              e-s >= 4 : 5로 이동 후 -1
            //              e-s < 4  : 1로 이동
            if (district >= 5) {
                while (district > 5) {
                    district = district % 5;
                    answer += 1;
                }
                if (district == 4) {
                    district = 5 - district;
                    answer += 1;
                }
                answer += district;
            }

        } else {
            // 송아지가 현수보다 앞 선 경우 > 뒤로 1가기만 가능
            answer = -district;
        }
        return answer;
    }
}
