public class BarkingDog {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,1));
        System.out.println(shouldWakeUp(false,2));
        System.out.println(shouldWakeUp(true,8));
        System.out.println(shouldWakeUp(true,-1));
        System.out.println(shouldWakeUp(true,23));
    }

    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {

        /*if ( hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 8 && hourOfDay < 22) ) {
            return false;
        } else if (barking) {
            return true;
        } else
            return false;*/

        if ( hourOfDay >= 0 && hourOfDay <= 23 && (hourOfDay < 8 || hourOfDay > 22) && barking) {
            return true;
        } else
            return false;

    }

}
