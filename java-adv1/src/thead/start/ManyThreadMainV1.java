package thead.start;

import static util.MyLogger.*;

public class ManyThreadMainV1 {
    public static void main(String[] args) {

        log("main() start");

        HelloRunnable helloRunnable = new HelloRunnable();
        Thread thread1 = new Thread(helloRunnable);
        thread1.start();
        Thread thread2 = new Thread(helloRunnable);
        thread2.start();
        Thread thread3 = new Thread(helloRunnable);
        thread3.start();

        log("main() end");

        // 12:42:32:998 [     main] main() start
        // 12:42:33:002 [     main] main() end
        // Thread-2 : run()
        // Thread-1 : run()
        // Thread-0 : run()

    }
}
