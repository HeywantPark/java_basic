package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Animal[] animalArray = {new Dog(), new Cat(), new Caw()};

        for (Animal animal : animalArray) {
            animalSound(animal);
        }
    }

    private static void animalSound(Animal animal) {
        System.out.println("동물 울음 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 울음 소리 테스트 종료");
        System.out.println();
    }
}
