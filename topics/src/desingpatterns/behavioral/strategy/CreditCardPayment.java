package desingpatterns.behavioral.strategy;

//Concrete Strategies (CreditCardPayment.java, PayPalPayment.java)
//This class implements different payment methods.

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;
    private String cvv;

    public CreditCardPayment(String cardNumber, String cardHolderName, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cvv = cvv;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with Credit Card: " + cardNumber);
    }
}