public class NumberPalindrome {

    public static boolean isPalindrome (int number) {

        int reverse = 0;
        int lastDigit = 0;
        int count = 0;
        int original = number;

        while (Math.abs(number) >= 9) {
            number = number/10;
            count++;
        }

        number = original;


        while (count >= 0) {
            lastDigit = number%10;
            number = number/10;
            reverse = (int) (reverse + lastDigit*Math.pow(10,count));
            count--;
        }
        if (original == reverse) {
            return true;
        } else {
            return false;
        }

    }

}
