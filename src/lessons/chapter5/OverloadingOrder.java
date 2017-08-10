package lessons.chapter5;

import static lessons.chapter6.Print.print;

/**
 * Created by Goro on 03.08.2017.
 */
public class OverloadingOrder {
    static void f(String s, int i) {
        print("String: " + s + ", int: " + i);
    }

    static void f(int i, String s) {
        print("int: " + i + ", String: " + s);
    }

    public static void main(String[] args) {
        f("First String", 11);
        f(11, "then string");
    }
}
