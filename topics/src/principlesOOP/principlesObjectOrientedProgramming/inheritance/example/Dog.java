package example;

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