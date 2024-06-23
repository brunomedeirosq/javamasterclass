package dev.lpa;


import java.util.ArrayList;
import java.util.Arrays;

// grocery item record -->
record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name,"DAIRY",1);
    }

    @Override
    public String toString() {
        //overriding toString method formatting the string using class build String with .format
        //three specifiers %d for integer "count" and 2 specifiers %s for string, "name" and "type"
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class Main {

    public static void main(String[] args) {

        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples","PRODUCE",6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE",5);

        //System.out.println(Arrays.toString(groceryArray));

        //create an ArrayList and initialize the ArrayList with empty values, however the ArrayList has the default type of Object,
        // meaning that will store any kind of data:
        //Example of raw version of the ArrayList, since we are not specifying the type of the ArrayList
        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        //to create an ArrayList and initialize/instantiation of this ArrayList for type GroceryItem with angle brackets <> (diamond operator), we can do:
        //ArrayList<GroceryItem> groceryList = new ArrayList<GroceryItem>();
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        //Since we specify the type on ArrayList to be "GroceryItem" the compiler is showing an error, meaning that we should only store inside this
        //groceryList ArrayList objects from type GroceryItem:
        //groceryList.add("Yogurt");


        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("oranges","PRODUCE",5));

        groceryList.add(0, new GroceryItem("apples","PRODUCE",6));
        //groceryList.set(0, new GroceryItem("apples","PRODUCE",6));

        //we can remove from ArrayList using the following method
        groceryList.remove(1);

        System.out.println(groceryList);











    }

}
