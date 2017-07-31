package lessons.chapter4;

/**
 * Created by HCAV on 31.07.2017.
 */
public class CommaOperator {
    public static void main(String[] args) {
        for (int i = 1, j = i + 10; i < 10; i++, j = i * 2) {
            System.out.println("i = " + i + " j = " + j);
        }
    }
}
