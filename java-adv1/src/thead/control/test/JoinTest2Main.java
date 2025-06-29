package thead.control.test;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class JoinTest2Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyTask(), "t1");
        Thread thread2 = new Thread(new MyTask(), "t2");
        Thread thread3 = new Thread(new MyTask(), "t3");
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println("모든 스레드 실행 완료");

        /*
        * 14:25:14:800 [       t1] 1
        * 14:25:14:800 [       t2] 1
        * 14:25:14:800 [       t3] 1
        * 14:25:15:822 [       t3] 2
        * 14:25:15:822 [       t2] 2
        * 14:25:15:822 [       t1] 2
        * 14:25:16:825 [       t2] 3
        * 14:25:16:825 [       t1] 3
        * 14:25:16:825 [       t3] 3
        * 모든 스레드 실행 완료
        * */

    }

    static class MyTask implements Runnable {
        @Override
        public void run() {
            for (int i=1; i<=3; i++) {
                log(i);
                sleep(1000);
            }
        }
    }

}
