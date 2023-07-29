public class Main {
    public static void main(String[] args) {

        int myVariable = 1;
        //java statement is "int myVariable = 50;"

        myVariable++;
        myVariable--;
        //including semicolon to expression "myVariable++" is a java statement

        System.out.println("This is a test");
        //system out also a java statement

        System.out.println("This is"
                + " another"
                + " still more.");

        int anotherVariable = 50;
        myVariable--;
        System.out.println("myVariable = " + myVariable);

        if (myVariable == 0) {
            System.out.println("It's now zero");
        }

    }
}
