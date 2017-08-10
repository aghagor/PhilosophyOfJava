package lessons.chapter5;

import javafx.beans.binding.ObjectExpression;
import javafx.util.converter.IntegerStringConverter;

/**
 * Created by Goro on 10.08.2017.
 */
public class NewVarArgs {
    static void printArray(Object... args) {
        for (Object obj : args) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Integer(47), new Float(3.14), new Double(12.12));
        printArray(47, 3.21, 12.12);
        printArray("one", "two", "three");
        printArray(new A(), new A(), new A());
        printArray((Object[]) new Integer[]{1, 2, 3, 4, 5});
        printArray();
    }
}
