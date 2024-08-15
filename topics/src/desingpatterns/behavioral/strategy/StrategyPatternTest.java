package desingpatterns.behavioral.strategy;

public class StrategyPatternTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Add items to the cart
        cart.addItem(100);
        cart.addItem(200);

        // Pay using Credit Card
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432", "John Doe", "123"));
        cart.checkout();

        // Pay using PayPal
        cart.setPaymentStrategy(new PayPalPayment("johndoe@example.com", "password"));
        cart.checkout();
    }
}
