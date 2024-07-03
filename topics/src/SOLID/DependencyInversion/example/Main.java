package SOLID.DependencyInversion.example;

public class Main {

//    In this design, NotificationService does not depend on the concrete implementations of MessageSender.
//    Instead, it depends on the abstraction (MessageSender interface). This adheres to the Dependency
//    Inversion Principle by decoupling the high-level module (NotificationService) from the low-level
//    modules (EmailSender and SMSSender).


    public static void main(String[] args) {
        // Using EmailSender
        MessageSender emailSender = new EmailSender();
        NotificationService emailNotificationService = new NotificationService(emailSender);
        emailNotificationService.notify("Hello via Email!");

        // Using SMSSender
        MessageSender smsSender = new SMSSender();
        NotificationService smsNotificationService = new NotificationService(smsSender);
        smsNotificationService.notify("Hello via SMS!");
    }
}

