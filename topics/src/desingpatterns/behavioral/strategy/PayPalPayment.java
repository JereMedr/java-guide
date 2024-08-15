package desingpatterns.behavioral.strategy;

//Concrete Strategies (CreditCardPayment.java, PayPalPayment.java)
//This class implements different payment methods.

public class PayPalPayment implements PaymentStrategy {
    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal: " + email);
    }
}