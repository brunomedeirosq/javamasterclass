public class Main {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,35));
    }

    public static boolean isCatPlaying (boolean isSummer, int temperature) {

        if (isSummer == true && temperature >= 25 && temperature <= 45) {
            return true;
        } else if (isSummer == false && temperature >= 25 && temperature <= 35) {
            return true;
        } else return false;

    }

}
