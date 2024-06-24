package dataStructures.CollectionFramework.map;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        // Print all key-value pairs
        System.out.println("HashMap: " + hashMap);

        // Retrieve a value
        int value = hashMap.get("Two");
        System.out.println("Value for key 'Two': " + value);

        // Remove a key-value pair
        hashMap.remove("One");
        System.out.println("HashMap after removing key 'One': " + hashMap);

        // Check for a key
        boolean containsKey = hashMap.containsKey("Three");
        System.out.println("HashMap contains key 'Three': " + containsKey);

        // Check for a value
        boolean containsValue = hashMap.containsValue(2);
        System.out.println("HashMap contains value 2: " + containsValue);

        // Size of the map
        int size = hashMap.size();
        System.out.println("Size of HashMap: " + size);

        // Iterate over keys
        System.out.println("Keys in HashMap:");
        for (String key : hashMap.keySet()) {
            System.out.println(key);
        }

        // Iterate over values
        System.out.println("Values in HashMap:");
        for (int val : hashMap.values()) {
            System.out.println(val);
        }

        // Iterate over key-value pairs
        System.out.println("Key-Value pairs in HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Using LinkedHashMap to maintain insertion order
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);
        linkedHashMap.put("Three", 3);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // Using TreeMap to maintain sorted order
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);
        System.out.println("TreeMap: " + treeMap);
    }
}
