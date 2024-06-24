package controlstructures.conditional.ifelse;

public class IfelseExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        // if-else statement
        if (x > 15) {
            System.out.println("x is greater than 10");
        } else {
            System.out.println("x is not greater than 10");
        }

        // Nested if-else statements
        if (x > y) {
            System.out.println("x is greater than y");
        } else if (x < y) {
            System.out.println("x is less than y");
        } else {
            System.out.println("x is equal to y");
        }

        // Ternary operator examples
        int age = 25;
        String message = (age >= 18) ? "You are an adult" : "You are a minor";
        System.out.println("Message: " + message);

        boolean isRaining = true;
        String activity = isRaining ? "Stay indoors" : "Go for a walk";
        System.out.println("Activity: " + activity);

        // Nested ternary operator
        int num = -5;
        String result = (num >= 0) ? "Positive" : (num == 0) ? "Zero" : "Negative";
        System.out.println("Number is: " + result);
    }
}

