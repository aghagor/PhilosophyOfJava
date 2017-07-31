package lessons.chapter4;



/**
 * Created by HCAV on 31.07.2017.
 */
public class ForEachInt {
    public static void main(String[] args) {
        int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {5, 6, 7, 8, 9};
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : arr2) {
            System.out.print(i + " ");
        }

    }
}
