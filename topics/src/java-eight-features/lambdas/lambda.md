# Lambda expressions 
 Represents a way to define anonymous methods that can be passed around as arguments, stored in variables, 
 or returned from other methods. This allows for more concise and functional-style code, especially when 
 working with collections and functional interfaces.
 
## Understanding Lambda Expressions
### A lambda expression consists of three parts:
- Parameters: Enclosed in parentheses, similar to method parameters.
- Arrow (->): Separates the parameters from the body.
- Body: Contains the logic of the lambda expression, which can be either a single expression or a block of code.

``` 
(parameters) -> expression
(parameters) -> { statements; }
```

## How Lambda Expressions Work
Lambda expressions are used primarily with functional interfaces—interfaces that have exactly one abstract method. 
Java 8 introduced several such interfaces in the java.util.function package, such as Function, Predicate, Supplier, 
and Consumer.
```
# The lambda expression is assigned to a variable of type Runnable:

Runnable runnable = () -> System.out.println("Running in a separate thread");
new Thread(runnable).start();

# A new Thread object is created and passed the runnable variable:
# This creates a new thread of execution. When the thread is started using the start() method, it will call the run() 
# method of the Runnable passed to it. The run() method, as defined by the lambda expression, 
# will execute the System.out.println("Running in a separate thread") statement, printing the message to the console.
```
### Runnable Interface: 
Defines a task to be executed by a thread, typically by implementing its run() method.
### Lambda Expression: 
Provides a concise way to implement the run() method of the Runnable interface.
### New Thread: 
The Runnable implementation is passed to a new Thread, which, when started, executes the code defined in the lambda expression.

# When to Use Lambda Expressions
## Simplify Anonymous Classes: 
Lambda expressions are ideal for replacing anonymous classes, especially when working with interfaces that have a single abstract method.
### example : 
``` 
// Before Java 8 (Anonymous class)
Comparator<String> comparator = new Comparator<String>() {
    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2);
    }
};

// After Java 8 (Lambda expression)
Comparator<String> comparator = (s1, s2) -> s1.compareTo(s2);
```

## Functional Programming: 
Lambdas enable a more functional programming style, making it easier to write concise code for operations 
like filtering, mapping, and reducing collections.
### example :
```
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
names.stream()
     .filter(name -> name.startsWith("A"))
     .forEach(System.out::println);
```

## Event Handling: 
In GUI applications, lambda expressions can be used to handle events like button clicks, making the code more 
readable.
### example :
```
button.setOnAction(event -> System.out.println("Button clicked!"));
```

### When Not to Use Lambda Expressions
## Complex Logic: 
If the logic within the lambda expression is complex, it's better to use a method reference or a separate method 
to keep the code readable.
### instead of :
```
list.forEach(item -> {
    // complex logic here
});
```
### Use : 
``` 
list.forEach(this::processItem);

private void processItem(Item item) {
    // complex logic here
}
```

## Code Readability: 
If the lambda expression is too long or hard to understand, it can negatively impact code readability. 
In such cases, it's better to use a named class or method.

## Debugging: 
Lambdas can make debugging more challenging, as the stack trace may not be as informative as with 
traditional anonymous classes.

## Side Effects: 
Lambdas are best suited for pure functions (functions without side effects). If the lambda performs 
actions that affect the program's state in unexpected ways, it can lead to bugs that are hard to trace.