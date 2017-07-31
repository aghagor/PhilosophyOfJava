package lessons.chapter4;

import net.mindview.util.Print;

/**
 * Created by HCAV on 31.07.2017.
 */
public class LabelFor {
    public static void main(String[] args) {
        int i = 0;
        outer:
        for (; true; ) {
            inner:
            for (; i < 10; i++) {
                Print.print("i = " + i);
                if (i == 2) {
                    Print.print("continue");
                    continue;
                }
                if (i == 3) {
                    Print.print("break");
                    i++;
                    break;
                }
                if (i == 7) {
                    Print.print("continue outer");
                    i++;
                    continue outer;
                }
                if (i == 8) {
                    Print.print("break outer");
                    break outer;
                }
                for (int j = 0; j < 5; j++) {
                    if (j == 3) {
                        Print.print("continue inner");
                        continue inner;
                    }
                }
            }
        }
    }
}
