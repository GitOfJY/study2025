package exception.basic.uncheked;

public class UncheckedThrowMain {
    public static void main(String[] args) {

        Service service = new Service();
        service.callThrow();
        System.out.println("정상 종료");

        // Exception in thread "main" exception.basic.uncheked.MyUncheckedException: ex
        // at exception.basic.uncheked.Client.call(Client.java:6)
        // at exception.basic.uncheked.Service.callThrow(Service.java:32)
        // at exception.basic.uncheked.UncheckedThrowMain.main(UncheckedThrowMain.java:6)

    }
}
