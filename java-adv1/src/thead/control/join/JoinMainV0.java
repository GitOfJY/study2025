package thead.control.join;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class JoinMainV0 {
    public static void main(String[] args) {
        log("Start");
        Thread thread1 = new Thread(new Job(), "thread-1");
        Thread thread2 = new Thread(new Job(), "thread-2");

        thread1.start();
        thread2.start();

        log("End");

        /*
        * 11:17:38:429 [     main] Start
        * 11:17:38:444 [     main] End
        * 11:17:38:444 [ thread-1] 작업 시작
        * 11:17:38:444 [ thread-2] 작업 시작
        * 11:17:40:470 [ thread-2] 작업 완료
        * 11:17:40:470 [ thread-1] 작업 완료
        * */

    }

    static class Job implements Runnable {
        @Override
        public void run() {
            log("작업 시작");
            sleep(2000);
            log("작업 완료");
        }
    }
}
