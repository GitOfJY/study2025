package thead.control.join;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class JoinMainV2 {
    public static void main(String[] args) {
        log("Start");
        SumTask task1 = new SumTask(1, 50);
        SumTask task2 = new SumTask(51, 100);

        Thread thread1 = new Thread(task1, "thread-1");
        Thread thread2 = new Thread(task2, "thread-2");
        thread1.start();
        thread2.start();

        //정확한 타이밍을 맞춰 기다리기 어려움
        log("main 스레드 sleep()");
        sleep(3000);
        log("main 스레드 깨어남");

        log("task1.result = " + task1.result);
        log("task2.result = " + task2.result);

        int sumAll = task1.result + task2.result;
        log("task1 + task2 = " + sumAll);

        log("End");

        /*
        * 14:08:38:532 [     main] Start
        * 14:08:38:558 [     main] main 스레드 sleep()
        * 14:08:38:558 [ thread-2] 작업 시작
        * 14:08:38:558 [ thread-1] 작업 시작
        * 14:08:40:574 [ thread-1] 작업 완료 result = 1275
        * 14:08:40:574 [ thread-2] 작업 완료 result = 3775
        * 14:08:41:575 [     main] main 스레드 깨어남
        * 14:08:41:579 [     main] task1.result = 1275
        * 14:08:41:580 [     main] task2.result = 3775
        * 14:08:41:580 [     main] task1 + task2 = 5050
        * 14:08:41:582 [     main] End
        * */

    }

    static class SumTask implements Runnable {

        int startValue;
        int endValue;
        int result = 0;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        public void run() {
            log("작업 시작");
            sleep(2000);
            int sum = 0;
            for (int i=startValue; i<=endValue; i++) {
                sum += i;
            }
            result = sum;
            log("작업 완료 result = " + result);
        }

    }
}
