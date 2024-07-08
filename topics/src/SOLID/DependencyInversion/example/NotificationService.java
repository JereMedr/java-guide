package SOLID.DependencyInversion.example;

public class NotificationService {
    private MessageSender messageSender;

    // Constructor injection
    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void notify(String message) {
        messageSender.sendMessage(message);
    }
}
