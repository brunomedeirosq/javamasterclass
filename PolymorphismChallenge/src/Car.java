public class Car {
    //class instance fields
    private String description;


    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Starting engine from " + getClass().getSimpleName());
    }

    protected void runEngine() {
        System.out.println("Running Engine from " + getClass().getSimpleName());
    }

    public void drive() {
        runEngine();
        System.out.println("Driving " + getClass().getSimpleName());
    }

//static factory method from Car class that allow us to create different instances of Car subclasses
//using this approach we can call this factory method directly from class name, Car.deliverCar() and accordingly to type we can instantiate different car objects
//from GasPoweredCar, ElectricCar, HybridCar subclasses from Car parent class
    public static Car deliverCar(String type, String description, double avgKmPerLitre, int cylinders, double avgKmPerCharge, int batterySize) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'G' -> new GasPoweredCar(description, avgKmPerLitre,cylinders);
            case 'E' -> new ElectricCar(description, avgKmPerCharge, batterySize);
            case 'H' -> new HybridCar(description, avgKmPerLitre, cylinders, batterySize);
            default -> new Car(description);
        };
    }

    public static Car deliverGasCar(String description, double avgKmPerLitre, int cylinders) {
        return deliverCar("G", description, avgKmPerLitre, cylinders,0,0);
    }

    public static Car deliverElectricCar(String description, double avgKmPerCharge, int batterySize) {
        return deliverCar("E", description, 0, 0, avgKmPerCharge,batterySize);
    }

    public static Car deliverHybridCar(String description, double avgKmPerLitre, int cylinders, double avgKmPerCharge, int batterySize) {
        return deliverCar("H", description, avgKmPerLitre, cylinders, avgKmPerCharge,batterySize);
    }


}

//subclass from Car, child from Car class and allow to extend different behaviors and specific attributes for this type of car
class GasPoweredCar extends Car {
    //specific instance fields for this class GasPoweredCar that extends generic parent class Car
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public void setAvgKmPerLitre(double avgKmPerLitre) {
        this.avgKmPerLitre = avgKmPerLitre;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Press start button from " + getClass().getSimpleName());
        super.startEngine();

    }

    @Override
    public void drive() {
        super.drive();
    }
}

class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("Press start button from " + getClass().getSimpleName());
        super.startEngine();

    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Driving a " + getClass().getSimpleName() + "car");
    }

}

class HybridCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;
    private int batterySize;

    public HybridCar(String description, double avgKmPerLitre, int cylinders, int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("Press start button from " + getClass().getSimpleName());
        super.startEngine();

    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Driving a " + getClass().getSimpleName() + "car");
    }

}
