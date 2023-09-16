public class Car {

    //five fields for class Car
    //they are defined in the class's code block instead of being declared inside methods like local variables
    //when we create an object from this class then the values we assign to these fields represent the state of the object
    //unlike local variables, class variables should have some type of access modifier declared for it
    //if we don't declare a modifier to class variables Java declares the default one (package private), implicitly.
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;



    //not static since we´re accessing instance fields on the class
    public void describeCar() {
        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }

    //setters methods that allow us to set values to class private fields
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    //getters methods allow us to get values from class private fields
    public String getMake() {
        return make;
    }




}
