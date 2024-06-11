# What is an Iterator?
An Iterator is an interface in Java that provides a way to traverse a collection of objects one at a time. It allows you to iterate through the elements of a collection, such as a TreeSet, in a sequential manner.

## When to Use an Iterator
- When you need to traverse a collection: Iterators are useful when you need to go through all elements of a collection one by one.
- When you need to remove elements during traversal: Iterators provide a safe way to remove elements from the collection while iterating.
- When the collection type is unknown or abstracted: Using an iterator can abstract the way of traversing through various types of collections.

## When Not to Use an Iterator
- When random access is needed: If you need to access elements randomly (i.e., not sequentially), iterators are not suitable.
- For simple loops over known structures: For collections like ArrayList, where you know the structure and size, a simple for-each loop might be more readable and efficient.
- When thread safety is a concern: Iterators are generally not thread-safe. If you need to traverse a collection in a multithreaded environment, consider using concurrent collections or other thread-safe mechanisms.

## Iterator Methods
- boolean hasNext(): Returns true if there are more elements to iterate over.
- E next(): Returns the next element in the iteration.
- void remove(): Removes the last element returned by the iterator (optional operation).