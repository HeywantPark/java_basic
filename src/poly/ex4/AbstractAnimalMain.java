package poly.ex4;

public class AbstractAnimalMain {
    public static void main(String[] args) {
        AbstractAnimal[] animals = {new Dog(), new Cat(), new Cow()};
        for (AbstractAnimal animal : animals) {
            soundAnimal(animal);
            moveAnimal(animal);
        }

    }
    private static void soundAnimal(AbstractAnimal animal){
        System.out.println("동물 울음 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 울음 소리 테스트 종료");
        System.out.println();
    }
    private static void moveAnimal(AbstractAnimal animal){
        System.out.println("동물 울음 소리 테스트 시작");
        animal.move();
        System.out.println("동물 울음 소리 테스트 종료");
        System.out.println();
    }
}
