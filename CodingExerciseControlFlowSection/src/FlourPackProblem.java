public class FlourPackProblem {

    public static boolean canPack (int bigCount, int smallCount, int goal) {
        //bigCount: represents the count of big flour bags (5 kg each)
        //smallCount: represents the count of small flour bags (1 kg each)
        //goal: represents the goal amount of kilos of flour needed to assemble a package

        //variable that will be used to sum kilos from bags and compare with goal
        int sumKilos = 0;

        //validation for negative numbers return false
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        //if 5 fit in goal then we first add big bags with 5 kilos each
        if (goal / 5 > 0) {
            while (bigCount > 0 && sumKilos < goal && (goal-sumKilos)/5 > 0) {
                bigCount--;
                sumKilos += 5;
            }
        }

        //if above condition is true we add first the big bags and sumKilos will have value greater than zero
        //if above condition is false we add only small bags and sumKilos will have zero value
        while (smallCount > 0 && sumKilos < goal) {
            smallCount--;
            sumKilos +=1;
        }

        if (sumKilos == goal) {
            return true;
        }

        return false;
    }

}
