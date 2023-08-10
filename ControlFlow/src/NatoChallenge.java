public class NatoChallenge {

    public static String natoWord (char natoChar) {

        switch (natoChar) {
            case 'A':
                return natoChar + " = Able";
            case 'B':
                return natoChar + " = Baker";
            case 'C':
                return natoChar + " = Charlie";
            case 'D':
                return natoChar + " = Dog";
            case 'E':
                return natoChar + " = Easy";
            default:
                return natoChar + " letter not found";
        }

    }

}
