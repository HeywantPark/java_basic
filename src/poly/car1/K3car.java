package poly.car1;

public class K3car implements Car {
    @Override
    public void startEngin() {
        System.out.println("K3car.startEngin");
    }

    @Override
    public void offEngin() {
        System.out.println("K3car.offEngin");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("K3car.pressAccelerator");
    }
}
