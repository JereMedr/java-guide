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
        VariableTypes variableTypes = new VariableTypes(); 
        variableTypes.instanceVariable = 5;
        System.out.println("Instance variable value: " + variableTypes.instanceVariable);

        VariableTypes.classVariable = 10;
        System.out.println("Class variable value: " + VariableTypes.classVariable);

        System.out.println("Value constant PI: " + variableTypes.PI);

        int age = 30;
        increaseAgeOneYear(age);

        localVaraibleExample();
    }
}