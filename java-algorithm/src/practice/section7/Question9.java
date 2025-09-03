package practice.section7;

import java.util.LinkedList;
import java.util.Queue;

public class Question9 {
    Node root;

    public static void main(String[] args) {
        /*
        Tree 말단 노드까지의 가장 짧은 경로
        아래 그림과 같은 이진트리에서 루트 노드 1에서 말단노드까지의 길이 중 가장 짧은 길이를 구하는 프로그램을 작성하세요.
        각 경로의 길이는 루트노드에서 말단노드까지 가는데 이동하는 횟수를 즉 간선(에지)의 개수를 길이로 하겠습니다.
                         1
                 2                3
        4                5
        가장 짧은 길이는 3번 노드까지의 길이인 1이다
        */
        Question9 tree = new Question9();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.rt.rt = new Node(5);
        System.out.println(tree.BFS(tree.root));
    }

    public int BFS(Node root) {
        int level = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node cur = queue.poll();
                if (cur.lt == null || cur.rt == null) {
                    return level;
                }

                if (cur.lt != null) {
                    queue.offer(cur.lt);
                }

                if (cur.rt != null) {
                    queue.offer(cur.rt);
                }
            }
            level++;
        }
        return 0;
    }
}
