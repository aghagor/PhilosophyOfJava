package lessons.chapter2;

/**
 * Created by HCAV on 25.07.2017.
 */
public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("User.name"));
        System.out.println(System.getProperty("Java.library.path"));

    }
}
