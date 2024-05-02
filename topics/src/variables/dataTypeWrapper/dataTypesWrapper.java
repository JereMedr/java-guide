package variables.dataTypeWrapper;

import java.util.ArrayList;

import java.util.*;

public class dataTypesWrapper {
    public static void main(String[] args) {
        // Using Collections
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(10);
        myNumbers.add(20);
        myNumbers.add(30);
        int firstNumber = myNumbers.get(0);
        System.out.println("First number: " + firstNumber);

        // Using Generics
        Container<Integer> intContainer = new Container<>(42);
        System.out.println("Value in container: " + intContainer.getValue());

        // Nullable Values
        Integer nullableValue = null;
        if (nullableValue == null) {
            System.out.println("Nullable value is null");
        }

        // Using in Java Streams
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        // Using in Java Reflection
        Class<?> intClass = int.class;
        System.out.println("Primitive int class: " + intClass.getName());

        Class<?> integerClass = Integer.class;
        System.out.println("Wrapper Integer class: " + integerClass.getName());

        // Storing in Maps
        Map<String, Integer> nameToAge = new HashMap<>();
        nameToAge.put("Alice", 30);
        nameToAge.put("Bob", 25);
        nameToAge.put("Charlie", 35);
        int ageOfAlice = nameToAge.get("Alice");
        System.out.println("Age of Alice: " + ageOfAlice);
    }

    static class Container<T> {
        private T value;

        public Container(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }
    }
}
