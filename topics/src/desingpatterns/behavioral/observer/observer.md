# Observer Design Pattern in Java
The Observer pattern is a behavioral design pattern that allows an object (known as the Subject) 
to notify a list of dependent objects (known as Observers) of any state changes, usually by 
calling one of their methods. This pattern is particularly useful when you want to implement a 
system where changes to one object automatically result in updates to other objects.

## Key Concepts of the Observer Pattern
### Subject: 
The object that holds the state and notifies observers when a change occurs. It maintains a list 
of observers and provides methods to add, remove, and notify observers.

### Observer: 
An interface or abstract class that defines an update method, which is called by the subject 
whenever the subject's state changes.

### ConcreteSubject: 
The actual subject that stores the state of interest to observers and implements the method to 
notify them.

### ConcreteObserver: 
The actual observer that implements the update method to respond to notifications from the subject.

## When to Use the Observer Pattern
- When you need to notify multiple objects about changes in another object without tightly coupling 
them.
- When an abstraction has two aspects, one dependent on the other. Encapsulating these aspects in 
separate objects allows for varying and reusing them independently.
- When a change to one object requires changing others, and you don't know how many objects need to 
be changed.

### Advantages of the Observer Pattern
- `Loose Coupling:` The subject and observers are loosely coupled, meaning that changes to one don’t 
require changes to the other.
- `Dynamic Relationships:` Observers can be added or removed at runtime, providing flexibility in 
the system.
- `Automatic Updates:` Observers automatically receive updates whenever the subject's state changes, 
reducing the need for manual checks.

### Code Example in Java 8
Let's implement a simple example where we have a Subject that notifies observers whenever its state 
changes. The observers could be various components that need to react to these changes.