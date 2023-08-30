import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int currentYear = 2023;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }

    }

    public static String getInputFromConsole(int currentYear) {

        boolean validDateOfBirth = false;
        int age = -1;

        String name = System.console().readLine("Hi, what's your name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        do {
            String dateOfBirth = System.console().readLine("What year were your born? ");
            age = checkData(currentYear, dateOfBirth);
            if (age == -1) {
                validDateOfBirth = false;
                System.out.println("Wrong dates! Please answer again.");
            } else {
                validDateOfBirth = true;
            }

        } while (!validDateOfBirth);

        return "So you are " + age + " years old!";

    }

    public static String getInputFromScanner(int currentYear) {

        boolean validDateOfBirth = false;
        int age = -1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, what's your name?");

        String name = scanner.nextLine();

        //String name = System.console().readLine("Hi, what's your name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        do {
            System.out.println("What year were your born?");

            try {
                age = checkData(currentYear, scanner.nextLine());
                validDateOfBirth = age < 0 ? false : true;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed!!! Try again.");
                System.out.println("Please review the Exception:");
                System.out.println(badUserData);
            }
        } while (!validDateOfBirth);

        return "So you are " + age + " years old!";

    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }

        return (currentYear - dob);

    }


}
