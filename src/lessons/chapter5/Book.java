package lessons.chapter5;

/**
 * Created by Goro on 05.08.2017.
 */
public class Book {
    boolean checkedOut = false;

    Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    public void finalize() {
        if (checkedOut) {
            System.out.println("Exception: checkedOut");
        }
    }
}

class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        novel.checkIn();
        new Book(true);
        System.gc();
    }
}
