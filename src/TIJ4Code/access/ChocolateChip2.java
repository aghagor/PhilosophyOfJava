package TIJ4Code.access;//: access/ChocolateChip2.java
import TIJ4Code.access.cookie2.Cookie;
import access.cookie2.*;

public class ChocolateChip2 extends Cookie {
  public ChocolateChip2() {
   System.out.println("ChocolateChip2 constructor");
  }
  public void chomp() { bite(); } // Protected method
  public static void main(String[] args) {
    ChocolateChip2 x = new ChocolateChip2();
    x.chomp();
  }
} /* Output:
CookieMostre constructor
ChocolateChip2 constructor
bite
*///:~
