package poly.car1;

public class CarMain {
    public static void main(String[] args) {
        Driver driver = new Driver();

        // 차량 선택 - K3
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();
        /*
        자동차를 설정합니다. : poly.car1.K3Car@1d81eb93
        자동차를 운전합니다.
        K3Car.startEngine
        K3Car.pressAccelerator
        K3Car.offEngine
        */

        // 차량 변경 - model3Car
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();
        /*
        자동차를 설정합니다. : poly.car1.Model3Car@6e8cf4c6
        자동차를 운전합니다.
        Model3Car.startEngine
        Model3Car.pressAccelerator
        Model3Car.offEngine
        */
        
        // OCP 원칙 - NewCar(기능) 추가
        // Driver(핵심 클라이언트)의 코드 변경 없이 추가 가능하다.
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();

    }
}
