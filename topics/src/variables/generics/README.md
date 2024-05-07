# Generics java
Generics in Java allow you to create classes, interfaces, and methods that operate with specified types. They provide a way to make classes and methods more flexible and reusable by allowing them to work with any data type.

## why use generics ?
Generics add type safety to your code. They allow you to catch type errors at compile time rather than at runtime. They also help in writing cleaner and more concise code by reducing the need for explicit type casting.

## Syntaxis
Class :
```
class MyClass<T> {
    // Class body
}

interface MyInterface<T> {
    // Interface body
}

void myMethod(T item) {
    // Method body
}
```
Method :
```
<T> T myMethod(T item) {
    return item;
}
```
### Wildcards
Java also provides wildcards (?) to represent unknown types. Wildcards are useful when you want to operate on a collection of unknown types. For example:
```
List<?> myList = new ArrayList<>();
```
Here, myList is a list of unknown type.

### Generic Hierachies
You can create hierarchies of generic classes and interfaces. For example:
```
interface Container<T> {
    // Interface body
}

class Box<T> implements Container<T> {
    // Class body
}
```
### Using Bounded Type Parameters:
You can restrict the types that can be used as type parameters using bounded type parameters. For example:
```
class Box<T extends Number> {
    // Class body
}
```
Here, T can only be a subtype of Number.