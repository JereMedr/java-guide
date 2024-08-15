package desingpatterns.behavioral.observer;

// ObserverPatternTest.java
public class ObserverPatternTest {
    public static void main(String[] args) {
        // Create the subject
        MessageSubject messageSubject = new MessageSubject();

        // Create observers
        Observer emailObserver = new EmailObserver("Observer1");
        Observer smsObserver = new SMSObserver("Observer2");

        // Attach observers to the subject
        messageSubject.attach(emailObserver);
        messageSubject.attach(smsObserver);

        // Change state of the subject
        messageSubject.setMessage("Hello Observers!");

        // Detach one observer and change state again
        messageSubject.detach(emailObserver);
        messageSubject.setMessage("Observer1 detached, only Observer2 should receive this.");
    }
}

