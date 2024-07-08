# Polymorphism
Allows objects to be treated as instances of their parent class rather than their actual class. This enables one interface to be used for a general class of actions, where the specific action is determined by the exact nature of the situation.

## There are two main types of polymorphism in Java:

### Compile-Time Polymorphism (Method Overloading):
- Occurs when multiple methods in the same class have the same name but different parameters (different type, number, or both).
- The correct method to call is determined at compile time.

### Run-Time Polymorphism (Method Overriding):
- Occurs when a subclass provides a specific implementation of a method that is already defined in its superclass.
- The correct method to call is determined at runtime based on the object being referred to.

## Key Points
- Method Overloading: Same method name but different parameters within the same class. Determined at compile time.
- Method Overriding: Subclass provides a specific implementation of a method that is already defined in its superclass. Determined at runtime.
- Polymorphism: Allows objects of different classes to be treated as objects of a common superclass. It helps in achieving flexibility and reusability in code.