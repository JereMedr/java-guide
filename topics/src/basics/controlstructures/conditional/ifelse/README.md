# Conditionals 
 Conditional statements allow you to control the flow of your program based on certain conditions. the `else` statement provides an alternative path if the condition specified in `if` is not `true`. Java supports the ternary operator `(? :)`, which is a concise way to express conditional operations.

 ## IF
 The `if` statement evaluates a condition and executes a block of code if the condition is true.
 ```
 if (condition) {
    // Code to execute if condition is true
}
```
### example:
```
int x = 10;
if (x > 5) {
    System.out.println("x is greater than 5");
}
```

## ELSE
The `else` statement follows an `if` statement and executes a block of code `if` the condition in the if statement is `false`.
```
if (condition) {
    // Code to execute if condition is true
} else {
    // Code to execute if condition is false
}
```
### example:
```
int x = 3;
if (x > 5) {
    System.out.println("x is greater than 5");
} else {
    System.out.println("x is not greater than 5");
}
```

## IF ELSE
The `else if` statement is used to add additional condition checks after an initial `if` statement. It allows you to evaluate multiple conditions sequentially until one of them evaluates to true, executing the corresponding block of code associated with *the first* `true` condition or the default block if none of the conditions are met.

```
if (condition1) {
    // Code to execute if condition1 is true
} else if (condition2) {
    // Code to execute if condition1 is false and condition2 is true
} else if (condition3) {
    // Code to execute if condition1 and condition2 are false and condition3 is true
} else {
    // Code to execute if none of the conditions are true
}
```
### example:
```
int num = 10;

if (num > 0) {
    System.out.println("Number is positive");
} else if (num < 0) {
    System.out.println("Number is negative");
} else {
    System.out.println("Number is zero");
}
```

## Ternary Operator (? :)
The ternary operator `(? :)` is a concise way to express conditional operations in Java.
```
(condition) ? expression1 : expression2
```
If the `condition` is true, `expression1` is evaluated; else, `expression2` is evaluated.

### example:
```
int x = 10;
String message = (x > 5) ? "x is greater than 5" : "x is not greater than 5";
System.out.println(message);
```
---
object examples :
```
public class MyClass {
    private boolean myAttribute;

    public MyClass(boolean myAttribute) {
        this.myAttribute = myAttribute;
    }

    public void methodForTrue() {
        System.out.println("The attribute is true.");
        // Additional logic if the attribute is true
    }

    public void methodForFalse() {
        System.out.println("The attribute is false.");
        // Additional logic if the attribute is false
    }

    public static void main(String[] args) {
        // Create an instance of MyClass with the attribute as false
        MyClass obj = new MyClass(false);

        // Call the appropriate method based on the value of the attribute
        (obj.myAttribute ? obj.methodForTrue() : obj.methodForFalse());
    }
}
```