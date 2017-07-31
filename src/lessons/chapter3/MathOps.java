package lessons.chapter3;

import java.util.Random;

/**
 * Created by HCAV on 25.07.2017.
 */
public class MathOps {
    public static void main(String[] args) {
        Random rand = new Random(47);

        // test for integers
        int i;
        int j;
        int k;
        System.out.println("Test for integers");
        //select number from 1 to 100
        j = rand.nextInt(100) + 1;
        System.out.println("j:" + j);
        k = rand.nextInt(100) + 1;
        System.out.println("k: " + k);
        i = j + k;
        System.out.println("j + k: " + i);
        i = j - k;
        System.out.println("j - k: " + i);
        i = j * k;
        System.out.println("j * k: " + i);
        i = k / j;
        System.out.println("k / j: " + i);
        i = k % j;
        System.out.println("k % j: " + i);
        j %= k;
        System.out.println("j %/ k: " + j);

        // test for float numbers
        System.out.println("Test for floats");

        float u;
        float w;
        float v;

        v = rand.nextFloat();
        System.out.println("v: " + v);
        w = rand.nextFloat();
        System.out.println("w: " + w);
        u = v + w;
        System.out.println("v + w: " + u);
        u = v - w;
        System.out.println("v - w: " + u);
        u = v * w;
        System.out.println("v * w: " + u);
        u = v / w;
        System.out.println("v / w: " + u);

        //it's imposible for char, byte, short, int, long and double:
        System.out.println("it's imposible for char, byte, short, int, long and double:");

        u += v;
        System.out.println("u += v: " + u);
        u -= v;
        System.out.println("u -= v: " + u);
        u *= v;
        System.out.println("u *= v: " + u);
        u /= v;
        System.out.println("u /= v: " + u);


    }
}
