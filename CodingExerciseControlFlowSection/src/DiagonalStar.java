public class DiagonalStar {

    public static void printSquareStar(int number) {

        int columnNumber = 1;


        if (number < 5) {
            System.out.println("Invalid Value");

        } else {

            //for to iterate and print lines starting on 1 and finish on number
            for (int rowCount = 1; rowCount <= number; rowCount++) {
                //while to iterate and print columns
                while (columnNumber <= number) {
                    if (rowCount == 1) {
                        System.out.print("*");
                        columnNumber++;
                        continue;
                    }
                    if (columnNumber == 1) {
                        System.out.print("*");
                        columnNumber++;
                        continue;
                    }
                    if (rowCount == number) {
                        System.out.print("*");
                        columnNumber++;
                        continue;
                    }
                    if (columnNumber == number) {
                        System.out.print("*");
                        columnNumber++;
                        continue;
                    }
                    if (columnNumber == rowCount) {
                        System.out.print("*");
                        columnNumber++;
                        continue;
                    }
                    if (columnNumber == number + 1 - rowCount) {
                        System.out.print("*");
                        columnNumber++;
                        continue;
                    }

                    System.out.print(" ");
                    columnNumber++;

                }
                //after printing the first line set column number to zero, to iterate on a new line
                columnNumber = 1;
                System.out.println();

            }


        }
    }


}
