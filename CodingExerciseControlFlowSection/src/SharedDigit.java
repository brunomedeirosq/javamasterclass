public class SharedDigit {

    public static boolean hasSharedDigit (int numberOne, int numberTwo) {

        if (numberOne < 10 || numberOne > 99 || numberTwo < 10 || numberTwo > 99) {
            return false;
        }

        int bigNumber = 0;
        int smallNumber = 0;
        int testDigit = 0;

        if (numberOne >= numberTwo) {
            bigNumber = numberOne;
            smallNumber = numberTwo;
        } else {
            bigNumber = numberTwo;
            smallNumber = numberOne;
        }

        int originalSmallNumber = smallNumber;

        while (bigNumber > 0){
            testDigit = bigNumber%10;
            bigNumber /= 10;
            while (smallNumber > 0) {
                if (testDigit == smallNumber % 10) {
                    return true;
                } else {
                    smallNumber /= 10;
                }
            }
            smallNumber=originalSmallNumber;

        }
        return false;

    }

}
