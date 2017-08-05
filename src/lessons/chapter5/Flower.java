package lessons.chapter5;

import net.mindview.util.Print;

import static net.mindview.util.Print.*;

/**
 * Created by Goro on 05.08.2017.
 */
public class Flower {
    int petalCOunt = 0;
    String s = "initial value";

    public Flower(int petal) {
        petalCOunt = petal;
        print("Constructor with parametor int, petalCount = " + petalCOunt);
    }

    Flower(String ss) {
        print("COnstructor with parametor String, s = " + ss);
        s = ss;
    }

    Flower(String s, int petals) {
        this(petals);
        this.s = s;
        print("String and int arguments");
    }

    Flower() {
        this("hi", 47);
        print("Defoult constructor(without arguments)");
    }

    void printPetalCount() {
        print("petalCount = " + petalCOunt + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}
