package lessons.chapter5;

/**
 * Created by Goro on 10.08.2017.
 */
public class VarArgType {
    static void f(Character... args) {
        System.out.print(args.getClass());
        System.out.println(" lenght " + args.length);
    }

    static void g(int... args) {
        System.out.print(args.getClass());
        System.out.println(" lenght " + args.length);
    }

    public static void main(String[] args) {
        f('a');
        f();
        g(1);
        g();
        System.out.println("int[]: " + new int[0].getClass());
    }
}
