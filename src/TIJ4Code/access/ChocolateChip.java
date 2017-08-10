package TIJ4Code.access;//: access/ChocolateChip.java
// Can't use package-access member from another package.
import TIJ4Code.access.dessert.Cookie;
import access.dessert.*;

public class ChocolateChip extends Cookie {
  public ChocolateChip() {
   System.out.println("ChocolateChip constructor");
  }
  public void chomp() {
    //! bite(); // Can't access bite
  }
  public static void main(String[] args) {
    ChocolateChip x = new ChocolateChip();
    x.chomp();
  }
} /* Output:
CookieMostre constructor
ChocolateChip constructor
*///:~
