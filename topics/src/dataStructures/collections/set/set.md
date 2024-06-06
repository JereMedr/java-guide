# SET
In Java, a `set` is a collection that cannot contain duplicate elements. It models the mathematical set abstraction and is part of the Java Collections Framework. Java 8 introduced several enhancements to collections, including new methods and the Stream API.

## Characteristics
- No Duplicate Elements: A Set cannot contain duplicate elements.
- Order: Some implementations (like HashSet) do not maintain any order of the elements, while others (like LinkedHashSet) maintain insertion order, and TreeSet sorts the elements in natural order or by a provided comparator.
- Null Elements: A Set can contain at most one null element (if the implementation allows it, e.g., HashSet).

## How to instantiate
### Hashset :
The most commonly used implementation, which does not guarantee any order of the elements.
```
Set<String> hashSet = new HashSet<>();
hashSet.add("Apple");
hashSet.add("Banana");
hashSet.add("Orange");
```
### LinkedHashSet: 
Maintains insertion order.
```
Set<String> linkedHashSet = new LinkedHashSet<>();
linkedHashSet.add("Apple");
linkedHashSet.add("Banana");
linkedHashSet.add("Orange");
```
### TreeSet: 
Sorts the elements in natural order.
```
Set<String> treeSet = new TreeSet<>();
treeSet.add("Apple");
treeSet.add("Banana");
treeSet.add("Orange");
```

## Advantages 
- No Duplicates: Ensures that there are no duplicate elements.
- Different Implementations: Flexibility in choosing the implementation that fits the use case (e.g., HashSet for general use, TreeSet for sorted sets).
- Performance: Generally offers better performance for certain operations (e.g., HashSet offers constant time performance for basic operations).

## Disadvantages
- No Indexed Access: Elements cannot be accessed by an index, as Set does not provide random access like List.
- Less Control Over Order: Depending on the implementation, the order of elements can be unpredictable (e.g., HashSet).
- Single Null Element: Only one null element is allowed (and not at all in TreeSet due to sorting).

