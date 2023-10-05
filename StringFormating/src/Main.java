public class Main {

    public static void main(String[] args) {

        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";

        System.out.println(bulletIt);

        // text between triples quotes is a text block and printed as was written with tabs and new lines without using the \t or \n like in previous example
        String textBlock = """
                Print a Bulleted List:
                        \u2022 First Point
                            \u2022 Sub Point
                """;

        System.out.println(textBlock);

        // printf doesn't end with a new line, but this method as multiple arguments, the first is a String which will be printed to
        // %d is a placeholder for other data
        int age = 35;
        System.out.printf("Your age is %d%n", age);

        int yearOfBirth = 2023 - age;

        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);

        System.out.printf("Your age is %.2f%n", (float) age);

        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %6d%n", i);
        }

        //two format methods on String class, static methods. we are using them through the class "String.format"

        String formattedString = String.format("Your age is %d",age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);

    }

}
