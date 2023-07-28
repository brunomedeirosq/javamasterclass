public class ChallengeLesson39 {

    public static void main(String[] args) {

        //step 1
        double myFirstDouble = 20.00d;
        //step 2
        double mySecondDouble = 80.00d;
        //step 3
        double firstResult = (myFirstDouble + mySecondDouble) * 100.00d;
        System.out.println("the result = " + firstResult);
        //step 4
        double remainderResult = firstResult % 40.00d;
        System.out.println("the remainder = " + remainderResult);
        //step 5
        boolean isRemainderZero = (remainderResult == 0.00) ? true : false;
        //step 6
        System.out.println("isRemainderZero = " + isRemainderZero);
        //step 7
        String outputRemainder = isRemainderZero ? "the remainder is zero" : "got some remainder";
        System.out.println(outputRemainder);
        if (!isRemainderZero) {
            System.out.println("got some remainder");
        }

    }
}
