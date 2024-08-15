package desingpatterns.behavioral.observer;

// This class implement the Observer interface and define how they react to updates from the subject.

public class EmailObserver implements Observer {
    private String name;

    public EmailObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received email: " + message);
    }
}
