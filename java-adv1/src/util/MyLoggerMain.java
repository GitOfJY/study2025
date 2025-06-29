package util;

import static util.MyLogger.log;

public class MyLoggerMain {
    public static void main(String[] args) {

        log("hello thread");
        log(123);

        // 12:39:10:093 [     main] hello thread
        // 12:39:10:096 [     main] 123

    }
}
