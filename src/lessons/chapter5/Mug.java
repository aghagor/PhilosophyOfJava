package lessons.chapter5;

import net.mindview.util.Print;

import static net.mindview.util.Print.*;

/**
 * Created by Goro on 10.08.2017.
 */
public class Mug {
    Mug(int marker) {
        print("Mug(" + marker + ")");
    }

    void f(int marker) {
        print("f(" + marker + ")");
    }
}

class Mugs {
    Mug mug1;
    Mug mug2;

    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        print("mug1 & mug2 initialized");
    }

    Mugs() {
        print("Mugs()");
    }

    Mugs(int i) {
        print("Mugs(int)");
    }

    public static void main(String[] args) {
        print("In method main()");
        new Mugs();
        print("new Mugs() finished");
        new Mugs(1);
        print("new Mugs(1) finished");
    }
}
