# Streams API: Functional-Style Operations on Collections
Java 8's Streams API allows you to process sequences of elements in a functional style. Streams can be 
created from collections, arrays, or I/O channels, and offer a powerful way to perform bulk operations 
on data.

## What is a Stream?
A stream is a sequence of elements supporting sequential and parallel aggregate operations. Unlike collections, 
streams don't store data; they are designed to allow you to perform functional-style operations on the data 
from a source (like a list or an array).

### Pipeline of Operations: 
Streams allow you to create a pipeline of operations, including intermediate operations (e.g., filter, map) 
and terminal operations (e.g., forEach, collect).

## Stream Operations
### Intermediate Operations: 
These operations return another stream, allowing you to chain multiple operations together. They are lazy, 
meaning they do not process data until a terminal operation is invoked.
- filter: Filters elements based on a predicate.
- map: Transforms each element using a function.
- sorted: Sorts elements based on a comparator.

### Terminal Operations: 
These operations trigger the processing of the stream and produce a result.
- forEach: Performs an action for each element.
- collect: Collects the elements into a collection, such as a List or Set.
- reduce: Aggregates elements into a single result.

# How Streams Work
Streams are designed to be lazy. Intermediate operations like `filter()` and `map()` do not process the 
elements immediately; they build up a pipeline of operations. The elements are only processed when a 
terminal operation like `forEach()` or `collect()` is invoked.

### lazy evaluation example :
```
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

List<String> result = names.stream()
    .filter(name -> {
        System.out.println("Filtering: " + name);
        return name.startsWith("A");
    })
    .map(name -> {
        System.out.println("Mapping: " + name);
        return name.toUpperCase();
    })
    .collect(Collectors.toList());
```

## Parallel Streams
Java 8 allows streams to be processed in parallel, enabling multi-threaded processing with minimal 
code changes.

```
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

List<String> result = names.parallelStream()
    .filter(name -> name.startsWith("A"))
    .collect(Collectors.toList());
```
### Parallel Processing: 
The parallelStream() method creates a parallel stream that may process elements in multiple threads. 
This can lead to significant performance improvements, especially with large datasets.

## When Not to Use Streams
### Readability: 
If the stream operations become too complex, they can hurt code readability. In such cases, traditional 
loops may be more appropriate.
### Side Effects: 
Streams are best used in a functional style without side effects (e.g., modifying global state). Using 
side effects in streams can lead to unpredictable results, especially in parallel streams.
### Performance Overhead: 
For small datasets, the overhead of streams, especially parallel streams, might outweigh the benefits.