package tasks.chapter5;

/**
 * Created by Goro on 03.08.2017.
 */
public class COnstructorTask {
    public COnstructorTask() {
        System.out.println("This is empty constructor");
    }
    COnstructorTask(String s){
        System.out.println("You pass: "+s);
    }
}class ConstructorTaskTest{
    public static void main(String[] args) {
        new COnstructorTask();
        new COnstructorTask("Hello Java");

    }
}
