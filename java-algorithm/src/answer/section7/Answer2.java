package answer.section7;

public class Answer2 {
    public static void main(String[] args) {
        Answer2 T = new Answer2();
        T.DFS(11);
    }

    public void DFS(int n) {
        if (n == 0) {
            return;
        } else {
            DFS(n/2);
            System.out.print(n%2);
        }
    }
}
