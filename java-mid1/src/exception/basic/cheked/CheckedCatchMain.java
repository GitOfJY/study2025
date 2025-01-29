package exception.basic.cheked;

public class CheckedCatchMain {
    public static void main(String[] args) {

        Service service = new Service();
        service.callCatch();
        System.out.println("정상 종료");
        /*
          예외처리, message = ex
          정상 흐름
          정상 종료
        */

    }
}
