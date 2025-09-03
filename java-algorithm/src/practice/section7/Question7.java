package practice.section7;

class Node {
    int data;
    Node lt, rt;
    public Node(int val) {
        this.data = val;
        lt = null;
        rt = null;
    }
}

public class Question7 {
    Node root;

    public static void main(String[] args) {
        /*
        이진트리 순회(넓이우선탐색 : 레벨탐색)
        아래 그림과 같은 이진트리를 레벨탐색 연습하세요

                         1
                 2               3
            4        5     6          7

        레벨 탐색 순회 출력 : 1 2 3 4 5 6 7
        */
        Question7 tree = new Question7();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.rt.rt = new Node(5);
        tree.root.lt.lt.rt = new Node(6);
        tree.root.rt.rt.lt = new Node(7);
        tree.DFS(tree.root);
    }

    public void DFS(Node tree) {
        // 무조건 중간 > 왼쪽 > 오른쪽 탐색
        //

    }
}
