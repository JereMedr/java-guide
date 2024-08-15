package desingpatterns.creational.singleton;

public class SingletonRunnable implements Runnable {
    @Override
    public void run() {
        // Get the Singleton instance
        Singleton singleton = Singleton.getInstance();

        // Call a method on the Singleton instance
        singleton.showMessage();
    }
}
