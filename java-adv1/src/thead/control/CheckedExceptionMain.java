package thead.control;

import static util.ThreadUtils.sleep;

public class CheckedExceptionMain {
    public static void main(String[] args) throws Exception {
        throw new Exception();
    }

    static class CheckedRunnable implements Runnable {

        // @Override
        // public void run() throws Exception {
        //     throw new Exception();
        // }
        // java: run() in thead.control.CheckedExceptionMain.CheckedRunnable cannot implement run() in java.lang.Runnable
        // overridden method does not throw java.lang.Exception
        // 체크예외
        // 부모 메서드가 체크 예외를 던지지 않는 경우, 재정의된 자식 메서드도 체크 예외를 던질 수 없다
        // 자식 메서드는 부모 메서드가 던질 수 있는 체크 예외의 하위 타입만 던질 수 있다

        @Override
        public void run() {
            sleep(1000);
        }

    }
}
