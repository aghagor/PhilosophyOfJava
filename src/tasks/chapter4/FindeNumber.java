package tasks.chapter4;

/**
 * Created by HCAV on 31.07.2017.
 */
public class FindeNumber {

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            int factors = 0;
            for (int j = 1; j < (i + 2) / 2; j++) {
                if ((i % j) == 0) {
                    factors++;
                }
            }
            if (factors < 2) System.out.println(i + " is prime");
        }
    }
}
