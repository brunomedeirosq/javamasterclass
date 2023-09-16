public class Main {

    public static void main(String[] args) {

        //instantiate a car object from Class Car (template)
        Car car = new Car();

        //setting new values to object instance created previously
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setColor("black");
        car.setConvertible(true);

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setColor("black");
        targa.setConvertible(false);

        //with this new object we can use the instance method describeCar() over our previously created object
        car.describeCar();
        //with this new object we can use the instance method describeCar() over our previously created object
        targa.describeCar();

    }
}
