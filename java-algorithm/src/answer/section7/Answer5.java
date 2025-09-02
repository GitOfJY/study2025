package answer.section7;

public class Answer5 {
    Node root;
    public void DFS(Node root){
        if (root == null) {
            return;
        } else {
            // 전위순회
            // System.out.print(root.data + " ");
            DFS(root.lt);
            // 중위순회
            System.out.print(root.data + " ");
            DFS(root.rt);
            // 후위순회
            System.out.print(root.data + " ");
        }

    }

    public static void main(String[] args) {
        Answer5 tree = new Answer5();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }

}

class Node {
    int data;
    Node lt, rt; // node 객체의 주소 저장
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}
