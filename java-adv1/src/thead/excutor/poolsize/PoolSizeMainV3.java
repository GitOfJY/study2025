package thead.excutor.poolsize;

import thead.excutor.RunnableTask;

import java.util.concurrent.*;

import static thead.excutor.ExecutorUtils.printState;
import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class PoolSizeMainV3 {
    public static void main(String[] args) {
        // ExecutorService es = Executors.newCachedThreadPool();
        ExecutorService es = new ThreadPoolExecutor(0, Integer.MAX_VALUE
        , 3, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());

        log("pool 생성");
        printState(es);

        for (int i = 1; i <= 6; i++) {
            String taskname = "task" + i;
            es.execute(new RunnableTask(taskname));
            printState(es, taskname);
        }

        sleep(3000);
        log("== 작업 수행 완료");
        printState(es);

        sleep(3000);
        log("== maximunPoolSize 대기 시간 초과 ==");
        printState(es);
    }
}
