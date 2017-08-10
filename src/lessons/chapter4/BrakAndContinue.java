package lessons.chapter4;

import TIJ4Code.net.mindview.util.Range;

/**
 * Created by HCAV on 31.07.2017.
 */
public class BrakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 99) break;
            if (i % 9 != 0) continue;
            System.out.println(i + " ");
        }
        System.out.println();

        for (int i : Range.range(100)) {
            if (i == 99) break;
            if (i % 9 != 0) continue;
            System.out.println(i + " ");
        }
        System.out.println();
        int i = 0;
        while (true) {
            i++;
            int j = i * 27;
            if (j == 1269) break;
            if (j % 10 != 0) continue;
            System.out.println(i + " ");
        }
    }
}
