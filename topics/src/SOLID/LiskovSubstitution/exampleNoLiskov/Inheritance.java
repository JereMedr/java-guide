package SOLID.LiskovSubstitution.exampleNoLiskov;

import SOLID.LiskovSubstitution.exampleLiskov.Rectangle;
import SOLID.LiskovSubstitution.exampleLiskov.Square;

public class Inheritance {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(10);
        System.out.println("Rectangle area: " + rectangle.getArea());

//  TODO failure
//        Rectangle square = new Square();
//        square.setWidth(5);
//        System.out.println("Square area (after setting width to 5): " + square.getArea());
//        square.setHeight(10); // This should ideally not be allowed for a square
//        System.out.println("Square area (after setting height to 10): " + square.getArea());
    }
}