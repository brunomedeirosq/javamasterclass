public class Main {

    public static void main(String[] args) {

//        for (int i = 1; i < 1000; i++) {
//            System.out.println(i + " is prime " + isPrime(i));
//        }

//        System.out.println(isPrimeEnhanced(89));
//        System.out.println(isPrime(89));

        int primeNumberCounter = 0;

        for (int i = 10; primeNumberCounter < 3 && i <= 50; i++) {
            if (isPrimeEnhanced(i)) {
                System.out.println("Number " + i + " is prime.");
                primeNumberCounter++;
//                if (primeNumberCounter==3) {
//                    break;
//            }

            }
        }

    }


    public static boolean isPrime (int number) {

        if (number < 2) {
            return false;
        } else if (number == 2 || number == 3 || number == 5 || number == 7) {
            return true;
        } else if (number%2 == 0) {
            return false;
        } else if (number%3 == 0) {
            return false;
        } else if (number%5 == 0) {
            return false;
        } else if (number%7 == 0) {
            return false;
        } else {
            return true;
        }

    }

    public static boolean isPrimeEnhanced (int wholeNumber) {

        //0 and 1 are not prime
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2 ; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }


}
