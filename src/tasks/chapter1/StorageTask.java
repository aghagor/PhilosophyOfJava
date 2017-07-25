package tasks.chapter1;

/**
 * Created by HCAV on 25.07.2017.
 */
public class StorageTask {
    static String text = "Hello World";

    public static void main(String[] args) {
        System.out.println("First text length = " + text.length());

        storage(text);
    }

    private static void storage(String s) {
        System.out.println(s.length() * 2);
    }
}
