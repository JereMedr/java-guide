package desingpatterns.structural.bridge;

// Concrete implementors:concrete implementations of the Color interface.
public class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying Red Color");
    }
}