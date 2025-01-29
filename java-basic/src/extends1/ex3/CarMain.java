package extends1.ex3;

public class CarMain {
    public static void main(String[] args) {

        ElctricCar elctricCar = new ElctricCar();
        elctricCar.move();
        elctricCar.charge();
        elctricCar.openDoor();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
        gasCar.openDoor();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
        hydrogenCar.fillHydrogen();
        hydrogenCar.openDoor();

    }
}
