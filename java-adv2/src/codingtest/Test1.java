package codingtest;

public class Test1 {
    public static void main(String[] args) {
        // solution(3);
        solution3(8, 1);
    }

    private static int[] solution3(int b, int yellow) {
        int yheight=0, ywidth=0;
        int[] answer = new int[2];

        // yellow 박스로 만들 수 있는 가로,세로 구하기
        // ex) y = 24
        for (int i=1; i<=yellow; i++) {
            if (yellow % i == 0) {
                // i는 y의 약수
                yheight = i;
                ywidth = yellow/i;
                System.out.println("i : " + i);
                System.out.println("yheight is " + yheight);
                System.out.println("ywidth is " + ywidth);

                int tmpBCnt = 2*yheight + 2*ywidth + 4;
                System.out.println("tmpBCnt is " + tmpBCnt);
                System.out.println("b is " + b);
                if (tmpBCnt == b) {
                    answer[0] = ywidth + 2;
                    answer[1] = yheight + 2;
                    break;
                }
            }
        }
        System.out.println(answer[0] + " " + answer[1]);
        return answer;
    }

    public static int solution(int n) {
        int[] rslt = new int[n+1];
        rslt[0] = 0;
        rslt[1] = 1;
        // 0 1 1 2 3 5 8 13 21 34 0
        // 0 1 1 2 3 5 8 13 21 34 55 0

        for (int i=2; i<n+1; i++) {
            rslt[i] = rslt[i-1] + rslt[i-2];
        }

        int tmpAns = rslt[n];
        int ans = rslt[n] % 1234567;
        System.out.println("ans is " + ans);

        for (int x : rslt) {
            System.out.print(x + " ");
        }

        return 0;
    }

    public static int solution2(int n) {
        int[] rslt = new int[n+1];
        rslt[0] = 0;
        rslt[1] = 1;
        // 0 1 1 2 3 5 8 13 21 34 0
        // 0 1 1 2 3 5 8 13 21 34 55 0

        for (int i=2; i<n+1; i++) {
            rslt[i] = (rslt[i-1] + rslt[i-2]) % 1234567;
        }

        return 0;
    }

}
