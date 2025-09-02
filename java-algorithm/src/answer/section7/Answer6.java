package answer.section7;

public class Answer6 {
    static int n;
    static int[] ch; // 체크배열(부분집합 사용한다/안한다)
    public void DFS(int L) {
        if (L == n+1) {
            // 종착점 도착
            String tmp = "";
            for (int i = 1; i < n; i++) {
                if (ch[i] == 1) {
                    tmp += (i + " ");
                }
                if (tmp.length() > 0) {
                    System.out.println(tmp);
                }
            }
        } else {
            ch[L] = 1;
            DFS(L+1); // 왼쪽(사용한다)
            ch[L] = 0;
            DFS(L+1); // 오른쪽
        }

    }

    public static void main(String[] args) {
        Answer6 T = new Answer6();
        n = 3;
        ch = new int[n+1]; // 체크배열의 인덱스를 원소로 사용
        T.DFS(n);
    }
}
