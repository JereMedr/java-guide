# LinkedList 
A linked list is a data structure consisting of a sequence of elements, each containing a reference (or link) to the next element in the sequence. In Java 8, the LinkedList class, which is part of the java.util package, implements the List interface and allows for efficient insertion and removal of elements from any position in the list.

## How LinkedList Works
A `LinkedList` in Java is a doubly-linked list. Each node in the list contains three fields:

- Data: The actual value of the node.
- Next: A reference to the next node in the list.
- Previous: A reference to the previous node in the list.

This structure allows for efficient bidirectional traversal of the list, as well as insertion and deletion operations at both ends (head and tail) and anywhere in between.

## How to Instantiate a LinkedList
To create a LinkedList, you need to import the java.util.LinkedList class and then instantiate it:
```
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
    }
}
```
## Operations on LinkedList
### Adding Elements:
- add(E e): Appends the specified element to the end of the list.
- add(int index, E element): Inserts the specified element at the specified position in the list.
- addFirst(E e): Inserts the specified element at the beginning of the list.
- addLast(E e): Appends the specified element to the end of the list.

### Accessing Elements:
- get(int index): Returns the element at the specified position in the list.
- getFirst(): Returns the first element in the list.
- getLast(): Returns the last element in the list.

### Removing Elements:
- remove(): Retrieves and removes the head (first element) of this list.
- remove(int index): Removes the element at the specified position in the list.
- removeFirst(): Removes and returns the first element from this list.
- removeLast(): Removes and returns the last element from this list.

### Other Operations:
- size(): Returns the number of elements in the list.
- isEmpty(): Returns true if the list contains no elements.
- clear(): Removes all the elements from the list.

## When to Use LinkedList
### Use LinkedList when:

- You need frequent insertions and deletions in the middle of the list.
- You need to implement a queue or deque structure where you add/remove elements from both ends frequently.

### Avoid LinkedList when:
- You need fast random access to elements (use ArrayList instead).
- Memory overhead is a concern (each element in a LinkedList requires extra memory for storing references to the next and previous elements).