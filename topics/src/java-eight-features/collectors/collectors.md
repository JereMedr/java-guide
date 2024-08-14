# Collectors 
The Collectors class in Java 8 is a utility class that provides a range of static methods for reducing 
and transforming elements in a Stream into a final result, such as a List, Set, Map, or even a single 
value. It plays a crucial role in the Java Stream API, enabling powerful data manipulation and aggregation 
capabilities.

## What is a Collector?
A Collector is an interface in Java 8 that defines how to collect the elements of a stream. It encapsulates 
the logic of transforming elements from a stream into a different form, such as a collection or a summary 
result. The Collectors utility class provides implementations of the Collector interface that are ready to use.

## Common Collectors
### Collecting to a List
The `Collectors.toList()` method collects the elements of a stream into a List.
```
List<String> names = Stream.of("Alice", "Bob", "Charlie")
    .collect(Collectors.toList());
    
    // Result: The stream of names is collected into a List<String>.
```

### Collecting to a Set
The `Collectors.toSet()` method collects the elements of a stream into a Set, removing duplicates.
```
Set<String> uniqueNames = Stream.of("Alice", "Bob", "Charlie", "Alice")
    .collect(Collectors.toSet());
    
    // Result: The stream of names is collected into a Set<String>, where duplicates are automatically removed.
```

### Collecting to a Map
The `Collectors.toMap()` method collects the elements of a stream into a Map. You need to provide 
two functions: one for the keys and one for the values.
```
Map<Integer, String> nameMap = Stream.of("Alice", "Bob", "Charlie")
    .collect(Collectors.toMap(String::length, Function.identity()));
```
- Explanation: 
String::length is used as the key (the length of the string), and Function.identity() returns the string 
itself as the value.
- Result: The stream is collected into a Map<Integer, String>, where the key is the length of the string 
and the value is the string itself.
- Note: If the stream contains elements with duplicate keys, toMap() will throw an IllegalStateException. 
You can resolve this by providing a merge function as a third argument to handle collisions.