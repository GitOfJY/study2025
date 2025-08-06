package practice.section3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

       /*
       설명
       A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.

       입력
       첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
       두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
       세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
       네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
       각 집합의 원소는 1,000,000,000이하의 자연수입니다.

       출력
       두 집합의 공통원소를 오름차순 정렬하여 출력합니다.

       예시 입력 1
       5
       1 3 9 5 2
       5
       3 2 5 7 8
       예시 출력 1
       2 3 5
       */

        Question2 T = new Question2();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nArr = new int[n];
        for (int i=0; i<n; i++) {
            nArr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] mArr = new int[m];
        for (int i=0; i<n; i++) {
            mArr[i] = sc.nextInt();
        }

        for (int a : T.Solution(n, nArr, m, mArr)) {
            System.out.print(a + " ");
        }

    }

    public ArrayList<Integer> Solution(int n, int[] nArr, int m, int[] mArr) {
        ArrayList<Integer> tmp = new ArrayList<>();

        // 공통된 요소 추출
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (nArr[i]==mArr[j]) {
                    tmp.add(nArr[i]);
                    break;
                }
            }
        }

        // Time Limit Exceeded
        Collections.sort(tmp);

        // Time Limit Exceeded
        //int[] answer = new int[tmp.size()];
        // 순서대로 배열
        //for (int i=0; i< tmp.size(); i++) {
        //    answer[i] = tmp.get(i);
        //}
        //Arrays.sort(answer);

        return tmp;
    }

}
