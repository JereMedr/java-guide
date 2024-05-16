# Collections in Java
The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.

Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.

Java Collection means a single unit of objects. Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).

## What is Collection in Java
A Collection represents a single unit of objects, a group.

## What is a framework in Java
- It provides readymade architecture.
- It represents a set of classes and interfaces.
- It is optional.
## What is Collection framework
The Collection framework represents a unified architecture for storing and manipulating a group of objects. It has:
Interfaces and its implementations, classes to handle elements.
### Queue Interface:
- LinkedList: Implements a doubly-linked list that can function as a queue.
- PriorityQueue: Implements a priority queue based on the priority heap.
- Common Operations (for Queue):
```  
    Adding Elements: offer(element) method.
    Removing Elements: poll() method.
    Checking Size: size() method.
    Accessing Elements: peek() method to view the head of the queue.
```
### List Interface:
- ArrayList: Implements a dynamic array that can grow as needed.
- LinkedList: Implements a doubly-linked list.
- Vector: Similar to ArrayList but is synchronized.
  
### Set Interface:
- HashSet: Implements a set using a hash table .Does not guarantee the order of elements.
Provides constant-time performance for the basic operations (add, remove, contains).
- TreeSet: Implements a set stored in a tree structure. Elements are ordered according to their natural ordering or a custom Comparator.
Provides logarithmic-time performance for most operations.
- LinkedHashSet: Maintains insertion order. Implemented as a hash table with a linked list running through it.
Provides constant-time performance for the basic operations.

### Common Operations:
- Removing Elements: remove(element) method.
- Adding Elements: add(element) method.
- Checking Size: size() method.
- Accessing Elements: get(index) method for lists, contains(element) method for sets and maps.
- Iteration: Using loops or enhanced for loops.
### Enhanced Features in Java 8:
   a. Lambda Expressions:
 ```
   List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
   names.forEach(name -> System.out.println(name));
 ```
   b. Stream API:
```   List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
   names.stream()
   .filter(name -> name.startsWith("A"))
   .forEach(System.out::println);
```
   c. Method References:
```
   List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
   names.forEach(System.out::println);
```
   d. Optional:
```
   Optional<String> optionalName = Optional.ofNullable(getName());
   String name = optionalName.orElse("Default Name");
```
   e. New Methods in Collections:
```
   List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
   names.removeIf(name -> name.length() > 5);
```
   f. Parallel Array Sorting:
```
   int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6};
   Arrays.parallelSort(numbers); 
```
## General Tips:
- Use generics to ensure type safety.
- Prefer interfaces over concrete implementations.
- Choose the appropriate collection type based on your requirements (e.g., List for ordered collections with duplicates, Set for unordered collections without duplicates).