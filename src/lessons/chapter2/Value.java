package lessons.chapter2;

/**
 * Created by HCAV on 26.07.2017.
 */
public class Value {
    int v;
}

class EqualsMethod2 {
    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();

        v1.v = v2.v = 100;

        System.out.println(v1.equals(v2));
    }
}
