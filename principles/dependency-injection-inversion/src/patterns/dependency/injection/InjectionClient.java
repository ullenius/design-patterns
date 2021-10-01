package patterns.dependency.injection;

public class InjectionClient implements ConnectToDatabase {
    // Following Dependency-Inversion by using a Interface
    private Database database;

    // Constructor Injection
    public InjectionClient(Database database) {
        this.database = database;
    }

    // Setter Injection
    public void setDatabase(Database database) {
        this.database = database;
    }

    // Abstraction/Interface Injection
    @Override
    public void setConnection(Database database) {
        this.database = database;
    }
}

interface ConnectToDatabase {
    void setConnection(Database database);
}

interface Database {
    void connect();
}

class H2Database implements Database {
    @Override
    public void connect() {
        System.out.println("Conneting to: " + getClass().getSimpleName());
    }
}
