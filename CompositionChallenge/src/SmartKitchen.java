public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    private void addWater() {
        brewMaster.setHasWorkToDo(true);
    }

    private void pourMilk() {
        iceBox.setHasWorkToDo(true);
    }

    private void loadDishWasher() {
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean addWater, boolean pourMilk, boolean loadDishWasher) {
        brewMaster.setHasWorkToDo(addWater);
        iceBox.setHasWorkToDo(pourMilk);
        dishWasher.setHasWorkToDo(loadDishWasher);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }

}

class CoffeeMaker {

    //instance variable
    private boolean hasWorkToDo;

    public CoffeeMaker() {
    }

    //constructor
    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    //instance methods
    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Brewing coffee");
            hasWorkToDo = false;
        }
    }

}

class DishWasher {

    //instance variable
    private boolean hasWorkToDo;

    public DishWasher() {
    }

    //constructor
    public DishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    //instance methods
    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Washing dishes");
            hasWorkToDo = false;
        }

    }
}

class Refrigerator {

    //instance variable
    private boolean hasWorkToDo;

    //constructor


    public Refrigerator() {
    }

    public Refrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    //instance methods
    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ordering food");
            hasWorkToDo = false;
        }
    }
}
