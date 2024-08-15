package desingpatterns.behavioral.observer;

// This interface defines the update method that will be called when the subject's state changes.

public interface Observer {
    void update(String message);
}
