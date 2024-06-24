# Class:
- A class is a blueprint or template for creating objects.
It defines the properties (fields) and behaviors (methods) that objects of that class will have.
- Classes serve as a template from which objects are created.
# Object:
- An object is an instance of a class.
- When you create an object, you are creating a specific instance of that class, with its own set of values for the fields defined in the class.
- Objects have state (values of their fields) and behavior (methods that they can perform).
- You can create multiple objects from the same class, each with its own distinct set of data.

## What is a Subclass?
 A subclass, also known as a derived class, is a class that inherits properties and behaviors (methods) from another class, called the superclass or base class. The subclass can extend the functionality of the superclass by adding new methods or overriding existing ones.
 ```
 // Superclass
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Subclass
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}
```
more information in *inheritance* topic.

Sub-objects ? WRONG! java has nested `Objects`.more information in  *object-oriented programming* topic