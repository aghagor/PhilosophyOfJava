package lessons.chapter6;

/**
 * Created by Goro on 11.08.2017.
 */
public class Lunch {
    void testPrivate() {

    }

    void testStatic() {
        Soup1 sp = Soup1.makeSoup();
    }

    void testSingleton() {
        Soup2.access();
    }

}

class Soup1 {
    private Soup1() {
    }

    public static Soup1 makeSoup() {
        return new Soup1();
    }
}

class Soup2 {
    private Soup2() {
    }

    private static Soup2 sp = new Soup2();

    public static Soup2 access() {
        return sp;
    }
}
