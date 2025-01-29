package lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        String result = "";
        for (int i =0; i < 10000; i ++){
            result += "Hello, Java";
        }
        long endTime = System.currentTimeMillis();

        System.out.println("result : " + result);
        System.out.println("time : " + (endTime - startTime) + "ms");
        // time : 174ms
        // 루프 안에서 문자열을 더하는 경우에는 최적화가 이루어지지 않는다.

    }
}
