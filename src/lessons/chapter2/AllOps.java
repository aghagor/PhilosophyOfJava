package lessons.chapter2;

/**
 * Created by Goro on 30.07.2017.
 */
public class AllOps {
    void f(boolean b) {
    }

    void booleanTest(boolean x, boolean y) {
        f(x == y);
        f(x != y);
        f(!y);

        x = x && y;
        x = x || y;

        x = x & y;
        x = x | y;
        x = x ^ y;

        x &= y;
        x |= y;
        x ^= y;
    }

    void charTest(char x, char y) {
        x = (char) (x * y);
        x = (char) (x / y);
        x = (char) (x % y);
        x = (char) (x + y);
        x = (char) (x - y);
        x++;
        x--;
        x = (char) +y;
        x = (char) -y;

        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        x = (char) ~y;
        x = (char) (x & y);
        x = (char) (x | y);
        x = (char) (x ^ y);
        x = (char) (x << 1);
        x = (char) (x >> 1);
        x = (char) (x >>> 1);

        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x ^= y;
        x |= y;

        byte B = (byte) x;
        short s = (short) x;
        int i = (int) x;
        long l = (long) x;
        float f = (float) x;
        double d = (double) x;

    }

    void byteTest(byte x, byte y) {
        x = (byte) (x * y);
        x = (byte) (x / y);
        x = (byte) (x % y);
        x = (byte) (x + y);
        x = (byte) (x - y);
        x++;
        x--;
        x = (byte) +y;
        x = (byte) -y;

        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        x = (byte) ~y;
        x = (byte) (x & y);
        x = (byte) (x | y);
        x = (byte) (x ^ y);
        x = (byte) (x << 1);
        x = (byte) (x >> 1);
        x = (byte) (x >>> 1);

        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x ^= y;
        x |= y;

        char c = (char) x;
        short s = (short) x;
        int i = (int) x;
        long l = (long) x;
        float f = (float) x;
        double d = (double) x;
    }

    void shortTest(short x, short y) {
        x = (short) (x * y);
        x = (short) (x / y);
        x = (short) (x % y);
        x = (short) (x + y);
        x = (short) (x - y);
        x++;
        x--;
        x = (short) +y;
        x = (short) -y;

        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        x = (short) ~y;
        x = (short) (x & y);
        x = (short) (x | y);
        x = (short) (x ^ y);
        x = (short) (x << 1);
        x = (short) (x >> 1);
        x = (short) (x >>> 1);

        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x ^= y;
        x |= y;

        char c = (char) x;
        byte s = (byte) x;
        int i = (int) x;
        long l = (long) x;
        float f = (float) x;
        double d = (double) x;
    }

    void intTest(int x, int y) {
        x = (x * y);
        x = (x / y);
        x = (x % y);
        x = (x + y);
        x = (x - y);
        x++;
        x--;
        x = +y;
        x = -y;

        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        x = ~y;
        x = (x & y);
        x = (x | y);
        x = (x ^ y);
        x = (x << 1);
        x = (x >> 1);
        x = (x >>> 1);

        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x ^= y;
        x |= y;

        char c = (char) x;
        short s = (short) x;
        byte b = (byte) x;
        long l = (long) x;
        float f = (float) x;
        double d = (double) x;
    }

    void longTest(long x, long y) {
        x = (x * y);
        x = (x / y);
        x = (x % y);
        x = (x + y);
        x = (x - y);
        x++;
        x--;
        x = +y;
        x = -y;

        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        x = ~y;
        x = (x & y);
        x = (x | y);
        x = (x ^ y);
        x = (x << 1);
        x = (x >> 1);
        x = (x >>> 1);

        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x ^= y;
        x |= y;

        char c = (char) x;
        short s = (short) x;
        int i = (int) x;
        byte b = (byte) x;
        float f = (float) x;
        double d = (double) x;
    }

    void floatTest(float x, float y) {
        x = (x * y);
        x = (x / y);
        x = (x % y);
        x = (x + y);
        x = (x - y);
        x++;
        x--;
        x = +y;
        x = -y;

        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);


        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;


        char c = (char) x;
        short s = (short) x;
        int i = (int) x;
        long l = (long) x;
        byte b = (byte) x;
        double d = (double) x;
    }

    void doubleTest(double x, double y) {
        x = (x * y);
        x = (x / y);
        x = (x % y);
        x = (x + y);
        x = (x - y);
        x++;
        x--;
        x = +y;
        x = -y;

        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);


        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;


        char c = (char) x;
        short s = (short) x;
        int i = (int) x;
        long l = (long) x;
        float f = (float) x;
        byte b = (byte) x;
    }
}
