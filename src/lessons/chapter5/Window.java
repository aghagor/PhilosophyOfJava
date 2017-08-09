package lessons.chapter5;

import net.mindview.util.Print;

import static net.mindview.util.Print.*;

/**
 * Created by Goro on 09.08.2017.
 */
public class Window {
    Window(int marker) {
        print("Window(" + marker + ")");
    }
}

class House {
    Window w1 = new Window(1);

    House() {
        print("House()");
        w3 = new Window(33);
    }

    Window w2 = new Window(2);

    void f() {
        print("f()");
    }

    Window w3 = new Window(3);
}

class OrderOfInitialization {
    public static void main(String[] args) {
        House h = new House();
        h.f();
    }
}
