# Design patterns 
Design patterns are proven solutions to common problems in software design. They provide a reusable template 
to solve a recurring design issue, making it easier to develop flexible, scalable, and maintainable software 
systems. Below are some common categories and examples of design patterns:

## Creational Patterns
### Purpose: 
These patterns deal with object creation mechanisms, trying to create objects in a manner suitable for the 
situation.
### Examples:
### Singleton: 
Ensures a class has only one instance and provides a global point of access to it.
### Factory Method: 
Defines an interface for creating an object, but allows subclasses to alter the type of objects that will 
be created.
### Abstract Factory: 
Provides an interface for creating families of related or dependent objects without specifying their concrete 
classes.
### Builder: 
Separates the construction of a complex object from its representation, allowing the same construction process 
to create various representations.
### Prototype: 
Creates new objects by copying an existing object, known as the prototype. 

## Structural Patterns
### Purpose: 
These patterns deal with object composition or the structure of objects to form larger structures.
### Examples:
### Adapter: 
Allows incompatible interfaces to work together by converting the interface of a class into another interface 
that a client expects.
### Bridge: 
Decouples an abstraction from its implementation, allowing them to vary independently.
### Composite: 
Composes objects into tree structures to represent part-whole hierarchies, allowing clients to treat individual 
objects and compositions of objects uniformly.
### Decorator: 
Adds additional functionality to an object dynamically by wrapping it with a decorator class.
### Facade: 
Provides a simplified interface to a complex subsystem or set of interfaces.
### Flyweight: 
Reduces the cost of creating and manipulating a large number of similar objects by sharing common parts of 
state between objects.
### Proxy: 
Provides a surrogate or placeholder for another object to control access to it.

## Behavioral Patterns
## Purpose: 
These patterns are concerned with algorithms and the assignment of responsibilities between objects.
### Examples:
### Chain of Responsibility: 
Passes a request along a chain of handlers until it is handled by one of the handlers.
### Command: 
Encapsulates a request as an object, allowing parameterization of clients with queues, requests, and 
operations.
### Interpreter: 
Defines a grammatical representation for a language and an interpreter to deal with this grammar.
### Iterator: 
Provides a way to access the elements of an aggregate object sequentially without exposing its underlying 
representation.
### Mediator: 
Defines an object that encapsulates how a set of objects interact, promoting loose coupling by preventing 
direct communication between objects.
### Memento: 
Captures and externalizes an object’s internal state so that it can be restored later without violating 
encapsulation.
### Observer: 
Defines a one-to-many dependency between objects, so that when one object changes state, all its dependents
are notified and updated automatically.
### State: 
Allows an object to alter its behavior when its internal state changes, appearing as if the object changed 
its class.
### Strategy: 
Defines a family of algorithms, encapsulates each one, and makes them interchangeable. The algorithm can 
vary independently from the clients that use it.
### Template Method: 
Defines the skeleton of an algorithm in an operation, deferring some steps to subclasses.
### Visitor: 
Represents an operation to be performed on the elements of an object structure, allowing new operations to 
be defined without changing the classes of the elements.

## Concurrency Patterns
### Purpose: 
These patterns deal with multi-threaded programming paradigms to ensure thread-safe, efficient, and maintainable 
concurrency.
### Examples:
### Thread Pool: 
Manages a pool of worker threads, reducing the overhead of thread creation and destruction by reusing threads 
for multiple tasks.
### Producer-Consumer: 
Ensures that producer and consumer threads operate independently using a buffer, where producers can place items 
and consumers can take items.
### Read-Write Lock: 
Allows multiple readers or a single writer to access a resource at a time, optimizing concurrent read access.
### Future: 
Represents a value that will be available later, allowing a program to continue execution without waiting for 
a result.
   
## Benefits of Using Design Patterns
### Reusability: 
Design patterns provide solutions that can be reused in different situations, reducing the amount of custom 
code required.
### Readability: 
By using well-known patterns, the intent of the code becomes more apparent to other developers.
### Maintainability: 
Patterns promote the use of best practices, making the code easier to maintain and extend.