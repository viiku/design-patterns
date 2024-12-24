### Factory Pattern
**The Factory Pattern is a creational design pattern that provides an interface for creating objects but lets subclasses decide which class to instantiate.**

1. Encapsulation of Object Creation:
    Object creation logic is moved to a factory class, which decides which object to create based on input or conditions.

2. Polymorphism:
The factory returns objects of a common interface or abstract class, allowing the client to use the objects without worrying about their concrete implementation.

3. Static Factory Method:
A common implementation in Java uses a static method to create and return objects.

### Key concepts:
1. A generic interface 
2. Class implementing that interface and it's method
3. A factory class/method that takes care of different types of object creation
4. A main method, passing different objects from main method