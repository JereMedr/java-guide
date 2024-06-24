package objectsclasses.classes.classes;

public class Car {
    String color;
    int year;
    double price;

    public Car(String c, int y, double p) {
        color = c;
        year = y;
        price = p;
    }

    public void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }
}