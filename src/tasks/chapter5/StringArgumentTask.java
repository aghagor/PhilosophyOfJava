package tasks.chapter5;

/**
 * Created by Goro on 10.08.2017.
 */
public class StringArgumentTask {
    static void stringArgPrint(String... args) {
        for (String s : args) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] srt = {"one", "two", "three"};
        stringArgPrint(srt);
        stringArgPrint("1", "2", "3");
    }
}
