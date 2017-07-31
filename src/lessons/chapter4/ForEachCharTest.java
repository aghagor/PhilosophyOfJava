package lessons.chapter4;

/**
 * Created by HCAV on 31.07.2017.
 */
public class ForEachCharTest {
    public static void main(String[] args) {
        for (char c : "I Love Java and Android!!!".toCharArray()) {
            System.out.print(c + " ");
        }
    }
}
