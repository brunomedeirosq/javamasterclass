public class Main {
    public static void main(String[] args) {

        int i = 4;
        int totalEvenNumbersFound = 0;
        int totalOddNumbersFound = 0;
        while (i <= 20) {
            //set always increment variable in the beginning of code to prevent infinite looping
            i++;
            if (isEvenNumber(i)) {
                totalEvenNumbersFound++;
                System.out.println(i);
            } else {
                totalOddNumbersFound++;
            }
            if (totalEvenNumbersFound == 5) {
                break;
            }

        }
        System.out.println("Total odd numbers found was " + totalOddNumbersFound);

        System.out.println("Total even numbers found was " + totalEvenNumbersFound);


    }

    public static boolean isEvenNumber (int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }


}
