import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<>();

        placesToVisit.add("jardin");
        placesToVisit.add("yarumal");
        placesToVisit.add("rionegro");
        placesToVisit.add("medellin");
        placesToVisit.add("cartagena");
        placesToVisit.add("san andres");

        printList(placesToVisit);

        placesToVisit.remove(4);
        placesToVisit.add(2, "envigado");

        printList(placesToVisit);

        LinkedList<String> cityList = new LinkedList<>();
        addInOrder(cityList, "jardin");
        addInOrder(cityList, "yarumal");
        addInOrder(cityList, "rionegro");
        addInOrder(cityList, "medellin");
        addInOrder(cityList, "cartagena");
        addInOrder(cityList, "san andres");
        addInOrder(cityList, "san andres");

        printList(cityList);
        visitCity(cityList);


    }

    public static void printList(LinkedList<String> list) {
        Iterator i = list.iterator();

        while (i.hasNext()) {
            System.out.println("Ciudad: " + i.next());
        }

        System.out.println("||||||||||||||||||||||||||||||||||||");
    }

    public static boolean addInOrder(LinkedList<String> linkedList, String newCity) {

        ListIterator i = linkedList.listIterator();

        while (i.hasNext()) {
            String city = (String) i.next();
            int comparetion = city.compareTo(newCity);
            if (comparetion == 0) {

                System.out.println("The city is already added");

                return false;
            } else if (comparetion > 0 ) {
                i.previous();
                i.add(newCity);
                return true;
            }
        }

        i.add(newCity);
        return true;
    }

    public static void visitCity(LinkedList<String> cityList) {
        System.out.println("0 - to quit \n 1 - go to the next city \n 2 - go to the previous city \n" +
                " 3 - print menu option");

        boolean quit = false;

        ListIterator listIterator = cityList.listIterator();

        boolean nextWey = true;
        while (!quit) {
            int action = scanner.nextInt();

            switch (action) {
                case 0:
                    quit = true;
                    break;

                case 1:
                    if (!nextWey) {
                        listIterator.next();
                        nextWey = true;
                    }
                    System.out.println("Now visiting the city " + listIterator.next());
                    break;

                case 2:
                    if (nextWey) {
                        listIterator.previous();
                        nextWey = false;
                    }
                    System.out.println("Now visiting the city " + listIterator.previous());
                    break;

                case 3:
                    System.out.println("0 - to quit /n 1 - go to the next city /n 2 - go to the previous city /n" +
                            " 3 - print menu option");
                    break;
            }
        }
    }
}
