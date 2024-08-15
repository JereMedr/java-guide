package desingpatterns.structural.bridge;

//Refined Abstraction:
//An extension of the abstraction class that can add more functionality or modify existing behavior.
public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.print("Drawing Circle with ");
        color.applyColor();
    }
}