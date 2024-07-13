package poly.car1;

public class Model3Car implements Car {
    @Override
    public void startEngin() {
        System.out.println("Model3Car.startEngin");
    }

    @Override
    public void offEngin() {
        System.out.println("Model3Car.offEngin");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("Model3Car.pressAccelerator");
    }
}
