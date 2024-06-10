# What is HashSet?
*HashSet* is a collection class in Java that implements the Set interface, backed by a hash table (actually a HashMap instance). It does not allow duplicate elements and offers constant-time performance for the basic operations (*add, remove, contains, and size*), assuming the hash function disperses elements properly among the buckets.

## How Does HashSet Work?
### Hashing: 
When you add an element to a HashSet, it uses the element's hashCode to determine the bucket in which the element should be placed. If two elements have the same hash code, they are placed in the same bucket, and their actual equality is checked using the equals method.
### No Duplicates: 
HashSet ensures that no duplicate elements are allowed. If an element already exists in the set, adding it again will have no effect.
### No Order Guarantee: 
The HashSet does not maintain any order of its elements. The order of elements can change over time, especially after adding and removing elements.

## Instantiation
### Default Constructor: 
Creates an empty HashSet with the default initial capacity (16) and load factor (0.75).
```
Set<String> hashSet = new HashSet<>();
```

### With Initial Capacity: 
Creates an empty HashSet with the specified initial capacity and the default load factor.
```
Set<String> hashSet = new HashSet<>(50);
```
### With Initial Capacity and Load Factor: 
Creates an empty HashSet with the specified initial capacity and load factor.
```
Set<String> hashSet = new HashSet<>(50, 0.5f);
```

### From Another Collection: 
Creates a HashSet containing the elements of the specified collection.
```
Set<String> hashSet = new HashSet<>(Arrays.asList("Apple", "Banana", "Orange"));
```

# When to Use HashSet
### Unique Elements: 
When you need to ensure that a collection contains no duplicate elements.
### Fast Operations: 
When you need fast access (constant time performance) for basic operations like add, remove, and contains.
### Unordered Collection: 
When the order of elements is not important.
# When Not to Use HashSet
### Ordered Collection: 
If you need to maintain insertion order, consider using LinkedHashSet.
### Sorted Collection: 
If you need to maintain elements in a sorted order, consider using TreeSet.
### Thread-Safety: 
If you need a thread-safe implementation, consider using Collections.synchronizedSet or ConcurrentHashMap.

# Methods
## Basic Methods:

- `boolean add(E e)`: Adds the specified element to the set if it is not already present.
- `boolean remove(Object o)`: Removes the specified element from the set if it is present.
- `boolean contains(Object o)`: Returns true if the set contains the specified element.
- `void clear()`: Removes all of the elements from the set.
- `int size()`: Returns the number of elements in the set.
- `boolean isEmpty()`: Returns true if the set contains no elements.

## Bulk Operations:

- `boolean addAll(Collection<? extends E> c)`: Adds all of the elements in the specified collection to this set if they're not already present.
- `boolean removeAll(Collection<?> c)`: Removes from this set all of its elements that are contained in the specified collection.
- `boolean retainAll(Collection<?> c)`: Retains only the elements in this set that are contained in the specified collection.
- `boolean containsAll(Collection<?> c)`: Returns true if this set contains all of the elements in the specified collection.

## Array Operations:

- `Object[] toArray()`: Returns an array containing all of the elements in this set.
- `<T> T[] toArray(T[] a)`: Returns an array containing all of the elements in this set; the runtime type of the returned array is that of the specified array.

## Iterating:

- `Iterator<E> iterator()`: Returns an iterator over the elements in this set.