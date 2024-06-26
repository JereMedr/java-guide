# The Single Responsibility Principle (SRP) 
 SRP states that a class should have only one reason to change. This means that a class should have only one job or responsibility:

## Why SRP Matters
### Cohesion: 
A class with a single responsibility is highly cohesive. Cohesion refers to how closely related and focused the responsibilities of a single module (class, method, etc.) are. High cohesion within a class means that its responsibilities are related and focused, making it easier to understand and maintain.

### Maintainability: 
When a class has only one reason to change, it is easier to maintain. If a class is responsible for multiple things, changes in one responsibility might affect the other, leading to more fragile and difficult-to-maintain code.

### Reusability: 
Classes with single responsibilities are more likely to be reusable in different contexts because they are not entangled with other responsibilities.

### Testability: 
It is easier to write unit tests for classes with a single responsibility because their behavior is simpler and more predictable.