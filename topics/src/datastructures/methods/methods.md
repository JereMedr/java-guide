# Java methods
A method is a block of code which only runs when it is called. You can pass data, known as parameters, into a method. Methods are used to perform certain actions, and they are also known as functions. Why use methods? To reuse code: `define the code once, and use it many times`.

## Method Declaration: 
To declare a method, you specify its access modifier `(optional)` return type, name, and parameters (if any). Here's a basic syntax:
```
returnType methodName(parameter1Type parameter1, parameter2Type parameter2, ...) {
    // method body
}
```
## Return Type: 
A method may return a value of a specific type using the return statement. If a method does not return any value, its return type is specified as `void`.
## Method Name: 
It's the identifier of the method. It should follow Java's *naming conventions*.

- In Java, method names should be verbs or verb phrases and should be written in lowerCamelCase.
    ```
    public void getUserById(int id) {
        // method body
    }
    ```
- Method parameters should also be meaningful and written in lowerCamelCase.
- For boolean methods, it's common to prefix them with "is", "has", or other appropriate verbs.
    ```
    public boolean isActive() {
        // method body
    }
    ```
- When overloading methods (defining multiple methods with the same name but different parameters), ensure that the method names are the same, but the parameter lists differ.
    ```
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }
    ```
- Static methods, which belong to the class rather than to any specific instance, should be named like other methods but may also have a descriptive prefix to indicate their purpose.
- Instance methods belong to an object instance and should follow the same naming conventions as other methods.
## Parameters: 
These are optional and are used to pass data to the method. A method can have zero or more parameters.
## Method Body: 
It contains the code that defines what the method does. This code is enclosed within curly braces {}.
### Example: 
```
public int add(int num1, int num2) {
    int sum = num1 + num2;
    return sum;
}
```