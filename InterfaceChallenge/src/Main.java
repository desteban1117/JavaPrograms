import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player tim = new Player("Tim", 10, 15);
        tim.toString();
        saveObject(tim);

        tim.setHitPoints(8);
        System.out.println(tim);
        tim.setWeapon("Stormbringer");
        saveObject(tim);
        //loadObject(tim);
        System.out.println(tim);

        Saveable werewolf = new Monster("Werewolf", 20, 40);
        System.out.println(((Monster) werewolf).getStrength());
        System.out.println(werewolf);
        saveObject(werewolf);

    }

    public static List<String> readValues() {
        Scanner scanner = new Scanner(System.in);

        List<String> values = new ArrayList<>();
        int index = 0;

        boolean quit = false;
        int action;


        while (!quit) {
            System.out.println("Enter 0 for quit or 1 for save a new string");
            action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    quit = true;
                    break;

                case 1:
                    System.out.println("Enter the new string: ");
                    values.add(index, scanner.nextLine());
                    index++;
                    break;

            }
        }

        return values;
    }

    public static void saveObject(Saveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(Saveable objectToLoad) {

        List<String> objects = readValues();
        objectToLoad.read(objects);

    }
}
