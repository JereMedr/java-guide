package interfaceAbstraction;
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound(); // Output: Barks

        Animal cat = new Cat();
        cat.sound(); // Output: Meows
    }
}
