// Issues with the Code
// Every time a new shape (e.g., Triangle) is added, 
// the calculateArea() method needs to be modified, violating OCP.

public class ShapeExampleWithoutOCP {
    private String type;

    public ShapeExampleWithoutOCP(String type) {
        this.type = type;
    }

    public double calculateArea() {
        if (type.equals("Circle")) {
            // Area calculation for Circle
        } else if (type.equals("Rectangle")) {
            // Area calculation for Rectangle
        }
        // More shapes can be added here, but this violates OCP
        return 0;
    }
}
