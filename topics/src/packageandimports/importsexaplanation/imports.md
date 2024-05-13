# Imports
In Java, the import statement is used to make classes and interfaces from other packages available to your current source file. Here's how you can use import statements effectively:

## Single Import:
You can import a single class or interface from another package using a single import statement.
```
import packageName.ClassName;
```

## Wildcard Import:
You can import all the classes and interfaces from a package using a wildcard import (*).

```
import packageName.*;
```

## Static Import:
You can import static members (fields and methods) of a class directly into your source file, allowing you to use them without qualifying with the class name.
```
import static packageName.ClassName.*;
```

## Using Imported Classes:
Once you import a class or interface, you can use it directly within your code without fully qualifying its name.
```
ClassName obj = new ClassName();
```

## Commonly Imported Packages:
- Certain packages like java.lang are automatically imported into every Java source file, so you can use classes from these packages without explicit import statements.
- Other commonly used packages like java.util, java.io, etc., may need to be imported explicitly if you're using classes from them.

## Order of Import Statements:

- Import statements should be placed at the beginning of your source file, before any class or interface declarations.
- It's a good practice to group imports by type (static imports first, then single imports, and finally wildcard imports) and organize them alphabetically within each group for readability.
Example:

```
import java.util.ArrayList;
import java.util.List;
import java.util.*; // Wildcard import for all classes/interfaces in java.util package

public class Example {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>(); // Using classes from imported packages
        // Other code...
    }
}
``` 