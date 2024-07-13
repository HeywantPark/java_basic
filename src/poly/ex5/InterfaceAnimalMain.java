package poly.ex5;

public class InterfaceAnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }
    private static void soundAnimal(InterfaceAnimal animal) {
        animal.sound();
    }
}
