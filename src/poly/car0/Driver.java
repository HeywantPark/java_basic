package poly.car0;

public class Driver {
    private K3car k3car;
    private Model3Car model3Car;

    public void setK3car(K3car k3car) {
        this.k3car = k3car;
    }

    public void setModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car;
    }

    public void drive(){
        System.out.println("자동차를 운전합니다.");
        if(k3car != null) {
            k3car.startEngin();
            k3car.pressAccelerator();
            k3car.offEngin();
        } else if (model3Car != null) {
            model3Car.startEngin();
            model3Car.pressAccelerator();
            model3Car.offEngin();
        }
    }
}
