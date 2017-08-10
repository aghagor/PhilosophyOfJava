package lessons.chapter4;


import TIJ4Code.net.mindview.util.Range;

import static TIJ4Code.net.mindview.util.Print.print;
import static TIJ4Code.net.mindview.util.Print.printnb;

/**
 * Created by HCAV on 31.07.2017.
 */
public class ForEachInt {
    public static void main(String[] args) {

        for (int i : Range.range(10)) {
            printnb(i + " ");
        }
        print();
        for (int i : Range.range(5, 10)) {
            printnb(i + " ");
        }
        print();
        for (int i : Range.range(5, 20, 3)) {
            printnb(i + " ");
        }

    }
}
