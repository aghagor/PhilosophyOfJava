package tasks.chapter2;

/**
 * Created by HCAV on 26.07.2017.
 */
public class Dog {
    String name;
    String says;

    public static void main(String[] args) {
        Dog spot = new Dog();
        Dog scruffy = new Dog();
        Dog rex = spot;

        spot.name = "Dingo";
        spot.says = "Gaf-gaf";

        scruffy.name = "Bingo";
        scruffy.says = "gaf-gaf-gaf";

        System.out.println(spot.name + " says " + spot.says);
        System.out.println(scruffy.name + " says " + scruffy.says);

        System.out.println("Comparing dog1 and dog2 objects...");
        compare(spot, scruffy);
        System.out.println("\nComparing dog1 and dog3 objects...");
        compare(spot, rex);
        System.out.println("\nComparing dog2 and dog3 objects...");
        compare(scruffy, rex);
    }

    private static void compare(Dog dog1, Dog dog2) {
        System.out.println("== on top references: " + (dog1 == dog2));
        System.out.println(
                "equals() on top references: " + dog1.equals(dog2)
        );
        System.out.println("== on names: " + (dog1.name == dog2.name));
        System.out.println(
                "equals() on names: " + dog1.name.equals(dog2.name)
        );
        System.out.println("== on says: " + (dog1.says == dog2.says));
        System.out.println(
                "equals() on says: " + dog1.says.equals(dog2.says)
        );
    }
}
