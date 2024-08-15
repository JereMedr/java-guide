# Bridge Design Pattern in Java
The Bridge design pattern is a structural design pattern that decouples an abstraction from its implementation so that 
the two can vary independently. This pattern is especially useful when you need to combine different implementations and 
avoid a combinatorial explosion of classes.

## Key Concepts of the Bridge Pattern
### Abstraction: 
The core concept or high-level control class that clients interact with. It holds a reference to an implementer (bridge) 
object.

### Implementor (Bridge): 
An interface or abstract class that defines the methods to be implemented by concrete implementations. It acts as a bridge 
between the abstraction and the concrete classes.

### Concrete Implementor: 
These are the actual implementations of the bridge interface. Each concrete implementor provides specific functionality.

### Refined Abstraction: 
An extension of the abstraction class that can add more functionality or modify existing behavior.

## When to Use the Bridge Pattern
- When you have multiple abstractions and implementations that need to be combined in different ways, and you want to 
avoid a large number of subclasses.
- When both the abstraction and the implementation should be extensible via inheritance independently.
- When you want to change the implementation at runtime without affecting the abstraction.

## Advantages of the Bridge Pattern
### Decoupling: 
It decouples the abstraction from its implementation, allowing them to evolve independently.
### Reduces Code Complexity: 
By avoiding an explosion of subclasses, it keeps the codebase more manageable.
### Increases Flexibility: 
New abstractions and implementations can be added without modifying existing code.
### Improves Maintainability: 
With clear separation between abstraction and implementation, the code is easier to maintain and extend.

## Key Points for the Interview
### Decoupling Abstraction from Implementation: 
The Bridge pattern is used to decouple an abstraction from its implementation, allowing the two to vary independently.
### Use Case: 
It's ideal when you have multiple abstractions and implementations that you want to combine flexibly without creating 
a large number of subclasses.
### Advantages: 
It reduces the complexity of the codebase, increases flexibility, and improves maintainability by clearly separating 
the abstraction from the implementation.
### Real-World Example: 
The pattern is often used in graphical applications, where different shapes (abstractions) can be drawn in different 
colors (implementations) without creating a new class for every possible combination.

### Example: 
Let's implement a simple example where we have different shapes (like Circle, Square) and different colors 
(like Red, Green). Instead of creating separate classes for every possible combination (RedCircle, GreenSquare, etc.), 
we use the Bridge pattern.

