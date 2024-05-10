package methods;

public class OverloadedMethodExample {
    // Method to add two integers
    static public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method overloading to add two doubles
    static public double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method overloading to add three integers
    static public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // Method overloading to add an array of integers
    static public int add(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 2;
        int[] numberArray = new int[] {a,b,c} ;
        System.out.println("add override simple example :");
        System.out.println(add(a,b));        
        System.out.println(add(a, b, c));
        System.out.println(add(numberArray));
    }
}