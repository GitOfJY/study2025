package exception.basic.cheked;

public class CheckedThrowMain {
    public static void main(String[] args) throws MyCheckedException {
        
        Service service = new Service();
        service.catchThrow();
        System.out.println("정상 종료");

        // Exception in thread "main" exception.basic.cheked.MyCheckedException: ex
        // at exception.basic.cheked.Client.call(Client.java:7)
        // at exception.basic.cheked.Service.catchThrow(Service.java:33)
        // at exception.basic.cheked.CheckedThrowMain.main(CheckedThrowMain.java:7)

    }
}
