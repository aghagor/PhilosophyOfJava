package tasks.chapter5;

/**
 * Created by Goro on 05.08.2017.
 */
public class ConstructorOverloadingTask {
    int i = 0;
    String s = "Hello world";

    ConstructorOverloadingTask(int i) {
        this.i = i;
    }

    ConstructorOverloadingTask(String ss) {
        this(51);
        this.s = ss;

    }
}
