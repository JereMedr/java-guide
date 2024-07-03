package SOLID.DependencyInversion.badExample;
//        In this example, the Switch class is tightly coupled to the Light class.
//        Any change to the Light class will affect the Switch class, which violates
//        the Dependency Inversion Principle.
public class BadExample {
    public static void main(String[] args) {
        Switch s = new Switch();
        s.operate();
    }
}


