package variablesTypes;

public class VariableTypes {
    int instanceVariable; // Instance variable

    static int classVariable; // Class variable

    final double PI = 3.14; // Constant

    static public void increaseAgeOneYear(int age) { // Method parameter
        age = age + 1;
        System.out.println("Your new age is " + age);
    }

    static void localVaraibleExample() { // Local variable
        int localVariable = 10;
        System.out.println(localVariable);
    }

    public static void main(String[] args) {
        VariableTypes obj1 = new VariableTypes(); // Instance variable example
        obj1.instanceVariable = 5;
        System.out.println("Instance variable value: " + obj1.instanceVariable);

        VariableTypes obj2 = new VariableTypes(); // Class variable example
        VariableTypes.classVariable = 10;
        System.out.println("Class variable value: " + VariableTypes.classVariable);

        VariableTypes obj3 = new VariableTypes(); // Constant example
        System.out.println("Value of PI: " + obj3.PI);

        int age = 30; // Method parameter example
        increaseAgeOneYear(age);

        localVaraibleExample(); // Local variable example
    }
}
