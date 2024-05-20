package dataStructures.collections.lists.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListInitializationExample {
    public static void main(String[] args) {
        // 1. Creating an empty ArrayList
        // Use Case: When you need an empty list to add elements later.
        // Characteristics: Starts with no elements, can dynamically grow as elements are added.
        ArrayList<String> list1 = new ArrayList<>();
        System.out.println("Empty ArrayList: " + list1);

        // 2. Creating an ArrayList with initial capacity
        // Use Case: When you know the approximate number of elements you will need to store.
        // Characteristics: Helps to optimize performance by reducing the number of resizing operations.
        ArrayList<String> list2 = new ArrayList<>(10);
        System.out.println("ArrayList with initial capacity 10: " + list2);

        // 3. Creating an ArrayList from another collection
        // Use Case: When you want to create an ArrayList from an existing collection.
        // Characteristics: Initializes the list with the elements from the provided collection.
        List<String> initialList = Arrays.asList("one", "two", "three");
        ArrayList<String> list3 = new ArrayList<>(initialList);
        System.out.println("ArrayList from another collection: " + list3);

        // 4. Creating an ArrayList using Arrays.asList (returns fixed-size list)
        // Use Case: When you need a fixed-size list initialized with specific elements.
        // Characteristics: The returned list is fixed-size and backed by an array.
        List<String> list4 = Arrays.asList("four", "five", "six");
        System.out.println("ArrayList using Arrays.asList: " + list4);

        // 5. Creating an ArrayList using Collections.addAll
        // Use Case: When you want to add multiple elements to an ArrayList at once.
        // Characteristics: Adds all specified elements to the list.
        ArrayList<String> list5 = new ArrayList<>();
        Collections.addAll(list5, "seven", "eight", "nine");
        System.out.println("ArrayList using Collections.addAll: " + list5);

        // 6. Creating an ArrayList using Java 8 Stream API
        // Use Case: When you want to create a list based on a stream of elements.
        // Characteristics: Provides flexibility in processing and filtering elements before collection.
        ArrayList<String> list6 = new ArrayList<>(initialList.stream().collect(java.util.stream.Collectors.toList()));
        System.out.println("ArrayList using Stream API: " + list6);

        // 7. Creating an ArrayList with double brace initialization
        // Use Case: When you need to initialize a list with some elements in a concise way.
        // Characteristics: Allows adding elements at the time of list creation, but has a slight performance overhead due to the creation of an anonymous inner class.
        ArrayList<String> list7 = new ArrayList<String>() {{
            add("ten");
            add("eleven");
            add("twelve");
        }};
        System.out.println("ArrayList with double brace initialization: " + list7);

        // 8. Creating an ArrayList with a specific type
        // Use Case: When you want to create a list with elements of a specific type.
        // Characteristics: Type-safe and ensures that only elements of the specified type can be added.
        ArrayList<Integer> list8 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("ArrayList with specific type Integer: " + list8);
    }
}
