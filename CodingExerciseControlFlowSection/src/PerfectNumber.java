public class PerfectNumber {

    public static boolean isPerfectNumber (int number) {

        //test invalid numbers
        if (number < 1) {
            return false;
        }

        //variables initialization
        int divisor = number;
        int sum = 0;

        //test all whole numbers less than "number" as divisors, store the ones that have remainder zero in sum variable
        while (divisor > 1) {
            divisor--;
            if (number % divisor == 0) {
                sum += divisor;
            }
        }

        //test if sum variable, the sum of all divisors with remainder zero are equal to number, case true is a perfect number
        if (sum == number) {
            return true;
        } else {
            return false;
        }
    }

}
