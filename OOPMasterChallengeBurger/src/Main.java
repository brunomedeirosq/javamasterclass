import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

//        Burger burger = new Burger("regular", 4.00);
//        burger.addToppings("BACON","CHEESE","MAYO");
//        burger.printItem();

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("BACON","CHEESE","MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();


    /*    Item coke = new Item("drink","coke",1.5);
        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();*/

 /*       Item avocado = new Item("Topping","avocado",1.5);
        avocado.printItem();*/


/*        Burger delux = new Burger("Delux",5);
        delux.addToppings("avocado","cheese","bacon");
        delux.printItem();*/

/*        MealOrder regularMeal = new MealOrder();
        regularMeal.addBurgerToppings("BACON","CHEESE","MAYO");
        regularMeal.setDrinkSize("LARGE");
        regularMeal.printItemizedList();

*/
/*        MealOrder secondMeal = new MealOrder("turkey", "7-up", "chili");
        secondMeal.addBurgerToppings("LETTUCE","CHEESE","MAYO");
        secondMeal.setDrinkSize("SMALL");
        secondMeal.printItemizedList();*/

        MealOrder deluxMeal = new MealOrder("deluxe","7-up","chili");
        deluxMeal.addBurgerToppings("AVOCADO","BACON","LETTUCE","CHEESE","MAYO");
        deluxMeal.setDrinkSize("SMALL");
        deluxMeal.printItemizedList();


    }


}
