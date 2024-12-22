# Decorator Pattern
The decorator pattern is a design pattern that allows behavior to be added to an individual object, either statically or dynamically, without affecting the behavior of other objects from the same class. The decorator pattern is often useful for adhering to the Single Responsibility Principle, as it allows functionality to be divided between classes with unique areas of concern as well as to the Open-Closed Principle, by allowing the functionality of a class to be extended without being modified.

***The Decorator Pattern is a structural design pattern that allows you to dynamically add new behavior or responsibilities to objects without modifying their existing code. It wraps the original object with additional functionality.***

**Decorator pattern lets you dynamically change the behavior of an object at run time by wrapping them in an object of a decorator class.**

Key Concepts
    Component Interface:
    Defines the methods that can be implemented or decorated.

    Concrete Component:
    The original object to which additional responsibilities can be added.

    Decorator:
    A wrapper that implements the same interface and adds extra behavior.

    Concrete Decorators:
    Specific implementations of the decorator that add distinct features.