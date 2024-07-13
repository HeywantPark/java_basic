package poly.ex5;

public class Cat implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("냐~옹");
    }

    @Override
    public void move() {
        System.out.println("냥이가 움직여 파박!");

    }
}
