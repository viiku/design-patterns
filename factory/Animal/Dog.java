package factory.Animal;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dogs barking...");
    }
}
