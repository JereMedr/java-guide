# Interfaces in Java
An interface in Java is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields or constructors, and they cannot be instantiated. Instead, they are implemented by classes or extended by other interfaces.

## Types of Interfaces
### Functional Interfaces: 
An interface with exactly one abstract method. They are used for lambda expressions and method references. Example: Runnable, Callable, Comparator.
- These are interfaces that contain exactly one abstract method.
- They can have multiple default and static methods.
- They are the foundation of lambda expressions in Java 8.
- Annotated with @FunctionalInterface.

### Marker Interfaces: 
Interfaces with no methods or constants, used to mark a class as having a certain property. Example: Serializable, Cloneable.

### Normal Interfaces: 
Interfaces with one or more abstract methods. Example: List, Map.

## How Interfaces Work
Method Declarations: Interfaces define methods that must be implemented by the classes that implement the interface.

## Multiple Inheritance: 
- A class can implement multiple interfaces, allowing Java to support a form of multiple inheritance.
- Default Methods: Java 8 introduced default methods, allowing interfaces to provide method implementations.

- Static Methods: Java 8 also allowed static methods in interfaces, which are called on the interface type.

## Utility of Interfaces
- Abstraction: Interfaces provide a way to define methods without implementing them, promoting a design principle called abstraction.

- Loose Coupling: By using interfaces, classes can be decoupled from the implementation of their dependencies, making code more modular and easier to maintain.

- Polymorphism: Interfaces allow objects to be accessed through their interface type rather than their concrete class, enabling polymorphic behavior.

## When to Use Interfaces
- When you want to define a contract for classes to implement.
- When you need to support multiple inheritance.
- When you want to decouple the implementation from the interface.
- When you are designing an API or library to be used by multiple clients.

## When Not to Use Interfaces
- When a class will not have multiple implementations.
- When a base class provides default behavior and state management that subclasses can inherit.
- When you need to define a class with a significant amount of common behavio- r.1