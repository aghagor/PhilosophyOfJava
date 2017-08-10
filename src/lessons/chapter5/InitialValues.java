package lessons.chapter5;

import static lessons.chapter6.Print.print;

/**
 * Created by Goro on 09.08.2017.
 */
public class InitialValues {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitialValues reference;

    void printInitialValues() {
        print("Type of dates        First values");
        print("boolean              " + t);
        print("char                 [" + c + "]");
        print("byte                 " + b);
        print("short                " + s);
        print("int                  " + i);
        print("long                 " + l);
        print("float                " + f);
        print("double               " + d);
        print("reference            " + reference);
    }

    public static void main(String[] args) {
        InitialValues iv = new InitialValues();
        iv.printInitialValues();
    }
}
