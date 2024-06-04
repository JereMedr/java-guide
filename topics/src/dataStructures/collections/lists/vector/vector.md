# Vector
A Vector in Java is a synchronized, dynamic array that can hold elements of any type. It automatically resizes itself as elements are added or removed. Because it is synchronized, it is thread-safe, meaning it can be safely used in a multi-threaded environment. However, due to synchronization, it might have some performance overhead compared to non-synchronized collections like ArrayList.
## How Vectors works ?
### Synchronized: 
All methods in Vector are synchronized. This ensures that only one thread can access a Vector object at a time, making it thread-safe.
### Dynamic Sizing: 
Vector automatically increases its size when more elements are added than its current capacity.
### Legacy Class: 
Vector has been part of Java since version 1.0 and is considered a legacy class. It has been retrofitted to implement the List interface and is part of the Java Collections Framework.

# How to instantate a Vector 
### Default Constructor: 
Creates an empty vector with an initial capacity of 10.
```
Vector<E> vector = new Vector<>();
```
### Constructor with Initial Capacity: 
Creates an empty vector with the specified initial capacity.
```
Vector<E> vector = new Vector<>(initialCapacity);
```
### Constructor with Initial Capacity and Capacity Increment: 
Creates an empty vector with the specified initial capacity and capacity increment.
```
Vector<E> vector = new Vector<>(initialCapacity, capacityIncrement);
```
### Constructor from Collection: 
Creates a vector containing the elements of the specified collection, in the order they are returned by the collection's iterator.
```
Vector<E> vector = new Vector<>(Collection<? extends E> c);
```
## Operations on Vector :
### Adding elements :
```
vector.add(element);         // Adds an element to the end of the vector
vector.add(index, element);  // Adds an element at the specified position
```

### Accesing elements :
```
E element = vector.get(index);  // Gets the element at the specified position
```

### Removing elements :
```
vector.remove(index);           // Removes the element at the specified position
vector.remove(element);         // Removes the first occurrence of the specified element
vector.clear();                 // Removes all elements from the vector
```

### Iterating 
```
for (E element : vector) {
    // Process element
}
```

### Size and capacity
```
int size = vector.size();       // Gets the number of elements in the vector
int capacity = vector.capacity(); // Gets the current capacity of the vector
```

### Checking elements
```
boolean contains = vector.contains(element); // Checks if the vector contains the specified element
int index = vector.indexOf(element);         // Gets the index of the first occurrence of the specified element
```