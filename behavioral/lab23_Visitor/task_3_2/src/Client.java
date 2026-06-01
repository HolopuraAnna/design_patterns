import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<MilitaryObject> militaryObjects =
                new ArrayList<>();

        militaryObjects.add(
                new GeneralStaff(20, 100));

        militaryObjects.add(
                new MilitaryBase(
                        10,
                        1000,
                        300,
                        20));

        System.out.println("Initial state:");

        for (MilitaryObject object : militaryObjects) {
            System.out.println(object);
        }

        Spy secretAgent = new SecretAgent();

        System.out.println("\n=== Secret Agent ===");

        for (MilitaryObject object : militaryObjects) {
            object.accept(secretAgent);
        }

        Spy saboteur = new Saboteur();

        System.out.println("\n=== Saboteur ===");

        for (MilitaryObject object : militaryObjects) {
            object.accept(saboteur);
        }

        System.out.println("\nFinal state:");

        for (MilitaryObject object : militaryObjects) {
            System.out.println(object);
        }
    }

}