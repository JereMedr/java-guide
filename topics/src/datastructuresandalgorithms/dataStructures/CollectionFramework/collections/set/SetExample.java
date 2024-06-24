package dataStructures.CollectionFramework.collections.set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        // Create sets with different implementations
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        // Add elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");

        // Display sets
        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);

        // Add all elements from one set to another
        Set<String> anotherSet = new HashSet<>(Arrays.asList("Grape", "Apple", "Lemon"));
        hashSet.addAll(anotherSet);
        System.out.println("HashSet after addAll: " + hashSet);

        // Check if set contains an element
        boolean containsApple = hashSet.contains("Apple");
        System.out.println("HashSet contains 'Apple': " + containsApple);

        // Check if set contains all elements of another collection
        boolean containsAll = hashSet.containsAll(Arrays.asList("Apple", "Banana"));
        System.out.println("HashSet contains all [Apple, Banana]: " + containsAll);

        // Remove an element
        hashSet.remove("Banana");
        System.out.println("HashSet after removing 'Banana': " + hashSet);

        // Remove all elements from another collection
        hashSet.removeAll(Arrays.asList("Apple", "Lemon"));
        System.out.println("HashSet after removing [Apple, Lemon]: " + hashSet);

        // Retain only the elements that are contained in another collection
        hashSet.retainAll(Arrays.asList("Grape", "Orange"));
        System.out.println("HashSet after retaining [Grape, Orange]: " + hashSet);

        // Check if set is empty
        boolean isEmpty = hashSet.isEmpty();
        System.out.println("HashSet is empty: " + isEmpty);

        // Get the size of the set
        int size = hashSet.size();
        System.out.println("HashSet size: " + size);

        // Convert set to array
        Object[] array = hashSet.toArray();
        System.out.println("HashSet as array: " + Arrays.toString(array));

        // Convert set to typed array
        String[] stringArray = hashSet.toArray(new String[0]);
        System.out.println("HashSet as typed array: " + Arrays.toString(stringArray));

        // Iterate over set elements using iterator
        System.out.println("Iterating HashSet using Iterator:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Use Java 8 forEach method
        System.out.println("Iterating HashSet using forEach:");
        hashSet.forEach(System.out::println);

        // Use Java 8 Stream API
        System.out.println("HashSet elements that start with 'G':");
        hashSet.stream()
                .filter(s -> s.startsWith("G"))
                .forEach(System.out::println);
        
        // Use Java 8 parallelStream API
        System.out.println("HashSet elements in parallel:");
        hashSet.parallelStream()
                .forEach(System.out::println);
    }
}