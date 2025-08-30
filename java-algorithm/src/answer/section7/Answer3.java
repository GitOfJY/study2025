package answer.section7;

public class Answer3 {
    public static void main(String[] args) {
        Answer3 T = new Answer3();
        System.out.println(T.DFS(5));
    }

    public int DFS(int n) {
        if (n == 1) return 1;
        else return n * DFS(n-1);
    }
}
