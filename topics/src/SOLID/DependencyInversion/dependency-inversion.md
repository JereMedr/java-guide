# The Dependency Inversion Principle (DIP) 
It states that:
- High-level modules should not depend on low-level modules. Both should depend on abstractions.

- Abstractions should not depend on details. Details should depend on abstractions.

In simpler terms, this principle encourages the decoupling of software modules by relying on abstractions rather than concrete implementations.

## Key Concepts of Dependency Inversion Principle
### Abstractions over Implementations: 
Code should depend on interfaces or abstract classes rather than concrete implementations. This makes the code more flexible and easier to change.

### Decoupling: 
By depending on abstractions, high-level modules are not tightly coupled to low-level modules. This reduces the impact of changes in one part of the system on another.

### Inversion of Control (IoC): 
A `design pattern` that helps achieve DIP by ensuring that objects do not create their dependencies directly. Instead, they get dependencies from an external source, often referred to as a container or a framework.