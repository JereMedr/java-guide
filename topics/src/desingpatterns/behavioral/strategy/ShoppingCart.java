package desingpatterns.behavioral.strategy;

//Context (ShoppingCart.java)
//This class maintains a reference to the current strategy and delegates the algorithm's execution to that strategy.

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Integer> items;
    private PaymentStrategy paymentStrategy;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(int price) {
        items.add(price);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout() {
        int totalAmount = items.stream().mapToInt(Integer::intValue).sum();
        paymentStrategy.pay(totalAmount);
    }
}
