# Interface Segregation Principle (ISP)
It states that no client should be forced to depend on methods it doesn't use. This principle is aimed at preventing the design of monolithic interfaces that are too large and filled with methods that might not be needed by all implementing classes.

## Key Concepts of Interface Segregation Principle
### Specific Interfaces: 
Rather than one large interface, design smaller, more specific interfaces so that clients only need to know about the methods that are of interest to them.
### Client-Specific Interfaces: 
Each interface should be client-specific. Clients should not be forced to implement methods they don't need.
### Avoid Fat Interfaces: 
A fat interface is an interface that has too many methods. This makes the interface more complex and harder to implement correctly.
### Enhances Flexibility and Maintenance: 
By segregating interfaces, changes to one part of the code have less impact on other parts, making the system easier to maintain and extend.

## Bad Example :

Consider an interface Worker that combines methods for different types of workers.
```
public interface Worker {
    void work();
    void eat();
}
```
In this case, both methods work and eat are combined in a single interface. Now, consider two classes Robot and Human that implement this interface:
```
public class Human implements Worker {
    @Override
    public void work() {
        // Human working
    }

    @Override
    public void eat() {
        // Human eating
    }
}
```
```
public class Robot implements Worker {
    @Override
    public void work() {
        // Robot working
    }

    @Override
    public void eat() {
        // Robots don't eat
        throw new UnsupportedOperationException("Robots don't eat");
    }
}
```

The Robot class doesn't need the eat method, but it is forced to implement it, which violates the ISP.

## Good example 
```
public interface Worker {
    void work();
}
```
```
public interface Eater {
    void eat();
}
```
```
public class Human implements Worker, Eater {
    @Override
    public void work() {
        // Human working
    }

    @Override
    public void eat() {
        // Human eating
    }
}
```
```
public class Robot implements Worker {
    @Override
    public void work() {
        // Robot working
    }
}
```