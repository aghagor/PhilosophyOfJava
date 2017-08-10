package lessons.chapter4;

import TIJ4Code.net.mindview.util.Print;

import java.util.Random;

/**
 * Created by HCAV on 31.07.2017.
 */
public class VowelsAndConsonants {
    public static void main(String[] args) {
        Random random = new Random(47);
        for (int i = 0; i < 100; i++) {
            int c = random.nextInt(26) + 'a';
            Print.printnb((char) c + ", " + c + ": ");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    Print.print("Vowel");
                    break;
                case 'y':
                case 'w':
                    Print.print("Conditionally vowel");
                    break;
                default:
                    Print.print("Consonant");
            }
        }
    }
}
