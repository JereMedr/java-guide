package desingpatterns.behavioral.observer;

// This interface defines methods for attaching, detaching, and notifying observers.

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
