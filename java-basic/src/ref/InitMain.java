package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();

        System.out.println("value1 = " + data.value1);
        // value1 = 0 (자동초기화)
        System.out.println("value2 = " + data.value2);
        // value2 = 10

    }
}