package tasks.chapter2;

import java.util.Random;

/**
 * Created by HCAV on 26.07.2017.
 */
public class Coin {
    public static void main(String[] args) {
        Random rand = new Random(2);
        boolean coin = rand.nextBoolean();
        for (int i = 0; i < 10; i++) {
            System.out.print("Outcome: ");
            System.out.println(coin ? "Head" : "Tail");
        }
    }
}
