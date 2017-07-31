package lessons.chapter3;

/**
 * Created by Goro on 30.07.2017.
 */
public class StringOperators {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int z = 2;
        String s = "x, y, z ";
        System.out.println(s + x + y + z);
        System.out.println(x + " " + s);
        s += "(summed) = ";
        System.out.println(s + (x + y + z));
        System.out.println("" + x);
    }
}
