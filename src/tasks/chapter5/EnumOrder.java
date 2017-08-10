package tasks.chapter5;

/**
 * Created by Goro on 10.08.2017.
 */
public class EnumOrder {
    public static void main(String[] args) {
        for (Spiciness s:Spiciness.values()){
            System.out.println(s+", ordinal "+s.ordinal());
        }
    }
}
