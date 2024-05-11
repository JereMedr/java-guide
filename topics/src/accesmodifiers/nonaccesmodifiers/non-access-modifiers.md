# Non access modifiers 
Non-access modifiers in Java are keywords used to provide additional functionality to classes, methods, and variables without controlling their visibility or accessibility. These modifiers alter the behavior of elements within a Java program.

### For classes
 you can use either final or abstract:
- `final`: The class cannot be inherited by other classes.
- `abstract`: The class cannot be used to create objects.

### For *attributes* and *methods* you can use the one of the following:
- `final`: Attributes and methods cannot be overridden/modified.
- `static`: Attributes and methods belongs to the class, rather than an object.
- `abstract`: Can only be used in an abstract class, and can only be used on methods. The method does not have a body. 
for example :

    ```abstract void run();```.

    The body is provided by the subclass (inherited from).
- `transient`: Attributes and methods are skipped when serializing the object containing them.
- `synchronized`: Methods can only be accessed by one thread at a time.
- `volatile`: The value of an attribute is not cached thread-locally, and is always read from the "main memory"