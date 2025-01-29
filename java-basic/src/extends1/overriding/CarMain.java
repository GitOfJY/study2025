package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {

        ElctricCar elctricCar = new ElctricCar();
        elctricCar.move();

        GasCar gasCar = new GasCar();
        gasCar.move();

    }
}
