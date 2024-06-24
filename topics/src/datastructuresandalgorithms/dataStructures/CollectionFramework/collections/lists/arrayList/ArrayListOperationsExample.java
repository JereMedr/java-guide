package dataStructures.CollectionFramework.collections.lists.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperationsExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Initial list: " + list);

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("After adding elements: " + list);

        list.add(1, "Orange");
        System.out.println("After adding an element at index 1: " + list);

        String fruit = list.get(2);
        System.out.println("Element at index 2: " + fruit);

        list.set(2, "Grape");
        System.out.println("After setting an element at index 2: " + list);

        list.remove(1);
        System.out.println("After removing the element at index 1: " + list);

        list.remove("Banana");
        System.out.println("After removing 'Banana': " + list);

        boolean hasApple = list.contains("Apple");
        System.out.println("Contains 'Apple': " + hasApple);

        int size = list.size();
        System.out.println("Size of the list: " + size);

        System.out.println("Iterating over the list:");
            for (String item : list) {
                System.out.println(item);
            }

        list.clear();
        System.out.println("After clearing the list: " + list);

        boolean isEmpty = list.isEmpty();
        System.out.println("Is the list empty: " + isEmpty);

        list.add("Pear");
        list.add("Apple");
        list.add("Mango");
        System.out.println("Before sorting: " + list);
        Collections.sort(list);
        System.out.println("After sorting: " + list);

        ArrayList<String> subList = new ArrayList<>(list.subList(1, 3));
        System.out.println("Sublist from index 1 to 2: " + subList);
    }
}
