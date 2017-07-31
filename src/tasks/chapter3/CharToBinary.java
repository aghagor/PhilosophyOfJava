package tasks.chapter3;

/**
 * Created by Goro on 30.07.2017.
 */
public class CharToBinary {
    public static void main(String[] args) {


        printBinaryChar("X : ", 'X');
        printBinaryChar("A : ", 'A');
        printBinaryChar("B : ", 'B');
        printBinaryChar("@ : ", '@');
    }

    private static void printBinaryChar(String s, char x) {
        System.out.println(s + ", int: " + x + ", binary: \n "
                + Integer.toBinaryString(x));
    }
}
