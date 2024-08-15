package desingpatterns.structural.bridge;

//Abstraction:
//The core concept or high-level control class that clients interact with. It holds a reference to an implementer (bridge)
//object.

public abstract class Shape {
    protected Color color;

    // Constructor
    protected Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}