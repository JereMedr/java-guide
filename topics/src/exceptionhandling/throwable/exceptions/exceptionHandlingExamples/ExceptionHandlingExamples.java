package exceptionhandling.throwable.exceptions.exceptionHandlingExamples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingExamples {

    // Example of try-catch block
    public static void exampleTryCatch() {
        try {
            int result = 10 / 0; // This will throw an ArithmeticException
            System.out.println("result : " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }
    }

    // Example of throw statement
    public static void exampleThrow() {
        try {
            throw new IllegalArgumentException("Invalid argument");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an IllegalArgumentException: " + e.getMessage());
        }
    }

    // Example of throws clause
    public static void exampleThrows() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("nonexistentfile.txt"));
        System.out.println(reader);
        // This will throw an IOException if the file does not exist
    }

    // Example of finally block
    public static void exampleFinally() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("example.txt"));
            String line = reader.readLine();
            System.out.println("First line of the file: " + line);
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing the file: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        // Demonstrating each example
        System.out.println("Example of try-catch block:");
        exampleTryCatch();

        System.out.println("\nExample of throw statement:");
        exampleThrow();

        System.out.println("\nExample of throws clause:");
        try {
            exampleThrows();
        } catch (IOException e) {
            System.err.println("An IOException occurred: " + e.getMessage());
        }

        System.out.println("\nExample of finally block:");
        exampleFinally();
    }
}
