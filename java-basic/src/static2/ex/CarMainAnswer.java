package static2.ex;

public class CarMainAnswer {
    public static void main(String[] args) {
        CarAnswer car1 = new CarAnswer("k3");
        CarAnswer car2 = new CarAnswer("G80");
        CarAnswer car3 = new CarAnswer("k3");

        CarAnswer.showTotalCars();
        // 구매한 차량 수를 출력하는 static 메서드
    }
}
