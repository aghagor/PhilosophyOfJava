package tasks.chapter3;

/**
 * Created by HCAV on 25.07.2017.
 */
public class TankFloat {
    float f;
}

class Assingnment {
    public static void main(String[] args) {
        TankFloat tf1 = new TankFloat();
        TankFloat tf2 = new TankFloat();

        tf1.f = 2.7f;
        tf2.f = 23.7f;
        System.out.println("1: tf1.f: " + tf1.f + ", tf2.f: " + tf2.f);
        tf1 = tf2;
        System.out.println("2: tf1.f: " + tf1.f + ", tf2.f: " + tf2.f);
        tf1.f = 225.5f;
        System.out.println("3: tf1.f: " + tf1.f + ", tf2.f: " + tf2.f);
    }
}
