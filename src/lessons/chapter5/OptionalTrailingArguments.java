package lessons.chapter5;

/**
 * Created by Goro on 10.08.2017.
 */
public class OptionalTrailingArguments {
    static void f(int required, String ... trailing){
        System.out.print("Optional: "+required+" ");
        for(String s : trailing){
            System.out.print(s+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f(1,"one");
        f(2, "one","two");
        f(3);
    }
}
