package lessons.chapter3;

/**
 * Created by HCAV on 26.07.2017.
 */
public class Literals {
    public static void main(String[] args) {
        int i1 = 0x2f;
        System.out.println("i1: " + Integer.toBinaryString(i1));
        int i2 = 0x2F;
        System.out.println("i2: " + Integer.toBinaryString(i2));
        int i3 = 0177;
        System.out.println("i3: " + Integer.toBinaryString(i3));
        char c = 0xffff;
        System.out.println("c: " + Integer.toBinaryString(c));
        byte b = 0x7f;
        System.out.println("b: " + Integer.toBinaryString(b));
        short s = 0x7fff;
        System.out.println("s: " + Integer.toBinaryString(s));
        long l1 = 200L;
        System.out.println("l1: " + Integer.toBinaryString(s));
        long l2 = 200l;
        System.out.println("l2: " + Integer.toBinaryString(s));
        long l3 = 200;
        System.out.println("l3: " + Integer.toBinaryString(s));
        float f1 = 1;
        System.out.println("f1: " + Integer.toBinaryString(s));
        float f2 = 1F;
        System.out.println("f2: " + Integer.toBinaryString(s));
        float f3 = 1f;
        System.out.println("f3: " + Integer.toBinaryString(s));
        double d1 = 1d;
        System.out.println("d1: " + Integer.toBinaryString(s));
        double d2 = 1D;
        System.out.println("d2: " + Integer.toBinaryString(s));
    }
}
