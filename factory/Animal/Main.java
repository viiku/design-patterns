package factory.Animal;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        // Create dog using animal factory
        Animal dog = animalFactory.createAnimal("dog");
        dog.makeSound();

        Animal cat = animalFactory.createAnimal("cat");
        cat.makeSound();
    }
}
