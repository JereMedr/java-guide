package variables.generics.generic;

public class Book extends Item {
    private String author;

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }
}
