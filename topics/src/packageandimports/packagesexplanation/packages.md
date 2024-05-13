# Packages short definition
A package is a namespace that organizes a set of related classes and interfaces. Conceptually you can think of packages as being similar to different folders on your computer. You might keep HTML pages in one folder, images in another, and scripts or applications in yet another. Because software written in the Java programming language can be composed of hundreds or thousands of individual classes, it makes sense to keep things organized by placing related classes and interfaces into packages.

# Packages are divided into two categories:
## Built-in Packages (packages from the Java API)
java.lang: This package is automatically imported in every Java program and contains fundamental classes like Object, String, Integer, etc.

a few examples of the many built-in packages available in Java :
- java.util: 
This package provides utility classes for data structures like ArrayList, HashMap, LinkedList, etc., as well as classes for handling dates, times, and other utility functions.

- java.io: 
This package contains classes for input and output operations such as reading from files (FileInputStream, FileReader) and writing to files (FileOutputStream, FileWriter).

- java.net: 
This package provides classes for networking operations such as creating client-server applications, working with URLs, sockets, and connections.

- java.awt and javax.swing: 
These packages provide classes for creating graphical user interfaces (GUI). AWT (Abstract Window Toolkit) is the original GUI toolkit in Java, while Swing provides more advanced and customizable components.

- java.math: 
This package contains classes for performing arbitrary-precision arithmetic (BigDecimal, BigInteger), which are useful for calculations requiring high precision.

- java.util.concurrent: 
This package provides classes for concurrent programming, including utilities for synchronization, thread pools, and concurrent data structures like ConcurrentHashMap.

- java.security: 
This package contains classes for implementing security functionalities such as encryption, digital signatures, and secure communication.

- java.sql: 
This package provides classes and interfaces for working with relational databases using JDBC (Java Database Connectivity), enabling Java programs to interact with databases like MySQL, Oracle, etc.

- java.text: This package provides classes for formatting and parsing text, numbers, dates, and currencies according to the locale.

## User-defined Packages (create your own packages)

### Creating Packages :
To create a package, you need to include a package statement at the top of your Java source file. For example:
```
package com.example.myproject;
```

### Naming Conventions
Package names are written in all lower case to avoid conflict with the names of classes or interfaces.

Companies use their reversed Internet domain name to begin their package names—for example, com.example.mypackage for a package named mypackage created by a programmer at example.com.

Name collisions that occur within a single company need to be handled by convention within that company, perhaps by including the region or the project name after the company name (for example, com.example.region.mypackage).

Packages in the Java language itself begin with java. or javax.

In some cases, the internet domain name may not be a valid package name. This can occur if the domain name contains a hyphen or other special character, if the package name begins with a digit or other character that is illegal to use as the beginning of a Java name, or if the package name contains a reserved Java keyword, such as "int". In this event, the suggested convention is to add an underscore.