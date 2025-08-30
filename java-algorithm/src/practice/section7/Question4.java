package practice.section7;

public class Question4 {
    public static void main(String[] args) {
        /*
        피보나치 수열
        1) 피보나치 수열을 출력한다 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
        2) 입력은 피보나치 수열의 총 항의 수 이다 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.

        입력설명
        첫 줄에 총 항수 N(3<=N<=45)이 입력된다

        출력설명
        첫 줄에 피보나치 수열을 출력합니다.

        입력예제 1
        10

        출력예제 1
        1 1 2 3 5 8 13 21 34 55
        */
        // System.out.println(DFS(5));
        int[] arr = new int[10];
        for (int x : arrAnswer(10, arr)) {
            System.out.print(x + " ");
        }

    }
    public static int DFS(int n) {
        if (n == 0) {
            return 1;
        } else {
            System.out.print(n+ " ");
            return DFS(n-1);
        }
    }

    public static int[] arrAnswer(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                arr[0] = 1;
            } else if (i == 1) {
                arr[1] = 1;
            } else {
                arr[i] = arr[i-1] + arr[i-2];
            }
        }
        return arr;
    }
}
