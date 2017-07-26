package tasks.chapter2;

/**
 * Created by HCAV on 26.07.2017.
 */
public class LongTask {
    public static void main(String[] args) {
        long l1 = 0x2f;
        long l2 = 0x2F;
        long l3 = 0122;
        System.out.println("l1: " + Long.toBinaryString(l1));
        System.out.println("l2: " + Long.toBinaryString(l2));
        System.out.println("l3: " + Long.toBinaryString(l3));
    }
}
