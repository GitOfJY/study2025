package thead.start;

public class DaemonThreadMain {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + " : main() start");

        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true); // 데몬스레드 여부
        daemonThread.start();

        System.out.println(Thread.currentThread().getName() + " : main() end");

        /*
          1. daemonThread.setDaemon(true);
          main : main() start
          main : main() end
          Thread-0 : run()  start

          2. daemonThread.setDaemon(false);
          main : main() start
          main : main() end
          Thread-0 : run()  start
          Thread-0 : run() end
        */

    }

    static class DaemonThread extends Thread {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " : run() start");
            try {
                Thread.sleep(10000); // 10초간 실행
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " : run() end");
        }

    }
}
