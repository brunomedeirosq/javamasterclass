public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(4000));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65,45));
        System.out.println(getDurationString(65,145));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));

    }

    public static String getDurationString(int seconds) {

        if (seconds >= 0) {
            return getDurationString(seconds / 60, seconds % 60);
        } else
            return "invalid seconds: " + seconds + ", should be positive integer!";
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            return minutes / 60 + "h " + (minutes % 60) + "m " + seconds + "s";
        } else
            return "invalid minutes or seconds: " + minutes + " should be greater or equal than 0, " + seconds + " should be greater or equal to 0 and less or equal to 59";

    }

}
