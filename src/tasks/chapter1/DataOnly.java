package tasks.chapter1;

/**
 * Created by HCAV on 25.07.2017.
 */
public class DataOnly {
    int i;
    double d;
    boolean b;

    public static void main(String[] args) {
        DataOnly dataOnly = new DataOnly();
        dataOnly.i = 7;
        dataOnly.d = 1.5;
        dataOnly.b = true;

        System.out.println(dataOnly.i);
        System.out.println(dataOnly.d);
        System.out.println(dataOnly.b);
    }
}
