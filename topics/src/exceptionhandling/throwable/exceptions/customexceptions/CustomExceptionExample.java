package exceptionhandling.throwable.exceptions.customexceptions;

public class CustomExceptionExample {
    public static double calculateSquareRoot(double number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Number cannot be negative");
        }
        return Math.sqrt(number);
    }

    public static void main(String[] args) {
        try {
            double result = calculateSquareRoot(-10);
            System.out.println("Square root: " + result);
        } catch (NegativeNumberException e) {
            System.out.println("Caught NegativeNumberException: " + e.getMessage());
        }
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}
