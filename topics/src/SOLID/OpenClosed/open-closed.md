# The Open/Closed Principle (OCP) 
OCP states that software entities (classes, modules, functions, etc.) should be open for extension but closed for modification. This means that the behavior of a module should be extendable without modifying its source code.

## Keys of Open/Closed :

### Behavior Extension: 
The OCP encourages designing software modules that can be extended to add new behaviors or functionalities without changing the existing code. This is typically achieved through inheritance and polymorphism.

### Avoiding Modification: 
Modifying existing code can introduce new bugs and unintended consequences. By following OCP, you minimize the need to change existing code and reduce the risk of destabilizing the system.

### Abstraction: 
OCP promotes the use of abstraction (e.g., interfaces, abstract classes) to define stable points of extension. Clients can then use these abstractions to extend the behavior without modifying the core implementation.

## Benefits of OCP
- Maintainability 
- Extensibility
- Reduced Risk 


The Open/Closed Principle encourages modular and extensible designs by allowing software entities to be extended for new functionalities without modifying existing code. This principle promotes cleaner, more maintainable, and scalable software systems.