# Proxy Design Pattern in Java
The Proxy design pattern is a structural design pattern that provides a surrogate or placeholder for 
another object to control access to it. It allows you to create an intermediary that acts as the real 
object, controlling and managing access to that object.

## Key Concepts of the Proxy Pattern
## Subject Interface: 
This is the common interface for both the Real Subject and the Proxy. It defines the operations that 
can be performed on the real object.

## Real Subject: 
The actual object that performs the real work.

## Proxy: 
The surrogate that controls access to the Real Subject. The Proxy can add additional functionality, 
such as lazy initialization, access control, logging, or caching.

## Types of Proxies
### Virtual Proxy: 
Manages the creation and initialization of expensive resources.
### Protection Proxy: 
Controls access to the original object, often used for access control.
### Remote Proxy: 
Represents an object located remotely, often in different memory spaces.
### Caching Proxy: 
Provides temporary storage of results of expensive operations to improve performance.
### Logging Proxy: 
Logs every request and access to the real object.

## Advantages of the Proxy Pattern
### Controlled Access: 
The Proxy pattern controls the access to the real object, ensuring that only authorized or 
appropriate requests are passed through.
### Lazy Initialization: 
The Proxy can delay the creation and initialization of the object until it is needed.
### Logging and Monitoring: 
The Proxy can log requests, monitor usage, and track the operations performed on the real object.
### Cost Optimization: 
By caching results or managing expensive resource allocation, the Proxy can optimize performance 
and reduce unnecessary operations.

Let's implement a simple example where we have a Database interface. The real implementation (RealDatabase) 
performs expensive operations (e.g., connecting to a database), while the ProxyDatabase adds access control 
and lazy initialization.