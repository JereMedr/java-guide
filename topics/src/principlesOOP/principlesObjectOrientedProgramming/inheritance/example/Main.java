package example;
public class Main {
    public static void main(String[] args) {
        // Create an object of the subclass
        Dog dog = new Dog("Buddy");

        // Call methods of the superclass
        dog.eat();   // Buddy is eating dog food.
        dog.sleep(); // Buddy is sleeping.

        // Call method of the subclass
        dog.bark();  // Buddy is barking.
    }
}
