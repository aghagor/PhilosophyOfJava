package tasks.chapter5;

/**
 * Created by Goro on 05.08.2017.
 */
public class WebBankFinalize {
    boolean loggedIn = false;

    WebBankFinalize(boolean logStatus) {
        loggedIn = logStatus;
    }

    void logOut() {
        loggedIn = false;
    }

    protected void finalize() {
        if (loggedIn)
            System.out.println("Error: still logged in");
    }
}

class WebBankTest {
    public static void main(String[] args) {
        WebBankFinalize bank1 = new WebBankFinalize(true);
        WebBankFinalize bank2 = new WebBankFinalize(true);
        bank1.logOut();
        System.out.println("try 1");
        System.runFinalization();
        System.out.println("try 2");
        Runtime.getRuntime().runFinalization();
        System.out.println("try 3");
        System.gc();
        System.out.println("try 4");
        System.runFinalizersOnExit(true);
    }
}
