import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);

        if (theatre.reserveSeat("A02")) {
            System.out.println("Please pay for A02");
        }else {
            System.out.println("Seat already reserved ");
        }

        List<Theatre.Seat> reverseTheare = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseTheare);
        printList((List<Theatre.Seat>) theatre.getSeats());
        printList(reverseTheare);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);

    }

    public static void printList(List<Theatre.Seat> list) {

        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " " + seat.getPrice());
        }

        System.out.println();
        System.out.println("===========================================================");
    }

}
