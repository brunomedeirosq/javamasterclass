public class NumberPalindromeImproved {

    public static boolean isPalindrome (int number) {

        int reverse = 0;
        int lastDigit = 0;
        int original = number;

        while (Math.abs(number) >= 1) {
            lastDigit = number%10;
            number = number/10;
            reverse = reverse*10+lastDigit;
            //reverse = 0*10+2 = 2
            //reverse = 2*10+1 = 21
            //reverse = 21*10+2 = 212
            //reverse = 212*10+1 = 2121
            //reverse = 2121*10+1 = 21211
        }

        if (original == reverse) {
            return true;
        } else {
            return false;
        }

    }

}
