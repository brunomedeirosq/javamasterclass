import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {


        //initialize LinkedList object
        LinkedList<String> placesToVisist = new LinkedList<>();
        //System.out.println(placesToVisist.getClass().getSimpleName());

        //
        var placesToTravel = new LinkedList<String>();
        //System.out.println(placesToTravel.getClass().getSimpleName());

        placesToTravel.add("lisbon");
        //System.out.println(placesToTravel);
        placesToTravel.add("porto");
        //System.out.println(placesToTravel);
        placesToTravel.add(2, "braga");
        System.out.println(placesToTravel);
        addMoreElements(placesToTravel);
//        System.out.println(placesToTravel);
//        removeElements(placesToTravel);
//        System.out.println(placesToTravel);
        //gettingElements(placesToTravel);

        //printItinerary(placesToTravel);
        //printItinerary2(placesToTravel);
        //printItinerary3(placesToTravel);
        testIterator(placesToTravel);
    }

    private static void addMoreElements(LinkedList<String> list) {
        list.addFirst("covilha");
        list.addLast("covilha");
        //queue methods
        list.offer("montalegre");
        list.offerFirst("viana");
        list.offerLast("maia");
        //stack methods
        list.push("gaia");
    }

    private static void removeElements(LinkedList<String> list) {
        String removed = list.remove();
        System.out.println(removed);
        String removedFirst = list.removeFirst();
        System.out.println(removedFirst);
        String removedLast = list.removeLast();
        System.out.println(removedLast);
    }

    private static void gettingElements(LinkedList<String> list) {
        System.out.println(list.get(5));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.indexOf("covilha"));
        System.out.println(list.lastIndexOf("covilha"));
        //queue retrieval methods
        System.out.println(list.element());
        //stack retrieval methods
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list) {
        System.out.println("Print itinerary:");
        System.out.println(list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println(list.get(i - 1) + " to " + list.get(i));
        }
        System.out.println(list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list) {
        System.out.println("Print itinerary:");
        System.out.println(list.getFirst());
        String previousTown = list.getFirst();
        for (String town : list) {
            System.out.println(previousTown + " -> " + town);
            previousTown = town;

        }
        System.out.println(list.getLast());
    }

    public static void printItinerary3(LinkedList<String> list) {
        System.out.println("Print itinerary:");
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());

    }

    private static void testIterator(LinkedList<String> list) {
        var iterator = list.listIterator();
        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
            if (iterator.next().equals("gaia")) {
                iterator.add("london");
            }

        }
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        iterator = list.listIterator(0);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(list);
    }


}
