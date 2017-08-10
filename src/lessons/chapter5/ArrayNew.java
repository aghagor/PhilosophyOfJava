package lessons.chapter5;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Goro on 10.08.2017.
 */
public class ArrayNew {
    public static void main(String[] args) {
        Random random = new Random(47);
        int[] a;
        a = new int[random.nextInt(20)];
        System.out.println("Lenght of a = " + a.length);
        System.out.println(Arrays.toString(a));
    }
}
