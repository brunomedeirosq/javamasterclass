public class TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }

    public static boolean isTeen(int age) {
        if (age >= 13 && age <= 19) {
            return true;
        } else
            return false;
    }

    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {

        if (isTeen(firstNumber) || isTeen(secondNumber) || isTeen(thirdNumber)) {
            return true;
        } else
            return false;
    }

}
