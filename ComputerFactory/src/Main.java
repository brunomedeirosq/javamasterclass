public class Main {

    public static void main(String[] args) {

        ComputerCase computerCase = new ComputerCase("2208","Dell","240");
        Monitor monitor = new Monitor("27inch beast","Acer",27,"2540 x 1440");
        Motherboard motherboard = new Motherboard("BJ-200","Asus",4,6,"v2.44");

        PersonalComputer myPc = new PersonalComputer("2208","Dell",monitor,motherboard,computerCase);

//        myPc.getComputerCase().pressPowerButton();
//        myPc.getMotherboard().loadProgram("steam");
//        myPc.getMonitor().drawPixelAt(10,10,"red");

        myPc.powerUp();

    }

}
