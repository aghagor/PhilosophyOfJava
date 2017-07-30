package tasks.chapter2;

/**
 * Created by Goro on 30.07.2017.
 */
public class BinaryInteger {
    public static final int NUM_1 = 0xaaaaaaaa;
    public static final int NUM_2 = 0x55555555;

    public static void main(String[] args) {
        System.out.println("NUM_1 : " + Integer.toBinaryString(NUM_1));
        System.out.println("NUM_2 : " + Integer.toBinaryString(NUM_2));
        System.out.println("~NUM_1 : " + Integer.toBinaryString(~NUM_1));
        System.out.println("~NUM_2 : " + Integer.toBinaryString(~NUM_2));
        System.out.println("NUM_1 & NUM_1 : " + Integer.toBinaryString(NUM_1 & NUM_1));
        System.out.println("NUM_1 | NUM_1 : " + Integer.toBinaryString(NUM_1 | NUM_1));
        System.out.println("NUM_1 ^ NUM_1 : " + Integer.toBinaryString(NUM_1 ^ NUM_1));
        System.out.println("NUM_1 & NUM_2 : " + Integer.toBinaryString(NUM_1 & NUM_2));
        System.out.println("NUM_1 | NUM_2 : " + Integer.toBinaryString(NUM_1 | NUM_2));
        System.out.println("NUM_1 ^ NUM_2 : " + Integer.toBinaryString(NUM_1 ^ NUM_2));

    }
}
