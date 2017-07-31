package lessons.chapter3;

/**
 * Created by HCAV on 25.07.2017.
 */
class Letter {
    char c;
}

class PassObject {
    static void f(Letter l) {
        l.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c: " + x.c);
        f(x);
        System.out.println("2: x.c: " + x.c);
    }
}
