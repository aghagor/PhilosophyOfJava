package tasks.chapter4;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by HCAV on 31.07.2017.
 */
public class RandomNum {

    private static Random random = new Random(50);
    private static int firstNum;
    private static int lastNum;

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            firstNum = random.nextInt(100);
            lastNum = random.nextInt(100);


            if (firstNum > lastNum) {
                System.out.println(firstNum + " > " + lastNum);
            } else if (firstNum < lastNum) {
                System.out.println(firstNum + " < " + lastNum);
            } else if (firstNum == lastNum) {
                System.out.println(firstNum + " = " + lastNum);
            }

            // forever loop
            while (true)
//                for (int i = 1; i < 100; i++)
            {
                firstNum = random.nextInt(100);
                lastNum = random.nextInt(100);


                if (firstNum > lastNum) {
                    System.out.println(firstNum + " > " + lastNum);
                } else if (firstNum < lastNum) {
                    System.out.println(firstNum + " < " + lastNum);
                } else if (firstNum == lastNum) {
                    System.out.println(firstNum + " = " + lastNum);
                }


            }
        }

    }
}
