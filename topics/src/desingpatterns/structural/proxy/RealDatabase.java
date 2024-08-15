package desingpatterns.structural.proxy;

public class RealDatabase implements Database {
    public RealDatabase() {
        // Simulate an expensive operation like connecting to a database
        System.out.println("Connecting to the database...");
    }

    @Override
    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }
}