import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        //int sum = 0;
        double sum = 0;

        do {
            System.out.println("Enter number #" + counter + ":");

            try {
                //int number = Integer.parseInt(scanner.nextLine());
                double number = Double.parseDouble(scanner.nextLine());
                counter++;
                sum += number;
            } catch (NumberFormatException badFormatNumber) {
                System.out.println("Invalid number. Exception:");
                System.out.println(badFormatNumber);
            }

        } while ( counter <= 5 );

        System.out.println(sum);

    }

    public static int checkValidNumber (String number) {

        try {
            int num = Integer.parseInt(number);
            return num;
        } catch (NumberFormatException badFormatNumber) {
            System.out.println("Invalid number. Exception:");
            System.out.println(badFormatNumber);
            return -1;
        }

    }

}
