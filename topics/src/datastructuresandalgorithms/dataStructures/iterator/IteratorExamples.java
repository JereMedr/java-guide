package dataStructures.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class IteratorExamples {

    public static void main(String[] args) {
        // ArrayList Example
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("ArrayList:");
        iterateAndRemove(arrayList);

        // HashSet Example
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Date");

        System.out.println("\nHashSet:");
        iterateAndRemove(hashSet);

        // LinkedList Example
        List<String> linkedList = new LinkedList<>();
        linkedList.add("One");
        linkedList.add("Two");
        linkedList.add("Three");
        linkedList.add("Four");

        System.out.println("\nLinkedList:");
        iterateAndRemove(linkedList);

        // TreeSet Example
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        System.out.println("\nTreeSet:");
        iterateAndRemove(treeSet);

        // HashMap Example
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        hashMap.put(4, "Four");
        hashMap.put(5, "Five");

        System.out.println("\nHashMap - Iterating over Map Entries:");
        iterateAndRemoveEntries(hashMap);

        // Re-populate the HashMap for the next example
        hashMap.put(2, "Two");
        hashMap.put(4, "Four");

        System.out.println("\nHashMap - Iterating over Map Keys:");
        iterateAndRemoveKeys(hashMap);

        // Re-populate the HashMap for the next example
        hashMap.put(4, "Four");

        System.out.println("\nHashMap - Iterating over Map Values:");
        iterateAndRemoveValues(hashMap);
    }

    // Generic method to iterate and remove elements using Iterator
    private static <E> void iterateAndRemove(Iterable<E> collection) {
        Iterator<E> iterator = collection.iterator();
        while (iterator.hasNext()) {
            E element = iterator.next();
            System.out.println("Element: " + element);
            // Example condition to remove an element
            if (element.toString().length() > 3) {
                iterator.remove();
                System.out.println("Removed element: " + element);
            }
        }
        System.out.println("Collection after iteration and removal: " + collection);
    }

    // Method to iterate and remove map entries using Iterator
    private static <K, V> void iterateAndRemoveEntries(Map<K, V> map) {
        Iterator<Map.Entry<K, V>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<K, V> entry = entryIterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            // Example condition to remove an entry
            if (entry.getKey().toString().length() > 1) {
                entryIterator.remove();
                System.out.println("Removed entry with key: " + entry.getKey());
            }
        }
        System.out.println("Map after entry iteration and removal: " + map);
    }

    // Method to iterate and remove map keys using Iterator
    private static <K, V> void iterateAndRemoveKeys(Map<K, V> map) {
        Iterator<K> keyIterator = map.keySet().iterator();
        while (keyIterator.hasNext()) {
            K key = keyIterator.next();
            System.out.println("Key: " + key);
            // Example condition to remove an entry by key
            if (key.toString().length() > 1) {
                keyIterator.remove();
                System.out.println("Removed entry with key: " + key);
            }
        }
        System.out.println("Map after key iteration and removal: " + map);
    }

    // Method to iterate and remove map values using Iterator
    private static <K, V> void iterateAndRemoveValues(Map<K, V> map) {
        Iterator<V> valueIterator = map.values().iterator();
        while (valueIterator.hasNext()) {
            V value = valueIterator.next();
            System.out.println("Value: " + value);
            // Example condition to remove an entry by value
            if (value.toString().length() > 3) {
                valueIterator.remove();
                System.out.println("Removed entry with value: " + value);
            }
        }
        System.out.println("Map after value iteration and removal: " + map);
    }
}