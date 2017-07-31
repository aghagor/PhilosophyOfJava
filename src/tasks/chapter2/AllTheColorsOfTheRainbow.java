package tasks.chapter2;

/**
 * Created by HCAV on 25.07.2017.
 */
public class AllTheColorsOfTheRainbow {
    static int anInteger;

    static int changeTheColor(int newInteger) {
        anInteger++;
        anInteger += newInteger;
        return anInteger;
    }

    public static void main(String[] args) {
        System.out.println(changeTheColor(5));
    }
}
