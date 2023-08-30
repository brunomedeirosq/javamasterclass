public class LargestPrime {

    public static int getLargestPrime (int number) {

        //test negative numbers, 0 (not prime) and 1 (not prime) and return -1
        if (number <= 1) {
            return -1;
        }

        //iterate over all numbers bellow "number", starting from the number itself since we want the largest prime
        for (int i = number-1; i >= 2; i--) {
            if (number % i == 0) {
                number=i;
                continue;
            }
        }

        return number;

    }

    public static boolean isPrime (int number) {

        //test negative numbers and number 0 and 1 since they are not primes, return false
        if (number <= 1) {
            return false;
        }
        //iterate over all smaller numbers to check if the number can be divided by them excluding itself that's way (number-1)
        for (int i = (number-1); i >= 2; i--) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }




}
