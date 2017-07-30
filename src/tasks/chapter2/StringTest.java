package tasks.chapter2;

/**
 * Created by Goro on 30.07.2017.
 */
public class StringTest {

    public static void p(String s, boolean b) {
        System.out.println(s + ": " + b);
    }

    public static void compare(String lval, String rval) {
        System.out.println("lval: " + lval + " rval: " + rval);

        p("lval == rval", lval == rval);
        p("lval != rval", lval != rval);
        p("lval.equals(rval)", lval.equals(rval));
    }

    public static void main(String[] args) {
        compare("Hello", "Hello");


        String s = new String("Hello");
        compare("Hello", s);
        compare("Hello", "Goodbye");
    }
}
