package lessons.chapter5;

import net.mindview.util.Print;

import static net.mindview.util.Print.*;

/**
 * Created by Goro on 02.08.2017.
 */
public class Tree {
    int height;

    public Tree() {
        print("Grow new tree");
        height = 0;
    }

    public Tree(int height) {
        this.height = height;
        print("Growing new tree, height " + height + " m.");
    }

    void info() {
        print("The tree with height " + height + " m.");
    }

    void info(String s) {
        print(s + ": The tree with height " + height + " m.");
    }
}
