package implementations.treeset;
import java.util.TreeSet;
import java.util.SortedSet;
import java.util.Comparator;
import java.util.Arrays;
import java.util.List;

public class TreeSetExample {
    public static void main(String[] args) {
        // Basic instantiation
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(7);
        treeSet.add(1);
        treeSet.add(9);
        treeSet.add(2);

        // Print the TreeSet
        System.out.println("TreeSet: " + treeSet);

        // Check for the existence of an element
        boolean exists = treeSet.contains(3);
        System.out.println("Does 3 exist in the TreeSet? " + exists);

        // Remove an element
        treeSet.remove(2);
        System.out.println("TreeSet after removing 2: " + treeSet);

        // Iterate over the TreeSet
        System.out.println("Iterating over TreeSet:");
        for (Integer number : treeSet) {
            System.out.println(number);
        }

        // Navigation methods
        Integer first = treeSet.first(); // Gets the first (lowest) element
        Integer last = treeSet.last(); // Gets the last (highest) element
        Integer lower = treeSet.lower(5); // Gets the greatest element less than 5
        Integer higher = treeSet.higher(5); // Gets the least element greater than 5

        System.out.println("First element: " + first);
        System.out.println("Last element: " + last);
        System.out.println("Element lower than 5: " + lower);
        System.out.println("Element higher than 5: " + higher);

        // Subsets
        SortedSet<Integer> headSet = treeSet.headSet(5); // Elements less than 5
        SortedSet<Integer> tailSet = treeSet.tailSet(5); // Elements greater than or equal to 5
        SortedSet<Integer> subSet = treeSet.subSet(3, 8); // Elements between 3 (inclusive) and 8 (exclusive)

        System.out.println("HeadSet (less than 5): " + headSet);
        System.out.println("TailSet (greater or equal to 5): " + tailSet);
        System.out.println("SubSet (from 3 inclusive to 8 exclusive): " + subSet);

        // Instantiation with a collection
        List<Integer> list = Arrays.asList(10, 20, 15, 25, 30);
        TreeSet<Integer> treeSetFromList = new TreeSet<>(list);
        System.out.println("TreeSet from list: " + treeSetFromList);

        // Instantiation with a comparator
        TreeSet<String> treeSetWithComparator = new TreeSet<>(Comparator.reverseOrder());
        treeSetWithComparator.add("Apple");
        treeSetWithComparator.add("Banana");
        treeSetWithComparator.add("Cherry");
        treeSetWithComparator.add("Date");

        System.out.println("TreeSet with custom comparator (reverse order): " + treeSetWithComparator);
    }
}
