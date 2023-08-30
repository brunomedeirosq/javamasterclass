import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //create an object from type Scanner to use instance method nextLine()
        Scanner scanner = new Scanner(System.in);
        double min = 0;
        double max = 0;
        double number = 0;
        int loopCount = 0;


        while (true) {
            //ask input from user
            System.out.println("Please enter a number or any character to quit.");
            //catch any input that isn't a double and quit the infinite loop
            try {
                //read input from user and parse from String to Double
                number = Double.parseDouble(scanner.nextLine());
                //store min number
                if (loopCount == 0 || number <= min) {
                    min = number;
                }
                //store max number
                if (loopCount == 0 || number >= max) {
                    max = number;
                }
                loopCount++;
            } catch (NumberFormatException notNumber) {
                //quit from loop
                System.out.println(notNumber);
                System.out.println("Exit");
                break;
            }
        }

        if (loopCount > 0) {
            System.out.println("The minimum number is " + min + " and " + "maximum number is " + max + ".");
        } else {
            System.out.println("No valid data entered");
        }

    }

}
