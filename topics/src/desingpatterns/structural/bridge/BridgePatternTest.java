package desingpatterns.structural.bridge;

// The client code demonstrating how to use the Bridge pattern.
public class BridgePatternTest {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedColor());
        redCircle.draw();

        Shape greenSquare = new Square(new GreenColor());
        greenSquare.draw();
    }
}
