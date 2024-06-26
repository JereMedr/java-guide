package abstractClassAbstraction;

abstract class Animal {
    // Abstract method (no implementation)
    abstract void sound();

    // Concrete method
    void sleep() {
        System.out.println("This animal is sleeping");
    }
}
