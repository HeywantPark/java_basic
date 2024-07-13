package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        // 차량 선택(K3)
        K3car k3car = new K3car();
        driver.setCar(k3car);
        driver.drive();

        // 차량 변경(K3 -> Model3)
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();

        //차량 변경(Model3 -> New)
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
