package desingpatterns.behavioral.observer;

// This class implement the Observer interface and define how they react to updates from the subject.
public class SMSObserver implements Observer {
    private String name;

    public SMSObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received SMS: " + message);
    }
}