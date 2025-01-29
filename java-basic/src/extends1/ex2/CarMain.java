package extends1.ex2;

public class CarMain {
    public static void main(String[] args) {

        ElctricCar elctricCar = new ElctricCar();
        elctricCar.move();
        elctricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();

    }
}
