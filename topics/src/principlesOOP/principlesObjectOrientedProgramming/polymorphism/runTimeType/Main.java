package principlesObjectOrientedProgramming.polymorphism.runTimeType;

// Superclass
class Animal {
    // Method to be overridden
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    // Overriding the makeSound method
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass
class Cat extends Animal {
    // Overriding the makeSound method
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of different subclasses
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Polymorphism in action
        myDog.makeSound();  // Dog barks
        myCat.makeSound();  // Cat meows
    }
}

