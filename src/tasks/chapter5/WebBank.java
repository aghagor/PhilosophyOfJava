package tasks.chapter5;

/**
 * Created by Goro on 05.08.2017.
 */
public class WebBank {
    boolean loggedIn = false;

    WebBank(boolean logStatus) {
        loggedIn = logStatus;
    }

    void logIn() {
        loggedIn = true;
    }

    void logOut() {
        loggedIn = false;
    }

    protected void finalize() {
        if (loggedIn) {
            System.out.println("Error: still logged in");
        }
    }
}

class TerminationConditionEx {
    public static void main(String[] args) {
        WebBank bank1 = new WebBank(true);
        WebBank bank2 = new WebBank(true);
        bank1.logOut();
        new WebBank(true);
        System.gc();
    }
}
