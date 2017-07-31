package tasks.chapter2;

/**
 * Created by HCAV on 25.07.2017.
 */
public class ArgumentsTask {
    static String[] array = {"A", "B", "C"};

    public static void main(String[] args) {
        args = array;

        if (args.length < 3) {
            System.err.print("Enter the arguments!!!");
        } else {
            System.out.println(array[0]);
            System.out.println(array[1]);
            System.out.println(array[2]);
        }
    }
}
