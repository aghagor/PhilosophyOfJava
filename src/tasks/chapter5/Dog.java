package tasks.chapter5;

/**
 * Created by Goro on 03.08.2017.
 */
public class Dog {
    void bark(char x) {
        System.out.println("Gaf gaf");
    }

    void bark(byte b) {
        System.out.println("haf haf");
    }

    void bark(short s) {
        System.out.println("gaaaf gaaaaaaaf");
    }

    void bark(int i) {
        System.out.println("baf baf");
    }

    void bark(long l) {
        System.out.println("brrr brrrr");
    }

    void bark(float f,int i) {
        System.out.println("gaf gaf gaf");
    }

    void bark(int i,double d) {
        System.out.println("haf haf haf");
    }

    public static void main(String[] args) {

        Dog d = new Dog();
        d.bark(1);
        d.bark('x');
        d.bark(4);
        d.bark(3);
        d.bark(15478451541543145l);
        d.bark(2.3f,2);
        d.bark(5,3.1);
    }
}
