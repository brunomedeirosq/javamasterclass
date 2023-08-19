public class Main {

    public static void main(String[] args) {

//        for (int i=1; i<=10; i++) {
//            System.out.println(i);
//        }

        for (double interestRate = 7.5; interestRate <=10 ; interestRate+=0.25) {
            double interestAmount = calculateInterest(100,interestRate);
            if (interestAmount > 8.5) {
                break;
            }
            System.out.println("The interest amount for " + interestRate + "% is = " + interestAmount);
        }

    }

    public static double calculateInterest (double amount, double interestRate) {
        return (amount * (interestRate/100));
    }





}
