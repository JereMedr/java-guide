# Exception handle 
To better understand exceptions and exception handling, let’s make a real-life comparison. Imagine that we order a product online, but while en-route, there’s a failure in delivery. A good company can handle this problem and gracefully re-route our package so that it still arrives on time.

Likewise, in Java, the code can experience errors while executing our instructions. Good exception handling can handle errors and gracefully re-route the program to give the user still a positive experience.

Exception handling in Java 8 is primarily done through the use of try-catch blocks, throw statements, throws clause, and finally blocks. These constructs help in managing errors and handling exceptional situations gracefully.

## try-catch Blocks:
- The try block encloses the code that may throw exceptions.
- The catch block catches and handles any exceptions thrown within the try block.

Syntax:
```
try {
    // code that may throw exceptions
} catch (ExceptionType e) {
    // exception handling code
}
```

## throw Statement:
- The throw statement is used to explicitly throw an exception.
- It can be used within methods or blocks to indicate exceptional conditions.
Syntax:
```
throw new ExceptionType("Error message");

```
## throws Clause:

- The throws clause is used in method declaration to specify the exceptions that the method can throw.
- It informs the caller of the method about the potential exceptions that need to be handled.
Syntax:
```
public void methodName() throws ExceptionType1, ExceptionType2 {
    // method implementation
}
```
## finally Block:
- The finally block is used to execute code that needs to be run regardless of whether an exception is thrown or not.
- It's typically used for releasing resources or cleanup tasks.
Syntax:
```
try {
    // code that may throw exceptions
} catch (ExceptionType e) {
    // exception handling code
} finally {
    // cleanup code
}
```