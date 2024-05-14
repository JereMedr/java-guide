# Checked Exceptions:
Checked exceptions are those that are checked at compile-time. This means the compiler checks that the code handling the exception is in place. If not, it forces the programmer to either handle the exception using a try-catch block or declare the exception to be thrown using the throws keyword.

Examples :

- IOException: This exception occurs when there is an error during input-output operations, such as reading from or writing to files.
- SQLException: This exception occurs when there is an error in database operations.
- ClassNotFoundException: This exception occurs when an application tries to load a class through its string name, but no definition for the class with the specified name could be found.
- ParseException: This exception occurs when there is an error parsing strings into date objects or vice versa.