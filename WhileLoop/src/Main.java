public class Main {

    public static void main(String[] args) {

//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }
//
//        int j = 1;
//        while (j <= 5) {
//            System.out.println(j);
//            j++;
//        }
//
//        int k = 1;
//        while (true) {
//            if (k > 5) {
//                break;
//            }
//            System.out.println(k);
//            k++;
//        }
//
//        int z = 1;
//        boolean isReady = false;
//         do {
//             if (z > 5) {
//                 break;
//             }
//             System.out.println(z);
//             z++;
//         } while (isReady);


        int number = 0;
        while (number < 50) {
            number += 5;

            if (number % 25 == 0) {
            continue;
            }
            System.out.print(number + "_");
        }

    }

}
