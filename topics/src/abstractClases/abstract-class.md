# What is an Abstract Class?
An abstract class in Java is a class that cannot be instantiated on its own and is meant to be subclassed. It can have both abstract methods (methods without a body) and concrete methods (methods with a body).

# Key Points:

* An abstract class can have both abstract and concrete methods.
* It can't be instantiated directly.
* It can have constructors, fields, and methods.
* A subclass must either implement all abstract methods of the abstract class or be declared abstract itself.

code example :
```
abstract class Vehicle {
    // Abstract method (does not have a body)
    abstract void start();

    // Concrete method
    void stop() {
        System.out.println("Vehicle stopped");
    }
}
```

## Types of Abstract Classes
### Purely Abstract Class: 
Only contains abstract methods (this is rare in Java because interfaces are usually used for this purpose).
```
abstract class Shape {
    abstract void draw();
}
```

### Partially Abstract Class: 
Contains both abstract and concrete methods.
```
abstract class Animal {
    abstract void sound();
    void eat() {
        System.out.println("Animal is eating");
    }
}
```
### Concrete Abstract Class: 
Contains only concrete methods but is declared abstract to prevent instantiation.
```
abstract class Utility {
    void performTask() {
        System.out.println("Performing task");
    }
}
```

## How Does It Work?
An abstract class serves as a blueprint for other classes. Subclasses inherit the properties and methods of the abstract class and must provide implementations for the abstract methods.


## When to Use Abstract Classes
### Shared Code: 
When you want to provide some common functionality and force subclasses to provide specific details.
### Base Class: 
When creating a base class that shouldn't be instantiated but can hold shared code for derived classes.
### Partial Implementation: 
When you have a common base functionality but need derived classes to implement certain methods.

## When to Use Abstract Classes
### Shared Code: 
When you want to provide some common functionality and force subclasses to provide specific details.
### Base Class: 
When creating a base class that shouldn't be instantiated but can hold shared code for derived classes.
### Partial Implementation: 
When you have a common base functionality but need derived classes to implement certain methods.

## When Not to Use Abstract Classes
### Full Abstraction: 
Use interfaces instead if you need to define a contract without any implementation.
### Multiple Inheritance: 
If you need a class to inherit from multiple sources, prefer interfaces, as Java does not support multiple inheritance with classes but allows multiple interfaces.

## Abstract Classes vs. Interfaces
### Abstract Classes: 
Can have state (fields) and concrete methods.
### Interfaces: 
Cannot have instance fields and, until Java 8, could only have abstract methods. Java 8 introduced default and static methods in interfaces, which can have concrete implementations.