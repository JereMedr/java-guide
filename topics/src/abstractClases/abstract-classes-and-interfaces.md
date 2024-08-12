# Abstract Classes
# Definition: 
An abstract class is a class that cannot be instantiated directly. It can contain both abstract methods (without implementation) and concrete methods (with implementation).
## Abstract Methods: 
Declared without a body (abstract), and any class that inherits from the abstract class must implement these methods unless it is also abstract.
## Concrete Methods: 
Can contain methods with full implementations.
## Constructors: 
Can have constructors, which are called when a concrete class that inherits from the abstract class is instantiated.
## State (Instance Variables): 
Can have instance variables that are inherited by subclasses.
## Inheritance: 
A class can inherit from a single abstract class (Java does not support multiple inheritance).


# Interfaces
## Definition: 
An interface is a contract that defines a set of methods that a class must implement. Before Java 8, all methods in an interface were abstract.
## Abstract Methods: 
All methods in an interface are implicitly public and abstract (up to Java 7). Classes that implement an interface must provide an implementation for all its methods.
## Constants: 
Interfaces can declare constants (public static final), but not instance variables.
## Interface Inheritance: 
A class can implement multiple interfaces, which allows emulation of multiple inheritance.
## No Constructors: 
Interfaces cannot have constructors because they cannot be instantiated directly.

# Interfaces with default Methods (Java 8 onwards)
## default Methods: 
Starting from Java 8, interfaces can contain methods with implementation, known as default methods. These methods allow interfaces to evolve 
without breaking compatibility with classes that already implement them.
## Static Methods: 
They can also contain static methods, which do not require an instance to be called.
## Purpose: 
default methods provide a way to add new functionalities to interfaces while maintaining backward compatibility.
## Overriding: 
Classes that implement the interface can override the default methods if specific behavior is desired. 


# General Comparison
## Abstract Classes vs Interfaces:

Abstract classes are more flexible in terms of what they can contain (constructors, state) and are typically used when there is a close relationship between the base class and its subclasses.
Interfaces are better suited for defining a common contract or behavior that different, possibly unrelated, classes must follow.

## Classic Interfaces vs Interfaces with default Methods:

Classic interfaces offer a pure contract with no implementation.
Interfaces with default methods allow adding default behavior, which is useful for API evolution and avoiding breaking code when new methods are added to the interface.
Abstract Classes vs Interfaces with default Methods:

## Flexibility: 
Abstract classes offer more flexibility in terms of what they can define (state, constructors, non-public methods) compared to interfaces, even those with default methods.
## Multiple Inheritance: 
Interfaces with default methods allow a form of multiple inheritance where a class can inherit behavior from multiple sources, which is not possible with abstract classes.
## Use Cases: 
If you need shared state or a base implementation that should be extended or modified, an abstract class is preferable. If you need to define behavior across multiple classes without 
concern for shared state, interfaces with default methods are more appropriate.

## Abstract Classes vs Interfaces with Default Methods: Key Differences

## State and Fields:

### Abstract Classes: 
Can have instance variables (state). This allows abstract classes to maintain a shared state across all instances of subclasses.
### Interfaces with Default Methods: 
Cannot have instance variables; they can only have constants (public static final). Interfaces with default methods cannot maintain state.

## Constructors:

### Abstract Classes: 
Can have constructors, which are used to initialize the state. Subclasses can call these constructors when they are instantiated.
### Interfaces with Default Methods: 
Cannot have constructors. Since they can't be instantiated, there's no need for a constructor.

## Multiple Inheritance:

### Abstract Classes: 
Java does not allow a class to inherit from multiple abstract classes due to the single inheritance model.
### Interfaces with Default Methods: 
A class can implement multiple interfaces, even if they contain default methods. This allows for a form of multiple inheritance where a class 
can inherit behavior from multiple sources.

## Flexibility:

### Abstract Classes: 
Provide more flexibility in terms of what can be defined, including state, constructors, private methods, and protected methods. They are 
suitable for creating a base class with shared code that multiple related classes can extend.
### Interfaces with Default Methods: 
Primarily define contracts (methods) that classes must adhere to, with the option to provide a default implementation. They are less flexible 
in terms of structure but more flexible in terms of combining behaviors from multiple sources.

## Method Implementation:

### Abstract Classes: 
Can contain both abstract methods (which subclasses must implement) and concrete methods (which provide a default implementation).
### Interfaces with Default Methods: 
Primarily define abstract methods but can also include methods with default implementations. However, all methods are implicitly public, and they cannot define protected or private methods for implementing subclasses.
Use Cases:

### Abstract Classes: Use abstract classes when:
- You want to share code among several closely related classes.
- You need to maintain shared state or require a constructor.
- You want to define some methods as optional to override while providing a base implementation.

### Interfaces with Default Methods: Use interfaces with default methods when:
- You want to define a contract that multiple unrelated classes can implement.
- You need to provide default behavior that classes can optionally override.
- You want to support multiple inheritance of behavior (since a class can implement multiple interfaces).

## When to Use Each
### Abstract Classes:

Ideal when you have a clear hierarchy with shared state or behavior. For example, in a game development context, you might have an abstract 
Character class with fields like health and name, methods like takeDamage(), and subclasses like Warrior, Mage, etc., that extend this class.
Useful when you want to ensure that certain related classes inherit common functionality and properties, and also when you need to provide a 
common base implementation for certain methods.

### Interfaces with Default Methods:

Best suited for defining roles or capabilities that can be shared across unrelated classes. For example, you might have an interface Flyable 
with a default method fly(), which can be implemented by a Bird, an Airplane, and a Drone, none of which need to share a common ancestor.
Appropriate when you want to avoid the restrictions of single inheritance and allow classes to implement multiple behaviors.