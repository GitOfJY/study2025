package nested.nested.ex1;

public class NetworkMain {
    public static void main(String[] args) {

        Network network = new Network();
        network.sendMessage("Hello Java");

        // NetworkMain은 오직 Network 클래스만 사용한다.
        // NetworkMessage는 오직 Network 내부에서만 사용된다.

    }
}
