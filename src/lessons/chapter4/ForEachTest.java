package lessons.chapter4;

import java.util.Random;

/**
 * Created by HCAV on 31.07.2017.
 */
public class ForEachTest {
    static Random random = new Random(47);
    static float[] f = new float[10];

    public static void main(String[] args) {
        for (int i = 0; i < f.length; i++) {
            f[i] = random.nextFloat();
        }
        for (float x : f) {
            System.out.println(x);
        }
    }
}
