package tasks.chapter2;

/**
 * Created by HCAV on 25.07.2017.
 */
public class StaticTestTask {
    static int i = 54;

    public static void main(String[] args) {
        StaticTestTask staticTestTask = new StaticTestTask();
        StaticTestTask staticTestTask1 = new StaticTestTask();

        System.out.println(staticTestTask.i + " == " + staticTestTask1.i);
        staticTestTask.i++;
        System.out.println(staticTestTask.i + " == " + staticTestTask1.i);
    }
}
