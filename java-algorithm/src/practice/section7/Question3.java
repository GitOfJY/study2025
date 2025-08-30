package practice.section7;

public class Question3 {
    public static void main(String[] args) {
        /*
        팩토리얼
        자연수 N이 입력되면 N!를 구하는 프로그램을 작성하세요
        예를 들어 5! = 5*4*3*2*1=120 입니다

        입력설명
        첫 번째 줄에 자연수 N(1<=N<=10)이 주어집니다

        출력설명
        첫 번째 줄에 N 팩토리얼 값을 출력합니다

        입력예제 1
        5

        출력예제 1
        120
        */
        // int[] arr = new int[5];
        // factoryFunc(5, arr);
        System.out.println(factoryFuncV2(5));
    }
    public static void factoryFunc(int n, int[] arr) {
        if (n == 0) {
            int sum = 1;
            for (int x : arr) {
                sum = sum * x;
            }
            System.out.println(sum);
            return;
        } else {
            factoryFunc(n-1, arr);
            arr[n-1] = n;
        }
    }

    public static int factoryFuncV2(int n) {
        if (n == 0) return 1;
        return n * factoryFuncV2(n-1);
    }
}
