public class DayOfTheWeekChallenge {

    public static void printDayOfWeek (int day) {

        String dayOfTheWeek = switch (day) {
            case 0 -> {
                dayOfTheWeek = "Sunday";
                yield dayOfTheWeek;
            }
            case 1 -> {
                yield "Monday";
            }
            case 2 -> { yield "Tuesday"; }
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> {
                yield dayOfTheWeek = "Invalid Day";
            }
        };

        System.out.println(day + " is " + dayOfTheWeek);

    }

    public static void printWeekDay (int day) {
        String dayOfTheWeek="";
        if (day==0) {
            dayOfTheWeek="Sunday";
        } else if (day==1) {
            dayOfTheWeek="Monday";
        } else if (day==2) {
            dayOfTheWeek="Tuesday";
        } else if (day==3) {
            dayOfTheWeek="Wednesday";
        } else if (day==4) {
            dayOfTheWeek="Thursday";
        } else if (day==5) {
            dayOfTheWeek="Friday";
        } else if (day==6) {
            dayOfTheWeek="Saturday";
        } else
            dayOfTheWeek = "Invalid Day";

        System.out.println(day + " is " + dayOfTheWeek);
    }

}
