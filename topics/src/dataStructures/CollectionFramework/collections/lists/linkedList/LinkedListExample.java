package dataStructures.CollectionFramework.collections.lists.linkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("A");
        list.add("B");
        list.addLast("C");
        list.addFirst("D");
        System.out.println("list values : " + list);

        list.add(2, "E"); // Insert "E" at index 2
        System.out.println("list values after add new element in index 2 : " + list);

        // Accessing elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("list values after add element in specific index : " + list);

        // Removing elements
        list.removeFirst(); // Remove first element
        System.out.println("list values after remove first element: " + list);

        list.removeLast(); // Remove last element
        System.out.println("list values after remove last element: " + list);

        list.remove(1); // Remove element at index 1
        System.out.println("list values after remove index 1: " + list);


        // Display the final list
        System.out.println("Final LinkedList: " + list);
    }
}
