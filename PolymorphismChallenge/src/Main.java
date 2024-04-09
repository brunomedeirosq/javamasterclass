public class Main {
    public static void main(String[] args) {
        Car car1 = Car.deliverGasCar("VW Golf VI", 100, 4);
        car1.startEngine();
        car1.drive();

        Car car2 = Car.deliverElectricCar("VW Golf E",600,200);
        car2.startEngine();
        car2.drive();

        Car car3 = Car.deliverHybridCar("VW Golf Hybrid", 100, 4,600,200);
        car3.startEngine();
        car3.drive();

    }
}
