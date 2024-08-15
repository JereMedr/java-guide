package desingpatterns.structural.bridge;

public class GreenColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying Green Color");
    }
}