package answer.section2;
import java.util.ArrayList;
import java.util.Scanner;

public class Answer6 {
    public static void main(String[] args) {
        Answer6 T = new Answer6();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : T.Solution(n, arr)) {
            System.out.println(x + " ");
        }

    }

    public ArrayList<Integer> Solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i=0; i<n; i++) {
            int tmp = arr[i];
            int res = 0;

            while (tmp>0) {
                int t = tmp%10;
                res = res*10 + t;
                tmp = tmp/10;
            }

            if (isPrime(res)) {
                answer.add(res);
            }
        }

        return answer;
    }

    public boolean isPrime(int num) {
        if (num==1) return false;
        for (int i=2; i<num; i++) {
            if (num%i==0)  return false;
        }
        return true;
    }

}
