package poly.car1;

public class Driver {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }
    public void drive(){
        System.out.println("자동차를 설정합니다. : " + car);
        car.startEngin();
        car.pressAccelerator();
        car.offEngin();
        System.out.println();
    }
}
