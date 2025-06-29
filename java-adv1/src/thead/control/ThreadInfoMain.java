package thead.control;
import thead.start.HelloRunnable;

import static util.MyLogger.log;

public class ThreadInfoMain {
    public static void main(String[] args) {

        // main 스레드
        Thread mainThread = Thread.currentThread();
        log("mainThread = " + mainThread);
        log("mainThread.threadId() = " + mainThread.threadId());
        log("mainThread.getName() = " + mainThread.getName());
        log("mainThread.getPriority() = " + mainThread.getPriority());
        log("mainThread.getThreadGroup() = " + mainThread.getThreadGroup());
        log("mainThread.getState() = " + mainThread.getState());

        /*
        * 10:25:31:010 [     main] mainThread = Thread[#1,main,5,main]
        * 10:25:31:024 [     main] mainThread.threadId() = 1
        * 10:25:31:024 [     main] mainThread.getName() = main
        * 10:25:31:028 [     main] mainThread.getPriority() = 5
        * 10:25:31:029 [     main] mainThread.getThreadGroup() = java.lang.ThreadGroup[name=main,maxpri=10]
        * 10:25:31:029 [     main] mainThread.getState() = RUNNABLE
        * */

        // main 스레드
        Thread myThread = new Thread(new HelloRunnable(), "myThread");
        log("myThread = " + myThread);
        log("myThread.threadId() = " + myThread.threadId());
        log("myThread.getName() = " + myThread.getName());
        log("myThread.getPriority() = " + myThread.getPriority());
        log("myThread.getThreadGroup() = " + myThread.getThreadGroup());
        log("myThread.getState() = " + myThread.getState());

        /*
         * 10:27:48:954 [     main] myThread = Thread[#30,myThread,5,main]
         * 10:27:48:954 [     main] myThread.threadId() = 30
         * 10:27:48:954 [     main] myThread.getName() = myThread
         * 10:27:48:955 [     main] myThread.getPriority() = 5
         * 10:27:48:955 [     main] myThread.getThreadGroup() = java.lang.ThreadGroup[name=main,maxpri=10]
         * 10:27:48:956 [     main] myThread.getState() = NEW
         * */

    }
}
