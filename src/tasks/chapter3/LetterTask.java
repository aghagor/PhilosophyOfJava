package tasks.chapter3;

/**
 * Created by HCAV on 25.07.2017.
 */
public class LetterTask {
    float f;
}

class LetterPass {
    static void a(LetterTask t) {
        t.f = 23.1f;
    }

    public static void main(String[] args) {
        LetterTask l = new LetterTask();
        l.f = 41.2f;
        System.out.println("1:l.f: " + l.f);
        a(l);
        System.out.println("2:l.f: " + l.f);
    }
}
