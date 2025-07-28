package thead.excutor.poolsize;

import thead.excutor.RunnableTask;

import java.util.concurrent.*;

import static thead.excutor.ExecutorUtils.printState;
import static util.MyLogger.log;

public class PoolSizeMainV4 {

    // 1. 일반
    // static final int TASK_SIZE = 1100;
    
    // 2. 긴급
    static final int TASK_SIZE = 1200;
    
    // 3. 거절
    // static final int TASK_SIZE = 1201;


    public static void main(String[] args) {
        ExecutorService es = new ThreadPoolExecutor(100, 200, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1000));
        printState(es);

        long startMs = System.currentTimeMillis();
        for (int i = 1; i <= TASK_SIZE; i++) {
            String taskName = "taksk" + i;
            try {
                es.execute(new RunnableTask(taskName));
                printState(es);
            } catch (RejectedExecutionException e) {
                log(taskName + " -> " + e);
            }
        }

        es.close();
        long endMs = System.currentTimeMillis();
        log("time : " + (startMs - endMs));
    }
}
