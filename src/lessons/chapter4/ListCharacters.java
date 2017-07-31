package lessons.chapter4;

/**
 * Created by HCAV on 31.07.2017.
 */
public class ListCharacters {
    public static void main(String[] args) {
        for (char c = 0; c < 128; c++) {
            if (Character.isLowerCase(c)) {
                System.out.println("Result: " + (int) c + " symbol: " + c);
            }

        }
    }
}
