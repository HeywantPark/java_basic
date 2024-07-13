package poly.ex6;

public class Chicken extends AbstractAnimal implements Fly {
    @Override
    public void sound() {
        System.out.println("꼬!끼오~~");
    }

    @Override
    public void fly() {
        System.out.println("닭이 날아가다,, 넘어집니다.");
    }
}
