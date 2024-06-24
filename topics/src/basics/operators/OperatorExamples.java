package operators;
public class OperatorExamples {

    public static void main(String[] args) {
        // Arithmetic operators
        int a = 10;
        int b = 4;
        System.out.println("Addition: " + (a + b));       // 14
        System.out.println("Subtraction: " + (a - b));    // 6
        System.out.println("Multiplication: " + (a * b)); // 40
        System.out.println("Division: " + (a / b));       // 2
        System.out.println("Modulus: " + (a % b));        // 2

        // Increment and decrement operators
        int x = 5;
        System.out.println("Increment: " + (++x)); // 6
        System.out.println("Decrement: " + (--x)); // 5

        // Relational operators
        int num1 = 10;
        int num2 = 20;
        System.out.println("Greater than: " + (num1 > num2));      // false
        System.out.println("Less than: " + (num1 < num2));         // true
        System.out.println("Equal to: " + (num1 == num2));         // false
        System.out.println("Not equal to: " + (num1 != num2));     // true
        System.out.println("Greater than or equal to: " + (num1 >= num2)); // false
        System.out.println("Less than or equal to: " + (num1 <= num2));    // true

        // Logical operators
        boolean p = true;
        boolean q = false;
        System.out.println("Logical AND: " + (p && q)); // false
        System.out.println("Logical OR: " + (p || q));  // true
        System.out.println("Logical NOT: " + (!p));     // false

        // Bitwise operators
        int num3 = 5;  // binary: 0101
        int num4 = 3;  // binary: 0011
        System.out.println("Bitwise AND: " + (num3 & num4));     // 1 (binary: 0001)
        System.out.println("Bitwise OR: " + (num3 | num4));      // 7 (binary: 0111)
        System.out.println("Bitwise XOR: " + (num3 ^ num4));     // 6 (binary: 0110)
        System.out.println("Bitwise NOT: " + (~num3));           // -6
        System.out.println("Left shift: " + (num3 << 1));        // 10 (binary: 1010)
        System.out.println("Right shift: " + (num3 >> 1));       // 2 (binary: 0010)
        System.out.println("Unsigned right shift: " + (num3 >>> 1)); // 2 (binary: 0010)

        // Assignment operators
        int total = 10;
        total += 5; // Equivalent to: total = total + 5;
        System.out.println("Addition assignment: " + total); // 15

        // Ternary operator
        int age = 20;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Ternary operator: " + result); // Adult
    }
}
