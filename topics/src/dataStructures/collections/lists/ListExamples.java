package dataStructures.collections.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.Collections;

public class ListExamples {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList: " + arrayList);
        
        System.out.println("Element at index 1: " + arrayList.get(1));
        
        arrayList.remove("Banana");
        System.out.println("ArrayList after removal: " + arrayList);
        
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Elephant");
        linkedList.add("Frog");
        System.out.println("LinkedList: " + linkedList);
        
        List<String> vector = new Vector<>();
        vector.add("Giraffe");
        vector.add("Hippo");
        vector.add("Iguana");
        System.out.println("Vector: " + vector);
        
        Collections.sort(arrayList);
        System.out.println("Sorted ArrayList: " + arrayList);
        
        boolean containsApple = arrayList.contains("Apple");
        System.out.println("ArrayList contains 'Apple': " + containsApple);
    }
}
