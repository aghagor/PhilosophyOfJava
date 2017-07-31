package lessons.chapter4;

import static net.mindview.util.Print.print;

/**
 * Created by HCAV on 31.07.2017.
 */
public class IfElse2 {
    static int test(int testival, int target) {
        if (testival > target) {
            return +1;
        } else if (testival < target) {
            return -1;
        } else return 0;
    }

    static int test(int begin, int end, int testival, int target) {
        if (testival >= begin && testival <= end && testival < target) {
            return +1;
        } else if (testival >= begin && testival <= end && testival > target) {
            return -1;
        } else if (testival >= begin && testival <= end && testival == target) {
            return 0;
        } else if (testival < begin || testival > end) {
            return 2;
        } else return 3;
    }

    public static void main(String[] args) {
        print(test(10, 5));
        print(test(5, 10));
        print(test(5, 5));

        print(test(3, 15, 6, 5));
        print(test(3, 15, 5, 6));
        print(test(3, 15, 5, 5));
        print(test(3, 15, 2, 5));
        print(test(3, 15, 20, 5));
    }
}
