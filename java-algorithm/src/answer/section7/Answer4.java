package answer.section7;

public class Answer4 {
    static int[] fibo;

    public static void main(String[] args) {
        // for문으로 사용하는게 훨씬 성능이 좋다
        // 재귀는 스택 프레임 호출되기 때문에 성능이 안 좋음
        // 코테 보는 중소에서는 두 방법 모두 구현하라는 문제가 출제됨
        Answer4 T = new Answer4();
        int n = 10;
        fibo = new int[n+1];
        T.DFS(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i]  + " ");
        }
    }

    public int DFS(int n) {
        if (fibo[n] > 0) {
            return fibo[n];
        }
        if (n == 1) {
            return fibo[n] = 1;
        } else if (n == 2) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = DFS(n-2) + DFS(n-1);
        }
    }
}
