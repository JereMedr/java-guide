# Custom Exceptions:
Custom exceptions are exceptions that you create in your Java programs to represent specific error conditions that are not adequately covered by existing exception classes. 

## Steps to Create a Custom Exception:

1. Create a new Java class that extends Exception (or one of its subclasses like RuntimeException):

2. Define a constructor that accepts a message. This message will be used to describe the exception.
```
public class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}
```
3. Use it
```
public class CustomExceptionExample {
    public static void validate(int age) throws MyCustomException {
        if (age < 0) {
            throw new MyCustomException("Age cannot be negative");
        }
    }

    public static void main(String[] args) {
        try {
            int age = -5;
            validate(age);
        } catch (MyCustomException e) {
            System.out.println("Caught MyCustomException: " + e.getMessage());
        }
    }
}
```
