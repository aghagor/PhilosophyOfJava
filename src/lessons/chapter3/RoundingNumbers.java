package lessons.chapter3;

/**
 * Created by Goro on 30.07.2017.
 */
public class RoundingNumbers {
    public static void main(String[] args) {
        double above = 0.7;
        double below = 0.4;
        float fabove = 0.7f;
        float fbelow = 0.4f;
        System.out.println("Math.round(above): " + Math.round(above));
        System.out.println("Math.round(below): " + Math.round(below));
        System.out.println("Math.round(fabove): " + Math.round(fabove));
        System.out.println("Math.round(fbelow): " + Math.round(fbelow));
    }
}
