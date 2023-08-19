public class Main {

    public static void main(String[] args) {
//        System.out.println(125%10);
//        System.out.println(125/10);
//        System.out.println(12%10);
//        System.out.println(12/10);
//        System.out.println(1%10);
//        System.out.println(1%10);

        System.out.println(sumDigits(10005));
        System.out.println(sumDigits(15));
        System.out.println(sumDigits(5));
        System.out.println(sumDigits(-5));
        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));


    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number < 0) {
            return -1;
        } else {
            while (number >= 1) {
//                sum = sum + number%10;
                sum += number%10;
                number=number/10;
            }
            return sum;
        }
    }

}
