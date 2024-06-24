# Access Modifiers 
## controls the access level
 Used in Java to control the visibility and accessibility of classes, methods, and fields within a program. They provide a way to enforce encapsulation and protect the internal state of objects. 
 Acces modifiers are useful for : 

### Encapsulation: 
Access modifiers help enforce encapsulation by hiding the internal implementation details of classes from external code. This allows classes to expose only the necessary functionalities and prevents external code from directly accessing or modifying internal data, which can help maintain the integrity of the data and ensure that it remains consistent.

### Security: 
By restricting access to certain parts of a program, access modifiers help improve security by preventing unauthorized code from accessing sensitive or critical functionality. For example, marking certain methods or fields as private ensures that they can only be accessed by trusted code within the same class, reducing the risk of unintended interference or manipulation.

### Abstraction: 
Access modifiers allow developers to define clear interfaces for interacting with objects, hiding unnecessary details and exposing only the essential functionalities. This promotes abstraction and simplifies the usage of classes, making it easier to understand and work with complex systems.

### Modularity: 
Access modifiers facilitate modularity by enabling developers to define clear boundaries between different components of a program. By controlling the visibility of classes, methods, and fields, developers can create well-defined APIs and modules that can be independently developed, tested, and maintained.

### Maintainability: 
By encapsulating implementation details and controlling access to class members, access modifiers help improve the maintainability of codebases. Changes to internal implementations can be made without affecting external code that relies on the defined interfaces, reducing the risk of unintended side effects and making it easier to refactor or extend the code in the future.

### For classes 
You can use either `public` or `default`.
- `public` : The class is accessible by any other class.
```
public class MyClass {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
```	
- `default` : The class is only accessible by classes in the same package. This is used when you don't specify a modifier.
```
class MyClass {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}
```

### For *attributes*, *methods* and *constructors*, you can use the one of the following:
- `public` : The class is accessible for all classes.
- `private` : The code is only accessible within the declared class.
- `default` : The code is only accessible in the same package. This is used when you don't specify a modifier.
- `protected` : The code is accessible in the same package and subclasses.

These access modifiers help in encapsulation and controlling the visibility of code elements, which is essential for building maintainable and secure Java applications.