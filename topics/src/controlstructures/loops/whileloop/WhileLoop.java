package controlstructures.loops.whileloop;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange");

        while (i < 5) {
            System.out.println("Value of i: " + i);
            i++;
        }

        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        i = 0; // Reusing variable i
        while (i < fruits.size()) {
            System.out.println(fruits.get(i));
            i++;
        }

        i = 0; // Reusing variable i
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }
}
