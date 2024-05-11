package objectsclasses.classes.classes;

public class Main {
    public static void main(String[] args) {
        // Creating objects of the Car class
        Car car1 = new Car("Red", 2022, 25000.0);
        Car car2 = new Car("Blue", 2023, 30000.0);

        // Calling methods on car objects
        car1.displayInfo();
        car2.displayInfo();
    }
}
