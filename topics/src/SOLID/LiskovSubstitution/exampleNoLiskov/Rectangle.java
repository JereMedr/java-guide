package SOLID.LiskovSubstitution.exampleNoLiskov;

public class Rectangle {
    protected int width;
    protected int height;

    public Rectangle() {
        this.width = 0;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}