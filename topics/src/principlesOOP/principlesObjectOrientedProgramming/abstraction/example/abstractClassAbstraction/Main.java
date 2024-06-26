package abstractClassAbstraction;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound(); // Output: Barks
        dog.sleep(); // Output: This animal is sleeping

        Animal cat = new Cat();
        cat.sound(); // Output: Meows
        cat.sleep(); // Output: This animal is sleeping
    }
}
