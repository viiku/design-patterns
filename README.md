# design-patterns

Learning about different kind of design pattern in Java OOPS. Implementing various examples to get most of it.

### Overview
***Questions have been taken from Head First Design Book***

1. Each design pattern contains a related question and it's definitions and implementation. 

### Design Principles
1. Identify the aspects of your application that vary and separate them from what stays the same. 
2. Program to an interface, not an implementation. 
        Program to an interface means designing code to depend on abstract types (interfaces or abstract classes) rather than concrete implementations.
3. Favor composition over inheritance.
4. Strive for loosely coupled designs between objects that interact.
5. Classes should be open for extension, but closed for modification.

### Types of Design Patterns
#### Creational Patterns
**Focus on object creation mechanisms, trying to create objects in a manner suitable for the situation.**

Example: Factory Method, Abstract Factory, Singleton.
Key Idea: Encapsulate object creation to promote flexibility.

1. [Abstract Factory](./factory/abstractfactory/)
2. [Builder](./builder)
3. [Factory Method](./factory/)
4. [Prototype](./prototype)
5. [Singleton](./singleton/)

#### Structural Patterns
**Deal with the composition of classes or objects to form larger structures.**

Example: Adapter, Composite, Decorator.
Key Idea: Simplify relationships between entities or extend functionality dynamically.

1. [Adapter](./adapter)
2. [Bridge](./bridge)
3. [Composite](./composite)
4. [Decorator](./decorator/)
5. [Facade](./facade)
6. [Flyweight](./flyweight)
7. [Proxy](./proxy)

#### Behavioral Patterns
**Concerned with algorithms and communication between objects.**

Example: Strategy, Observer, Command.
Key Idea: Define communication and responsibilities between objects.

1. [Command](./command)
2. [Interpreter](./interpreter)
3. [Iterator](./iterator)
4. [Mediator](./mediator)
5. [Memento](./memento)
6. [Observer](./observer/)
7. [State](./state)
8. [Strategy](./strategy/)