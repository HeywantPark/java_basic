package static2.ex;

public class Car {
    private static int totalCars;
    private String carName;

    public Car(String carName) {
        this.carName = carName;
        System.out.println("차량 구, 이름 : " + carName);
        totalCars++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수 : " + totalCars);

    }
}
