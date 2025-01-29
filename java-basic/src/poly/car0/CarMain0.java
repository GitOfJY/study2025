package poly.car0;

public class CarMain0 {
    public static void main(String[] args) {

        Driver driver = new Driver(); // 운전자는 자동차를 갖고있지 않다.
        K3Car k3Car = new K3Car();
        driver.setK3Car(k3Car); // 운전자가 K3Car 인스턴스를 갖게 된다.
        driver.drive();

        // K3 운전하던 운전자가 Model3 차량으로 변경해서 운전한다.
        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null); // 기존 참조 제거
        driver.setModel3Car(model3Car);
        driver.drive();

    }
}
