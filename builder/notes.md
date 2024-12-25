### Builder pattern
### Structure of the Builder Pattern
    Product:
        The complex object that needs to be built.
    
    Builder Interface:
        Defines the methods for constructing parts of the product.
    
    Concrete Builder:
        Implements the builder interface and provides specific implementations for building the product.
    
    Director (Optional):
        Directs the building process by calling the builder methods in a specific sequence.
    
    Client:
        Uses the builder and director to construct the product.

### When to Use the Builder Pattern
1. When the object to be constructed is complex and requires multiple steps or configurations.
2. When you want to avoid a large number of constructor parameters (telescoping constructors).
3. When you need different representations of the same object.