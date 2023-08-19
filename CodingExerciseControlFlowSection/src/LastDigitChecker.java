public class LastDigitChecker {

    public static boolean hasSameLastDigit (int firstNum, int secondNum, int thirdNum) {

        if (isValid(firstNum) && isValid(secondNum) && isValid(thirdNum)) {

            int lastDigitFirstNum = firstNum % 10;
            int lastDigitSecondNum = secondNum % 10;
            int lastDigitThirdNum = thirdNum % 10;

            if (lastDigitFirstNum == lastDigitSecondNum || lastDigitFirstNum == lastDigitThirdNum || lastDigitSecondNum == lastDigitThirdNum) {
                return true;
            }
        }

        return false;

    }

    public static boolean isValid (int number) {
        if (number < 10 || number > 1000) {
            return false;
        }
        return true;
    }

}
