package example;
// Superclass
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Subclass
class Dog extends Animal {
    // Constructor
    Dog(String name) {
        // Call the constructor of the superclass
        super(name);
    }

    void bark() {
        System.out.println(name + " is barking.");
    }

    // Overriding the eat method
    @Override
    void eat() {
        System.out.println(name + " is eating dog food.");
    }
}

// Main class to demonstrate inheritance
public class Inheritance {
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
