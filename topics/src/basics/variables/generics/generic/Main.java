package variables.generics.generic;

public class Main {
    public static void main(String[] args) {
        ShoppingCart<Product> productCart = new ShoppingCart<>();
        productCart.addItem(new Product("Laptop", 999.99));
        productCart.addItem(new Product("Phone", 699.99));
        productCart.displayItems();

        ShoppingCart<Book> bookCart = new ShoppingCart<>();
        bookCart.addItem(new Book("Java Programming", 39.99, "John Doe"));
        bookCart.addItem(new Book("Data Structures", 29.99, "Jane Smith"));
        bookCart.displayItems();
    }
}