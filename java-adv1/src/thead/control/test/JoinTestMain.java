package thead.control.test;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class JoinTestMain {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyTask(), "t1");
        Thread thread2 = new Thread(new MyTask(), "t2");
        Thread thread3 = new Thread(new MyTask(), "t3");

        thread1.start();
        thread1.join();

        thread2.start();
        thread2.join();

        thread3.start();
        thread3.join();

        System.out.println("모든 스레드 실행 완료");

        /*
        * 14:23:52:504 [       t1] 1
        * 14:23:53:519 [       t1] 2
        * 14:23:54:534 [       t1] 3
        * 14:23:55:539 [       t2] 1
        * 14:23:56:552 [       t2] 2
        * 14:23:57:567 [       t2] 3
        * 14:23:58:571 [       t3] 1
        * 14:23:59:580 [       t3] 2
        * 14:24:00:581 [       t3] 3
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
