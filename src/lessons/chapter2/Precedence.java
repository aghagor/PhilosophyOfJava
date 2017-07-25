package lessons.chapter2;

/**
 * Created by HCAV on 25.07.2017.
 */
public class Precedence {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;

        int a = x + y - 2 / 2 + z;
        int b = x + (y - 2) / (2 + z);

        System.out.println("a = " + a + " b = " + b);
    }
}
