package tasks.chapter4;

/**
 * Created by HCAV on 31.07.2017.
 */
public class FibonacciTask {
    static int fib(int n) {
        if (n < 2) return 1;
        return (fib(n - 2) + fib(n - 1));
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++)
            System.out.println(FibonacciTask.fib(i));
    }
}
