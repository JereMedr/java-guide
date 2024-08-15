# Strategy Design Pattern in Java
The Strategy pattern is a behavioral design pattern that allows you to define a family of algorithms, 
encapsulate each one of them in a separate class, and make their objects interchangeable. This pattern 
enables a client to choose which algorithm to use at runtime.

## Key Concepts of the Strategy Pattern
### Strategy Interface: 
Defines a common interface for all the algorithms (strategies). This interface is implemented by all 
concrete strategy classes.

### Concrete Strategies: 
These are the different implementations of the strategy interface. Each concrete strategy implements 
a specific algorithm.

### Context: 
This is the class that contains a reference to a strategy object. It uses this strategy object to 
execute the algorithm defined by the strategy interface. The context does not know the specifics 
of the strategy; it only knows that it adheres to the strategy interface.

## When to Use the Strategy Pattern
- When you have multiple algorithms for a specific task and you want to choose the algorithm at 
runtime.
- When you want to avoid conditional statements for selecting different behaviors.
- When you want to encapsulate and make algorithms interchangeable without modifying the client 
code.

## Advantages of the Strategy Pattern
### Flexibility: 
The strategy pattern allows you to change the algorithm without modifying the context or client code.
### Code Reusability: 
Algorithms can be reused across different contexts.
### Avoids Conditional Logic: 
By encapsulating algorithms in their own classes, the strategy pattern helps avoid complex conditional 
logic in the client code.
### Encapsulation: 
Each algorithm is encapsulated in its own class, making the codebase easier to maintain and extend.

### Code Example in Java 8
Let’s implement a simple example where we have a PaymentStrategy interface. The concrete strategies will 
implement different payment methods like credit card payment and PayPal payment.