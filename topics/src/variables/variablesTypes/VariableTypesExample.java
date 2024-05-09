package variables.variablesTypes;

public class VariableTypesExample {
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
        VariableTypesExample variableTypes = new VariableTypesExample(); 
        variableTypes.instanceVariable = 5;
        System.out.println("Instance variable value: " + variableTypes.instanceVariable);

        VariableTypesExample.classVariable = 10;
        System.out.println("Class variable value: " + VariableTypesExample.classVariable);

        System.out.println("Value constant PI: " + variableTypes.PI);

        int age = 30;
        increaseAgeOneYear(age);

        localVaraibleExample();
    }
}