package desingpatterns.creational.singleton;

public class Singleton {
    // Volatile keyword ensures that multiple threads handle the singleton instance correctly
    private static volatile Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {
        System.out.println("Singleton Instance Created");
    }

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Example method to demonstrate Singleton behavior
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
