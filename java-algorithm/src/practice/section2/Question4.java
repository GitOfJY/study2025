package practice.section2;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

       /*
       설명
       1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
       2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.

       입력
       첫 줄에 총 항수 N(3<=N<=45)이 입력된다.

       출력
       첫 줄에 피보나치 수열을 출력합니다.

       예시 입력 1
       10
       예시 출력 1
       1 1 2 3 5 8 13 21 34 55
       */

        Question4 T = new Question4();
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        System.out.println(T.solution(inputNum));

    }

    public String solution(int inputNum) {
        String answer = "";
        int[] arr = new int[inputNum];
        arr[0] = 1;

        if (inputNum>1) {
            arr[1] = 1;
            for (int i=0; i<inputNum-2; i++) {
                arr[i+2] = getSum(arr, i+2);
            }
        }

        for (int i=0; i<inputNum-1; i++) {
            answer += arr[i] + " ";
        }

        answer += arr[inputNum-1];
        return answer;
    }

    public int getSum(int[] arr, int index) {
        return arr[index-2] + arr[index-1];
    }

}
