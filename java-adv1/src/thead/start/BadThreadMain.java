package thead.start;

public class BadThreadMain {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + " : main() start");

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + " : run() 호출 전");
        helloThread.run();
        System.out.println(Thread.currentThread().getName() + " : run() 호출 후");

        System.out.println(Thread.currentThread().getName() + " : main() end");

        /*
          main : main() start
          main : run() 호출 전
          main : run()
          main : run() 호출 후
          main : main() end
        */

    }
}
