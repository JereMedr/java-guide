package desingpatterns.structural.bridge;

//Refined Abstraction:
//An extension of the abstraction class that can add more functionality or modify existing behavior.

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    void draw() {
        System.out.print("Drawing Square with ");
        color.applyColor();
    }
}