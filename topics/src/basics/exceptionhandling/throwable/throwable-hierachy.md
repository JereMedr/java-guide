# Throwable Hierarchy:
## Throwable:
- At the top of the hierarchy is the `Throwable` class.
Both `Exception` and `Error` classes `extend` from `Throwable`.
- Throwable is the superclass of all errors and exceptions in the Java language.
### Exception:
- Exceptions are conditions that occur because of incorrect input, incorrect implementation, or unexpected conditions.
- Exception class extends Throwable.
- Exceptions are meant to be caught and handled in the code.
- Checked exceptions (e.g., `IOException`, `SQLException`) must be either caught or declared in the method signature.
- Exceptions in Java can be categorized into two types : `checked` and `unchecked`
### Error:
- Errors are conditions that generally occur because of resource exhaustion, serious failures, or other abnormal conditions.
- Error class `extends Throwable`.
- Errors are typically not meant to be caught by applications. They represent serious problems that should not be caught programmatically.