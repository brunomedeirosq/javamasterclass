public class EvenDigitSum {

    //sum all even (divisible by 2 means digit%2==0) digits from number
    public static int getEvenDigitSum (int number) {
        if (number < 0) {
            return -1;
        }
        int digit = 0;
        int sumEvenDigits = 0;
        while (number > 0) {
            digit = number%10;
            if (digit%2==0) {
                sumEvenDigits += digit;
            }
            number /= 10;
        }
        return sumEvenDigits;
    }

}
