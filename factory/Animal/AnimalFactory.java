package factory.Animal;

public class AnimalFactory {
    // This is the factory method that creates and returns Animal objects
    public Animal createAnimal(String animalType) {
        if(animalType == null || animalType.isEmpty()) {
            return null;
        }

        switch (animalType.toLowerCase()) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            default:
                throw new IllegalArgumentException("Unkown Animal Type:- "+animalType);
        }
    }
}
