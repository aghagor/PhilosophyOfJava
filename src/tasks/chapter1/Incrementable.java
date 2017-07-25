package tasks.chapter1;

class StaticTest {
    static int i = 47;
}

public class Incrementable {
    static void increment() {
        StaticTest.i++;
        System.out.println(StaticTest.i);
    }

    public static void main(String[] args) {
        Incrementable incrementable = new Incrementable();
        incrementable.increment();
        Incrementable.increment();
        increment();
    }
}