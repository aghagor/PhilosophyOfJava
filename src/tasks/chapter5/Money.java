package tasks.chapter5;

/**
 * Created by Goro on 10.08.2017.
 */
public enum Money {
    ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
}

class Wallet {
    Money m;

    public static void main(String[] args) {
        for (Money m : Money.values()) {
            System.out.println(m + ", ordinal " + m.ordinal());
            switch (m) {
                case ONE:
                    System.out.println("$1");
                    break;
                case FIVE:
                    System.out.println("$5");
                    break;
                case TEN:
                    System.out.println("$10");
                    break;
                case TWENTY:
                    System.out.println("$20");
                    break;
                case FIFTY:
                    System.out.println("$50");
                    break;
                case HUNDRED:
                    System.out.println("$100");
                    break;
                default:
                    break;
            }
        }

    }
}
