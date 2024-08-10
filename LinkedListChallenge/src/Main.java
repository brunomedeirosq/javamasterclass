import lpa.dev.Place;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Objective: Use LinkedList functionality to create a list of places, ordered by distance from the starting point.

        var placesToVisit = new LinkedList<Place>();

        Place sydney = new Place("Sydney", 0);

        placesToVisit.add(sydney);
        add(placesToVisit, "Adelaide", 1374);
        add(placesToVisit, "Alice Springs", 2771);
        add(placesToVisit, "Brisbane", 917);
        add(placesToVisit, "Darwin", 3972);
        add(placesToVisit, "Melbourne", 877);
        add(placesToVisit, "Perth", 3923);
        add(placesToVisit, "Braga", 4000);
        add(placesToVisit, "Lisbon", 1400);


        menu();
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        while (!option.equals("Q")) {
            switch (option.toUpperCase()) {
                case "F" -> printForward(placesToVisit);
                case "B" -> printBackward(placesToVisit);
                case "L" -> list(placesToVisit);
                case "M" -> menu();
                case "Q" -> System.exit(0);
                default -> throw new IllegalStateException("Unexpected value: " + option.toUpperCase());
            }
            menu();
            option = scanner.nextLine();
        }




    }


    private static void add(LinkedList<Place> list, String town, int distance) {
        Place newPlace = new Place(town, distance);
        int index = -1;
        var iterator = list.listIterator();
        while (iterator.hasNext()) {
            var place = iterator.next();
            if (place.getTown().equals(newPlace.getTown())) {
                index = -1;
                break;
            }
            if (newPlace.getDistance() > place.getDistance()) {
                index = iterator.nextIndex();

            }
        }
        if (index != -1) {
            list.add(index,newPlace);
        }

    }

    private static void printForward(LinkedList<Place> list) {
        var iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().print());
        }
    }

    private static void printBackward(LinkedList<Place> list) {
        var iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous().print());
        }
    }

    private static void list(LinkedList<Place> list) {
        var iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getTown());
        }
    }

    private static void menu() {
        System.out.println("""
                
                Available actions (select word):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit
                """);
    }

}
