package controlstructures.loops.forloops;

import java.util.Arrays;
import java.util.List;

public class ForLoopsExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Value of i: " + i);
        }

        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange");
            for (String fruit : fruits) {
                System.out.println(fruit);
        }
        
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("reverse loop :");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

    }
}
