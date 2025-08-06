package practice.section5;
import java.util.*;

public class Question5 {
    public static void main(String[] args) {
       /*
       설명
       현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다. 같은 숫자의 카드가 여러장 있을 수 있습니다.
       현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 합니다. 3장을 뽑을 수 있는 모든 경우를 기록합니다.
       기록한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성하세요.
       만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19......이고 K값이 3이라면 K번째 큰 값은 22입니다.


       입력
       첫 줄에 자연수 N(3<=N<=100)과 K(1<=K<=50) 입력되고, 그 다음 줄에 N개의 카드값이 입력된다.


       출력
       첫 줄에 K번째 수를 출력합니다. K번째 수가 존재하지 않으면 -1를 출력합니다.


       예시 입력 1
       10 3
       13 15 34 23 45 65 33 11 26 42


       90 30
       31 40 40 49 44 53 41 25 35 53 28 36 50 38 27 23 50 42 51 20 37 48 22 37 23 42 23 39 28 30 31 18 24 41 48 40 21 25 25 28 24 41 49 30 36 35 15 52 36 17 49 26 43 44 43 37 30 41 35 20 28 25 51 16 45 15 54 54 17 40 47 27 42 22 54 47 29 29 36 29 53 42 49 42 49 16 44 36 30 45


       예시 출력 1
       143
       */


        Question5 T = new Question5();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println(T.Solution(n, k, arr));


    }


    public int Solution(int n, int k, int[] arr) {
        List<Integer> tmplist = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            tmplist.add(arr[i]);
        }
        Collections.sort(tmplist,  Collections.reverseOrder());
        System.out.println("tmplist : "+tmplist);
        return getSumForThree(tmplist, k);
    }


    public int getSumForThree(List<Integer> arr, int k) {
        HashSet<Integer> sumList = new HashSet<>();
        List<Integer> rslt = new ArrayList<>();
        int totalSize = arr.size();


        for (int i = 0; i < totalSize; i++) {
            for (int j = i + 1; j < totalSize; j++) {
                for (int s = j + 1; s < totalSize; s++) {
                    sumList.add(arr.get(i) +arr.get(j) + arr.get(s));
                }
            }
        }
        rslt = new ArrayList<>(sumList);
        Collections.sort(rslt, Collections.reverseOrder());


        return rslt.get(k-1);
    }
}

