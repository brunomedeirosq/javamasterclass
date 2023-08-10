public class Main {

    public static void main(String[] args) {
//        switchExample(1);
//        switchExample(2);
//        switchExample(3);
//        switchExample(4);
//        switchExample(6);
//        switchExample(10);
//
//        switchEnhancedExample(1);
//        switchEnhancedExample(2);
//        switchEnhancedExample(3);
//        switchEnhancedExample(4);
//        switchEnhancedExample(6);
//        switchEnhancedExample(10);

//        System.out.println(getQuarter("January"));
//        System.out.println(getQuarter("February"));
//        System.out.println(getQuarter("March"));
//        System.out.println(getQuarter("April"));
//        System.out.println(getQuarter("May"));
//        System.out.println(getQuarter("June"));
//        System.out.println(getQuarter("July"));
//        System.out.println(getQuarter("August"));
//        System.out.println(getQuarter("September"));
//        System.out.println(getQuarter("October"));
//        System.out.println(getQuarter("November"));
//        System.out.println(getQuarter("December"));
//        System.out.println(getQuarter("xpto"));

//        System.out.println(getQuarterEnhanced("January"));
//        System.out.println(getQuarterEnhanced("February"));
//        System.out.println(getQuarterEnhanced("March"));
//        System.out.println(getQuarterEnhanced("April"));
//        System.out.println(getQuarterEnhanced("May"));
//        System.out.println(getQuarterEnhanced("June"));
//        System.out.println(getQuarterEnhanced("July"));
//        System.out.println(getQuarterEnhanced("August"));
//        System.out.println(getQuarterEnhanced("September"));
//        System.out.println(getQuarterEnhanced("October"));
//        System.out.println(getQuarterEnhanced("November"));
//        System.out.println(getQuarterEnhanced("December"));
//        System.out.println(getQuarterEnhanced("xpto"));

//        System.out.println(NatoChallenge.natoWord('A'));
//        System.out.println(NatoChallenge.natoWord('B'));
//        System.out.println(NatoChallenge.natoWord('C'));
//        System.out.println(NatoChallenge.natoWord('D'));
//        System.out.println(NatoChallenge.natoWord('E'));
//        System.out.println(NatoChallenge.natoWord('F'));

//        DayOfTheWeekChallenge.printDayOfWeek(0);
//        DayOfTheWeekChallenge.printDayOfWeek(1);
//        DayOfTheWeekChallenge.printDayOfWeek(2);
//        DayOfTheWeekChallenge.printDayOfWeek(3);
//        DayOfTheWeekChallenge.printDayOfWeek(4);
//        DayOfTheWeekChallenge.printDayOfWeek(5);
//        DayOfTheWeekChallenge.printDayOfWeek(6);
//        DayOfTheWeekChallenge.printDayOfWeek(7);
//        DayOfTheWeekChallenge.printDayOfWeek(10);

//        DayOfTheWeekChallenge.printWeekDay(0);
//        DayOfTheWeekChallenge.printWeekDay(1);
//        DayOfTheWeekChallenge.printWeekDay(2);
//        DayOfTheWeekChallenge.printWeekDay(3);
//        DayOfTheWeekChallenge.printWeekDay(4);
//        DayOfTheWeekChallenge.printWeekDay(5);
//        DayOfTheWeekChallenge.printWeekDay(6);
//        DayOfTheWeekChallenge.printWeekDay(7);
//        DayOfTheWeekChallenge.printWeekDay(10);

//        for (int i : new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -10}) {
//            NumberInWord.printNumberInWord(i);
//        }

//        for (int i : new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -10}) {
//            NumberInWord.printNumberInWordEnhanced(i);
//        }

//        System.out.println(NumberOfDaysInMonth.isLeapYear(-1600));
//        System.out.println(NumberOfDaysInMonth.isLeapYear(1600));
//        System.out.println(NumberOfDaysInMonth.isLeapYear(2017));
//        System.out.println(NumberOfDaysInMonth.isLeapYear(2000));

//        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1,2020));
//        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2020));
//        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2,2018));
//        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1,2020));
//        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1,-2020));


    }

    public static void switchExample(int testValue) {

        switch (testValue) {
            case 1:
                System.out.println("Value is " + testValue);
                break;
            case 2:
                System.out.println("Value is " + testValue);
                break;
            case 3:
                System.out.println("Value is " + testValue);
                break;
            case 4: case 5: case 6:
                System.out.println("Value is " + testValue);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + testValue);
        }

    }

    public static void switchEnhancedExample(int testValue) {

        switch (testValue) {
            case 1 -> System.out.println("Value is " + testValue);
            case 2 -> System.out.println("Value is " + testValue);
            case 3 -> System.out.println("Value is " + testValue);
            case 4, 5, 6 -> System.out.println("Value is " + testValue);
            default -> throw new IllegalStateException("Unexpected value: " + testValue);
        }

    }

    public static String getQuarter(String month) {
        switch (month) {
            case "January": case "February": case "March":
                return "First quarter";
            case "April": case "May": case "June":
                return "Second quarter";
            case "July": case "August": case "September":
                return "Third quarter";
            case "October": case "November": case "December":
                return "Fourth quarter";
            default:
                throw new IllegalStateException("Unexpected month: " + month);
        }
    }

    public static String getQuarterEnhanced(String month) {
        return switch (month) {
            case "January", "February", "March" -> "First quarter";
            case "April", "May", "June" -> "Second quarter";
            case "July", "August", "September" -> "Third quarter";
            case "October", "November", "December" -> "Fourth quarter";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }




}
