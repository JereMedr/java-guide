package dataStructures.arraysExample;

public class arraysExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array elements using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        System.out.println("\nArray elements using enhanced for loop:");
        for (int number : numbers) {
            System.out.println("Element: " + number);
        }

        System.out.println("\nArray elements in reverse order using while loop:");
        int index = numbers.length - 1;
        while (index >= 0) {
            System.out.println("Element at index " + index + ": " + numbers[index]);
            index--;
        }

        System.out.println("\nArray elements in reverse order using do-while loop:");
        index = numbers.length - 1;
        do {
            System.out.println("Element at index " + index + ": " + numbers[index]);
            index--;
        } while (index >= 0);

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("\nTwo-dimensional array elements using nested for loops:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.println("Element at row " + row + " and column " + col + ": " + matrix[row][col]);
            }
        }

        System.out.println("\nTwo-dimensional array elements using enhanced for loop:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.println("Element: " + value);
            }
        }

    }
}
