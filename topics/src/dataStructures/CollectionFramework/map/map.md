# MAP
The `Map` interface is not part of the Collection interface hierarchy in Java, but it is a part of the Java Collections Framework. The Collection interface is the root of the collections hierarchy that includes lists, sets, and queues, whereas Map stands alone in its own hierarchy because it represents a collection of key-value pairs rather than a simple collection of elements.

# Hierarchy of Map Interface
The Map interface is a part of the Java Collections Framework but does not extend the Collection interface. Instead, it provides its own set of operations to manage key-value pairs. The hierarchy is as follows:

Interface: java.util.Map<K, V>
Implementations:
java.util.HashMap<K, V>
java.util.LinkedHashMap<K, V>
java.util.TreeMap<K, V>
java.util.Hashtable<K, V>
java.util.WeakHashMap<K, V>
java.util.IdentityHashMap<K, V>
java.util.EnumMap<K, V>

# What is a Map?
A Map is an object that maps keys to values. It cannot contain duplicate keys, and each key can map to at most one value. This allows for efficient retrieval, update, and deletion operations based on keys.

# How do Maps Work?
Maps store key-value pairs and provide methods to a`dd, remove, and retrieve` these pairs. They offer constant-time performance for the basic operations (like get and put), assuming the hash function disperses the elements properly among the buckets.

# Instantiation methods
```
Map<String, Integer> hashMap = new HashMap<>();
Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
Map<String, Integer> treeMap = new TreeMap<>();
Map<String, Integer> hashtable = new Hashtable<>();
Map<String, Integer> weakHashMap = new WeakHashMap<>();
Map<String, Integer> identityHashMap = new IdentityHashMap<>();
Map<Day, Integer> enumMap = new EnumMap<>(Day.class);
```
# Common Methods
## Basic Operations:

- put(K key, V value): Associates the specified value with the specified key.
- get(Object key): Returns the value to which the specified key is mapped.
- remove(Object key): Removes the mapping for the specified key.
- containsKey(Object key): Returns true if the map contains a mapping for the specified key.
- containsValue(Object value): Returns true if the map maps one or more keys to the specified value.
- size(): Returns the number of key-value mappings in the map.
- isEmpty(): Returns true if the map contains no key-value mappings.
- clear(): Removes all mappings from the map.

### Bulk Operations:
- putAll(Map<? extends K, ? extends V> m): Copies all of the mappings from the specified map to this map.

### Collection Views:

- keySet(): Returns a Set view of the keys contained in this map.
- values(): Returns a Collection view of the values contained in this map.
- entrySet(): Returns a Set view of the mappings contained in this map.

## When to Use Maps
### Use Maps When:

- You need to associate keys with values.
- You need fast retrieval, insertion, and deletion of key-value pairs.
- You need to ensure unique keys.

### Avoid Using Maps When:

- The order of elements is crucial (unless using LinkedHashMap or TreeMap).
- You need to use the map in a multithreaded environment without synchronization (use ConcurrentHashMap for thread safety).
- You need null keys and values (use implementations that support null keys and values, like HashMap).

# Types of maps
## HashMap
### Characteristics:
- Uses a hash table to store key-value pairs.
- Allows one null key and multiple null values.
- Does not guarantee any specific order of elements.

### Advantages:
- Provides constant-time performance for basic operations (put, get, remove).
- Highly efficient for large datasets.

### Weaknesses:
- No ordering of elements.
- Not synchronized; needs external synchronization for concurrent access.

### Uses:
- General-purpose use cases where order is not important.
- Fast access to data based on unique keys.

## LinkedHashMap
### Characteristics:
- Extends HashMap and maintains a doubly-linked list of entries.
- Preserves insertion order or access order.

### Advantages:
- Maintains predictable iteration order (insertion or access order).
- Similar performance to HashMap with additional ordering features.

### Weaknesses:
- Slightly slower than HashMap due to the additional overhead of maintaining the linked list.

### Uses:
- Caches and other data structures where order of entry is important.
- Implementing LRU (Least Recently Used) caches.

## TreeMap
### Characteristics:

- Implements NavigableMap and is based on a Red-Black tree.
- Naturally ordered by keys (ascending order).

### Advantages:
- Provides guaranteed log(n) time cost for basic operations (put, get, remove).
- Supports a variety of ordered map operations (e.g., range views, iteration in sorted order).

### Weaknesses:
- Slower than HashMap and LinkedHashMap for insertion, deletion, and access operations.
- Does not allow null keys (but null values are permitted).

### Uses:
- Applications requiring sorted order of elements.
- Implementing natural ordering of keys or custom order using a comparator.

## Hashtable
### Characteristics:
- Synchronized version of HashMap.
- Does not allow null keys or values.

### Advantages:
- Thread-safe and can be shared among multiple threads without additional synchronization.

### Weaknesses:
- Generally slower than HashMap due to synchronization overhead.
- Legacy class with outdated methods; newer classes like ConcurrentHashMap are preferred for concurrent use.

### Uses:
- Legacy applications requiring thread-safe maps without external synchronization.
## ConcurrentHashMap
### Characteristics:
- Designed for concurrent access.
- Uses a segmented locking mechanism to allow multiple threads to read and write without locking the entire map.

### Advantages:
- High concurrency with better performance compared to Hashtable.
- Does not lock the entire map for reads and updates.

### Weaknesses:
- Slightly more complex internal structure compared to HashMap and Hashtable.

### Uses:
- Multithreaded applications where map access needs to be highly concurrent.
- Replacing Hashtable in concurrent scenarios.

## WeakHashMap
### Characteristics:
- Uses weak references for its keys.
- Entries are removed automatically when their keys are no longer in ordinary use.
### Advantages:
- Allows entries to be garbage collected, preventing memory leaks.

### Weaknesses:
- May not retain entries as expected since keys can be garbage collected.

### Uses:
- Caching scenarios where keys should not prevent their associated values from being garbage collected.
- Situations where you need to avoid memory leaks due to lingering references.

## IdentityHashMap

### Characteristics:
- Uses reference equality (==) instead of object equality (equals) for comparing keys.
- Does not allow duplicate keys based on reference equality.

### Advantages:
- Useful for scenarios where distinct objects with the same content should be treated as different keys.

### Weaknesses:
- Not suitable for general-purpose maps since it breaks the equals contract for keys.

### Uses:
- Specialized use cases where reference equality is required.
- Object graph traversals, where object identity is important.

## EnumMap
### Characteristics:
- Specialized map implementation for use with enum type keys.
- Very efficient and compact representation.

### Advantages:
- Fast and efficient for enum keys.
- Null keys are not allowed, but null values are permitted.

### Weaknesses:
- Only works with enum keys.

### Uses:
- Situations where the keys are enum constants.
- Applications needing a map with enum keys for efficiency and type safety.