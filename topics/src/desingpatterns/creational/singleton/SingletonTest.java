package desingpatterns.creational.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        // Create multiple threads that attempt to access the Singleton instance
        Thread thread1 = new Thread(new SingletonRunnable(), "Thread 1");
        Thread thread2 = new Thread(new SingletonRunnable(), "Thread 2");
        Thread thread3 = new Thread(new SingletonRunnable(), "Thread 3");

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

//Explanation:
//The "Singleton Instance Created" message should only appear once, demonstrating that even though multiple threads tried
//to create the instance simultaneously, only one instance was created.
//The "Hello from Singleton!" message will appear multiple times, once for each thread, showing that all threads are using
// the same Singleton instance.
//This example demonstrates a thread-safe Singleton implementation using double-checked locking, which is a common interview topic.
