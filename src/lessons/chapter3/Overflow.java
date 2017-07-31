package lessons.chapter3;

/**
 * Created by Goro on 30.07.2017.
 */
public class Overflow {
    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println("Maximum: " + big);
        int bigger = big * 4;
        System.out.println("bigger: " + bigger);
    }
}
