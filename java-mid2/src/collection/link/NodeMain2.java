package collection.link;

public class NodeMain2 {
    public static void main(String[] args) {

        // 노드 생성하고 연결하기 : A -> B -> C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println("연결된 노드 출력하기");
        System.out.println(first);

        // 연결된 노드 출력하기 (IDE)
        // Node{item=A, next=Node{item=B, next=Node{item=C, next=null}}}

        // 연결된 노드 출력하기 (직접 생성)
        // [A->B->C]

    }
}
