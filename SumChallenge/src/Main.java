public class Main {

    public static void main(String[] args) {

        int total = 0;
        int counter = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                total += i;
                counter++;
                System.out.println("number " + i);
                }
            if (counter == 5) {
                break;
            }
        }
        System.out.println("the sum = " + total);


    }
}
