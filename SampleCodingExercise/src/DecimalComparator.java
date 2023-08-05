public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175,3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123,3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){

        //3.4556 and 3.4557
        //*1000 (3 decimal) and discarding the decimal part we can compare the int number to check if they are equal
        //3455.6 and 3455.7

        int firstNumberAuxiliary = (int) (firstNumber * 1000);
        int secondNumberAuxiliary = (int) (secondNumber * 1000);

        if (firstNumberAuxiliary == secondNumberAuxiliary) {
            return true;
        } else
            return false;
    }


}
