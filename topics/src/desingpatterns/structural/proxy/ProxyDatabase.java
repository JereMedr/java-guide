package desingpatterns.structural.proxy;

public class ProxyDatabase implements Database {
    private RealDatabase realDatabase;
    private String userRole;

    public ProxyDatabase(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public void query(String sql) {
        if (userRole.equals("Admin")) {
            if (realDatabase == null) {
                realDatabase = new RealDatabase(); // Lazy initialization
            }
            realDatabase.query(sql);
        } else {
            System.out.println("Access denied. Only Admin can execute queries.");
        }
    }
}