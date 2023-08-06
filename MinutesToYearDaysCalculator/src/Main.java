public class Main {

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            //1 year = 365 days * 24 hours * 60 minutes

            int years = (int) minutes / (365 * 24 * 60);
            int days = (int) (minutes % (365 * 24 * 60)) / (24 * 60);

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }

    }

}
