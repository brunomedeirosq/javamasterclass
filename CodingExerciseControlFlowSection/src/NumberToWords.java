
public class NumberToWords {

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int count = 0;

        while (number >= 1) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static int reverse(int number) {

        int reversed = 0;
        boolean isNegative = false;

        //convert number to positive to use same while loop to reverse
        if (number < 0) {
            isNegative = true;
            number *= -1;
        }

        while (number >= 1) {
            reversed = reversed*10 + number%10;
            number /= 10;
        }

        //set sign to result if the number was negative
        if (isNegative) {
            return reversed * -1;
        } else {
            return reversed;
        }

    }

    public static void numberToWords (int number) {

        //test invalid numbers
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        //reverse number to print with correct order
        int reversed=reverse(number);

        //check digits difference between number and reversed to deal with leading zeros, 100 will be reversed to 1
        //with difDigit we can know the missing zeros and print them
        //this calculation and initialization is here since we later modified the value from reversed
        int difDigit = getDigitCount(number)-getDigitCount(reversed);

        //deal with number being zero
        if (reversed == 0) {
            System.out.println("Zero");
        }

        //loop number and convert last digit to word
        while ( reversed >= 1 ) {
            int lastDigit = reversed % 10;
            reversed /= 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + lastDigit);
            }

        }
        //check digits difference between number and reversed to deal with leading zeros, 100 will be reversed to 1
        //with difDigit we can know the missing zeros and print them
        for (int i=difDigit; i > 0; i--) {
            System.out.println("Zero");
        }

    }

}
