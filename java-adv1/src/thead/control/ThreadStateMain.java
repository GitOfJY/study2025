package thead.control;
import static util.MyLogger.log;

public class ThreadStateMain {
    public static void main(String[] args) throws InterruptedException{
        Thread thread = new Thread(new MyRunnable(), "myThread");
        log("myThread.state1 = " + thread.getState());
        log("myTread.start()");
        thread.start();
        thread.sleep(1000);
        log("myThread.state3 = " + thread.getState());
        thread.sleep(4000);
        log("myThread.state5 = " + thread.getState());

        /*
        * 10:52:16:093 [     main] myThread.state1 = NEW
        * 10:52:16:096 [     main] myTread.start()
        * 10:52:16:096 [ myThread] start
        * 10:52:16:098 [ myThread] myThread.state2 = RUNNABLE
        * 10:52:16:098 [ myThread] sleep() start
        * 10:52:17:106 [     main] myThread.state3 = TIMED_WAITING
        * 10:52:19:107 [ myThread] sleep() end
        * 10:52:19:108 [ myThread] myThread.state4 = RUNNABLE
        * 10:52:19:108 [ myThread] end
        * 10:52:21:110 [     main] myThread.state5 = TERMINATED
        * */

    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            try {
                log("start");
                log("myThread.state2 = " + Thread.currentThread().getState());
                log("sleep() start");
                Thread.sleep(3000);
                log("sleep() end");
                log("myThread.state4 = " + Thread.currentThread().getState());
                log("end");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
