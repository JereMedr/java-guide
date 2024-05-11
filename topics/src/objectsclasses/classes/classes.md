# Class
In Java, a class is a blueprint or template for creating objects. It defines the properties (fields) and behaviors (methods) that objects of that class will have.
```
public class Car {
    // Fields
    String color;
    int year;
    double price;

    // Constructor
    public Car(String c, int y, double p) {
        color = c;
        year = y;
        price = p;
    }

    // Method
    public void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }
}
```

You can create instances of the Car class and call its methods to perform actions or access its data.

```
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
```