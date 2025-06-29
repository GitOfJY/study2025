package thead.control.join;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class JoinMainV1 {
    public static void main(String[] args) {
        log("Start");
        SumTask task1 = new SumTask(1, 50);
        SumTask task2 = new SumTask(51, 100);

        Thread thread1 = new Thread(task1, "thread-1");
        Thread thread2 = new Thread(task2, "thread-2");
        thread1.start();
        thread2.start();

        log("task1.result = " + task1.result);
        log("task2.result = " + task2.result);

        int sumAll = task1.result + task2.result;
        log("task1 + task2 = " + sumAll);

        log("End");

        /*
        * 13:57:25:758 [     main] Start
        * 13:57:25:780 [ thread-1] 작업 시작
        * 13:57:25:780 [ thread-2] 작업 시작
        * 13:57:25:784 [     main] task1.result = 0
        * 13:57:25:784 [     main] task2.result = 0
        * 13:57:25:784 [     main] task1 + task2 = 0
        * 13:57:25:785 [     main] End
        * 13:57:27:791 [ thread-1] 작업 완료 result = 1275
        * 13:57:27:791 [ thread-2] 작업 완료 result = 3775
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
