package desingpatterns.behavioral.strategy;

// Strategy Interface : This interface defines the method that will be implemented by all concrete strategies.

public interface PaymentStrategy {
    void pay( int amount);
}
