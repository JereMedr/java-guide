# Default methods
introduced in Java 8, allow you to add new methods to interfaces without breaking the existing implementations. 
Before Java 8, interfaces could only have abstract methods (methods without a body). With default methods, 
you can provide a default implementation for a method directly in the interface.

## Understanding Default Methods in Interfaces
### Why Default Methods?
The main motivation behind default methods was to evolve interfaces in a backward-compatible way. Before 
Java 8, if you added a new method to an interface, all classes that implemented that interface would break 
because they wouldn’t have provided an implementation for the new method. Default methods allow you to add 
new methods to interfaces with a default implementation, so existing classes are not forced to implement those 
new methods.

### Example Use Case:
Consider an interface Vehicle that defines a method start(). Later, you want to add a method stop() to the 
interface. If stop() is a default method, existing implementations of Vehicle won’t break.

### Syntax of Default Methods
A default method is defined in an interface using the default keyword, followed by the method body.
```
interface Vehicle {
    void start(); // Abstract method

    default void stop() {
        System.out.println("Vehicle is stopping");
    }
}
```
### default Keyword: 
Used to define a method with a default implementation in the interface.
### Method Body: 
Unlike abstract methods, default methods have a body that provides the implementation.

## Using Default Methods
Any class that implements an interface with default methods can use those methods directly or override 
them if needed.

```
interface Vehicle {
    void start();

    default void stop() {
        System.out.println("Vehicle is stopping");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    // No need to override stop() unless specific behavior is needed
}

class Bicycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bicycle is starting");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle is stopping manually");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start(); // Outputs: Car is starting
        car.stop();  // Outputs: Vehicle is stopping

        Vehicle bicycle = new Bicycle();
        bicycle.start(); // Outputs: Bicycle is starting
        bicycle.stop();  // Outputs: Bicycle is stopping manually
    }
}
```
### Car Class: 
Inherits the default stop() method from Vehicle. No need to override it unless specific behavior is 
desired.
### Bicycle Class: 
Overrides the default stop() method to provide its own implementation.

## Multiple Inheritance and Conflict Resolution
One of the challenges with default methods is dealing with multiple inheritance in interfaces. If a 
class implements multiple interfaces that have conflicting default methods, Java provides a way to 
resolve the conflict.

```
interface Vehicle {
    default void service() {
        System.out.println("Vehicle service");
    }
}

interface Engine {
    default void service() {
        System.out.println("Engine service");
    }
}

class Car implements Vehicle, Engine {
    @Override
    public void service() {
        Vehicle.super.service(); // Calling Vehicle's service
        Engine.super.service();  // Calling Engine's service
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.service(); 
        // Outputs:
        // Vehicle service
        // Engine service
    }
}
```
