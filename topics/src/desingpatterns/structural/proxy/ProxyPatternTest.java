package desingpatterns.structural.proxy;

public class ProxyPatternTest {
    public static void main(String[] args) {
        // Admin user
        Database adminDatabase = new ProxyDatabase("Admin");
        adminDatabase.query("SELECT * FROM users");

        // Non-admin user
        Database userDatabase = new ProxyDatabase("User");
        userDatabase.query("SELECT * FROM users");
    }
}

