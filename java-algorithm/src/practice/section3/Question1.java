package practice.section3;

import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

       /*
       설명
       오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.

       입력
       첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
       두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
       세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
       네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
       각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.

       출력
       오름차순으로 정렬된 배열을 출력합니다.

       예시 입력 1
       3
       1 3 5
       5
       2 3 6 7 9

       예시 출력 1
       1 2 3 3 5 6 7 9
       */

        Question1 T = new Question1();
        Scanner sc = new Scanner(System.in);

        int inputNum1 = sc.nextInt();
        int[] inputArr1 = new int[inputNum1];
        for (int i=0; i<inputNum1; i++) {
            inputArr1[i] = sc.nextInt();
        }

        int inputNum2 = sc.nextInt();
        int[] inputArr2 = new int[inputNum2];
        for (int i=0; i<inputNum2; i++) {
            inputArr2[i] = sc.nextInt();
        }

        for (int x : T.solution(inputNum1, inputNum2, inputArr1, inputArr2)) {
            System.out.print(x + " ");
        }

    }

    public ArrayList<Integer> solution(int inputNum1, int inputNum2, int[] inputArr1, int[] inputArr2) {
        ArrayList<Integer> answer = new ArrayList<>();

        if (inputNum1 < inputNum2) {
            int tmpInt = inputNum1;
            inputNum1 = inputNum2;
            inputNum2 = tmpInt;

            int[] tmpArr = inputArr1.clone();
            inputArr1 = inputArr2.clone();
            inputArr2 = tmpArr.clone();
        }

        if (inputNum1 > inputNum2) {

            for (int x : inputArr1) {
                answer.add(x);
            }

            for (int i=0; i<inputNum2; i++) {
                for (int j=0; j<answer.size(); j++) {
                    if (inputArr2[i] <= answer.get(j)) {
                        answer.add(j, inputArr2[i]);
                        break;
                    }
                }
            }

        }

        return answer;
    }

}
