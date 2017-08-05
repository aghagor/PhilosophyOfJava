package lessons.chapter5;

/**
 * Created by Goro on 05.08.2017.
 */
public class Person {
    public void eat(Apple apple) {
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
    }
}

class Peeler {
    static Apple peel(Apple apple) {
        return apple;
    }
}

class Apple {
    Apple getPeeled() {
        return Peeler.peel(this);
    }
}

class PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}
