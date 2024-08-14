# Method References in Java
Method references were introduced in Java 8 as a shorthand notation for calling methods using lambda 
expressions. They allow you to refer to methods directly by their names, making your code cleaner and 
more readable. Method references are closely related to lambda expressions and can be used wherever a 
lambda expression is used.

## Why Use Method References?
Method references simplify the code when you need to pass an existing method as a parameter to a higher-order 
function (a function that takes another function as a parameter). Instead of writing a lambda expression that 
simply calls a method, you can directly refer to the method.

## Types of Method References
### Reference to a Static Method
You can refer to a static method using the syntax ClassName::methodName.
```
class NumberUtils {
    public static boolean isPositive(int number) {
        return number > 0;
    }
}
```
 Instead of using a lambda expression to refer to this method, like:
```
numbers.stream().filter(number -> NumberUtils.isPositive(number));
```
 you can use method reference like :
```
numbers.stream().filter(NumberUtils::isPositive);
```
### Reference to an Instance Method of a Particular Object
You can refer to an instance method of a specific object using the syntax `instance::methodName`.

Example:
Suppose you have an instance of the Printer class with a method `print`:
```
class Printer {
    public void print(String message) {
        System.out.println(message);
    }
}

Printer printer = new Printer();
```
Instead of using a lambda expression to refer to this method:
```
messages.forEach(message -> printer.print(message));
```

use method reference :
```
messages.forEach(printer::print);
```
Explanation: printer::print is a reference to the print method of the printer 
instance. This simplifies the lambda expression message -> printer.print(message) 
to just printer::print.

### Reference to an Instance Method of an Arbitrary Object of a Particular Type
You can refer to an instance method of an arbitrary object of a particular type using 
the syntax ClassName::methodName.

Example:
Suppose you have a list of strings, and you want to sort them using the compareToIgnoreCase method:
```
List<String> strings = Arrays.asList("A", "b", "C");
```
instead of lambda : 
```
strings.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
```
method reference :
```
strings.sort(String::compareToIgnoreCase);
```

### Reference to a Constructor
You can refer to a constructor using the syntax ClassName::new.
Suppose you have a User class with a constructor that takes a String parameter:
```
class User {
    private String name;

    public User(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "User: " + name;
    }
}
```
You want to create a list of User objects from a list of names:
```
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
```
using lambda : 
```
List<User> users = names.stream()
    .map(name -> new User(name))
    .collect(Collectors.toList());
```
using constructor reference : 
```
List<User> users = names.stream()
    .map(User::new)
    .collect(Collectors.toList());
```

## Practical Use Cases of Method References
Method references are particularly useful in stream operations 
where you frequently need to map or filter elements.
```
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

// Using method reference
List<String> sortedNames = names.stream()
    .sorted(String::compareToIgnoreCase)
    .collect(Collectors.toList());
```