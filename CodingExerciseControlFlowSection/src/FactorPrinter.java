public class FactorPrinter {

    public static void printFactors (int number) {

        int i = 1;

        if (number < 1) {
            System.out.println("Invalid Value");
        }

        while (i <= number) {
            if (number%i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
