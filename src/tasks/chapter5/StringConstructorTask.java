package tasks.chapter5;

/**
 * Created by Goro on 10.08.2017.
 */
public class StringConstructorTask {
    StringConstructorTask(String str) {
        System.out.println("StringConstructorTask(" + str + ")");
    }
}

class StringConstructorTaskTest {
    public static void main(String[] args) {
        StringConstructorTask[] sct = new StringConstructorTask[3];
        for (int i = 0; i < sct.length; i++) {
            sct[i] = new StringConstructorTask(Integer.toString(i));
        }
    }
}
