package ocp;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(3.0, 4.0);

        System.out.println("Area of Circle: " + circle.calculateArea()); // Output: Area of Circle: 78.53981633974483
        System.out.println("Area of Rectangle: " + rectangle.calculateArea()); // Output: Area of Rectangle: 12.0
    }
}
