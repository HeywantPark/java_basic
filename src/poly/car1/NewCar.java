package poly.car1;

public class NewCar implements Car {
    @Override
    public void startEngin() {
        System.out.println("NewCar.startEngin");
    }

    @Override
    public void offEngin() {
        System.out.println("NewCar.offEngin");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("NewCar.pressAccelerator");
    }
}
