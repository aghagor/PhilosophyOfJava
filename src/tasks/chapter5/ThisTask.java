package tasks.chapter5;

/**
 * Created by Goro on 05.08.2017.
 */
public class ThisTask {
    private static void thisTest() {
        System.out.println("This is thisTest method");

    }

    private void test() {
        this.thisTest();
        thisTest();
    }

    public static void main(String[] args) {
        ThisTask tt = new ThisTask();
        tt.test();
    }
}
