public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor (int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        //start divisor with value from first number
        int div = first;

        //while divisor is greater than 1 and starting from the first number test if the greatest divisor from first number is divisor from the second number
        while (div > 1){
            if (first % div == 0 && second % div == 0) {
                return div;
            }
            div--;
        }
        return -1;
    }

}
