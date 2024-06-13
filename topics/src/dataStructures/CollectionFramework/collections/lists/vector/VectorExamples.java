package dataStructures.CollectionFramework.collections.lists.vector;

import java.util.Vector;

public class VectorExamples {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>(5);

        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        vector.add(1, "Date");

        System.out.println("Element at index 2: " + vector.get(2));

        System.out.println("Vector elements:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }

        vector.remove(3);

        vector.remove("Date");

        boolean containsApple = vector.contains("Apple");
        System.out.println("Vector contains Apple: " + containsApple);

        int size = vector.size();
        int capacity = vector.capacity();
        System.out.println("Size: " + size);
        System.out.println("Capacity: " + capacity);
    }
}