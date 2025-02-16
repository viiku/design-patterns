### Strategy Pattern
***The Strategy Pattern is a behavioral design pattern that enables you to define a family of algorithms, encapsulate each one, and make them interchangeable at runtime.***

### When to Use the Strategy Pattern in Java?
Use the Strategy pattern when:

1. You need to use different variants of an algorithm within an object and want to switch algorithms at runtime.
2. There are multiple related classes that differ only in their behavior.
3. An algorithm uses data that clients shouldn't know about.
4. A class defines many behaviors and these appear as multiple conditional statements in its operations.

### "Program to an interface” really means “Program to a supertype.”
1. Program to an Interface
Meaning: Code should rely on an interface (or an abstract class) that defines a set of methods, rather than a specific implementation of those methods.
Purpose: This decouples the high-level logic from low-level details, allowing the implementation to change without affecting the dependent code.

2. Program to a Supertype
Meaning: Instead of referring to a specific class, use a reference to a supertype (an abstract class or interface) that multiple classes can implement or extend.
Purpose: This ensures that the code works with any object that adheres to the supertype's contract, regardless of the object's concrete class.

#### Example:- 

1. Without Programming to an Interface (Tightly Coupled)

```
class Dog {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class AnimalShelter {
    private Dog dog;

    public AnimalShelter() {
        this.dog = new Dog(); // Tight coupling to Dog class
    }

    public void letAnimalMakeSound() {
        dog.makeSound();
    }
}
```

<!-- Problem: The AnimalShelter class is tightly coupled to the Dog class. If you want to introduce a Cat, you would need to modify AnimalShelter. -->


2. With Programming to an Interface (Loosely Coupled)

```
interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class AnimalShelter {
    private Animal animal;

    public AnimalShelter(Animal animal) {
        this.animal = animal; // Dependency injection
    }

    public void letAnimalMakeSound() {
        animal.makeSound();
    }
}

<!-- Flexibility: You can now pass a Dog, Cat, or any other Animal to AnimalShelter without modifying its code: -->

AnimalShelter shelter = new AnimalShelter(new Dog());
shelter.letAnimalMakeSound(); // Output: Woof!

shelter = new AnimalShelter(new Cat());
shelter.letAnimalMakeSound(); // Output: Meow!
```

### Key Concepts:


### Structure
Key Concepts:

1. Context

a. This is the class that contains the varying algorithm
b. It maintains a reference to a Strategy object
c. It delegates the algorithm execution to the Strategy object
d. It can switch between different strategies at runtime


2. Strategy Interface

a. Declares the interface common to all supported algorithms
b. Context uses this interface to call the algorithm defined by a ConcreteStrategy


3. Concrete Strategies

a. Implement different algorithms while following the Strategy interface
b. Can be swapped in and out without changing the Context


**Strategy design pattern is very helpful when we've multiple objects using same methods due to this chances of code duplication increases.**