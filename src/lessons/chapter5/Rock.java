package lessons.chapter5;

/**
 * Created by Goro on 02.08.2017.
 */
public class Rock {
    public Rock(int i) {
        System.out.print("Rock "+i+" ");
    }
}class SimpleCOnstructor{
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock(i);
        }
    }
}
