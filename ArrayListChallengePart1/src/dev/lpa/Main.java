package dev.lpa;

import java.util.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //grocery list is an ArrayList instantiated without any items
        //empty ArrayList created
        //mutable and resizable
        //the compiler will check and only permit strings to assigned to this ArrayList since we specified type using ArrayList<String>

        ArrayList<String> groceryList = new ArrayList<>();
        printActions();

        try {
            manageGroceryList(Integer.parseInt(scanner.nextLine()),groceryList);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Option!");
            printActions();
            manageGroceryList(Integer.parseInt(scanner.nextLine()),groceryList);
        }
    }

    private static void manageGroceryList(int option, ArrayList<String> list) {
        while (option != 0) {
            switch (option) {
                case 1:
                    System.out.println("Please enter comma delimited list of items to add:");
                    String itemsToAdd = scanner.nextLine();
                    //the result of this instantiation, is a new mutable ArrayList called listToAdd, populated with the elements from the immutable list we passed,
                    //List.of(itemsToAdd.split(","))
                    //itemsToAdd.split(",") return an array composed by strings
                    ArrayList<String> listToAdd = new ArrayList<>(List.of(itemsToAdd.split(",")));
                    for (String item : listToAdd) {
                        addItem(item, list);
                    }
                    printActions();
                    option = Integer.parseInt(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Please enter comma delimited list of items to remove:");
                    String itemsToRemove = scanner.nextLine();
                    //the result of this instantiation, is a new mutable ArrayList called listToRemove, populated with the elements from the immutable list we passed,
                    //List.of(itemsToRemove.split(","))
                    //itemsToRemove.split(",") return an array composed by strings
                    ArrayList<String> listToRemove = new ArrayList<>(List.of(itemsToRemove.split(",")));
                    for (String item : listToRemove) {
                        removeItem(item, list);
                    }
                    printActions();
                    option = Integer.parseInt(scanner.nextLine());
                    break;
                default:
                    System.out.println("Invalid option!");
                    printActions();
                    option = Integer.parseInt(scanner.nextLine());
                    break;
            }

        }

    }

    private static void addItem(String item, ArrayList<String> list) {
        if (!checkItem(item, list)) {
            list.add(item);
            System.out.println(item + " was added to the grocery list!");
            printList(list);
        }
    }

    private static void removeItem(String item, ArrayList<String> list) {
        if (checkItem(item, list)) {
            list.remove(item);
            System.out.println("Grocery item: " + item + " was removed from the grocery list.");
            System.out.println("Updated grocery list:");
            printList(list);
        }
    }

    private static boolean checkItem(String item, ArrayList<String> list) {
        if (list.contains(item)) {
            System.out.println("Grocery item: " + item + " is present in the grocery list.");
            return true;
        }
        System.out.println("Grocery item: " + item + " it's not present in the grocery list.");
        return false;
    }

    private static void printList(ArrayList<String> list) {
        list.sort(Comparator.naturalOrder());
        if (list.isEmpty()) {
            System.out.println("Your grocery list is empty!");
        } else {
            System.out.println("Your grocery list: " + list);
        }
    }

    private static void printOptions() {
        System.out.println("Available actions:");
        System.out.println("0 - to shutdown");
        System.out.println("1 - to add item(s) to list (comma delimited list)");
        System.out.println("2 - to remove any items (comma delimited list)");
        System.out.println("Enter a number for which action you want to do:");
    }

    /**
     *
     */
    private static void printActions() {
        String textBlock = """
                Available actions:
                                
                0 - to shutdown
                                
                1 - to add item(s) to list (comma delimited list)
                                
                2 - to remove any items (comma delimited list)
                                
                Enter a number for which action you want to do:
                """;
        System.out.println(textBlock + " ");
    }


}
