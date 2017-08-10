package tasks.chapter5;

/**
 * Created by Goro on 10.08.2017.
 */
public class MainString {
    public static void main(String... args) {
        args = new String[]{"1", "2", "3"};
        for (String s : args) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
