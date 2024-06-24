package dataStructures.CollectionFramework.collections.set.implementations.hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet using different constructors
        Set<String> defaultHashSet = new HashSet<>();
        Set<String> initialCapacityHashSet = new HashSet<>(50);
        Set<String> capacityAndLoadFactorHashSet = new HashSet<>(50, 0.5f);
        Set<String> fromCollectionHashSet = new HashSet<>(Arrays.asList("Apple", "Banana", "Orange"));

        // Add elements to the default HashSet
        defaultHashSet.add("Apple");
        defaultHashSet.add("Banana");
        defaultHashSet.add("Orange");

        // Display the HashSet
        System.out.println("Default HashSet: " + defaultHashSet);

        // Check if the HashSet contains an element
        boolean containsApple = defaultHashSet.contains("Apple");
        System.out.println("Default HashSet contains 'Apple': " + containsApple);

        // Remove an element from the HashSet
        defaultHashSet.remove("Banana");
        System.out.println("Default HashSet after removing 'Banana': " + defaultHashSet);

        // Check the size of the HashSet
        int size = defaultHashSet.size();
        System.out.println("Default HashSet size: " + size);

        // Check if the HashSet is empty
        boolean isEmpty = defaultHashSet.isEmpty();
        System.out.println("Default HashSet is empty: " + isEmpty);

        // Add all elements from another collection
        defaultHashSet.addAll(Arrays.asList("Grape", "Apple", "Lemon"));
        System.out.println("Default HashSet after addAll: " + defaultHashSet);

        // Remove all elements that are contained in another collection
        defaultHashSet.removeAll(Arrays.asList("Apple", "Lemon"));
        System.out.println("Default HashSet after removeAll: " + defaultHashSet);

        // Retain only the elements that are contained in another collection
        defaultHashSet.retainAll(Arrays.asList("Grape", "Orange"));
        System.out.println("Default HashSet after retainAll: " + defaultHashSet);

        // Convert HashSet to array
        Object[] array = defaultHashSet.toArray();
        System.out.println("Default HashSet as array: " + Arrays.toString(array));

        // Convert HashSet to typed array
        String[] stringArray = defaultHashSet.toArray(new String[0]);
        System.out.println("Default HashSet as typed array: " + Arrays.toString(stringArray));

        // Iterate over HashSet using Iterator
        System.out.println("Iterating Default HashSet using Iterator:");
        Iterator<String> iterator = defaultHashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Clear the HashSet
        defaultHashSet.clear();
        System.out.println("Default HashSet after clear: " + defaultHashSet);

        // Check if the HashSet is empty after clearing
        isEmpty = defaultHashSet.isEmpty();
        System.out.println("Default HashSet is empty after clear: " + isEmpty);
    }
}
