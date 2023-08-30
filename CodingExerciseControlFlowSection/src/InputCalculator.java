import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        //create Scanner class object to read input from user
        Scanner scanner = new Scanner(System.in);
        //create variable to store sum
        int sum = 0;
        long avg = 0L;
        int loopCount = 0;

        while (true) {
            try {
                loopCount++;
                sum += Integer.parseInt(scanner.nextLine());
                avg = Math.round((double) sum /loopCount);
            } catch (NumberFormatException nfe) {
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
        }

    }

}
