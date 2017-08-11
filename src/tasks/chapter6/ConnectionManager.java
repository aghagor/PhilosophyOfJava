package tasks.chapter6;

/**
 * Created by Goro on 11.08.2017.
 */
public class ConnectionManager {
    static int howManyLeft = 3;
    static Connection[] connections = new Connection[3];

    {
        for (Connection c : connections) {
            c = Connection.connection();
        }
    }

    public static Connection getConnection() {
        if (howManyLeft > 0) {
            return connections[--howManyLeft];
        } else {
            System.out.println("No more connections");
            return null;
        }
    }

    public static void main(String[] args) {
        ConnectionManager cm = new ConnectionManager();
        System.out.println(cm.howManyLeft);
        cm.getConnection();
        System.out.println(howManyLeft);
        cm.getConnection();
        System.out.println(howManyLeft);
        cm.getConnection();
        System.out.println(cm.getConnection());
        System.out.println(howManyLeft);
    }
}

class Connection {
    private static int count = 0;
    private int i = 0;

    private Connection() {
        System.out.println("Connection()");
    }

    static Connection connection() {
        count++;
        return new Connection();
    }

    public static int howMany() {
        return count;
    }

    public String toString() {
        return ("Connection " + count);
    }
}
